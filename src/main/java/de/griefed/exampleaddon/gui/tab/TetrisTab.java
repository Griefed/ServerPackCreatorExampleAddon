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
package de.griefed.exampleaddon.gui.tab;

import com.electronwill.nightconfig.core.CommentedConfig;
import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.addons.swinggui.ExtensionTab;
import de.griefed.serverpackcreator.utilities.common.Utilities;
import de.griefed.serverpackcreator.versionmeta.VersionMeta;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.util.Objects;
import java.util.Optional;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
  protected TetrisTab(
      VersionMeta versionMeta,
      ApplicationProperties applicationProperties,
      Utilities utilities,
      Optional<CommentedConfig> addonConfig,
      Optional<File> configFile) {
    super(versionMeta, applicationProperties, utilities, addonConfig, configFile);

    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.fill = GridBagConstraints.NONE;
    gridBagConstraints.anchor = GridBagConstraints.CENTER;
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.gridheight = 1;
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 1;

    JPanel miniGame = new JPanel();
    miniGame.setBorder(BorderFactory.createTitledBorder("Tetris Minigame"));
    miniGame.setLayout(new GridBagLayout());
    GridBagConstraints miniGameConstraints = new GridBagConstraints();
    miniGameConstraints.fill = GridBagConstraints.HORIZONTAL;
    miniGameConstraints.anchor = GridBagConstraints.CENTER;

    JLabel press = new JLabel("PRESS PLAY ON TAPE  ");
    JButton play = new JButton();
    play.setIcon(new ImageIcon(Objects.requireNonNull(TetrisTab.class.getResource("/play.png"))));
    play.setToolTipText("Open Tetris in a new window");
    play.addActionListener(e -> Tetris.main(null));

    miniGameConstraints.gridx = 0;
    miniGameConstraints.gridy = 0;
    miniGame.add(press, miniGameConstraints);
    miniGameConstraints.gridx = 0;
    miniGameConstraints.gridy = 1;
    miniGame.add(play, miniGameConstraints);

    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;

    miniGame.setPreferredSize(new Dimension(300, 135));
    add(miniGame, gridBagConstraints);

    gridBagConstraints.gridy += 1;
    gridBagConstraints.anchor = GridBagConstraints.WEST;
    gridBagConstraints.fill = GridBagConstraints.BOTH;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);

    if (addonConfig.isPresent() && configFile.isPresent()) {
      JPanel config = new JPanel();
      config.setBorder(BorderFactory.createTitledBorder("Global Example Addon Config"));
      config.setLayout(new GridBagLayout());
      GridBagConstraints configConstraints = new GridBagConstraints();

      configConstraints.fill = GridBagConstraints.HORIZONTAL;
      configConstraints.anchor = GridBagConstraints.NORTHWEST;
      configConstraints.gridwidth = 1;
      configConstraints.gridheight = 1;
      configConstraints.weighty = 1;

      JLabel who = new JLabel("Who am I?");
      configConstraints.gridx = 0;
      configConstraints.gridy = 0;
      configConstraints.weightx = 0.1F;
      config.add(who, configConstraints);

      ami = new JTextField(addonConfig.get().get("whoami"));
      configConstraints.gridx = 1;
      configConstraints.weightx = 1;
      config.add(ami, configConstraints);

      JLabel why = new JLabel("Why am I here?");
      configConstraints.gridx = 0;
      configConstraints.gridy += 1;
      configConstraints.weightx = 0.1F;
      config.add(why, configConstraints);

      here = new JTextField(addonConfig.get().get("whyamihere"));
      configConstraints.gridx = 1;
      configConstraints.weightx = 1;
      config.add(here, configConstraints);

      JButton set = new JButton("Set values");
      configConstraints.gridx = 0;
      configConstraints.gridy += 1;
      configConstraints.gridwidth = 2;
      set.addActionListener(e -> {
        addonConfig.get().set("whoami", ami.getText());
        addonConfig.get().set("whyamihere", here.getText());

        if (JOptionPane.showConfirmDialog(
            null,
            "New values set. Save addon configuration?   ",
            "Save?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE) == 0) {
          saveConfiguration();
        } else {
          JOptionPane.showMessageDialog(
              null,
              "Values not saved :-(   ",
              "Sad face",
              JOptionPane.WARNING_MESSAGE
          );
        }
      });
      config.add(set, configConstraints);

      add(config, gridBagConstraints);
    }
  }
}
