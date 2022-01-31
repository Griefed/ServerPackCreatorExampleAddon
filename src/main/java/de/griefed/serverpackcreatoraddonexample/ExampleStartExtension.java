package de.griefed.serverpackcreatoraddonexample;

import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.plugins.serverpackhandler.PreGenExtension;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;

import java.nio.file.Files;
import java.nio.file.Paths;

@Extension
public class ExampleStartExtension implements PreGenExtension {

    private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");

    public final String NAME = "Example PreGen Extension";
    public final String DESCRIPTION = "Small and basic example for a PreGen extension. This would run before a server pack generation.";
    public final String PROVIDER = "Griefed";
    public final String VERSION = "0.0.1";

    @Override
    public void run(ApplicationProperties applicationProperties, ConfigurationModel configurationModel, String destination) throws Exception {
        LOG_ADDONS.info("Received destination: " + destination);
        LOG_ADDONS.info("We recieved the following configurationModel: " + configurationModel.toString());
        LOG_ADDONS.info("We received the following applicationProperties: " + applicationProperties.toString());
        StringUtils.upperCase("some text in lower case");
        //Create example file in server pack
        try {
            Files.createFile(Paths.get(String.format("%s/%s", destination, this.getClass().getSimpleName())));
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
        return PROVIDER;
    }

    @Override
    public String getVersion() {
        return VERSION;
    }
}