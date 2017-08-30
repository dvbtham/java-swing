import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton btnHello;
	private JButton btnGoodbye;
	private StringListener textListener;

	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());
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
			if(textListener != null)
				textListener.textEmmited("Hello\n");
		} else if (button == btnGoodbye) {
			if(textListener != null)
				textListener.textEmmited("Goodbye\n");
		}
	}

	public void setStringListener(StringListener textListener) {
		this.textListener = textListener;
	}

}
