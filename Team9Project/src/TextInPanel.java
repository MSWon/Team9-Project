import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;

public class TextInPanel extends JPanel{
	private JPanel subpanel;
	private JTextArea textarea;

	public TextInPanel()
	{
		subpanel = new JPanel();
		textarea = new JTextArea();
		
		try {
		      File myFile = new File("MyText.txt");            
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
		
		this.setLayout(new BorderLayout());		
		this.setBackground(Color.WHITE);
		this.add(subpanel,BorderLayout.CENTER);

	}
	
}
