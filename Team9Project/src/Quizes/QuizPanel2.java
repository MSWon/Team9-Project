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

public class QuizPanel2 extends JPanel implements ActionListener {
   
   private JRadioButton leftButton_1,leftButton_2,leftButton_3,RightButton_1,RightButton_2,RightButton_3,leftButton_4,RightButton_4;

   private final ButtonGroup buttonGroup = new ButtonGroup();
   private final ButtonGroup buttonGroup_1 = new ButtonGroup();
   private JLabel lblNewLabel;
   private JLabel lblConstructor;
   private JLabel lblInstanceVariable;
   private JLabel lblEveryJavaProgram;
   private JLabel lblProgramHas;
   private JTextArea txtrEe;
   private JTextArea txtrEqeqe;
   private JTextArea txtrWwrwr;
   private JLabel lblQuiz;

   public QuizPanel2() {
      
      this.setBackground(Color.WHITE);
      
      lblNewLabel = new JLabel("Class\r\n");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
      
      leftButton_4 = new JRadioButton("");
      leftButton_4.setBackground(Color.WHITE);
      leftButton_4.setHorizontalTextPosition(SwingConstants.LEFT);
      buttonGroup.add(leftButton_4);
      leftButton_4.addActionListener(this);
      
      lblConstructor = new JLabel("Constructor");
      lblConstructor.setFont(new Font("굴림", Font.BOLD, 18));
      
      leftButton_3 = new JRadioButton("");
      buttonGroup.add(leftButton_3);
      leftButton_3.setHorizontalTextPosition(SwingConstants.LEFT);
      leftButton_3.addActionListener(this);
      
      lblInstanceVariable = new JLabel("Instance Variables");
      lblInstanceVariable.setFont(new Font("굴림", Font.BOLD, 18));
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
      
      lblEveryJavaProgram = new JLabel("Every Java");
      lblEveryJavaProgram.setFont(new Font("굴림", Font.BOLD, 18));
      
      lblProgramHas = new JLabel("Program has");
      lblProgramHas.setFont(new Font("굴림", Font.BOLD, 18));
      
      RightButton_1 = new JRadioButton("");
      RightButton_1.setBackground(Color.WHITE);
      RightButton_1.addActionListener(this);
      
      lblQuiz = new JLabel("Quiz!");
      lblQuiz.setForeground(Color.RED);
      lblQuiz.setFont(new Font("굴림", Font.BOLD, 33));
      buttonGroup_1.add(RightButton_1);
      
      JTextArea txtrG = new JTextArea();
      txtrG.setFont(new Font("Monospaced", Font.BOLD, 18));
      txtrG.setText("at least one class with\r\na main() method.");
      RightButton_2 = new JRadioButton("");
      RightButton_2.setBackground(Color.WHITE);
      RightButton_2.addActionListener(this);
      buttonGroup_1.add(RightButton_2);
      
      txtrEe = new JTextArea();
      txtrEe.setFont(new Font("Monospaced", Font.BOLD, 18));
      txtrEe.setText("Store state of an object\r\n(also called fields)");
      RightButton_3 = new JRadioButton("");
      RightButton_3.setBackground(Color.WHITE);
      RightButton_3.addActionListener(this);
      buttonGroup_1.add(RightButton_3);
      
      txtrEqeqe = new JTextArea();
      txtrEqeqe.setFont(new Font("Monospaced", Font.BOLD, 18));
      txtrEqeqe.setText("is Type(blueprint or model)\r\nof an object\r\n");
      RightButton_4 = new JRadioButton("");
      RightButton_4.setBackground(Color.WHITE);
      RightButton_4.addActionListener(this);
      buttonGroup_1.add(RightButton_4);
      
      txtrWwrwr = new JTextArea();
      txtrWwrwr.setFont(new Font("Monospaced", Font.BOLD, 18));
      txtrWwrwr.setText("Has the same name than\r\nthe class and no return value.");
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
      	groupLayout.createParallelGroup(Alignment.LEADING)
      		.addGroup(groupLayout.createSequentialGroup()
      			.addGap(99)
      			.addComponent(lblQuiz))
      		.addGroup(groupLayout.createSequentialGroup()
      			.addGap(175)
      			.addComponent(lblNewLabel)
      			.addComponent(leftButton_1)
      			.addGap(426)
      			.addComponent(RightButton_1)
      			.addComponent(txtrG, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
      		.addGroup(groupLayout.createSequentialGroup()
      			.addGap(118)
      			.addComponent(lblConstructor)
      			.addComponent(leftButton_4)
      			.addGap(426)
      			.addComponent(RightButton_2)
      			.addComponent(txtrEe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      		.addGroup(groupLayout.createSequentialGroup()
      			.addGap(60)
      			.addComponent(lblInstanceVariable)
      			.addPreferredGap(ComponentPlacement.RELATED)
      			.addComponent(leftButton_3)
      			.addGap(426)
      			.addComponent(RightButton_3)
      			.addComponent(txtrEqeqe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      		.addGroup(groupLayout.createSequentialGroup()
      			.addGap(109)
      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
      				.addGroup(groupLayout.createSequentialGroup()
      					.addGap(15)
      					.addComponent(lblEveryJavaProgram))
      				.addComponent(lblProgramHas))
      			.addComponent(leftButton_2)
      			.addGap(426)
      			.addComponent(RightButton_4)
      			.addComponent(txtrWwrwr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      );
      groupLayout.setVerticalGroup(
      	groupLayout.createParallelGroup(Alignment.LEADING)
      		.addGroup(groupLayout.createSequentialGroup()
      			.addGap(48)
      			.addComponent(lblQuiz)
      			.addGap(48)
      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
      				.addComponent(lblNewLabel)
      				.addComponent(leftButton_1)
      				.addComponent(RightButton_1)
      				.addComponent(txtrG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addGap(54)
      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
      				.addComponent(lblConstructor)
      				.addComponent(leftButton_4)
      				.addComponent(RightButton_2)
      				.addComponent(txtrEe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addGap(63)
      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
      				.addComponent(lblInstanceVariable)
      				.addComponent(leftButton_3)
      				.addComponent(RightButton_3)
      				.addComponent(txtrEqeqe, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
      				.addGroup(groupLayout.createSequentialGroup()
      					.addGap(4)
      					.addComponent(lblEveryJavaProgram)
      					.addGap(4)
      					.addComponent(lblProgramHas))
      				.addComponent(leftButton_2)
      				.addComponent(RightButton_4)
      				.addComponent(txtrWwrwr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
      );
      setLayout(groupLayout);
   }
   

   private void drawConnectors(Graphics2D g2) {
       Rectangle r1, r2;
       double x1, y1, x2, y2;
 
       Component[] c = getComponents();
       for(int i = 0; i < c.length; i++) {
           r1 = c[i].getBounds();
           x1 = r1.getCenterX();
           y1 = r1.getCenterY();
           for(int j = i + 1; j < c.length; j++) {
               r2 = c[j].getBounds();
               x2 = r2.getCenterX();
               y2 = r2.getCenterY();
               g2.draw(new Line2D.Double(x1, y1, x2, y2));
           }
       }
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

//   public static void main(String[] args) {
//      
//      JFrame frame = new JFrame();
//      
//      QuizPanel2 qp = new QuizPanel2();
//      frame.getContentPane().add(qp);
//      
//      frame.setSize(600, 700);
//      frame.setVisible(true);
//      
//   
//      여기 코드는  QuizPanel2가 잘 돌아가는지 보려고 main 함수를 짜본거 (없어도 됨)
//   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      
         Graphics2D g = (Graphics2D) this.getGraphics();
         mypaint(g);
         
   
   }
}