import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton btnHello;
	private JButton btnGoodbye;
	private TextPanel textPanel;

	public Toolbar() {

		btnGoodbye = new JButton("Goodbye");
		btnHello = new JButton("Hello");

		btnGoodbye.addActionListener(this);
		btnHello.addActionListener(this);

		add(btnHello);
		add(btnGoodbye);
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button == btnHello) {
			this.textPanel.appendText("Hello\n");
		} else if (button == btnGoodbye) {
			this.textPanel.appendText("Goodbye\n");
		}
	}

	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}

}
