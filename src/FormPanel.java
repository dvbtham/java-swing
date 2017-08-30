import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FormPanel extends JPanel {
	private JLabel lblName;
	private JLabel lblOccupation;
	private JTextField txtName;
	private JTextField txtOccupation;
	private JButton btnOk;
	private FormListener formListener;
	
	public FormPanel() {
		
		lblName = new JLabel("Name: ");
		lblOccupation = new JLabel("Occupation: ");
		txtName = new JTextField(10);		
		txtOccupation = new JTextField(10);
		btnOk = new JButton("Ok");
		
		//event
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText(), occupation = txtOccupation.getText();
				FormEvent fe = new FormEvent(this, name, occupation);
				if(formListener != null)
					formListener.formEventOccurred(fe);
			}
		});
				
		Dimension dim = new Dimension();
		dim.width = 250;
		setPreferredSize(dim);
		javax.swing.border.Border innerBorder = BorderFactory.createTitledBorder("Add person");
		javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		////////////// first row /////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.fill = GridBagConstraints.NONE;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(lblName, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);;
		gc.anchor = GridBagConstraints.LINE_START;
		add(txtName, gc);
		
		////////////// second row /////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(lblOccupation, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(0, 0, 0, 0);;
		gc.anchor = GridBagConstraints.LINE_START;
		add(txtOccupation, gc);
		
		////////////// third row /////////////
		
		gc.weightx = 1;
		gc.weighty = 1.0;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(btnOk, gc);
	}
	
	public void setFormListener(FormListener formListener){
		this.formListener = formListener;
	}
}
