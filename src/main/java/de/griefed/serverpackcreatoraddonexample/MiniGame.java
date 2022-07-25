package de.griefed.serverpackcreatoraddonexample;

import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.plugins.swinggui.TabExtension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class MiniGame extends Plugin {

  /**
   * Constructor to be used by plugin manager for plugin instantiation. Your plugins have to provide
   * constructor with this exact signature to be successfully loaded by manager.
   *
   * @param wrapper {@link PluginWrapper} supplied by pf4j.
   */
  public MiniGame(PluginWrapper wrapper) {
    super(wrapper);
  }

  public void start() {
    System.out.println("Tetris Minigame");
  }

  @Extension(ordinal = 2)
  public static class MiniGameExtension extends JComponent implements TabExtension {

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

      JButton jButton = new JButton("Press Play On Tape");
      jButton.setToolTipText("Press to open Tetris in a new window.");
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 2;
      jComponent.add(jButton, gridBagConstraints);

      jButton.addActionListener(this::pressPlayOnTape);

      return jComponent;
    }

    private void pressPlayOnTape(ActionEvent actionEvent) {
      Tetris.main(null);
    }

    @Override
    public Icon getTabIcon() {
      return null;
    }

    @Override
    public String getTabTitle() {
      return "Tetris Minigame";
    }

    @Override
    public String getTabTooltip() {
      return null;
    }

    @Override
    public String getDescription() {
      return "Tetris minigame in a tab, for ServerPackCreator!";
    }

    @Override
    public String getAuthor() {
      return "Griefed";
    }

    @Override
    public String getVersion() {
      return "0.0.1";
    }

    @Override
    public void run(
        ApplicationProperties applicationProperties,
        ConfigurationModel configurationModel,
        String destination)
        throws Exception {
      System.out.println("FLYNN LIVES");
    }
  }
}
