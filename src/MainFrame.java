import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{
    private JButton btnSubmit;
    private TextPanel txtResult;
    private Toolbar toolbar;
	public MainFrame(){
		super("Custom component");
		btnSubmit = new JButton("Submit");
		txtResult = new TextPanel();
		toolbar = new Toolbar();
		
		btnSubmit.addActionListener(this);
		toolbar.setTextPanel(txtResult);
		add(toolbar, BorderLayout.NORTH);
		add(btnSubmit, BorderLayout.SOUTH);
		add(txtResult, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.txtResult.appendText("Submitted\n");		
	}

}
