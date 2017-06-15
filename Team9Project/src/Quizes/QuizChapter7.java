package Quizes;


import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class QuizChapter7 extends JPanel implements ActionListener{
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	private JButton submitbutton;
	private JButton answerbutton;
	private JRadioButton button1;
	private JRadioButton button2;
	private int count=0;
	
	
	public QuizChapter7() {
		this.setBackground(Color.white);
		JTextArea txtrWhichOf = new JTextArea();
		txtrWhichOf.setEditable(false);
		txtrWhichOf.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 23));
		txtrWhichOf.setText("1. Which of these is a process of writing the state of an\r\nobject to a byte stream?");
		
		JTextArea txtrWhichOf_1 = new JTextArea();
		txtrWhichOf_1.setEditable(false);
		txtrWhichOf_1.setText("2. Which of these process occur automatically by\r\n java run time system? ");
		txtrWhichOf_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 23));
		
		JLabel lblQuizSerialization = new JLabel("Quiz - Serialization");
		lblQuizSerialization.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 40));
		
		button1 = new JRadioButton("1. Serialization");
		buttonGroup.add(button1);
		button1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		button1.setBackground(Color.WHITE);
		
		JRadioButton rdbtnFileFiltering = new JRadioButton("2. File Filtering");
		buttonGroup.add(rdbtnFileFiltering);
		rdbtnFileFiltering.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnFileFiltering.setBackground(Color.WHITE);
		
		JRadioButton rdbtnExternalization = new JRadioButton("3. Externalization ");
		buttonGroup.add(rdbtnExternalization);
		rdbtnExternalization.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnExternalization.setBackground(Color.WHITE);
		
		JRadioButton rdbtnAllOf = new JRadioButton("4. All of the mentioned ");
		buttonGroup.add(rdbtnAllOf);
		rdbtnAllOf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnAllOf.setBackground(Color.WHITE);
		
		button2 = new JRadioButton("1. Serialization");
		buttonGroup_1.add(button2);
		button2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		button2.setBackground(Color.WHITE);
		
		JRadioButton rdbtnGarbageCollection = new JRadioButton("2. Garbage collection ");
		buttonGroup_1.add(rdbtnGarbageCollection);
		rdbtnGarbageCollection.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnGarbageCollection.setBackground(Color.WHITE);
		
		JRadioButton rdbtnFileFiltering_1 = new JRadioButton("3. File Filtering");
		buttonGroup_1.add(rdbtnFileFiltering_1);
		rdbtnFileFiltering_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnFileFiltering_1.setBackground(Color.WHITE);
		
		JRadioButton radioButton_1 = new JRadioButton("4. All of the mentioned ");
		buttonGroup_1.add(radioButton_1);
		radioButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		radioButton_1.setBackground(Color.WHITE);
		
		submitbutton = new JButton("Submit");
		submitbutton.addActionListener(this);
		submitbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		
		answerbutton = new JButton("Answer");
		answerbutton.addActionListener(this);
		answerbutton.setEnabled(false);
		answerbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(lblQuizSerialization))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(txtrWhichOf, GroupLayout.PREFERRED_SIZE, 657, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(rdbtnFileFiltering, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(rdbtnExternalization, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(rdbtnAllOf, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(txtrWhichOf_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(button2, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(rdbtnGarbageCollection))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(rdbtnFileFiltering_1))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(radioButton_1))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(523)
					.addComponent(answerbutton)
					.addGap(18)
					.addComponent(submitbutton))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(lblQuizSerialization)
					.addGap(19)
					.addComponent(txtrWhichOf, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(button1)
					.addGap(9)
					.addComponent(rdbtnFileFiltering, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(rdbtnExternalization, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(rdbtnAllOf, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(txtrWhichOf_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(button2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(rdbtnGarbageCollection, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(rdbtnFileFiltering_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(answerbutton)
						.addComponent(submitbutton)))
		);
		setLayout(groupLayout);

	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(submitbutton)){
			
			answerbutton.setEnabled(true);
			
			char signal1;
			char signal2;
			
			if(button1.isSelected()){
				count++;
				signal1 = 'O';
			}
			else
				signal1 = 'X';
			if(button2.isSelected()){
				count++;
				signal2 ='O';
			}
			else
				signal2 = 'X';
			
			JOptionPane.showMessageDialog(null, "You've got "+count+" / 2 correct."+"\n1."+signal1+"\n2."+signal2);
		}
		if(arg0.getSource().equals(answerbutton)){
			
			JOptionPane.showMessageDialog(null, "The Answer is\n"+"1.Serialization\n"+"2.Serialization");
			
		}
		
	}
}
