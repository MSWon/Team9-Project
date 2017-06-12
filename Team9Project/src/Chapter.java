import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Chapter implements ActionListener{
	
	private JFrame frame;
	private JLabel label1;
	private JButton button1,button2;
	private JPanel spanel,innerpanel;
	private JPanel Scrollpanel;
	private ArrayList<JButton> buttons;
	private JScrollPane scroller;
	private JMenuBar menubar;
	private JPanel Btnpanel;
	private JButton first,prev,next,last;
	private JButton label_1,label_2,label_3;
	private Cardpanel cardpanel;
	private CardLayout cl;
	private HelperDog hd;
	
	Color gray = new Color(245,245,245);
	
	public void go(){
		
		frame = new JFrame();  
		frame.setSize(1300, 950);
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
		button2.addActionListener(this);
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
		
		cardpanel = new Cardpanel();
		cardpanel.Chapter1();
		cardpanel.Chapter2();
		cardpanel.Chapter3();
		cardpanel.Chapter4();
		cardpanel.Chapter5();
		cardpanel.Chapter6();
		cardpanel.Chapter7();
		
		Btnpanel = new JPanel(); // Button panel
		
		first = new JButton("  First");
		first.setBackground(Color.WHITE);
		first.setBorder(null);
		first.addActionListener(this);
		first.setFont(new Font("Gothic",Font.BOLD,25));
		prev = new JButton("  Prev");
		prev.addActionListener(this);
		prev.setBackground(Color.WHITE);
		prev.setBorder(null);
		prev.setFont(new Font("Gothic",Font.BOLD,25));
		next = new JButton("  Next");
		next.addActionListener(this);
		next.setBackground(Color.WHITE);
		next.setBorder(null);
		next.setFont(new Font("Gothic",Font.BOLD,25));
		last = new JButton("  Last");
		last.addActionListener(this);
		last.setBackground(Color.WHITE);
		last.setBorder(null);
		last.setFont(new Font("Gothic",Font.BOLD,25));
		
		Btnpanel.add(first);
		Btnpanel.add(prev);
		Btnpanel.add(next);
		Btnpanel.add(last);
		Btnpanel.setBackground(Color.WHITE);

		
		Scrollpanel = new JPanel();
		Scrollpanel.setLayout(new BoxLayout(Scrollpanel,BoxLayout.Y_AXIS));
		Scrollpanel.setBackground(gray);
		
		JLabel h_label = new JLabel(" OOP Education  ");
		h_label.setFont(new Font("Gothic",Font.BOLD,25));
		Scrollpanel.add(h_label);
		
		label_1 = new JButton(" Tutorial");
		label_1.setBackground(gray);
		label_1.setBorder(null);
		label_1.addActionListener(this);
		label_1.setFont(new Font("Gothic",Font.BOLD,20));
		Scrollpanel.add(label_1);
		
		buttons = new ArrayList<JButton>();
		
		String[] listname = {" About Java"," Java System"," Compiling"};
			
		
		for(int i = 0; i<listname.length; i++){
			
			JButton button = new JButton(listname[i]);
			button.addActionListener(this);
			button.setName(listname[i]);
			button.setFont(new Font("Gothic",Font.PLAIN,15));
			button.setBackground(gray);
			button.setBorder(null);
			buttons.add(button);
			Scrollpanel.add(button);
			
		}

		
		label_2 = new JButton(" FirstStepToOOP");
		label_2.setBackground(gray);
		label_2.setBorder(null);
		label_2.addActionListener(this);
		label_2.setFont(new Font("Gothic",Font.BOLD,20));
		Scrollpanel.add(label_2);
		
		String[] listname2 = {" Class&Object"," Class"," Variables",				
				 " Methods"," Objects"," Constructor"," Array"};
		
		for(int i = 0; i<listname2.length; i++){
			
			JButton button = new JButton(listname2[i]);
			button.addActionListener(this);
			button.setName(listname2[i]);
			button.setFont(new Font("Gothic",Font.PLAIN,15));
			button.setBackground(gray);
			button.setBorder(null);
			buttons.add(button);
			Scrollpanel.add(button);
			
		}
		
		label_3 = new JButton(" Encapsulation");
		label_3.setBackground(gray);
		label_3.setBorder(null);
		label_3.addActionListener(this);
		label_3.setFont(new Font("Gothic",Font.BOLD,20));
		Scrollpanel.add(label_3);
		
		String[] listname3 = {" About Encapsulation"," State&Behavior"," Getter&Setter",				
				 };
		
		for(int i = 0; i<listname3.length; i++){
			
			JButton button = new JButton(listname3[i]);
			button.addActionListener(this);
			button.setName(listname3[i]);
			button.setFont(new Font("Gothic",Font.PLAIN,15));
			button.setBackground(gray);
			button.setBorder(null);
			buttons.add(button);
			Scrollpanel.add(button);
			
		}
		
		scroller = new JScrollPane(Scrollpanel);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		innerpanel.add(cardpanel);
		innerpanel.add(Btnpanel);
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		
		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);
			
				
	}
	
	public void go_to_Chap1(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter1");
	}
	
	public void go_to_Chap2(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter2");
	}
	
	public void go_to_Chap3(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter3");
	
	}
	
	public void go_to_Chap4(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter4");
	}
	
	public void go_to_Chap5(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter5");
	}
	
	public void go_to_Chap6(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter6");
	}
	
	public void go_to_Chap7(){
		
		cl = (CardLayout) (cardpanel.getLayout());
		cl.show(cardpanel, "chapter7");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton source = (JButton)e.getSource();
		
		if(source.equals(button1)){
			this.frame.dispose();
			MainPage frame = new MainPage();
			frame.go();
		}
		
		if (e.getSource().equals(first)) {

			cl.first(cardpanel);

		} else if (e.getSource().equals(prev)) {

			cl.previous(cardpanel);

		} else if (e.getSource().equals(next)) {

			cl.next(cardpanel);

		} else if (e.getSource().equals(last)) {

			cl.last(cardpanel);
		}
		
		if(e.getSource().equals(button2))
			hd = new HelperDog();
			
		for(int i=0; i<buttons.size(); i++){
			if(source == buttons.get(i))
				cl.show(cardpanel,"panel"+(i+1));
		}
		
		if(e.getSource().equals(label_1))
			cl.show(cardpanel, "chapter1");
		else if(e.getSource().equals(label_2))
			cl.show(cardpanel, "chapter2");
		else if(e.getSource().equals(label_3))
			cl.show(cardpanel, "chapter3");
	
	}	
}


