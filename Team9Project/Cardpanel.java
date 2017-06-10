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
		
		this.add(new TextPanel("text1_1.txt",40), "panel1");
		this.add(new TextPanel("What is Java?",40,"text1_2.txt",25), "panel2");
		this.add(new TextPanel("Why Java?",40,"text1_3.txt",25), "panel3");
		this.add(new TextPanel("The way Java works",40,"pic1_4.jpg"), "panel4");
		this.add(new TextPanel("Compiling and running",40,"pic1_5.jpg"), "panel5");

		quiz1 = new QuizPanel1();
		this.add(quiz1);
	}
	
	public void Chapter2(){

		
	}
	
	public void Chapter3(){

		
	}
	
	public void Chapter4(){

		
	}

}
