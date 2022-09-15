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
package de.griefed.exampleaddon.serverpack;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.toml.TomlWriter;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.addons.serverpackhandler.PreGenExtension;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;

@Extension
public class PreGeneration implements PreGenExtension {

  private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");
  private TomlWriter tomlWriter = null;

  /**
   * @param versionMeta           Instance of {@link VersionMeta} so you can work with available
   *                              Minecraft, Forge, Fabric, LegacyFabric and Quilt versions.
   * @param utilities             Instance of {@link Utilities} commonly used across
   *                              ServerPackCreator.
   * @param applicationProperties Instance of {@link ApplicationProperties} as ServerPackCreator
   *                              itself uses it.
   * @param configurationModel    Instance of {@link ConfigurationModel} for a given server pack.
   * @param destination           String. The destination of the server pack.
   * @param addonConfig           Configuration for this addon, conveniently provided by
   *                              ServerPackCreator.
   * @param packSpecificConfigs   Modpack and server pack specific configurations for this addon,
   *                              conveniently provided by ServerPackCreator.
   * @throws Exception {@link Exception} when an uncaught error occurs in the addon.
   * @author Griefed
   */
  @Override
  public void run(
      VersionMeta versionMeta,
      Utilities utilities,
      ApplicationProperties applicationProperties,
      ConfigurationModel configurationModel,
      String destination,
      Optional<CommentedConfig> addonConfig,
      ArrayList<CommentedConfig> packSpecificConfigs
  ) throws Exception {

    LOG_ADDONS.info("I am: " + getName() + "(" + getVersion() + ") by " + getAuthor() + ". "
        + getDescription());
    LOG_ADDONS.info(
        "Running with ServerPackCreator " + applicationProperties.SERVERPACKCREATOR_VERSION());
    LOG_ADDONS.info("I would do stuff before the generation of the server pack starts!");
    LOG_ADDONS.info("I could make some magic happen in the " + destination + "-directory :-)");

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
    }
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
    return "pregenexample";
  }


  /**
   * Get the name of this addon.
   *
   * @return The name of this addon.
   * @author Griefed
   */
  @Override
  public String getName() {
    return "Example Pre Server Pack Generation Extension";
  }

  /**
   * Get the description of this addon.
   *
   * @return The description of this addon.
   * @author Griefed
   */
  @Override
  public String getDescription() {
    return "An example for an extension which executes right before the generation of a server pack starts.";
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
