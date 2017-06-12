import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cardpanel extends JPanel {
	
	private QuizPanel1 quiz1;
	private QuizPanel2 quiz2;
	private MultiPanel textpanel;
	private int num = 1;
	
	
	public Cardpanel(){	
		this.setLayout(new CardLayout());
		this.setBackground(Color.WHITE);
	}
	
	public void Chapter1(){
		

		this.add(new MultiPanel("text1_1.txt",40), "chapter1"); 
		this.add(new MultiPanel("\nWhat is Java?",40,"text1_2.txt",25), "panel1"); // About Java
		this.add(new MultiPanel("\nWhy Java?",40,"text1_3.txt",25));
		this.add(new MultiPanel("The way Java works\n",40,"pic1_4.jpg"), "panel2"); // Java System
		this.add(new MultiPanel("Compiling and running\n\n",40,"pic1_5.jpg"), "panel3"); // Compiling
		

	}
	
	public void Chapter2(){
		
		this.add(new MultiPanel("chapter2.txt",40), "chapter2"); 
		this.add(new MultiPanel("Classes and Objects",38,"text2_1.txt",22,"text2_1.jpg"), "panel4"); // Class&Object
		this.add(new MultiPanel("Instance variables and methods",38,"text2_2.txt",22,"text2_2.jpg"));
		this.add(new MultiPanel("Class",40,"text2_3.txt",25),"panel5"); // Class
		this.add(new MultiPanel("Anatomy",40,"text2_4.jpg"));
		this.add(new MultiPanel("\nVariables",40,"text2_5.txt",25),"panel6"); // Variables
		this.add(new MultiPanel("Methods",40,"text2_6.txt",25,"text2_6.jpg"),"panel7"); // Methods
		this.add(new MultiPanel("Main methods",40,"text2_7.txt",25));
		this.add(new MultiPanel("\nCreating Objects\n\n",40,"text2_8.jpg"),"panel8"); //Objects
		this.add(new MultiPanel("Constructor",40,"text2_9.txt",25,"text2_9.jpg"),"panel9"); //Constructor
		this.add(new MultiPanel("Variables\n",40,"text2_10.txt",25,"text2_10.jpg"));
		this.add(new MultiPanel("\nVariable naming\n",40,"text2_11.txt",25));
		this.add(new MultiPanel("\nReference Variables\n",40,"text2_12.txt",25,"text2_12.jpg"));
		this.add(new MultiPanel("",1,"text2_13.txt",25,"text2_13.jpg"));
		this.add(new MultiPanel("\nArray",40,"text2_14.txt",25),"panel10"); //Array	
		
	}
	
	public void Chapter3(){
		
		this.add(new MultiPanel("chapter3.txt",40), "chapter3");
		this.add(new MultiPanel("What is Encapsulation",40,"text3_1.txt",25,"text3_1.jpg") , "panel11"); //About Encapsulation
		this.add(new MultiPanel("State and Behavior",40,"text3_2.txt",25,"text3_2.jpg"), "panel12" ); //State&Behavior
		this.add(new MultiPanel("Passing data to a Method",40,"text3_3.jpg") );
		this.add(new MultiPanel("Benefits of encapsulation",40,"text3_4.txt",25) , "panel13"); //Getter&Setter
		this.add(new MultiPanel("To Encapsulate",40,"text3_5.txt",25, "text3_5.jpg") );
		
	}
	
	public void Chapter4(){

		
	}
	
	public void Chapter5(){
		
		this.add(new MultiPanel("chapter5.txt",40), "chapter5");
		this.add(new MultiPanel("",1,"text5_1.txt",25,"text5_1.png") );
		this.add(new MultiPanel("",1,"text5_2.txt",25,"text5_2.png") );
		this.add(new MultiPanel("\nWhy polymorphism is important",40,"text5_3.txt",24) );
		this.add(new MultiPanel("Example: illegal overrides\n",40,"text5_4.png") );
		this.add(new MultiPanel("Overloading",40,"text5_5.txt",25,"text5_5.png") );
	}
	
	
	public void Chapter6(){
		
		this.add(new MultiPanel("chapter6.txt",40), "chapter6"); //GUI
		this.add(new MultiPanel("",1,"text6_1.txt",25,"text6_1.png") ); 
		this.add(new MultiPanel("Swing class hierarchy",40,"text6_2.jpg") ); //Class hierarchy
		this.add(new MultiPanel("\nLayout Manager",40,"text6_3.txt",25) ); //Layout Manager
		this.add(new MultiPanel("The three basic layout managers.",40,"text6_4.jpg") );
		this.add(new MultiPanel("",1,"text6_5.txt",25,"text6_5.jpg") ); // Event handling
		this.add(new MultiPanel("",1,"text6_6.txt",25,"text6_6.jpg") );
		this.add(new MultiPanel("\nEvent Handling\n",40,"text6_7.jpg") );
		this.add(new MultiPanel("\nEvent Handling2\n\n",40,"text6_8.jpg") );
		this.add(new MultiPanel("Cusom Widgets\n",20,"text6_9.txt",25,"text6_9.jpg") ); // Custom Widgets
		
	}
	
	
	public void Chapter7(){

		
	}

}
