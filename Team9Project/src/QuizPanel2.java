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
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		LeftButton1 = new JRadioButton();
		LeftButton1.addActionListener(this);
		buttonGroup.add(LeftButton1);
		LeftButton1.setHorizontalTextPosition(JRadioButton.LEFT);
		
		RightButton1 = new JRadioButton("2");
		RightButton1.addActionListener(this);
		buttonGroup_1.add(RightButton1);
		
		LeftButton2 = new JRadioButton();
		LeftButton2.addActionListener(this);
		buttonGroup.add(LeftButton2);
		LeftButton2.setHorizontalTextPosition(SwingConstants.LEFT);
		
		RightButton2 = new JRadioButton("7");
		RightButton2.addActionListener(this);
		buttonGroup_1.add(RightButton2);
		
		LeftButton3 = new JRadioButton();
		LeftButton3.addActionListener(this);
		buttonGroup.add(LeftButton3);
		LeftButton3.setHorizontalTextPosition(SwingConstants.LEFT);
		
		RightButton3 = new JRadioButton("5");
		RightButton3.addActionListener(this);
		buttonGroup_1.add(RightButton3);
		
		LeftButton4 = new JRadioButton();
		LeftButton4.addActionListener(this);
		buttonGroup.add(LeftButton4);
		LeftButton4.setHorizontalTextPosition(SwingConstants.LEFT);
		
		RightButton4 = new JRadioButton("8");
		RightButton4.addActionListener(this);
		buttonGroup_1.add(RightButton4);
		
		JLabel lblNewLabel = new JLabel("1+1");
		
		JLabel label = new JLabel("2+3");
		
		JLabel label_1 = new JLabel("3+4");
		
		JLabel label_2 = new JLabel("4+4");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(LeftButton2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(LeftButton1)
						.addComponent(LeftButton3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(LeftButton4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(RightButton4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(RightButton3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(RightButton2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(RightButton1))
					.addGap(72))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(RightButton1)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(LeftButton1)
							.addComponent(lblNewLabel)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(RightButton2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(LeftButton2))))
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(RightButton3)
							.addComponent(LeftButton3))
						.addComponent(label_1))
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(RightButton4)
							.addComponent(LeftButton4)))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	@Override
	protected void paintComponent(Graphics g){
//		g.setColor(Color.red);
//	      ((Graphics2D) g).setRenderingHint(
//	      RenderingHints.KEY_ANTIALIASING,
//	      RenderingHints.VALUE_ANTIALIAS_ON);
	      
	    if(LeftButton1.isSelected() && RightButton1.isSelected())
	    	g.drawLine(LeftButton1.getX(), LeftButton1.getY(), RightButton1.getX(), RightButton1.getY());
	    
	    else if(LeftButton2.isSelected() && RightButton3.isSelected())
	    	g.drawLine(LeftButton2.getX(), LeftButton2.getY(), RightButton3.getX(), RightButton3.getY());
	    
	    else if(LeftButton3.isSelected() && RightButton2.isSelected())
	    	g.drawLine(LeftButton3.getX(), LeftButton3.getY(), RightButton2.getX(), RightButton2.getY());
	    
	    else if(LeftButton4.isSelected() && RightButton4.isSelected())
	    	g.drawLine(LeftButton4.getX(), LeftButton4.getY(), RightButton4.getX(), RightButton4.getY());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		paint(this.getGraphics());
		
	}
	/////////////////////////이건 잘 돌아가는지 보려고 !
	static public void main(String args[]){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		QuizPanel2 q = new QuizPanel2();
		
		frame.getContentPane().add(q);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		
	}
}
