package Quizes;



import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class QuizChapter6 extends Quiz{
   
   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private String[] Answer = {"widget","action event","event handling","addactionlistener","flowlayout"};
   private JButton btnSubmit;
   private JButton btnAnswer;
  
   /**
    * Create the panel.
    */
   public QuizChapter6() {
      
	   
      JLabel lblQuizGui = new JLabel("Quiz - GUI");
      lblQuizGui.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 40));
      
      JLabel lblJframeContains = new JLabel("1.  JFrame contains");
      lblJframeContains.setFont(new Font("±¼¸²", Font.PLAIN, 22));
      
      JLabel lblNewLabel = new JLabel("2. When button is clicked, it creates an ");
      lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 22));
      
      JLabel lblNewLabel_1 = new JLabel("3. The process of registering and handling event is");
      lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
      
      textField = new JTextField();
      textField.setFont(new Font("±¼¸²", Font.PLAIN, 22));
      textField.setColumns(6);
      
      textField_1 = new JTextField();
      textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
      textField_1.setColumns(11);
      
      textField_2 = new JTextField();
      textField_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
      textField_2.setColumns(11);
      
      JLabel lblNewLabel_2 = new JLabel("4. ");
      lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
      
      textField_3 = new JTextField();
      textField_3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
      textField_3.setColumns(10);
      
      JLabel lblNewLabel_3 = new JLabel("method registers new action listener ");
      lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 22));
      
      JLabel lblNewLabel_4 = new JLabel("5. JPanel's default layout manager is");
      lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 22));
      
      textField_4 = new JTextField();
      textField_4.setFont(new Font("±¼¸²", Font.PLAIN, 18));
      textField_4.setColumns(9);
      
      btnSubmit = new JButton("Submit");
      btnSubmit.addActionListener(this);
      
            btnSubmit.setBackground(UIManager.getColor("Button.background"));
            btnSubmit.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
            
            btnAnswer = new JButton("Answer");
            btnAnswer.setEnabled(false);
            btnAnswer.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
            btnAnswer.addActionListener(this);
            GroupLayout groupLayout = new GroupLayout(this);
            groupLayout.setHorizontalGroup(
            	groupLayout.createParallelGroup(Alignment.LEADING)
            		.addGroup(groupLayout.createSequentialGroup()
            			.addGap(56)
            			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            				.addComponent(lblQuizGui)
            				.addGroup(groupLayout.createSequentialGroup()
            					.addComponent(lblJframeContains)
            					.addGap(15)
            					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            				.addGroup(groupLayout.createSequentialGroup()
            					.addComponent(lblNewLabel)
            					.addGap(11)
            					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            				.addGroup(groupLayout.createSequentialGroup()
            					.addComponent(lblNewLabel_2)
            					.addGap(8)
            					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            					.addGap(20)
            					.addComponent(lblNewLabel_3))
            				.addGroup(groupLayout.createSequentialGroup()
            					.addComponent(lblNewLabel_4)
            					.addGap(20)
            					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
            					.addGroup(groupLayout.createSequentialGroup()
            						.addComponent(btnAnswer)
            						.addGap(18)
            						.addComponent(btnSubmit))
            					.addGroup(groupLayout.createSequentialGroup()
            						.addComponent(lblNewLabel_1)
            						.addGap(19)
            						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
            			.addGap(63))
            );
            groupLayout.setVerticalGroup(
            	groupLayout.createParallelGroup(Alignment.LEADING)
            		.addGroup(groupLayout.createSequentialGroup()
            			.addGap(15)
            			.addComponent(lblQuizGui)
            			.addGap(81)
            			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            				.addGroup(groupLayout.createSequentialGroup()
            					.addGap(6)
            					.addComponent(lblJframeContains))
            				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
            			.addGap(48)
            			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            				.addGroup(groupLayout.createSequentialGroup()
            					.addGap(6)
            					.addComponent(lblNewLabel))
            				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
            			.addGap(52)
            			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            				.addGroup(groupLayout.createSequentialGroup()
            					.addGap(5)
            					.addComponent(lblNewLabel_1))
            				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
            			.addGap(54)
            			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            				.addGroup(groupLayout.createSequentialGroup()
            					.addGap(8)
            					.addComponent(lblNewLabel_2))
            				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
            				.addComponent(lblNewLabel_3))
            			.addGap(40)
            			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
            				.addGroup(groupLayout.createSequentialGroup()
            					.addGap(5)
            					.addComponent(lblNewLabel_4))
            				.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
            			.addGap(64)
            			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
            				.addComponent(btnSubmit)
            				.addComponent(btnAnswer))
            			.addGap(40))
            );
            setLayout(groupLayout);
   }
   
   
@Override
public void CheckAnswer(){
	
	 btnAnswer.setEnabled(true);//submitÀ» ÇÑ¹øÀÌ¶óµµ ´­·¯¾ß answer°¡ È°¼ºÈ­µÊ 
	 
	 int Score = 0;
     char Signal_1,Signal_2,Signal_3,Signal_4,Signal_5 ; // ¾î¶² ¹®Á¦°¡ ¸Â°í Æ²¸°Áö ¿·¿¡ OX Ã¼Å©
     
     if(textField.getText().toLowerCase().equals(Answer[0])){
        Score++;
        Signal_1 = 'O';
     }
     else
        Signal_1 = 'X';  //1¹ø¤Š ¹®Á¦
     
     if(textField_1.getText().toLowerCase().equals(Answer[1])){
        Score++;
        Signal_2 = 'O';
     }
     else
        Signal_2 = 'X';  //2¹ø¤Š ¹®Á¦
     
     if(textField_2.getText().toLowerCase().equals(Answer[2])){
        Score++;
        Signal_3 = 'O';
     }
     else
        Signal_3 = 'X'; // 3¹øÂ° ¹®Á¦
     
     if(textField_3.getText().toLowerCase().equals(Answer[3])){
        Score++;
        Signal_4 = 'O';
     }
     else
        Signal_4 = 'X'; //4¹ø¤Š ¹®Á¦
     
     if(textField_4.getText().toLowerCase().equals(Answer[4])){
        Score++;
        Signal_5 = 'O';
     }
     else
        Signal_5 = 'X'; //5¹øÂ° ¹®Á¦
     
     JOptionPane.showMessageDialog(frame, "You've got "+Score+" / 5 correct."+"\n1."+Signal_1+"\n2."+Signal_2+"\n3."+Signal_3+"\n4."+Signal_4+"\n5."+Signal_5);
}

@Override
public void actionPerformed(ActionEvent e) {
	 
	if(e.getSource().equals(btnSubmit)){ //submit¹öÆ° ´­·¶À»¶§ !
		 CheckAnswer();
		
	}
	if(e.getSource().equals(btnAnswer)){
		
		JOptionPane.showMessageDialog(frame, "The Answer is\n"+"1.widget\n"+"2.action event\n"+"3.event handling\n"+"4.addactionlistener\n"+"5.flowlayout");
	}
 }
}





