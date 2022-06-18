package de.griefed.serverpackcreatoraddonexample;

import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.plugins.serverpackhandler.PreZipExtension;
import de.griefed.serverpackcreator.utilities.ConfigUtilities;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;

@Extension
public class ExampleCreatedExtension implements PreZipExtension {

  private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");

  public final String NAME = "Example PreZip Extension";
  public final String DESCRIPTION =
      "Small and basic example for a PreZip extension. This would run after a server pack was generated, but BEFORE the ZIP-archive would be generated.";
  public final String PROVIDER = "Griefed";
  public final String VERSION = "0.0.1";

  @Override
  public void run(
      ApplicationProperties applicationProperties,
      ConfigurationModel configurationModel,
      String destination)
      throws Exception {
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

    new ConfigUtilities(null, null, applicationProperties, null)
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
    return PROVIDER;
  }

  @Override
  public String getVersion() {
    return VERSION;
  }
}
