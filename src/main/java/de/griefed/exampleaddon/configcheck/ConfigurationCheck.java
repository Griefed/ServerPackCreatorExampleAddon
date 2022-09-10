package de.griefed.exampleaddon.configcheck;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.toml.TomlWriter;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.addons.configurationhandler.ConfigCheckExtension;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;

@Extension
public class ConfigurationCheck implements ConfigCheckExtension {

  private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");
  private TomlWriter tomlWriter = null;

  /**
   * @param configurationModel  The configuration to check.
   * @param encounteredErrors   A list of encountered errors during any and all checks. The list is
   *                            displayed to the user if it contains any entries.
   * @param addonConfig         Configuration for this addon, conveniently provided by
   *                            ServerPackCreator.
   * @param packSpecificConfigs Modpack and server pack specific configurations for this addon,
   *                            conveniently provided by ServerPackCreator.
   * @return <code>true</code> if an error was encountered. <code>false</code> if the checks were
   * successful.
   * @throws Exception if any unexpected error is encountered during the execution of this method.
   * @author Griefed
   */
  @Override
  public boolean runCheck(
      ConfigurationModel configurationModel,
      List<String> encounteredErrors,
      Optional<CommentedConfig> addonConfig,
      ArrayList<CommentedConfig> packSpecificConfigs)
      throws Exception {

    boolean bool = false;

    LOG_ADDONS.info("I am: " + getName() + "(" + getVersion() + ") by " + getAuthor() + ". "
        + getDescription());
    LOG_ADDONS.info("I would provide additional checks for a given server pack configuration!");

    LOG_ADDONS.info("Maybe something based on this server packs Minecraft version "
        + configurationModel.getMinecraftVersion() + "?");

    if (addonConfig.isPresent()) {
      LOG_ADDONS.info("I got passed the following configuration:");

      StringWriter stringWriter = new StringWriter();

      getTomlWriter().write(addonConfig.get(), stringWriter);
      LOG_ADDONS.info(stringWriter);
    }

    LOG_ADDONS.info("I got passed the following pack specific configuration(s):");

    for (int i = 0; i < packSpecificConfigs.size(); i++) {

      LOG_ADDONS.info("Configuration " + i + " of " + packSpecificConfigs.size() + ":");

      StringWriter stringWriter = new StringWriter();

      getTomlWriter().write(packSpecificConfigs.get(i), stringWriter);
      LOG_ADDONS.info(stringWriter);

      if (!packSpecificConfigs.get(i).get("text").toString().isEmpty()) {
        bool = true;
        encounteredErrors.add("Extension " + packSpecificConfigs.get(i).get("extension").toString() + " encountered an error.");
      }
    }

    return bool;
  }

  private TomlWriter getTomlWriter() {
    if (tomlWriter == null) {
      tomlWriter = new TomlWriter();
    }
    return tomlWriter;
  }

  /**
   * Get the if of this extension. Used by ServerPackCreator to determine which configuration, if any,
   * to provide to any given extension being run.
   *
   * @return The ID of this extension.
   * @author Griefed
   */
  @Override
  public String getExtensionId() {
    return "configcheckexample";
  }

  /**
   * Get the name of this addon.
   *
   * @return The name of this addon.
   * @author Griefed
   */
  @Override
  public String getName() {
    return "Example Configuration Check Extension";
  }

  /**
   * Get the description of this addon.
   *
   * @return The description of this addon.
   * @author Griefed
   */
  @Override
  public String getDescription() {
    return "An example for an extension which executes additional configuration checks.";
  }

  /**
   * Get the author of this addon.
   *
   * @return The author of this addon.
   * @author Griefed
   */
  @Override
  public String getAuthor() {
    return "Griefed";
  }

  /**
   * Get the version of this addon.
   *
   * @return The version of this addon.
   * @author Griefed
   */
  @Override
  public String getVersion() {
    return "0.0.1-SNAPSHOT";
  }
}
