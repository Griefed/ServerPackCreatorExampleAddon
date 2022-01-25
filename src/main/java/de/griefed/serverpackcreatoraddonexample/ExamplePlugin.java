package de.griefed.serverpackcreatoraddonexample;

import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.plugins.serverpackhandler.ServerPackArchiveCreated;
import de.griefed.serverpackcreator.plugins.serverpackhandler.ServerPackCreated;
import de.griefed.serverpackcreator.plugins.serverpackhandler.ServerPackStart;
import de.griefed.serverpackcreator.plugins.swinggui.AddTab;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import javax.swing.*;
import java.awt.*;

public class ExamplePlugin extends Plugin {

    private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");

    /*
        You should provide and read all these from the manifest.
                                                                    */
    public static final String NAME = "ServerPackCreatorExampleAddon";
    public static final String DESCRIPTION = "This is an example addon for ServerPackCreator showcasing all, currently 4, aspects of" +
            "ServerPackCreators addon functionality. In this example you see code which gets executed before a server pack is generated," +
            "code that gets executed after a server pack was generated but before the ZIP-archive is created, code that gets executed" +
            "after this ZIP-archive was created, as well as code adding a new tabbed pane to the GUI.";
    public static final String AUTHOR = "Griefed";
    public static final String VERSION = "0.0.1";

    public ExamplePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        LOG_ADDONS.info("Starting ExamplePlugin...");
        LOG_ADDONS.info("This methods should prepare the environment for anything you want to do with it.");
        /*
            Write all your preparation code here..
                                                    */
    }

    @Extension(ordinal = 1)
    public static class ExampleStartPlugin implements ServerPackStart {

        @Override
        public void run(ApplicationProperties applicationProperties, ConfigurationModel configurationModel, String destination) throws Exception {
            LOG_ADDONS.info("This would run before a server pack generation.");
            LOG_ADDONS.info("We recieved the following configurationModel: " + configurationModel.toString());
            LOG_ADDONS.info("We received the following applicationProperties: " + applicationProperties.toString());
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
    public static class ExampleCreatedPlugin implements ServerPackCreated {

        @Override
        public void run(ApplicationProperties applicationProperties, ConfigurationModel configurationModel, String destination) throws Exception {
            LOG_ADDONS.info("This would run after a server pack was generated, but BEFORE the ZIP-archive would be generated.");
            LOG_ADDONS.info("We recieved the following configurationModel: " + configurationModel.toString());
            LOG_ADDONS.info("We received the following applicationProperties: " + applicationProperties.toString());
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
    public static class ExampleArchivePlugin implements ServerPackArchiveCreated {

        @Override
        public void run(ApplicationProperties applicationProperties, ConfigurationModel configurationModel, String destination) throws Exception {
            LOG_ADDONS.info("This would run after the server pack ZIP-archive was created.");
            LOG_ADDONS.info("We recieved the following configurationModel: " + configurationModel.toString());
            LOG_ADDONS.info("We received the following applicationProperties: " + applicationProperties.toString());
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
    public static class ExampleTabbedpanePlugin extends JComponent implements AddTab {

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
        public void run(ApplicationProperties applicationProperties, ConfigurationModel configurationModel, String destination) throws Exception {
            LOG_ADDONS.info("When adding tabbed panes, you could also write some backend logic here, like threads that do some stuff.");
            LOG_ADDONS.info("We recieved the following configurationModel: " + configurationModel.toString());
            LOG_ADDONS.info("We received the following applicationProperties: " + applicationProperties.toString());
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
}
