package Quizes;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class QuizChapter5 extends Quiz{
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	private JButton submitbutton;
	private JButton answerbutton;
	private JRadioButton button1;
	private JRadioButton button2;
	private int count=0;
	
	
	public QuizChapter5() {
		
		this.setBackground(Color.white);
		JTextArea txtrWhichOf = new JTextArea();
		txtrWhichOf.setEditable(false);
		txtrWhichOf.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 23));
		txtrWhichOf.setText("1. What is polymorphism in Java?");
		
		JTextArea txtrWhichOf_1 = new JTextArea();
		txtrWhichOf_1.setEditable(false);
		txtrWhichOf_1.setText("2. What is an advantage of polymorphism?");
		txtrWhichOf_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD | Font.ITALIC, 23));
		
		JLabel lblQuizSerialization = new JLabel("Quiz - Polymorphism");
		lblQuizSerialization.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 40));
		
		button1 = new JRadioButton("1. It is when a single variable is used with several different types");
		buttonGroup.add(button1);
		button1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		button1.setBackground(Color.WHITE);
		
		JRadioButton rdbtnFileFiltering = new JRadioButton("2. It is when a program uses several different types of objects, ");
		buttonGroup.add(rdbtnFileFiltering);
		rdbtnFileFiltering.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnFileFiltering.setBackground(Color.WHITE);
		
		JRadioButton rdbtnExternalization = new JRadioButton("3. It is when a single parent class has many child classes.");
		buttonGroup.add(rdbtnExternalization);
		rdbtnExternalization.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnExternalization.setBackground(Color.WHITE);
		
		JRadioButton rdbtnAllOf = new JRadioButton("4. It is when a class has several methods with the same name ");
		buttonGroup.add(rdbtnAllOf);
		rdbtnAllOf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnAllOf.setBackground(Color.WHITE);
		
		button2 = new JRadioButton("1. The same program logic can be used with objects of several\r\n");
		buttonGroup_1.add(button2);
		button2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		button2.setBackground(Color.WHITE);
		
		JRadioButton rdbtnGarbageCollection = new JRadioButton("2. Variables can be re-used in order to save memory.");
		buttonGroup_1.add(rdbtnGarbageCollection);
		rdbtnGarbageCollection.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnGarbageCollection.setBackground(Color.WHITE);
		
		JRadioButton rdbtnFileFiltering_1 = new JRadioButton("3. Constructing new objects from old objects of a similar type saves time.");
		buttonGroup_1.add(rdbtnFileFiltering_1);
		rdbtnFileFiltering_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnFileFiltering_1.setBackground(Color.WHITE);
		
		JRadioButton rdbtnPolymorphismIs = new JRadioButton("4. Polymorphism is a dangerous aspect of inheritance and should ");
		buttonGroup_1.add(rdbtnPolymorphismIs);
		rdbtnPolymorphismIs.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		rdbtnPolymorphismIs.setBackground(Color.WHITE);
		
		submitbutton = new JButton("Submit");
		submitbutton.addActionListener(this);
		submitbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		
		answerbutton = new JButton("Answer");
		answerbutton.addActionListener(this);
		answerbutton.setEnabled(false);
		answerbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("    of related objects at different places in a program.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		
		JLabel lblEachWithIts = new JLabel("    each with its own variable.");
		lblEachWithIts.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		
		JLabel lblButDifferentParameter = new JLabel("    but different parameter types.");
		lblButDifferentParameter.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		
		JLabel lblRelatedTypes = new JLabel("     related types");
		lblRelatedTypes.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		
		JLabel lblBeAvoided = new JLabel("    be avoided.");
		lblBeAvoided.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblQuizSerialization))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(txtrWhichOf, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(rdbtnFileFiltering, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblEachWithIts, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(rdbtnExternalization, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(rdbtnAllOf, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblButDifferentParameter, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(txtrWhichOf_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(button2, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblRelatedTypes, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(rdbtnGarbageCollection, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(rdbtnFileFiltering_1, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(rdbtnPolymorphismIs, GroupLayout.PREFERRED_SIZE, 719, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblBeAvoided, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(494)
					.addComponent(answerbutton)
					.addGap(18)
					.addComponent(submitbutton))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblQuizSerialization)
					.addGap(57)
					.addComponent(txtrWhichOf, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel)
					.addGap(11)
					.addComponent(rdbtnFileFiltering, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblEachWithIts)
					.addGap(11)
					.addComponent(rdbtnExternalization, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnAllOf, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblButDifferentParameter)
					.addGap(9)
					.addComponent(txtrWhichOf_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addComponent(button2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblRelatedTypes)
					.addGap(13)
					.addComponent(rdbtnGarbageCollection, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnFileFiltering_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnPolymorphismIs, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblBeAvoided)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(answerbutton)
						.addComponent(submitbutton)))
		);
		setLayout(groupLayout);

	}
	
	@Override 
	public void CheckAnswer(){
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


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(submitbutton)){
			CheckAnswer();	
		}
		if(arg0.getSource().equals(answerbutton)){	
			JOptionPane.showMessageDialog(null,"1.It is when a single variable is used with several different types of related objects at different places in a program."
					+ "\n2.The same program logic can be used with objects of several related types");	
		}
		
	}

}
