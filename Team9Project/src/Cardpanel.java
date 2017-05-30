import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cardpanel extends JPanel {
	
	private QuizPanel quiz;
	private TextPanel textpanel;
	private int num = 1;
	
	
	public Cardpanel(){	
		this.setLayout(new CardLayout());
		this.setBackground(Color.WHITE);
	}
	
	public void Chapter1(){
		String filename = "text1_";
		int i;

		for(i=1; i<=4; i++){			
			File f = new File(filename + i + ".txt");
			textpanel = new TextPanel(f);
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	

		}
		num = i;
		quiz = new QuizPanel();
		this.add(quiz);
		
	}
	
	public void Chapter2(){
		String filename = "text2_";
		int i;
		int j = 1;
		for(i=num; i<=num+3; i++){			
			File f = new File(filename + j + ".txt");
			textpanel = new TextPanel(f);
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	
			j++;
		}
		num = i;
		quiz = new QuizPanel();
		this.add(quiz);
		
	}
	
	public void Chapter3(){
		String filename = "text1_";  // change to 3
		int i;
		int j = 1;
		for(i=num; i<=num+3; i++){			
			File f = new File(filename + j + ".txt");
			textpanel = new TextPanel(f);
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	
			j++;
		}
		num = i;
		quiz = new QuizPanel();
		this.add(quiz);
		
	}
	
	public void Chapter4(){
		String filename = "text2_";  // change to 4
		int i;
		int j = 1;
		for(i=num; i<=num+3; i++){			
			File f = new File(filename + j + ".txt");
			textpanel = new TextPanel(f);
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	
			j++;
		}
		num = i;
		quiz = new QuizPanel();
		this.add(quiz);
		
	}

}
