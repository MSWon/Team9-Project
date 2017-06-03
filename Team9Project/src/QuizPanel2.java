import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class QuizPanel2 extends JPanel implements ActionListener{
	
	private JRadioButton LeftButton1; //왼쪽 버튼들
	private JRadioButton LeftButton2;
	private JRadioButton LeftButton3;
	private JRadioButton LeftButton4;
	
	private JRadioButton RightButton1; //오른쪽 버튼들
	private JRadioButton RightButton2;
	private JRadioButton RightButton3;
	private JRadioButton RightButton4;
	
	private final ButtonGroup buttonGroup = new ButtonGroup(); //왼쪽 버튼을 하나의 그룹으로 묶기
	private final ButtonGroup buttonGroup_1 = new ButtonGroup(); //오른쪽 버튼을 하나의 그룹으로 묶기
	
	
	public QuizPanel2() {
		
		LeftButton1 = new JRadioButton("1+1");
		LeftButton1.addActionListener(this);
		buttonGroup.add(LeftButton1);
		LeftButton1.setHorizontalTextPosition(JRadioButton.LEFT);
		
		RightButton1 = new JRadioButton("2");
		RightButton1.addActionListener(this);
		buttonGroup_1.add(RightButton1);
		
		LeftButton2 = new JRadioButton();
		LeftButton2.setText("2+3");
		LeftButton2.addActionListener(this);
		buttonGroup.add(LeftButton2);
		LeftButton2.setHorizontalTextPosition(SwingConstants.LEFT);
		
		RightButton2 = new JRadioButton("7");
		RightButton2.addActionListener(this);
		buttonGroup_1.add(RightButton2);
		
		LeftButton3 = new JRadioButton();
		LeftButton3.setText("3+4");
		LeftButton3.addActionListener(this);
		buttonGroup.add(LeftButton3);
		LeftButton3.setHorizontalTextPosition(SwingConstants.LEFT);
		
		RightButton3 = new JRadioButton("5");
		RightButton3.addActionListener(this);
		buttonGroup_1.add(RightButton3);
		
		LeftButton4 = new JRadioButton();
		LeftButton4.setText("4+4");
		LeftButton4.addActionListener(this);
		buttonGroup.add(LeftButton4);
		LeftButton4.setHorizontalTextPosition(SwingConstants.LEFT);
		
		RightButton4 = new JRadioButton("8");
		RightButton4.addActionListener(this);
		buttonGroup_1.add(RightButton4);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(LeftButton2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(LeftButton3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(LeftButton4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(LeftButton1))
					.addGap(104)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(RightButton2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(RightButton3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(RightButton4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(RightButton1))
					.addContainerGap(235, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LeftButton1)
						.addComponent(RightButton1))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LeftButton2)
						.addComponent(RightButton2))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LeftButton3)
						.addComponent(RightButton3))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LeftButton4)
						.addComponent(RightButton4))
					.addContainerGap(130, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	@Override
	protected void paintComponent(Graphics g){
		
		
		Point LeftPoint1 = LeftButton1.getLocation();
		LeftPoint1.x +=LeftButton1.getWidth()/2;
		LeftPoint1.y +=LeftButton1.getHeight()/2;
		
		Point LeftPoint2 = LeftButton2.getLocation();
		LeftPoint2.x +=LeftButton2.getWidth()/2;
		LeftPoint2.y +=LeftButton2.getHeight()/2;
		
		Point LeftPoint3 = LeftButton3.getLocation();
		LeftPoint3.x +=LeftButton3.getWidth()/2;
		LeftPoint3.y +=LeftButton3.getHeight()/2;
		
		Point LeftPoint4 = LeftButton4.getLocation();
		LeftPoint4.x +=LeftButton4.getWidth()/2;
		LeftPoint4.y +=LeftButton4.getHeight()/2;
		
		Point RightPoint1 = RightButton1.getLocation();
		RightPoint1.x +=RightButton1.getWidth()/2;
		RightPoint1.y +=RightButton1.getHeight()/2;
		
		Point RightPoint2 = RightButton2.getLocation();
		RightPoint2.x +=RightButton2.getWidth()/2;
		RightPoint2.y +=RightButton2.getHeight()/2;
		
		Point RightPoint3 = RightButton3.getLocation();
		RightPoint3.x +=RightButton3.getWidth()/2;
		RightPoint3.y +=RightButton3.getHeight()/2;
		
		Point RightPoint4 = RightButton4.getLocation();
		RightPoint4.x +=RightButton4.getWidth()/2;
		RightPoint4.y +=RightButton4.getHeight()/2;
		
		g.setColor(Color.red);
	      ((Graphics2D) g).setRenderingHint(
	      RenderingHints.KEY_ANTIALIASING,
	      RenderingHints.VALUE_ANTIALIAS_ON);
	     
	    if(LeftButton1.isSelected() && RightButton1.isSelected())
	    	g.drawLine(LeftPoint1.x, LeftPoint1.y, RightPoint1.x, RightPoint1.y);
	    
	    
	    else if(LeftButton2.isSelected() && RightButton3.isSelected()){
	    	g.drawLine(LeftPoint2.x, LeftPoint2.y, RightPoint3.x, RightPoint3.y);
	    }
	    
	    else if(LeftButton3.isSelected() && RightButton2.isSelected())
	    	g.drawLine(LeftPoint3.x, LeftPoint3.y, RightPoint2.x, RightPoint2.y);
	    
	    else if(LeftButton4.isSelected() && RightButton4.isSelected())
	    	g.drawLine(LeftPoint4.x, LeftPoint4.y, RightPoint4.x, RightPoint4.y);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		paint(this.getGraphics());
		
	}
	///////////////////////// 여기 아래는 잘 돌아가는지 보기위한것 ! 나중에 없애고 OOPEducation인가 거기다가 quiz 추가시켜야됨
	static public void main(String args[]){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		QuizPanel2 q = new QuizPanel2();
		
		frame.getContentPane().add(q);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
		
}
