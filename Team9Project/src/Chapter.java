import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import javaFramePractice.Chapter;

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
	private Cardpanel cardpanel;
	private CardLayout cl;
	
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
		// helper Dog
				button2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JFrame helpFrame = new JFrame();
						helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						
						JPanel helpPane = new JPanel();
						helpPane.setLayout(new GridLayout(0, 2, 5, 5));
						helpFrame.add(helpPane);
						
						ImageIcon helperDog = new ImageIcon("HelperDog.jpg");
						JLabel helperDogLabel = new JLabel(helperDog);
						helpPane.add(helperDogLabel);
						helpPane.setBackground(Color.WHITE);
						
						JPanel buttonPane = new JPanel();
						helpPane.add(buttonPane);
						buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.Y_AXIS));
						Color tooltipColor = new Color(255, 255, 102);
						buttonPane.setBackground(tooltipColor);//255,255,102				
						
						JLabel menuLabel = new JLabel("menu");
						JButton searchButton = new JButton("Search");
						searchButton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// search 부분 태풍이가 추가하면 됍니다
								
							}
						});
						JLabel emptyLabel = new JLabel(" ");
						JButton aboutButton = new JButton("About");
						aboutButton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {

								JOptionPane.showMessageDialog(Chapter.this.button2, "Created by team 9",
											"About ", JOptionPane.INFORMATION_MESSAGE);
								
							}
						});
						buttonPane.add(menuLabel);
						buttonPane.add(emptyLabel);
						buttonPane.add(searchButton);
						buttonPane.add(emptyLabel);
						buttonPane.add(aboutButton);
						
						helpFrame.setSize(200, 200);
						helpFrame.setVisible(true);
					}
				});
				
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
		
		cardpanel = new Cardpanel();
		cardpanel.Chapter1();
		cardpanel.Chapter2();
		cardpanel.Chapter3();
		cardpanel.Chapter4();
		
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
		
		JLabel label_1 = new JLabel(" Tutorial",SwingConstants.LEFT);
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

		
		JLabel label_2 = new JLabel(" FirstStepToOOP",SwingConstants.LEFT);
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
		
		JLabel label_3 = new JLabel(" Encapsulation",SwingConstants.LEFT);
		label_3.setFont(new Font("Gothic",Font.BOLD,20));
		Scrollpanel.add(label_3);
		
		String[] listname3 = {" About Encapsulation"," State&Behavior"," Getter&Setter",				
				 " Methods"};
		
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
		cl.show(cardpanel, "panel13");
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
	
			
		for(int i=0; i<10; i++){
			if(source == buttons.get(i))
				cl.show(cardpanel,"panel"+(i+1));
		}
	
	}	
}


