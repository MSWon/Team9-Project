package Chapter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Editor.EditorPane;
import Editor.JEditPane;

public class TextPanel extends JPanel implements ActionListener {
	
	static EditorPane editorpane;
	JPanel subpanel, btnpanel;
	JPanel subpanel2;
	JEditPane textpane;
	String FileNameHolder;
	JLabel label1, label2;
	private char[] Password ;
	JButton btnQuestion;
	private JButton editbutton;
	
	
	
	//Getter Setter Encapulation
	
	public char[] getPassword() {
		return Password;
	}


	public void setPassword(char[] password) {
		if(password !=null)   // Guardian
			Password = password;
	}



	// main structure 
	public TextPanel(){
		
		this.setBackground(Color.WHITE);
		
		subpanel = new JPanel();
		subpanel.setBackground(Color.WHITE);
		btnpanel = new JPanel();
		btnpanel.setBackground(Color.WHITE);
		
		editbutton = new JButton("Edit");
		editbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		editbutton.addActionListener(this);

		btnpanel.add(editbutton);
		
		btnQuestion = new JButton("Comment");
		btnQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CommentFrame option = new CommentFrame(btnQuestion);
				btnQuestion.setEnabled(false);
				
			}
		});
		btnQuestion.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		GroupLayout gl_btnpanel = new GroupLayout(btnpanel);
		gl_btnpanel.setHorizontalGroup(
			gl_btnpanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnpanel.createSequentialGroup()
					.addContainerGap(170, Short.MAX_VALUE)
					.addComponent(btnQuestion)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(editbutton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		gl_btnpanel.setVerticalGroup(
			gl_btnpanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnpanel.createSequentialGroup()
					.addContainerGap(218, Short.MAX_VALUE)
					.addGroup(gl_btnpanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnQuestion, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(editbutton))
					.addGap(33))
		);
		btnpanel.setLayout(gl_btnpanel);			
	}
	
	
	
	private boolean isCorrect(char[] inputPassword) {
		
		char[] password2 = {'p','a','s','s'};
		setPassword(password2);
		if (inputPassword.length != Password.length)
			return false;
		for (int i = 0; i < inputPassword.length; i++)
			if (inputPassword[i] != Password[i])
				return false;
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		editbutton.setEnabled(false);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter a password:");
		JPasswordField pass = new JPasswordField(10);
		panel.add(label);
		panel.add(pass);
		String[] options = new String[]{"OK", "Cancel"};
		int option = JOptionPane.showOptionDialog(null, panel, "Password",
		                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
		                         null, options, options[1]);
		if(option == 0) 
		{
			try {
				
				char[] inputpassword = pass.getPassword();
				if (isCorrect(inputpassword) == true) {
					editorpane = new EditorPane(textpane, FileNameHolder,editbutton);

				}
				else {
					JOptionPane.showMessageDialog(null, "You enter wrong password");
				}
			} catch(NullPointerException NEX) {
				JOptionPane.showMessageDialog(null, "There is an error!! User enters null.");
				NEX.printStackTrace();
			}
		}
		else{
			editbutton.setEnabled(true);
		}
	}
}
