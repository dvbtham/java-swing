import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{
    private JButton btnSubmit;
    private TextPanel txtResult;
    private Toolbar toolbar;
    private FormPanel formPanel;
	public MainFrame(){
		super("Custom component");
		btnSubmit = new JButton("Submit");
		txtResult = new TextPanel();
		toolbar = new Toolbar();
		formPanel = new FormPanel();
		
		btnSubmit.addActionListener(this);
		toolbar.setStringListener(new StringListener() {
			
			@Override
			public void textEmmited(String text) {
				txtResult.appendText(text);
			}
		});
		
		formPanel.setFormListener(new FormListener(){
			public void formEventOccurred(FormEvent e){
				String name = e.getName();
				String occupation = e.getOppucation();
				txtResult.appendText(name + ": " + occupation + "\n");
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(formPanel, BorderLayout.WEST);
		add(btnSubmit, BorderLayout.SOUTH);
		add(txtResult, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.txtResult.appendText("Submitted\n");		
	}

}
