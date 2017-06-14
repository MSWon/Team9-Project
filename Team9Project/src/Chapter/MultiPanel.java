package Chapter;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import Editor.JEditPane;

public class MultiPanel extends TextPanel {
	
	// Panel with only textfile you can adjust size of the font.
	public MultiPanel(String filename,int fontsize) {
		
		FileNameHolder = filename;
		File f = new File(filename);
		
		textpane = new JEditPane();
		textpane.setEditable(false);
		textpane.setFont(new Font("Gothic", Font.BOLD, fontsize));
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textpane.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		subpanel.add(textpane);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(subpanel);
		this.add(btnpanel);
								
	}
	
	// Put textfile first and image second.
	public MultiPanel(String filename, String imagename) {
		
		FileNameHolder = filename;
		File f = new File(filename);
		
		textpane = new JEditPane();
		textpane.setEditable(false);
		textpane.setFont(new Font("Gothic", Font.BOLD, 25));
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textpane.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(imagename);
		textpane.insertComponent(new JLabel(icon));
		
		subpanel.add(textpane);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(subpanel);
		this.add(btnpanel);
		
	}
	
	public MultiPanel(String title , int fontsize, String imagename) {
		

		textpane = new JEditPane();
		textpane.setEditable(false);
		// This set to align both text,image in center
		SimpleAttributeSet as = new SimpleAttributeSet();
		StyleConstants.setAlignment(as,
		                    StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontSize(as, fontsize);
		StyleConstants.setFontFamily(as, "Gothic");
		StyleConstants.setBold(as, true);
		textpane.setParagraphAttributes(as,true);
		textpane.append(title+"\n");
		textpane.setAlignmentX(CENTER_ALIGNMENT);
		
		ImageIcon icon = new ImageIcon(imagename);
		textpane.insertComponent(new JLabel(icon));
					
		subpanel.add(textpane);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(subpanel);
		this.add(btnpanel);
		
	}
	
	// title first and textfile second can adjust both sizes.
	public MultiPanel(String title , int titlesize, String filename , int filefont) {
		
		FileNameHolder = filename;
		
		textpane = new JEditPane();
		textpane.setEditable(false);
		
		JEditPane textpane2 = new JEditPane();
		// This set to align both text in center
		SimpleAttributeSet as = new SimpleAttributeSet();
		StyleConstants.setAlignment(as,
		                    StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontSize(as, titlesize);
		StyleConstants.setFontFamily(as, "Gothic");
		StyleConstants.setBold(as, true);
		textpane2.setParagraphAttributes(as,true);
		textpane2.append(title);
		
		textpane.setEditable(false);
		textpane.setFont(new Font("Gothic", Font.BOLD, filefont));
	
		File f = new File(filename);
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textpane.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		subpanel.setLayout(new BoxLayout(subpanel, BoxLayout.Y_AXIS));
		JPanel content = new JPanel();
		content.setBackground(Color.WHITE);
		content.add(textpane);
		
		subpanel.add(textpane2);
		subpanel.add(content);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(subpanel);
		this.add(btnpanel);
	}
	
	// title first and textfile second can adjust both sizes.
	public MultiPanel(String title , int titlesize, String filename , int filefont, String imagename) {
		
		FileNameHolder = filename;
		
		textpane = new JEditPane();
		textpane.setEditable(false);
		
		JEditPane textpane2 = new JEditPane();
		// This set to align both text in center
		SimpleAttributeSet as = new SimpleAttributeSet();
		StyleConstants.setAlignment(as,
		                    StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontSize(as, titlesize);
		StyleConstants.setFontFamily(as, "Gothic");
		StyleConstants.setBold(as, true);
		textpane2.setParagraphAttributes(as,true);
		textpane2.append(title);
		
		textpane.setEditable(false);
		textpane.setFont(new Font("Gothic", Font.BOLD, filefont));
	
		File f = new File(filename);
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textpane.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		ImageIcon icon = new ImageIcon(imagename);
		textpane.insertComponent(new JLabel(icon));

		subpanel.setLayout(new BoxLayout(subpanel, BoxLayout.Y_AXIS));
		JPanel content = new JPanel();
		content.setBackground(Color.WHITE);
		content.add(textpane);
		
		subpanel.add(textpane2);
		subpanel.add(content);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(subpanel);
		this.add(btnpanel);
	}

}
