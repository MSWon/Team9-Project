package Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import Chapter.Chapter;

public class MainPage implements ActionListener{
	
	
	private JFrame frame;
	private JPanel spanel,cpanel,npanel;
	private JLabel label;
	private JLabel label_1;
	private ArrayList<JButton> button = new ArrayList<JButton>();
	private int ChapNum = 7;
	private String[] ChapTitle = {"1. Tutorial","2. FirstSteptoOOP","3. Encapsulation","4.Inheritance ","5. Polymorphism","6. GUI","7. Serialization"};
	private String pic_dir;
	private JScrollPane scroller;
	private Chapter c;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void go(){
		
		frame = new JFrame("OOP Education");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1250, 800);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		spanel = new JPanel();
		spanel.setSize(1200,400);		
		spanel.setLayout(new GridLayout(1,4));
		
		

		for(int i=1;i<=ChapNum;i++){
			
			pic_dir = "chapters\\chapter" + i +".jpg";
			ImageIcon pic = new ImageIcon(pic_dir);
			button.add(new JButton(ChapTitle[i-1]));
			button.get(i-1).setSize(300,400);
			button.get(i-1).setFont(new Font("Gothic",Font.BOLD,25));
			button.get(i-1).setIcon(pic);
			button.get(i-1).setBackground(Color.WHITE);
			button.get(i-1).setHorizontalTextPosition(AbstractButton.CENTER);
			button.get(i-1).setVerticalTextPosition(AbstractButton.BOTTOM);
			button.get(i-1).addActionListener(this);
			spanel.add(button.get(i-1));
		}

		
		scroller = new JScrollPane(spanel);
		
//		spanel.setAutoscrolls(true);
//		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		
		cpanel = new JPanel();
		cpanel.setSize(1200,400);
		label_1 = new JLabel("Main Course");
		label_1.setFont(new Font("Gothic",Font.BOLD,60));
		label_1.setBackground(Color.WHITE);
		label_1.setOpaque(true);
		label_1.setSize(800,400);
		cpanel.setBackground(Color.WHITE);
		
		npanel = new JPanel();
		npanel.setSize(1200,400);
		label = new JLabel("Learn about OOP");
		label.setFont(new Font("Gothic",Font.BOLD,100));
		label.setForeground(Color.WHITE);
		label.setBackground(Color.MAGENTA);
		label.setOpaque(true);
		label.setSize(800,400);
		npanel.setBackground(Color.MAGENTA);
		
		frame.getContentPane().setLayout(new GridLayout(3,1));
		frame.getContentPane().add(npanel);
		GroupLayout gl_npanel = new GroupLayout(npanel);
		gl_npanel.setHorizontalGroup(
			gl_npanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_npanel.createSequentialGroup()
					.addContainerGap(188, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(170))
		);
		gl_npanel.setVerticalGroup(
			gl_npanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_npanel.createSequentialGroup()
					.addGap(53)
					.addComponent(label)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		npanel.setLayout(gl_npanel);
		frame.getContentPane().add(cpanel);
		GroupLayout gl_cpanel = new GroupLayout(cpanel);
		gl_cpanel.setHorizontalGroup(
			gl_cpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_cpanel.createSequentialGroup()
					.addContainerGap(418, Short.MAX_VALUE)
					.addComponent(label_1)
					.addGap(403))
		);
		gl_cpanel.setVerticalGroup(
			gl_cpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cpanel.createSequentialGroup()
					.addGap(70)
					.addComponent(label_1)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		cpanel.setLayout(gl_cpanel);
		frame.getContentPane().add(scroller);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			if(source == button.get(0)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap1();
			}
			else if(source == button.get(1)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap2();
			}
			else if(source == button.get(2)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap3();
			}
			else if(source == button.get(3)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap4();
			}
			else if(source == button.get(4)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap5();
			}
			else if(source == button.get(5)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap6();
			}
			else if(source == button.get(6)){
				frame.dispose();
				c = new Chapter();
				c.go();
				c.go_to_Chap7();
			}
	
		
	}

	
}
