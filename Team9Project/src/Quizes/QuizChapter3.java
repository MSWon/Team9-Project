package Quizes;


import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class QuizChapter3 extends JPanel implements ActionListener {
	private JTextField txtEncapsulation;
	private JTextField textField;
	private JTextField textField_1;
	private String[] Answer = {"encapsulation","private","setter"};
	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnAnswer;
	
	
	public QuizChapter3() {
		this.setBackground(Color.white);
		
		JLabel lblNewLabel = new JLabel("We can use");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		txtEncapsulation = new JTextField();
		txtEncapsulation.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		txtEncapsulation.setColumns(10);
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("1.");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblNewLabel_1 = new JLabel(" to add control information (guardian) as it passes");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2 = new JLabel("through the layered model and to combination of program code and data or ");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblNewLabel_3 = new JLabel("restriction of access to data except through dedicated code.");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel label_2 = new JLabel("2.");
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("is a modifier that will make the variables hidden. And it is the\r\n");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblNewLabel_5 = new JLabel(" first thing you should do for encapsulation.");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel label_3 = new JLabel("3.");
		label_3.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("takes a parameter ? new value for an instance variable. ");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblNewLabel_7 = new JLabel("It usually returns nothing and made pair with getter.");
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		
		JLabel lblQuizEncapsulation = new JLabel("Quiz - Encapsulation");
		lblQuizEncapsulation.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 40));
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		btnNewButton.addActionListener(this);
		
		btnAnswer = new JButton("Answer");
		btnAnswer.setEnabled(false);
		btnAnswer.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		btnAnswer.addActionListener(this);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(lblQuizEncapsulation))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addComponent(label_1)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(10)
					.addComponent(txtEncapsulation, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblNewLabel_1))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(label_2)
					.addGap(8)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblNewLabel_4))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(label_3)
					.addGap(20)
					.addComponent(lblA)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(515)
					.addComponent(btnAnswer)
					.addGap(18)
					.addComponent(btnNewButton))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblQuizEncapsulation)
					.addGap(125)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(label))
						.addComponent(label_1)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addComponent(lblNewLabel_1)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(txtEncapsulation, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addGap(9)
					.addComponent(lblNewLabel_3)
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(lblNewLabel_4)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblA))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_6))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_7)
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnswer)
						.addComponent(btnNewButton)))
		);
		setLayout(groupLayout);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(btnNewButton)){ // submit ¹öÆ°À» ´­·¶À»¶§ 
			
			btnAnswer.setEnabled(true);
			int Score = 0;
		    char Signal_1,Signal_2,Signal_3; // ¾î¶² ¹®Á¦°¡ ¸Â°í Æ²¸°Áö ¿·¿¡ OX Ã¼Å©
		     
		    if(txtEncapsulation.getText().toLowerCase().equals(Answer[0])){
		    	Score++;
		     	Signal_1 = 'O';
		     }
		    else
		     	Signal_1 = 'X';  //1¹ø¤Š ¹®Á¦
		     
		    if(textField.getText().toLowerCase().equals(Answer[1])){
		     	Score++;
		     	Signal_2 = 'O';
		     }
		    else
		     	Signal_2 = 'X';  //2¹ø¤Š ¹®Á¦
		     
		    if(textField_1.getText().toLowerCase().equals(Answer[2])){
		     	Score++;
		     	Signal_3 = 'O';
		     }
		    else
		     	Signal_3 = 'X'; // 3¹øÂ° ¹®Á¦
		     
		    JOptionPane.showMessageDialog(frame, "You've got "+Score+" / 3 correct."+"\n1."+Signal_1+"\n2."+Signal_2+"\n3."+Signal_3);
		}
		if(e.getSource().equals(btnAnswer)){ //Answer ¹öÆ°À» ´­·¶À»¶§
			JOptionPane.showMessageDialog(frame, "The Answer is\n"+"1.encapsulation\n"+"2.private\n"+"3.setter");
		}
		
	}

}
