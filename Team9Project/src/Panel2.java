
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel2 extends JPanel {

	private JLabel label1,label2;
	private JPanel subpanel;
	
	public Panel2(){
		
		subpanel = new JPanel();
		label1 = new JLabel("Panel2");
		label1.setFont(new Font("Gothic",Font.BOLD,30));
		label1.setBackground(Color.WHITE);
		subpanel.setBackground(Color.WHITE);
		subpanel.add(label1);
		
		
		label2 = new JLabel(new ImageIcon("panel2.jpg"));
		
		this.setLayout(new BorderLayout());		
		this.setBackground(Color.WHITE);
		this.add(subpanel,BorderLayout.NORTH);
		this.add(label2,BorderLayout.CENTER);
	}
	
	
}
