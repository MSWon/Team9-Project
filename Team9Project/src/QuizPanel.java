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

public class QuizPanel extends JPanel {
   
   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private String[] Answer = {"widgets","action event","event handling","addactionlistener()","flowlayout"};
   /**
    * Create the panel.
    */
   public QuizPanel() {
      setBackground(UIManager.getColor("Button.background"));
      
      JButton btnSubmit = new JButton("Submit");
      btnSubmit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            int Score = 0;
            char Signal_1,Signal_2,Signal_3,Signal_4,Signal_5 ; // 어떤 문제가 맞고 틀린지 옆에 OX 체크
            
            if(textField.getText().toLowerCase().equals(Answer[0])){
            	Score++;
            	Signal_1 = 'O';
            }
            else
            	Signal_1 = 'X';  //1번쨰 문제
            
            if(textField_1.getText().toLowerCase().equals(Answer[1])){
            	Score++;
            	Signal_2 = 'O';
            }
            else
            	Signal_2 = 'X';  //2번쨰 문제
            
            if(textField_2.getText().toLowerCase().equals(Answer[2])){
            	Score++;
            	Signal_3 = 'O';
            }
            else
            	Signal_3 = 'X'; // 3번째 문제
            
            if(textField_3.getText().toLowerCase().equals(Answer[3])){
            	Score++;
            	Signal_4 = 'O';
            }
            else
            	Signal_4 = 'X'; //4번쨰 문제
            
            if(textField_4.getText().toLowerCase().equals(Answer[4])){
            	Score++;
            	Signal_5 = 'O';
            }
            else
            	Signal_5 = 'X'; //5번째 문제
            
            JOptionPane.showMessageDialog(frame, "You've got "+Score+" / 5 correct."+"\n1."+Signal_1+"\n2."+Signal_2+"\n3."+Signal_3+"\n4."+Signal_4+"\n5."+Signal_5);
            
         }
      });
      btnSubmit.setBackground(UIManager.getColor("Button.background"));
      btnSubmit.setFont(new Font("굴림", Font.BOLD, 21));
      
      JLabel lblQuizGui = new JLabel("Quiz - GUI");
      lblQuizGui.setFont(new Font("굴림", Font.BOLD, 40));
      
      JLabel lblJframeContains = new JLabel("1.  JFrame contains");
      lblJframeContains.setFont(new Font("굴림", Font.PLAIN, 18));
      
      JLabel lblNewLabel = new JLabel("2. When button is clicked, it creates an ");
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
      
      JLabel lblNewLabel_1 = new JLabel("3. The process of registering and handling event is");
      lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
      
      textField = new JTextField();
      textField.setFont(new Font("굴림", Font.PLAIN, 18));
      textField.setColumns(6);
      
      textField_1 = new JTextField();
      textField_1.setFont(new Font("굴림", Font.PLAIN, 18));
      textField_1.setColumns(11);
      
      textField_2 = new JTextField();
      textField_2.setFont(new Font("굴림", Font.PLAIN, 18));
      textField_2.setColumns(11);
      
      JLabel lblNewLabel_2 = new JLabel("4. ");
      lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
      
      textField_3 = new JTextField();
      textField_3.setFont(new Font("굴림", Font.PLAIN, 18));
      textField_3.setColumns(10);
      
      JLabel lblNewLabel_3 = new JLabel("method registers new action listener ");
      lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 18));
      
      JLabel lblNewLabel_4 = new JLabel("5. JPanel's default layout manager is");
      lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 18));
      
      textField_4 = new JTextField();
      textField_4.setFont(new Font("굴림", Font.PLAIN, 18));
      textField_4.setColumns(9);
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblQuizGui)
               .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
               .addContainerGap(515, Short.MAX_VALUE)
               .addComponent(btnSubmit)
               .addGap(24))
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblJframeContains)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewLabel_1)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewLabel)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewLabel_2)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addComponent(lblNewLabel_3)
               .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewLabel_4)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(198, Short.MAX_VALUE))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblQuizGui)
               .addGap(29)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                  .addComponent(lblJframeContains)
                  .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(36)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(3)
                     .addComponent(lblNewLabel))
                  .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(41)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                  .addComponent(lblNewLabel_1)
                  .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(42)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                  .addComponent(lblNewLabel_2)
                  .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblNewLabel_3))
               .addGap(35)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                  .addComponent(lblNewLabel_4)
                  .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
               .addComponent(btnSubmit)
               .addGap(23))
      );
      setLayout(groupLayout);

   }
}




// 수정 보완했으면 하는 점들  : ox 표시하는거 노가다로 길게 표현하지 말고 마지막에 하나의 string으로 정리해서 덧붙이는정도로 끝낼수 있게 고안
