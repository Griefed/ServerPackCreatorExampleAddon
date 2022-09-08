package de.griefed.exampleaddon.gui.tab;

import com.electronwill.nightconfig.core.CommentedConfig;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.addons.swinggui.ExtensionTab;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.util.Optional;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TetrisTab extends ExtensionTab {

  private JTextField ami;
  private JTextField here;

  /**
   * Construct a new panel to add to the ServerPackCreator GUI as an additional tab.
   *
   * @param versionMeta           Instance of {@link VersionMeta} so you can work with available
   *                              Minecraft, Forge, Fabric, LegacyFabric and Quilt versions.
   * @param applicationProperties Instance of {@link ApplicationProperties} The current
   *                              configuration of ServerPackCreator, like the default list of
   *                              clientside-only mods, the server pack directory etc.
   * @param utilities             Instance of {@link Utilities} commonly used across
   *                              ServerPackCreator.
   * @param addonConfig           Addon specific configuration conveniently provided by
   *                              ServerPackCreator. This is the global configuration of the addon
   *                              which provides the ConfigPanelExtension to ServerPackCreator.
   * @param configFile            The config-file corresponding to the ID of the addon, wrapped in
   *                              an Optional.
   */
  protected TetrisTab(VersionMeta versionMeta,
      ApplicationProperties applicationProperties,
      Utilities utilities,
      Optional<CommentedConfig> addonConfig,
      Optional<File> configFile) {
    super(versionMeta, applicationProperties, utilities, addonConfig, configFile);

    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.fill = GridBagConstraints.NONE;
    gridBagConstraints.anchor = GridBagConstraints.WEST;
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.gridheight = 1;
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 1;

    JLabel press = new JLabel("PRESS PLAY ON TAPE");
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    add(press, gridBagConstraints);

    JButton play = new JButton("Tetris");
    play.setToolTipText("Open Tetris in a new window");
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    play.addActionListener(e -> Tetris.main(null));
    add(play, gridBagConstraints);

    if (addonConfig.isPresent()) {
      JLabel who = new JLabel("Who am I?");
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy += 1;
      add(who, gridBagConstraints);

      ami = new JTextField(addonConfig.get().get("whomai"));
      gridBagConstraints.gridx = 1;
      add(ami, gridBagConstraints);

      JLabel why = new JLabel("Why am I here?");
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy += 1;
      add(why, gridBagConstraints);

      here = new JTextField(addonConfig.get().get("whyamihere"));
      gridBagConstraints.gridx = 1;
      add(here, gridBagConstraints);

      JButton set = new JButton("Set values");
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy += 1;
      set.addActionListener(e -> {
        addonConfig.get().set("whomai", ami.getText());
        addonConfig.get().set("whyamihere", here.getText());

        if (JOptionPane.showConfirmDialog(
            null,
            "New values set. Save addon configuration?",
            "Save?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE) == 0) {
          saveConfiguration();
        } else {
          JOptionPane.showMessageDialog(
              null,
              "Values not saved :-(",
              "Sad face",
              JOptionPane.WARNING_MESSAGE
          );
        }
      });
      add(set, gridBagConstraints);
    }
  }
}
