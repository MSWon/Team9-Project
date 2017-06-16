package Quizes;



import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class QuizChapter2 extends Quiz{
   
   private JRadioButton leftButton_1,leftButton_2,leftButton_3,RightButton_1,RightButton_2,RightButton_3,leftButton_4,RightButton_4;

   private final ButtonGroup buttonGroup = new ButtonGroup();
   private final ButtonGroup buttonGroup_1 = new ButtonGroup();
   
   JTextArea right1;
   JTextArea right2;
   JTextArea right3;
   JTextArea right4;
   JLabel lblQuiz;
   JButton btnReset;
   JTextArea left1;
   JTextArea left2;
   JTextArea left3;
   JTextArea left4;

   public QuizChapter2() {
      
      
      leftButton_4 = new JRadioButton("");
      leftButton_4.setBackground(Color.WHITE);
      leftButton_4.setHorizontalTextPosition(SwingConstants.LEFT);
      buttonGroup.add(leftButton_4);
      leftButton_4.addActionListener(this);
      
      leftButton_3 = new JRadioButton("");
      buttonGroup.add(leftButton_3);
      leftButton_3.setHorizontalTextPosition(SwingConstants.LEFT);
      leftButton_3.addActionListener(this);
      leftButton_3.setBackground(Color.WHITE);
      
            
            leftButton_2 = new JRadioButton("");
            buttonGroup.add(leftButton_2);
            leftButton_2.setHorizontalTextPosition(SwingConstants.LEFT);
            leftButton_2.addActionListener(this);
            leftButton_2.setBackground(Color.WHITE);
      
      leftButton_1 = new JRadioButton("");
      leftButton_1.setBackground(Color.WHITE);
      leftButton_1.addActionListener(this);
      buttonGroup.add(leftButton_1);
      leftButton_1.setHorizontalTextPosition(JRadioButton.LEFT);
      
      RightButton_1 = new JRadioButton("");
      RightButton_1.setBackground(Color.WHITE);
      RightButton_1.addActionListener(this);
      
      lblQuiz = new JLabel("Quiz - FirstStepToOOP");
      lblQuiz.setForeground(Color.BLACK);
      lblQuiz.setFont(new Font("맑은 고딕", Font.BOLD, 40));
      buttonGroup_1.add(RightButton_1);
      
      right1 = new JTextArea();
      right1.setEditable(false);
      right1.setFont(new Font("Monospaced", Font.BOLD, 18));
      right1.setText("at least one class with\r\na main() method.");
      RightButton_2 = new JRadioButton("");
      RightButton_2.setBackground(Color.WHITE);
      RightButton_2.addActionListener(this);
      buttonGroup_1.add(RightButton_2);
      
      right2 = new JTextArea();
      right2.setEditable(false);
      right2.setFont(new Font("Monospaced", Font.BOLD, 18));
      right2.setText("Store state of an object\r\n(also called fields)");
      RightButton_3 = new JRadioButton("");
      RightButton_3.setBackground(Color.WHITE);
      RightButton_3.addActionListener(this);
      buttonGroup_1.add(RightButton_3);
      
      right3 = new JTextArea();
      right3.setEditable(false);
      right3.setFont(new Font("Monospaced", Font.BOLD, 18));
      right3.setText("is Type(blueprint or model)\r\nof an object\r\n");
      RightButton_4 = new JRadioButton("");
      RightButton_4.setBackground(Color.WHITE);
      RightButton_4.addActionListener(this);
      buttonGroup_1.add(RightButton_4);
      
      right4 = new JTextArea();
      right4.setEditable(false);
      right4.setFont(new Font("Monospaced", Font.BOLD, 18));
      right4.setText("Has the same name than\r\nthe class and no return value.");
      
      btnReset = new JButton("Reset");
      btnReset.addActionListener(this);
      btnReset.setFont(new Font("맑은 고딕", Font.BOLD, 20));
      
      left1 = new JTextArea();
      left1.setEditable(false);
      left1.setFont(new Font("Monospaced", Font.BOLD, 18));
      left1.setText("Class");
      
      left2 = new JTextArea();
      left2.setEditable(false);
      left2.setFont(new Font("Monospaced", Font.BOLD, 18));
      left2.setText("Constructor");
      
      left3 = new JTextArea();
      left3.setEditable(false);
      left3.setFont(new Font("Monospaced", Font.BOLD, 18));
      left3.setText("Instance Variable");
      
      left4 = new JTextArea();
      left4.setEditable(false);
      left4.setFont(new Font("Monospaced", Font.BOLD, 18));
      left4.setText("Every Java \r\nProgram has");
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(86)
               .addComponent(lblQuiz))
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(178)
               .addComponent(left1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addGap(3)
               .addComponent(leftButton_1)
               .addGap(423)
               .addComponent(RightButton_1)
               .addComponent(right1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(118)
               .addComponent(left2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addComponent(leftButton_4)
               .addGap(426)
               .addComponent(RightButton_2)
               .addComponent(right2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(58)
               .addComponent(left3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addGap(3)
               .addComponent(leftButton_3)
               .addGap(426)
               .addComponent(RightButton_3)
               .addComponent(right3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(118)
               .addComponent(left4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addGap(6)
               .addComponent(leftButton_2)
               .addGap(426)
               .addComponent(RightButton_4)
               .addComponent(right4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
               .addContainerGap(860, Short.MAX_VALUE)
               .addComponent(btnReset)
               .addGap(81))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(48)
               .addComponent(lblQuiz)
               .addGap(48)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(left1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                  .addComponent(leftButton_1)
                  .addComponent(RightButton_1)
                  .addComponent(right1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(54)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(left2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                  .addComponent(leftButton_4)
                  .addComponent(RightButton_2)
                  .addComponent(right2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(63)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(left3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                  .addComponent(leftButton_3)
                  .addComponent(RightButton_3)
                  .addComponent(right3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(left4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                  .addComponent(leftButton_2)
                  .addComponent(RightButton_4)
                  .addComponent(right4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
               .addGap(18)
               .addComponent(btnReset)
               .addContainerGap(43, Short.MAX_VALUE))
      );
      setLayout(groupLayout);
   }
   

   public void mypaint(Graphics2D g){

//      버튼의 범위를 넓게 인식하는것 같아서 선이 그어지는 위치를 좀더 정밀하게 하려고 Point를 새로 정의함.
      Point l_p1 = leftButton_1.getLocation();
      l_p1.x += leftButton_1.getWidth()/2;
      l_p1.y += leftButton_1.getHeight()/2;
      Point l_p2 = leftButton_2.getLocation();
      l_p2.x += leftButton_2.getWidth()/2;
      l_p2.y += leftButton_2.getHeight()/2;
      Point l_p3 = leftButton_3.getLocation();
      l_p3.x += leftButton_3.getWidth()/2;
      l_p3.y += leftButton_3.getHeight()/2;
      Point r_p1 = RightButton_1.getLocation();
      r_p1.x += RightButton_1.getWidth()/2;
      r_p1.y += RightButton_1.getHeight()/2;
      Point r_p2 = RightButton_2.getLocation();
      r_p2.x += RightButton_2.getWidth()/2;
      r_p2.y += RightButton_2.getHeight()/2;
      Point r_p3 = RightButton_3.getLocation();
      r_p3.x += RightButton_3.getWidth()/2;
      r_p3.y += RightButton_3.getHeight()/2;
      Point l_p4 = leftButton_4.getLocation();
      l_p4.x += leftButton_4.getWidth()/2;
      l_p4.y += leftButton_4.getHeight()/2;
      Point r_p4 = RightButton_4.getLocation();
      r_p4.x += RightButton_4.getWidth()/2;
      r_p4.y += RightButton_4.getHeight()/2;
      
      g.setColor(Color.RED);
        ((Graphics2D) g).setRenderingHint(
        RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        
      if(leftButton_1.isSelected() && RightButton_3.isSelected())   {
         g.drawLine(l_p1.x, l_p1.y,r_p3.x, r_p3.y);

      }
      
      else if(leftButton_2.isSelected() && RightButton_1.isSelected())   {
         g.drawLine(l_p2.x, l_p2.y,r_p1.x, r_p1.y);
      }
      else if(leftButton_3.isSelected() && RightButton_2.isSelected())   {
         g.drawLine(l_p3.x, l_p3.y,r_p2.x,r_p2.y);
      }
      else if(leftButton_4.isSelected() && RightButton_4.isSelected()){   
         g.drawLine(l_p4.x, l_p4.y, r_p4.x, r_p4.y);
      }
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
         Graphics2D g = (Graphics2D) this.getGraphics();
         mypaint(g);
         
         if(e.getSource().equals(btnReset)){
           repaint();
           buttonGroup_1.clearSelection();
           buttonGroup.clearSelection();
         }
   
   }
}