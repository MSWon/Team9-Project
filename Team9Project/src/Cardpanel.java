import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cardpanel extends JPanel {
	
	private QuizPanel1 quiz1;
	private QuizPanel2 quiz2;
	private TextPanel textpanel;
	private int num = 1;
	
	
	public Cardpanel(){	
		this.setLayout(new CardLayout());
		this.setBackground(Color.WHITE);
	}
	
	public void Chapter1(){
		String filename = "text1_";
		int i;
		
		this.add(new TextPanel("text1_1.txt"), "panel1");
		this.add(new TextPanel("text1_2.txt","pic1_2.png"), "panel2");
		this.add(new TextPanel("text1_3.txt"), "panel3");
		this.add(new TextPanel("text1_3.txt"), "panel4");

//		for(i=1; i<=4; i++){					
//			textpanel = new TextPanel(filename + i + ".txt");
//			String panelname = "panel" + i;
//			this.add(textpanel, panelname);	
//
//		}
		num = 6;
		quiz1 = new QuizPanel1();
		quiz2 = new QuizPanel2();
		this.add(quiz1);
		this.add(quiz2);
	}
	
	public void Chapter2(){
		String filename = "text2_";
		int i;
		int j = 1;
		for(i=num; i<=num+3; i++){			
			textpanel = new TextPanel(filename + j + ".txt");
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	
			j++;
		}
		num = i;
		quiz1 = new QuizPanel1();
		this.add(quiz1);
		
	}
	
	public void Chapter3(){
		String filename = "text1_";  // change to 3
		int i;
		int j = 1;
		for(i=num; i<=num+3; i++){			
			textpanel = new TextPanel(filename + j + ".txt");
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	
			j++;
		}
		num = i;
		quiz1 = new QuizPanel1();
		this.add(quiz1);
		
	}
	
	public void Chapter4(){
		String filename = "text2_";  // change to 4
		int i;
		int j = 1;
		for(i=num; i<=num+3; i++){			
			textpanel = new TextPanel(filename + j + ".txt");
			String panelname = "panel" + i;
			this.add(textpanel, panelname);	
			j++;
		}
		num = i;
		quiz1 = new QuizPanel1();
		this.add(quiz1);
		
	}

}
