/*
 * The MIT License (MIT)
 *
 * Copyright (C) 2021  Griefed
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.griefed.serverpackcreatoraddonexample;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.i18n.I18n;
import de.griefed.serverpackcreator.plugins.serverpackhandler.PostGenExtension;
import de.griefed.serverpackcreator.plugins.serverpackhandler.PreGenExtension;
import de.griefed.serverpackcreator.plugins.serverpackhandler.PreZipExtension;
import de.griefed.serverpackcreator.plugins.swinggui.TabExtension;
import de.griefed.serverpackcreator.utilities.ConfigUtilities;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

@SuppressWarnings("unused")
public class ExamplePlugin extends Plugin {

  /*
  You should provide and read all these from the manifest.
                                                              */
  public static final String NAME = "ServerPackCreatorExampleAddon";
  public static final String DESCRIPTION =
      "This is an example addon for ServerPackCreator showcasing all, currently 4, aspects of"
          + "ServerPackCreators addon functionality. In this example you see code which gets executed before a server pack is generated,"
          + "code that gets executed after a server pack was generated but before the ZIP-archive is created, code that gets executed"
          + "after this ZIP-archive was created, as well as code adding a new tabbed pane to the GUI.";
  public static final String AUTHOR = "Griefed";
  public static final String VERSION = "0.0.1";
  private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");

  public ExamplePlugin(PluginWrapper wrapper) {
    super(wrapper);
  }

  @Override
  public void start() {
    LOG_ADDONS.info("Starting ExamplePlugin...");
    LOG_ADDONS.info(
        "This methods should prepare the environment for anything you want to do with it.");
    LOG_ADDONS.info(
        "You could download some files. Create or replace some files. Basically you can do whatever you want.");
    /*
    Write all your preparation code here..
                                            */
  }

  @Extension(ordinal = 1)
  public static class ExampleStartExtension implements PreGenExtension {

    @Override
    public void run(
        ApplicationProperties applicationProperties,
        ConfigurationModel configurationModel,
        String destination)
        throws Exception {
      LOG_ADDONS.info("This would run before a server pack generation.");
      LOG_ADDONS.info("Received destination: " + destination);
      LOG_ADDONS.info(
          "We recieved the following configurationModel: " + configurationModel.toString());
      LOG_ADDONS.info(
          "We received the following applicationProperties: " + applicationProperties.toString());
      StringUtils.upperCase("some text in lower case");
      // Create example file in server pack
      try {
        Files.createFile(
            Paths.get(String.format("%s/%s", destination, this.getClass().getSimpleName())));
      } catch (Exception ignored) {
      }
      /*
      Write all your pre-gen stuff here...
                                              */
    }

    @Override
    public String getName() {
      return NAME;
    }

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

    @Override
    public String getAuthor() {
      return AUTHOR;
    }

    @Override
    public String getVersion() {
      return VERSION;
    }
  }

  @Extension(ordinal = 1)
  public static class ExampleCreatedExtension implements PreZipExtension {

    @Override
    public void run(
        ApplicationProperties applicationProperties,
        ConfigurationModel configurationModel,
        String destination)
        throws Exception {
      LOG_ADDONS.info(
          "This would run after a server pack was generated, but BEFORE the ZIP-archive would be generated.");
      LOG_ADDONS.info("Received destination: " + destination);
      LOG_ADDONS.info(
          "We recieved the following configurationModel: " + configurationModel.toString());
      LOG_ADDONS.info(
          "We received the following applicationProperties: " + applicationProperties.toString());
      StringUtils.upperCase("some text in lower case");
      // Create example file in server pack
      try {
        FileUtils.createParentDirectories(new File(destination + "/some/folder/with/a/name"));
      } catch (Exception ex) {
        LOG_ADDONS.info("Error occurred creating parent directories.", ex);
      }

      Utilities utilities = new Utilities(new I18n(), applicationProperties);

      new ConfigUtilities(
              new Utilities(new I18n(), applicationProperties),
              applicationProperties,
              new ObjectMapper()
                  .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                  .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
          .writeConfigToFile(configurationModel, new File(destination + "/serverpackcreator.conf"));
      /*
      Write all your post-gen-pre-zip stuff here...
                                                       */
    }

    @Override
    public String getName() {
      return NAME;
    }

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

    @Override
    public String getAuthor() {
      return AUTHOR;
    }

    @Override
    public String getVersion() {
      return VERSION;
    }
  }

  @Extension(ordinal = 1)
  public static class ExampleArchiveExtension implements PostGenExtension {

    @Override
    public void run(
        ApplicationProperties applicationProperties,
        ConfigurationModel configurationModel,
        String destination)
        throws Exception {
      LOG_ADDONS.info("This would run after the server pack ZIP-archive was created.");
      LOG_ADDONS.info("Received destination: " + destination);
      LOG_ADDONS.info(
          "We recieved the following configurationModel: " + configurationModel.toString());
      LOG_ADDONS.info(
          "We received the following applicationProperties: " + applicationProperties.toString());
      // Create example file in server pack
      try {
        Files.createFile(
            Paths.get(String.format("%s/%s", destination, this.getClass().getSimpleName())));
      } catch (Exception ignored) {
      }
      
      /*
      Write all your post-archive stuff here...
                                              */
    }

    @Override
    public String getName() {
      return NAME;
    }

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

    @Override
    public String getAuthor() {
      return AUTHOR;
    }

    @Override
    public String getVersion() {
      return VERSION;
    }
  }

  @Extension(ordinal = 1)
  public static class ExampleAddTabExtension extends JComponent implements TabExtension {

    @Override
    public JComponent getTab() {
      JComponent jComponent = new JPanel(false);
      jComponent.setLayout(new GridBagLayout());

      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.fill = GridBagConstraints.NONE;
      gridBagConstraints.anchor = GridBagConstraints.CENTER;
      gridBagConstraints.gridwidth = 1;
      gridBagConstraints.gridheight = 1;
      gridBagConstraints.weightx = 1;
      gridBagConstraints.weighty = 1;

      JLabel jLabel = new JLabel("This is a label");
      jLabel.setToolTipText("Some label tooltip");
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 1;
      jComponent.add(jLabel, gridBagConstraints);

      JButton jButton = new JButton("Some button");
      jButton.setToolTipText("This could do anything");
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 2;
      jComponent.add(jButton, gridBagConstraints);

      return jComponent;
    }

    @Override
    public Icon getTabIcon() {
      /*
       * other default icons can be:
       *   OptionPane.errorIcon
       *   OptionPane.warningIcon
       *   OptionPane.questionIcon
       */
      return UIManager.getIcon("OptionPane.informationIcon");
    }

    @Override
    public String getTabTitle() {
      return "Some title text";
    }

    @Override
    public String getTabTooltip() {
      return "Some tooltip text";
    }

    @Override
    public void run(
        ApplicationProperties applicationProperties,
        ConfigurationModel configurationModel,
        String destination)
        throws Exception {
      /*
      So far, the run(...) method for AddTab extensions never gets called.
      There is no point in writing code here with the intention of
      ServerPackCreator executing it.
                                              */
      System.out.println("Flitzmdeför!");
    }

    @Override
    public String getName() {
      return NAME;
    }

    @Override
    public String getDescription() {
      return DESCRIPTION;
    }

    @Override
    public String getAuthor() {
      return AUTHOR;
    }

    @Override
    public String getVersion() {
      return VERSION;
    }
  }
}
