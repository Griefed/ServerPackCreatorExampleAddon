package de.griefed.serverpackcreatoraddonexample;

import de.griefed.serverpackcreator.ApplicationProperties;
import de.griefed.serverpackcreator.ConfigurationModel;
import de.griefed.serverpackcreator.plugins.swinggui.TabExtension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pf4j.Extension;

@Extension
public class ExampleTabExtension implements TabExtension {

  private static final Logger LOG_ADDONS = LogManager.getLogger("AddonsLogger");

  public final String NAME = "Example Tab Extension";
  public final String DESCRIPTION =
      "Small and basic example for a Tab extension. This adds a tab containing a single JLabel and JButton.";
  public final String PROVIDER = "Griefed";
  public final String VERSION = "0.0.1";

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

    JLabel jLabel = new JLabel("This is a label");
    jLabel.setToolTipText("Some label tooltip");
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    jComponent.add(jLabel, gridBagConstraints);

    JButton jButton = new JButton("Some button");
    jButton.setToolTipText("This could do anything");
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    jComponent.add(jButton, gridBagConstraints);

    return jComponent;
  }

  @Override
  public Icon getTabIcon() {
    return UIManager.getIcon("OptionPane.informationIcon");
  }

  @Override
  public String getTabTitle() {
    return "Some title text";
  }

  @Override
  public String getTabTooltip() {
    return "Some tooltip text";
  }

  @Override
  public void run(
      ApplicationProperties applicationProperties,
      ConfigurationModel configurationModel,
      String destination)
      throws Exception {}

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
