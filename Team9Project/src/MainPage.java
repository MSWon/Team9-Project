import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainPage implements ActionListener{
	
	
	private JFrame frame;
	private JPanel spanel,cpanel,npanel;
	private JLabel label;
	private ArrayList<JButton> button = new ArrayList<JButton>();
	private int ChapNum = 4;
	private String[] ChapTitle = {"1. Tutorial","2. FirstSteptoOOP","3. Inheritance","4. GUI"};
	private String pic_dir;
	private JScrollPane scroller;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void go(){
		
		frame = new JFrame("Main Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		
		spanel = new JPanel();
		spanel.setSize(1200,400);		
		spanel.setLayout(new GridLayout(1,4));
		
		

		for(int i=1;i<=ChapNum;i++){
			
			pic_dir = "chapter" + i +".jpg";
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
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		cpanel = new JPanel();
		cpanel.setSize(1200,400);
		label = new JLabel("Main Course");
		label.setFont(new Font("Gothic",Font.BOLD,60));
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		label.setSize(800,400);
		cpanel.setBackground(Color.WHITE);
		cpanel.add(label);
		
		npanel = new JPanel();
		npanel.setSize(1200,400);
		label = new JLabel("Learn about OOP");
		label.setFont(new Font("Gothic",Font.BOLD,100));
		label.setForeground(Color.WHITE);
		label.setBackground(Color.MAGENTA);
		label.setOpaque(true);
		label.setSize(800,400);
		npanel.setBackground(Color.MAGENTA);
		npanel.add(label);
		
		frame.getContentPane().setLayout(new GridLayout(3,1));
		frame.getContentPane().add(npanel);
		frame.getContentPane().add(cpanel);
		frame.getContentPane().add(scroller);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
			Object source = e.getSource();
			if(source == button.get(0)){
				frame.dispose();
				Chapter c = new Chapter();
				c.go();
				c.go_to_Chap1();
			}
			else if(source == button.get(1)){
				frame.dispose();
				Chapter c = new Chapter();
				c.go();
				c.go_to_Chap2();
			}
			else if(source == button.get(2)){
				frame.dispose();
				Chapter c = new Chapter();
				c.go();
				c.go_to_Chap3();
			}
			else if(source == button.get(3)){
				frame.dispose();
				Chapter c = new Chapter();
				c.go();
				c.go_to_Chap4();
			}
	
		
	}

	
}
