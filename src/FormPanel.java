import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class FormPanel extends JPanel {
	public FormPanel() {
		Dimension dim = new Dimension();
		dim.width = 250;
		setPreferredSize(dim);
		javax.swing.border.Border innerBorder = BorderFactory.createTitledBorder("Add person");
		javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));

	}
}
