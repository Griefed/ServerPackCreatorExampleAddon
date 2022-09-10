package de.griefed.exampleaddon.gui.tab;

import com.electronwill.nightconfig.core.CommentedConfig;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.addons.swinggui.ExtensionTab;
import de.griefed.serverpackcreator.addons.swinggui.TabExtension;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
import java.io.File;
import java.util.Optional;
import javax.swing.Icon;
import org.pf4j.Extension;

@Extension
public class Tab implements TabExtension {

  /**
   * @param versionMeta           Instance of {@link VersionMeta} so you can work with available
   *                              Minecraft, Forge, Fabric, LegacyFabric and Quilt versions.
   * @param applicationProperties Instance of {@link ApplicationProperties} The current configuration of
   *                              ServerPackCreator, like the default list of clientside-only mods,
   *                              the server pack directory etc.
   * @param utilities             Instance of {@link Utilities} commonly used across
   *                              ServerPackCreator.
   * @param addonConfig           Addon specific configuration conveniently provided by
   *                              ServerPackCreator. This is the global configuration of the addon
   *                              which provides the ConfigPanelExtension to ServerPackCreator.
   * @param configFile            The config-file corresponding to the ID of the addon, wrapped in
   *                              an Optional.
   * @return Component to add to the ServerPackCreator GUI as a tab.
   * @author Griefed
   */
  @Override
  public ExtensionTab getTab(VersionMeta versionMeta, ApplicationProperties applicationProperties,
      Utilities utilities, Optional<CommentedConfig> addonConfig, Optional<File> configFile) {
    return new TetrisTab(versionMeta,applicationProperties,utilities,addonConfig,configFile);
  }

  /**
   * Get the {@link Icon} for this tab to display to the ServerPackCreator GUI.
   *
   * @return Icon to be used by the added tab.
   * @author Griefed
   */
  @Override
  public Icon getTabIcon() {
    return null;
  }

  /**
   * Get the title of this tab to display in the ServerPackCreator GUI.
   *
   * @return The title of this addons tabbed pane.
   * @author Griefed
   */
  @Override
  public String getTabTitle() {
    return "Tetris";
  }

  /**
   * Get the tooltip for this tab to display in the ServerPackCreator GUI.
   *
   * @return The tooltip of this addons tabbed pane.
   * @author Griefed
   */
  @Override
  public String getTabTooltip() {
    return "Click the button to play some Tetris.";
  }

  /**
   * Get the name of this addon.
   *
   * @return The name of this addon.
   * @author Griefed
   */
  @Override
  public String getName() {
    return "Example Tab Extension";
  }

  /**
   * Get the description of this addon.
   *
   * @return The description of this addon.
   * @author Griefed
   */
  @Override
  public String getDescription() {
    return "An example for an extension which adds an additional tab to the ServerPackCreator GUI which lets you play Tetris.";
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

  /**
   * Get the if of this extension. Used by ServerPackCreator to determine which configuration, if
   * any, to provide to any given extension being run.
   *
   * @return The ID of this extension.
   * @author Griefed
   */
  @Override
  public String getExtensionId() {
    return "tabextensionexample";
  }
}
