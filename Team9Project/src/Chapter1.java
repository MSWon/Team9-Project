import java.awt.BorderLayout;

public class Chapter1 extends Chapter{
	
	private QuizPanel quiz;
	
	@Override
	
	public void go2(){
		
		//p1 = new Panel1();
		p1 = new TextInPanel();
		p2 = new Panel2();
		p3 = new Panel3();
		quiz = new QuizPanel();
		
		Cardpanel.add(p1);
		Cardpanel.add(p2);
		Cardpanel.add(p3);
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
