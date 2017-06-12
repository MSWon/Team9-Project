package Chapter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TextPanel extends JPanel implements ActionListener {
	
	EditorPane editorpane;
	JPanel subpanel, btnpanel;
	JPanel subpanel2;
	JEditPane textpane;
	String FileNameHolder;
	JLabel label1, label2;
	
	// main structure 
	public TextPanel(){
		
		this.setBackground(Color.WHITE);
		
		subpanel = new JPanel();
		subpanel.setBackground(Color.WHITE);
		btnpanel = new JPanel();
		btnpanel.setBackground(Color.WHITE);
		
		JButton editbutton = new JButton("Edit");
		editbutton.setFont(new Font("���� ����", Font.BOLD, 18));
		editbutton.addActionListener(this);

		btnpanel.add(editbutton);
		
		JButton btnQuestion = new JButton("Question");
		btnQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuestionFrame option = new QuestionFrame();
			}
		});
		btnQuestion.setFont(new Font("���� ����", Font.BOLD, 18));
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
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String resultStr = null;
		String correctAns = "pass";
		resultStr = JOptionPane.showInputDialog("Enter the admin's password\n\u203B Edit is only for administratior \u203B");
		try {
			if (resultStr.equals(correctAns))
			{
				editorpane = new EditorPane();
				editorpane.makeEditorFrom(textpane, FileNameHolder);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You enter wrong password");
			}
		} catch(NullPointerException NEX) {
			System.out.println("User enters null.");
		}
	}
}