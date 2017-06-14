package Quizes;


import javax.swing.JFrame;

public class QuizTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		Quiz_son qs = new Quiz_son();
		Quiz_son2 qs2 = new Quiz_son2();
		frame.add(qs);
		frame.setSize(400, 500);
		frame.setVisible(true);
		

	}

}
