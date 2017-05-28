import java.awt.BorderLayout;
import java.io.File;

import javax.swing.ImageIcon;

public class Chapter1 extends Chapter{
	

	private QuizPanel quiz;


	
	public void go2(){
		
		File f = new File("MyText.txt");
		ImageIcon i = new ImageIcon("panel1.jpg");
		
		p1 = new TextPanel(f);
//		p1.textpanel(f);
		
//		p1.imagepanel(i);
		//p1 = new TextPanel();
//		p2 = new Panel2();
//		p3 = new Panel3();

		quiz = new QuizPanel();

		
		Cardpanel.add(p1);
//		Cardpanel.add(p2);
//		Cardpanel.add(p3);


		Cardpanel.add(quiz);
		
		innerpanel.add(Cardpanel);
		innerpanel.add(Btnpanel);
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		

		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
