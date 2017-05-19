import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseKeyApp extends JPanel implements MouseListener,KeyListener{
	
	private JButton button;
	private JFrame frame;

	
	public void GUI(){
		
		frame = new JFrame("Mouse and Key App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		button = new JButton("Interact with me");
		button.setBackground(Color.RED);
		button.setForeground(Color.WHITE);
		
		button.addKeyListener(this);
		button.addMouseListener(this);

		frame.add(button);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("Key pressed: " + e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println("Key released: " + e.getKeyChar());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == 'Q' || e.getKeyChar() == 'q'){
			System.out.println("Key typed: " + e.getKeyChar());
			System.out.println("Bye bye!");
			System.exit(0);
		}
		else
		System.out.println("Key typed: " + e.getKeyChar());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Mouse clicked at "+ e.getX()+", " + e.getY() +". Click count: " + e.getClickCount());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("Mouse entered: "+ e.getX()+", " + e.getY());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		System.out.println("Mouse exited: "+ e.getX()+", " + e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse pressed at "+ e.getX()+", " + e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse released at "+ e.getX()+", " + e.getY());
		
	}
	
	public static void main(String[] args){
		
		
		MouseKeyApp mk = new MouseKeyApp();
		mk.GUI();
		
	}

}
