import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class SimpleJavaGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtIAmStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleJavaGUI window = new SimpleJavaGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleJavaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 262);
		frame.getContentPane().add(label);
		
		JLabel nameLabel = new JLabel("My name is ");
		nameLabel.setBounds(29, 52, 75, 28);
		frame.getContentPane().add(nameLabel);
		
		JLabel ageLabel = new JLabel("I am");
		ageLabel.setBounds(43, 103, 46, 14);
		frame.getContentPane().add(ageLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 56, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 100, 122, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtIAmStudent = new JTextField();
		txtIAmStudent.setEditable(false);
		txtIAmStudent.setText("I am student at Year Up. ");
		txtIAmStudent.setBounds(71, 147, 147, 20);
		frame.getContentPane().add(txtIAmStudent);
		txtIAmStudent.setColumns(10);
		
		JButton whoButton = new JButton("Who are you?");
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (whoButton.getText().equals("Who are you?"))
				{
					textField.setText("Deneshia Walton");
					textField_1.setText("20");
					whoButton.setText("Im Free!");
				}
				else if (whoButton.getText().equals("Im Free!"))
				{
					textField.setText("");
					textField_1.setText("");
					whoButton.setText("Who are you?");
				}
				
			}
		});
		whoButton.setBounds(39, 186, 200, 50);
		frame.getContentPane().add(whoButton);
	}
}
