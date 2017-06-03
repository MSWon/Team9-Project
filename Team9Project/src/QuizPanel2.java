import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class QuizPanel2 extends JPanel implements ActionListener {
   
   private JRadioButton leftButton_1,leftButton_2,leftButton_3,RightButton_1,RightButton_2,RightButton_3,leftButton_4,RightButton_4;


   private final ButtonGroup buttonGroup = new ButtonGroup();
   private final ButtonGroup buttonGroup_1 = new ButtonGroup();

   public QuizPanel2() {
      
      leftButton_1 = new JRadioButton("1 + 1");
      leftButton_1.addActionListener(this);
      buttonGroup.add(leftButton_1);
      leftButton_1.setHorizontalTextPosition(JRadioButton.LEFT);

      
      leftButton_2 = new JRadioButton("2 + 5");
      buttonGroup.add(leftButton_2);
      leftButton_2.setHorizontalTextPosition(SwingConstants.LEFT);
      leftButton_2.addActionListener(this);
      
      leftButton_3 = new JRadioButton("3 + 2");
      buttonGroup.add(leftButton_3);
      leftButton_3.setHorizontalTextPosition(SwingConstants.LEFT);
      leftButton_3.addActionListener(this);
      
      leftButton_4 = new JRadioButton("4 + 2");
      leftButton_4.setHorizontalTextPosition(SwingConstants.LEFT);
      buttonGroup.add(leftButton_4);
      leftButton_4.addActionListener(this);
      
      RightButton_1 = new JRadioButton("7");
      RightButton_1.addActionListener(this);
      buttonGroup_1.add(RightButton_1);
      RightButton_2 = new JRadioButton("5");
      RightButton_2.addActionListener(this);
      buttonGroup_1.add(RightButton_2);
      RightButton_3 = new JRadioButton("2");
      RightButton_3.addActionListener(this);
      buttonGroup_1.add(RightButton_3);
      RightButton_4 = new JRadioButton("6");
      RightButton_4.addActionListener(this);
      buttonGroup_1.add(RightButton_4);

      
      
      
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(147)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(leftButton_1)
                  .addComponent(leftButton_3)
                  .addComponent(leftButton_4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                  .addComponent(leftButton_2))
               .addGap(177)
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addComponent(RightButton_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                  .addComponent(RightButton_3)
                  .addComponent(RightButton_2)
                  .addComponent(RightButton_1))
               .addContainerGap(205, Short.MAX_VALUE))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGap(135)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(leftButton_1)
                  .addComponent(RightButton_1))
               .addGap(52)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(RightButton_2)
                  .addComponent(leftButton_4))
               .addGap(58)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(leftButton_3)
                  .addComponent(RightButton_3))
               .addGap(45)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(leftButton_2)
                  .addComponent(RightButton_4))
               .addContainerGap(146, Short.MAX_VALUE))
      );
      setLayout(groupLayout);      
   }
   


   @Override
   public void paintComponent(Graphics g){
      
	   //버튼의 범위를 넓게 인식하는것 같아서 선이 그어지는 위치를 좀더 정밀하게 하려고 Point를 새로 정의함.
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

//   public static void main(String[] args) {
//      
//      JFrame frame = new JFrame();
//      
//      QuizPanel2 qp = new QuizPanel2();
//      frame.add(qp);
//      
//      frame.setSize(600, 700);
//      frame.setVisible(true);
//      
//   
//      여기 코드는  QuizPanel2가 잘 돌아가는지 보려고 main 함수를 짜본거 (없어도 됨)
//   }
   @Override
   public void actionPerformed(ActionEvent e) {
	   paint(this.getGraphics()); // 뭔진 모르겠지만 이게 있어야 선이 그어짐 
	
   }

}