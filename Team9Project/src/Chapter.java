import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Chapter implements ActionListener{
	
	private JFrame frame;
	private JLabel label1;
	private JButton button1,button2;
	private JPanel npanel,spanel,innerpanel;
	private TextPanel p1, p2, p3;
	private JPanel Scrollpanel;
	private JList<JButton> list1,list2;
	private JScrollPane scroller;
	private JMenuBar menubar;
	private JMenu menu1,menu2;
	
	private Chapter1 chapter1;
	private Chapter2 chapter2;
	private Chapter3 chapter3;
	private Chapter4 chapter4;

	Color gray = new Color(245,245,245);
	
	
	public void go(){
		
		frame = new JFrame();  
		frame.setSize(1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		// North Menubar

		menubar = new JMenuBar();
		menubar.setBackground(Color.MAGENTA);
		menubar.setSize(1200,200);
		
		button1 = new JButton("Home");
		button1.setBackground(Color.MAGENTA);
		button1.setForeground(Color.WHITE);
		button1.setFont(new Font("Gothic",Font.PLAIN,30));
		button1.setBorder(null);
		button1.addActionListener(this);
		
		label1 = new JLabel(" | ");
		label1.setBackground(Color.MAGENTA);
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Gothic",Font.PLAIN,30));
		label1.setBorder(null);
		
		button2 = new JButton("Help");
		button2.setBackground(Color.MAGENTA);
		button2.setForeground(Color.WHITE);
		button2.setFont(new Font("Gothic",Font.PLAIN,30));
		button2.setBorder(null);
				
		menubar.add(button1);
		menubar.add(label1);
		menubar.add(button2);

		
		// South Panel
		
		spanel = new JPanel();
		spanel.setLayout(new BoxLayout(spanel,BoxLayout.X_AXIS));
		spanel.setBackground(Color.WHITE);
		
		innerpanel = new JPanel();
		innerpanel.setBackground(Color.WHITE);
		innerpanel.setLayout(new BoxLayout(innerpanel,BoxLayout.Y_AXIS));
		
		Scrollpanel = new JPanel();
		Scrollpanel.setLayout(new BoxLayout(Scrollpanel,BoxLayout.Y_AXIS));
		Scrollpanel.setBackground(gray);
		
		JLabel h_label = new JLabel(" OOP Education  ");
		h_label.setFont(new Font("Gothic",Font.BOLD,25));
		Scrollpanel.add(h_label);
		
		JLabel label_1 = new JLabel(" Inheritance",SwingConstants.LEFT);
		label_1.setFont(new Font("Gothic",Font.BOLD,20));
		Scrollpanel.add(label_1);
		
		String[] listname = {" Superclass"," Subclass"," Override",				
				 " Overload"," Others"};
		
		for(int i = 0; i<listname.length; i++){
			
			JButton button = new JButton(listname[i]);
			button.setFont(new Font("Gothic",Font.PLAIN,15));
			button.setBackground(gray);
			button.setBorder(null);
			Scrollpanel.add(button);
		}
		
		JLabel label_2 = new JLabel(" GUI",SwingConstants.LEFT);
		label_2.setFont(new Font("Gothic",Font.BOLD,20));
		Scrollpanel.add(label_2);
		
		String[] listname2 = {" Superclass"," Subclass"," Override",				
				 " Overload"," Others"};
		
		for(int i = 0; i<listname2.length; i++){
			
			JButton button = new JButton(listname2[i]);
			button.setFont(new Font("Gothic",Font.PLAIN,15));
			button.setBackground(gray);
			button.setBorder(null);
			Scrollpanel.add(button);
		}
		

		scroller = new JScrollPane(Scrollpanel);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
				
	}
	
	public void go_to_Chap1(){
		
		chapter1 = new Chapter1();

		
		innerpanel.add(chapter1.getCardpanel());
		innerpanel.add(chapter1.getBtnpanel());
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		
		frame.setTitle("Chapter 1");
		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);	
	}
	
	public void go_to_Chap2(){
		
		chapter2 = new Chapter2();

		
		innerpanel.add(chapter2.getCardpanel());
		innerpanel.add(chapter2.getBtnpanel());
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		
		frame.setTitle("Chapter 2");
		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);	
	}
	
	public void go_to_Chap3(){
		
		chapter3 = new Chapter3();
		

		
		innerpanel.add(chapter3.getCardpanel());
		innerpanel.add(chapter3.getBtnpanel());
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		
		frame.setTitle("Chapter 3");
		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);	
	}
	
	public void go_to_Chap4(){
		
		chapter4 = new Chapter4();
		
		innerpanel.add(chapter4.getCardpanel());
		innerpanel.add(chapter4.getBtnpanel());
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		
		frame.setTitle("Chapter 4");
		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton source = (JButton)e.getSource();
		
		if(source.equals(button1)){
			this.frame.dispose();
			MainPage frame = new MainPage();
			frame.go();
		}


		
	}	
}


