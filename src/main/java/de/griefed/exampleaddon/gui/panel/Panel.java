package de.griefed.exampleaddon.gui.panel;

import com.electronwill.nightconfig.core.CommentedConfig;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ServerPackHandler;
import de.griefed.serverpackcreator.addons.swinggui.ConfigPanelExtension;
import de.griefed.serverpackcreator.addons.swinggui.ExtensionConfigPanel;
import de.griefed.serverpackcreator.swing.TabCreateServerPack;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
import java.util.Optional;
import org.pf4j.Extension;

@Extension
public class Panel implements ConfigPanelExtension {

  /**
   * This method gets called when an extension of this type is run. All parameters are provided by
   * ServerPackCreator, so you do not have to take care of them. A ConfigPanel is intended to be
   * used to change server pack-specific configurations which can then be used by other extensions
   * in your plugin. A simple example would be downloading a specific version of some mod. You could
   * add a panel which lets the user configure the version of the mod to use. When the user then
   * runs the server pack generation, your setting will be stored in the subsequently generated
   * serverpackcreator.conf, and could be used in any of the {@link ServerPackHandler}
   * extension-points, which would then download the version you specified via this here panel.
   *
   * @param versionMeta           Instance of {@link VersionMeta} so you can work with available
   *                              Minecraft, Forge, Fabric, LegacyFabric and Quilt versions.
   * @param applicationProperties Instance of {@link ApplicationProperties} The current configuration of
   *                              ServerPackCreator, like the default list of clientside-only mods,
   *                              the server pack directory etc.
   * @param utilities             Instance of {@link Utilities} commonly used across
   *                              ServerPackCreator.
   * @param tabCreateServerPack   Instance of {@link TabCreateServerPack} to give you access to the
   *                              various fields inside it, like the modpack directory, selected
   *                              Minecraft, modloader and modloader versions, etc.
   * @param addonConfig           Addon specific configuration conveniently provided by
   *                              ServerPackCreator. This is the global configuration of the addon
   *                              which provides the ConfigPanelExtension to ServerPackCreator.
   * @param extensionName         The name the titled border of this ConfigPanel will get.
   * @param pluginID              The same as the PluginId.
   * @return A ConfigPanel allowing users to further customize their ServerPackCreator experience
   * when using an addon.
   * @author Griefed
   */
  @Override
  public ExtensionConfigPanel getPanel(VersionMeta versionMeta,
      ApplicationProperties applicationProperties, Utilities utilities,
      TabCreateServerPack tabCreateServerPack, Optional<CommentedConfig> addonConfig,
      String extensionName, String pluginID) {
    return new ConfigurationPanel(versionMeta,applicationProperties,utilities,tabCreateServerPack,addonConfig,extensionName,pluginID);
  }

  /**
   * Get the name of this addon.
   *
   * @return The name of this addon.
   * @author Griefed
   */
  @Override
  public String getName() {
    return "Example Config Panel Extension";
  }

  /**
   * Get the description of this addon.
   *
   * @return The description of this addon.
   * @author Griefed
   */
  @Override
  public String getDescription() {
    return "An example for an extension which adds a server pack specific addon extension configuration panel.";
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
