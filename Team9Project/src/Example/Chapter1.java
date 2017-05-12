package Example;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chapter1 {
	private JFrame frame;
	private JLabel label;
	
	public void buildGUI() {
		frame = new JFrame();
		label = new JLabel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //��ũ�� ������ ã��
		frame.setBounds(0, 0,screen.width,screen.height - 30); // ��ũ�� ����� ���� �ٿ�� ����
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);//frame�� ��üȭ������ set

		label.setText("I'm chapter1!!");
		frame.add(label);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
	}

	/*public static void main(String[] args) {
		Chapter1 test = new Chapter1();
		test.buildGUI();

	}*/

}
