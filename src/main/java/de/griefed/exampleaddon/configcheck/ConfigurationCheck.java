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
package de.griefed.exampleaddon.configcheck;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.toml.TomlWriter;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.addons.configurationhandler.ConfigCheckExtension;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
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
   * @param versionMeta           Instance of {@link VersionMeta} so you can work with available
   *                              Minecraft, Forge, Fabric, LegacyFabric and Quilt versions.
   * @param applicationProperties Instance of {@link ApplicationProperties} The current
   *                              configuration of ServerPackCreator, like the default list of
   *                              clientside-only mods, the server pack directory etc.
   * @param utilities             Instance of {@link Utilities} commonly used across
   *                              ServerPackCreator.
   * @param configurationModel    The configuration to check.
   * @param encounteredErrors     A list of encountered errors during any and all checks. The list
   *                              is displayed to the user if it contains any entries.
   * @param addonConfig           Configuration for this addon, conveniently provided by
   *                              ServerPackCreator.
   * @param packSpecificConfigs   Modpack and server pack specific configurations for this addon,
   *                              conveniently provided by ServerPackCreator.
   * @return <code>true</code> if an error was encountered. <code>false</code> if the checks were
   * successful.
   * @throws Exception if any unexpected error is encountered during the execution of this method.
   * @author Griefed
   */
  @Override
  public boolean runCheck(
      VersionMeta versionMeta,
      ApplicationProperties applicationProperties,
      Utilities utilities,
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
        encounteredErrors.add("Extension " + packSpecificConfigs.get(i).get("extension").toString()
            + " encountered an error.");
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
   * Get the if of this extension. Used by ServerPackCreator to determine which configuration, if
   * any, to provide to any given extension being run.
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
