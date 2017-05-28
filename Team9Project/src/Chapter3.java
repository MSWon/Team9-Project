import java.awt.BorderLayout;

public class Chapter3 extends Chapter{
	

	
	public void go2(){
		
//		p1 = new Panel1();
//		p2 = new Panel2();
//		p3 = new Panel3();
//		
//		Cardpanel.add(p1);
//		Cardpanel.add(p2);
//		Cardpanel.add(p3);
//		
		innerpanel.add(Cardpanel);
		innerpanel.add(Btnpanel);
		
		spanel.add(scroller);
		spanel.add(innerpanel);
		

		frame.add(menubar,BorderLayout.NORTH);
		frame.add(spanel,BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
