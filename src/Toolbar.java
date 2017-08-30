import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel{
	private JButton btnHello;
	private JButton btnGoodbye;
	private TextPanel textPanel;
	public Toolbar() {
		
		btnGoodbye = new JButton("Goodbye");
		btnHello = new JButton("Hello");
		
		add(btnHello);
		add(btnGoodbye);		
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	
}
