import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {


	private JPanel subpanel, subpane2;
	private JTextArea textarea;
	private JLabel label1, label2;
	
	
	public void textpanel(File f) {

		subpanel = new JPanel();
		subpanel.setBackground(Color.WHITE);
		textarea = new JTextArea();
		textarea.setFont(new Font("Gothic", Font.BOLD, 25));
		

		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textarea.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		/*
		int panelwidth = (int) panel.getSize().getWidth();
		int panelheight = (int) panel.getSize().getHeight();
		
		int textwidth = (int) textarea.getSize().getWidth();
		int textheight = (int) textarea.getSize().getHeight();
	
		if (textwidth > panelwidth || textheight > panelwidth) {
			return;
		}
		
		textarea.setLocation(panelwidth/2 - textwidth/2, panelheight/2 - textheight/2);
		*/
		subpanel.add(textarea);
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));		
		this.setBackground(Color.WHITE);
		this.add(subpanel);
	}
	
	public void imagepanel(ImageIcon i)
	{
		subpane2 = new JPanel();
		label1 = new JLabel("Image name");
		label1.setFont(new Font("Gothic",Font.BOLD,25));
		label1.setBackground(Color.WHITE);
		subpane2.setBackground(Color.WHITE);
		subpane2.add(label1);
		
		label2 = new JLabel(i);
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));	
		this.setBackground(Color.WHITE);
		this.add(subpane2);
		this.add(label2);
	}

}
