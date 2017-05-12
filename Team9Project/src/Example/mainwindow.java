package Example;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class mainwindow implements ActionListener{
	private static JFrame mainframe;
	private JFrame frame;
	private JButton btn1;
	
	
	public void buildGUI() {
		
		mainframe = new JFrame();
	
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //스크린 사이즈 찾기
		mainframe.setBounds(0, 0,screen.width,screen.height - 30); // 스크린 사이즈에 따른 바운드 설정
		mainframe.setExtendedState(Frame.MAXIMIZED_BOTH);//frame을 전체화면으로 set

		
		
		JButton btn1 = new JButton("Chapter1");
		btn1.setSize(20, 5);
		mainframe.add(btn1, BorderLayout.CENTER);
		btn1.addActionListener(this);
		
		mainframe.setVisible(true);
		
		
	}
	
	public static void main(String args[]){
		mainwindow test = new mainwindow();
		test.buildGUI();

		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Object source = arg0.getSource();
		
		if (source == btn1) {
			Chapter1 chap = new Chapter1();
			chap.buildGUI();
		}
		//mainframe.setVisible(false);
		
	}
	

}
