import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Chapter implements ActionListener{
	
	JFrame frame;
	JLabel label1;
	JButton button1,button2;
	JButton first,prev,next,last;
	JPanel npanel,spanel,innerpanel;
	JPanel p1, p2, p3;
	JPanel Cardpanel;
	JPanel Btnpanel;
	JPanel Scrollpanel;
	JList<JButton> list1,list2;
	JScrollPane scroller;
	JMenuBar menubar;
	JMenu menu1,menu2;
	Color gray = new Color(245,245,245);
	
	
	public void go(){
		
		frame = new JFrame("Chapter 1");  // Main frame
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
		
		Cardpanel = new JPanel();   // Card panel
		Cardpanel.setLayout(new CardLayout());
		Cardpanel.setBackground(Color.WHITE);

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
	
	public void go2(){
		
		p1 = new Panel1();
		p2 = new Panel2();
		p3 = new Panel3();
		
		Cardpanel.add(p1);
		Cardpanel.add(p2);
		Cardpanel.add(p3);
		
		innerpanel.add(Cardpanel);
		innerpanel.add(Btnpanel);
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		

		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		CardLayout cl = (CardLayout) (Cardpanel.getLayout());
		JButton source = (JButton)e.getSource();
		
		if(source.equals(button1)){
			this.frame.dispose();
			MainPage frame = new MainPage();
			frame.go();
		}

		if (e.getSource().equals(first)) {

			cl.first(Cardpanel);

		} else if (e.getSource().equals(prev)) {

			cl.previous(Cardpanel);

		} else if (e.getSource().equals(next)) {

			cl.next(Cardpanel);

		} else if (e.getSource().equals(last)) {

			cl.last(Cardpanel);
		}
		
	}	
}


