/*
 * MIT License
 *
 * Copyright (c) 2022 Griefed
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package de.griefed.exampleaddon.gui.panel;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.toml.TomlFormat;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.addons.swinggui.ExtensionConfigPanel;
import de.griefed.serverpackcreator.swing.TabCreateServerPack;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class ConfigurationPanel extends ExtensionConfigPanel {

  private final String panelName;
  private final JTextField pregen = new JTextField();
  private final JTextField prezip = new JTextField();
  private final JTextField postgen = new JTextField();
  private final JTextField confcheck = new JTextField();

  /**
   * Construct a panel which allows users to further customize their ServerPackCreator experience.
   *
   * @param versionMeta           Instance of {@link VersionMeta} so you can work with available
   *                              Minecraft, Forge, Fabric, LegacyFabric and Quilt versions.
   * @param applicationProperties Instance of {@link ApplicationProperties} The current
   *                              configuration of ServerPackCreator, like the default list of
   *                              clientside-only mods, the server pack directory etc.
   * @param utilities             Instance of {@link Utilities} commonly used across
   *                              ServerPackCreator.
   * @param tabCreateServerPack   Instance of {@link TabCreateServerPack} to give you access to the
   *                              various fields inside it, like the modpack directory, selected
   *                              Minecraft, modloader and modloader versions, etc.
   * @param addonConfig           Addon specific configuration conveniently provided by
   *                              ServerPackCreator. This is the global configuration of the addon
   *                              which provides the ConfigPanelExtension to ServerPackCreator.
   * @param extensionName         The name the titled border of this ConfigPanel will get.
   * @param pluginID              The ID of the addon providing this extension implementation. The
   *                              pluginID determines which extension specific configurations are
   *                              provided to this panel, and how they are stored in a given
   *                              serverpackcreator.conf.
   * @author Griefed
   */
  protected ConfigurationPanel(VersionMeta versionMeta,
      ApplicationProperties applicationProperties,
      Utilities utilities,
      TabCreateServerPack tabCreateServerPack,
      Optional<CommentedConfig> addonConfig,
      String extensionName, String pluginID) {

    super(versionMeta, applicationProperties, utilities, tabCreateServerPack, addonConfig,
        extensionName, pluginID);

    panelName = extensionName + " (" + pluginID + ")";

    Font extensionHeader = new Font("Noto Sans Display Regular", Font.BOLD, 18);

    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = GridBagConstraints.WEST;
    gridBagConstraints.insets = new Insets(5, 5, 5, 5);
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.gridheight = 1;
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 1;

    JLabel pregenexample = new JLabel(
        "Example Pre Server Pack Generation Extension (pregenexample)");
    pregenexample.setFont(extensionHeader);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    add(pregenexample, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    JLabel pregenexampletext = new JLabel("text: ");
    add(pregenexampletext, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    add(pregen, gridBagConstraints);

    add(new JSeparator());

    JLabel prezipexample = new JLabel("Example Pre ZIP-Archive Creation Extension (prezipexample)");
    prezipexample.setFont(extensionHeader);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy += 1;
    add(prezipexample, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    JLabel prezipexampletext = new JLabel("text: ");
    add(prezipexampletext, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    add(prezip, gridBagConstraints);

    add(new JSeparator());

    JLabel postgenexample = new JLabel(
        "Example Post Server Pack Generation Extension (postgenexample)");
    postgenexample.setFont(extensionHeader);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy += 1;
    add(postgenexample, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    JLabel postgenexampletext = new JLabel("text: ");
    add(postgenexampletext, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    add(postgen, gridBagConstraints);

    add(new JSeparator());

    JLabel configcheckexample = new JLabel(
        "Example Configuration Check Extension (configcheckexample)");
    configcheckexample.setFont(extensionHeader);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy += 1;
    add(configcheckexample, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    JLabel configcheckexampletext = new JLabel("text: ");
    add(configcheckexampletext, gridBagConstraints);
    gridBagConstraints.gridy += 1;
    add(confcheck, gridBagConstraints);
  }

  /**
   * Retrieve this extensions server pack specific configuration. When no configuration with configs
   * for this extension has been loaded yet, the returned list is empty. Fill it with life!
   *
   * @return Config list to be used in subsequent server pack generation runs, by various other
   * extensions.
   * @author Griefed
   */
  @Override
  public ArrayList<CommentedConfig> serverPackExtensionConfig() {

    LOG_ADDONS.info("Retrieving " + panelName + " configuration.");

    String comment = " The ID of the extension.\n This field is used to identify the configuration to use when\n running the extension during config checks or server pack generation.";

    CommentedConfig pregenexample = TomlFormat.newConfig();
    pregenexample.setComment("extension", comment);
    pregenexample.set("extension", "pregenexample");
    pregenexample.set("text", pregen.getText());

    CommentedConfig prezipexample = TomlFormat.newConfig();
    prezipexample.setComment("extension", comment);
    prezipexample.set("extension", "prezipexample");
    prezipexample.set("text", prezip.getText());

    CommentedConfig postgenexample = TomlFormat.newConfig();
    postgenexample.setComment("extension", comment);
    postgenexample.set("extension", "postgenexample");
    postgenexample.set("text", postgen.getText());

    CommentedConfig configcheckexample = TomlFormat.newConfig();
    configcheckexample.setComment("extension", comment);
    configcheckexample.set("extension", "configcheckexample");
    configcheckexample.set("text", confcheck.getText());

    SERVERPACK_EXTENSION_CONFIG.clear();
    SERVERPACK_EXTENSION_CONFIG.add(pregenexample);
    SERVERPACK_EXTENSION_CONFIG.add(prezipexample);
    SERVERPACK_EXTENSION_CONFIG.add(postgenexample);
    SERVERPACK_EXTENSION_CONFIG.add(configcheckexample);

    return SERVERPACK_EXTENSION_CONFIG;
  }

  /**
   * Pass the extension configuration to the configuration panel so it can then, in turn, load the
   * available configurations and make them editable, if so desired.
   *
   * @param serverPackExtensionConfig The list of extension configurations to pass to the
   *                                  configuration panel.
   * @author Griefed
   */
  @Override
  public void setServerPackExtensionConfig(
      ArrayList<CommentedConfig> serverPackExtensionConfig) {

    LOG_ADDONS.info("Setting " + panelName + " configuration.");

    serverPackExtensionConfig.forEach(
        config -> {
          if (config.getOptional("extension").isPresent()) {

            String extension = config.getOptional("extension").get().toString();

            switch (extension) {
              case "pregenexample":

                pregen.setText(config.get("text").toString());
                break;

              case "prezipexample":

                prezip.setText(config.get("text").toString());
                break;

              case "postgenexample":

                postgen.setText(config.get("text").toString());
                break;

              case "configcheckexample":

                confcheck.setText(config.get("text").toString());
                break;
            }
          }
        }
    );
  }

  /**
   * Clear the interface, or in other words, reset this extensions config panel UI. If your Config
   * Panel Extensions has no elements you wish to reset, then simply overwrite this method with an
   * empty method body.<br><br> The <code>clear()</code>-method is called when the owning
   * <code>TabCreateServerPack.clearInterface()</code>-method is called.
   */
  @Override
  public void clear() {
    LOG_ADDONS.info("Clearing " + panelName + " interface.");

    pregen.setText("");
    prezip.setText("");
    postgen.setText("");
    confcheck.setText("");
  }
}
