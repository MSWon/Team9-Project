import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Buttons implements ActionListener {
	
	private JFrame frame;
	private JButton east, west, north, south, center;
	
	public void buildGUI(){
		
		frame = new JFrame("Buttons App");
		// Exit app when we close the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		east = new JButton("East"); 
		east.addActionListener(this);
		frame.add(east,BorderLayout.EAST);
		
		west = new JButton("West");
		west.addActionListener(this);
		frame.add(west,BorderLayout.WEST);
		
		north = new JButton("North");
		north.addActionListener(this);
		frame.add(north,BorderLayout.NORTH);
		
		south = new JButton("South");
		south.addActionListener(this);
		frame.add(south,BorderLayout.SOUTH);
		
		center = new JButton("Center");
		center.addActionListener(this);
		frame.add(center,BorderLayout.CENTER);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] agrs){
		Buttons b = new Buttons();
		b.buildGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		east = (JButton)e.getSource();
		east.setText("Clicked!");
		east.setEnabled(false);
		
	}
}

