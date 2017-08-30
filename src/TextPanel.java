import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	private JTextArea txtResult;
	public TextPanel(){
		setLayout(new BorderLayout());
		txtResult = new JTextArea();
		
		add(new JScrollPane(txtResult), BorderLayout.CENTER);		
	}
	
	public void appendText(String text){
		this.txtResult.append(text);
	}
}
