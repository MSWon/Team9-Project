import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Chapter2 implements ActionListener{
	

	private QuizPanel quiz;
	private TextPanel textpanel;
	private JPanel Cardpanel;
	private JPanel Btnpanel;
	private JButton first,prev,next,last;
	
	public Chapter2(){
		
		Cardpanel = new JPanel();   // Card panel
		Cardpanel.setLayout(new CardLayout());
		Cardpanel.setBackground(Color.WHITE);
		
		File f = new File("MyText.txt");
		ImageIcon i = new ImageIcon("panel1.jpg");
		
		textpanel = new TextPanel(f);
		quiz = new QuizPanel();
		
		Cardpanel.add(textpanel);
		Cardpanel.add(quiz);
		
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

	}

	public JPanel getBtnpanel() {
		return Btnpanel;
	}


	public void setBtnpanel(JPanel btnpanel) {
		Btnpanel = btnpanel;
	}
	
	
	public JPanel getCardpanel() {
		return Cardpanel;
	}


	public void setCardpanel(JPanel cardpanel) {
		Cardpanel = cardpanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		CardLayout cl = (CardLayout) (Cardpanel.getLayout());
		
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
