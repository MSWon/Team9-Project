import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TextPanel extends JPanel implements ActionListener {
	
	private TextEditor texteditor;
	private JPanel subpanel, subpane2;
	private JTextArea textArea;
	private JLabel label1, label2;
	
	public TextPanel(File f) {
		
				
		JButton editbutton = new JButton("Edit");
		editbutton.setFont(new Font("±¼¸²", Font.BOLD, 18));
		editbutton.addActionListener(this);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Gothic", Font.BOLD, 25));
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textArea.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(345, Short.MAX_VALUE)
					.addComponent(editbutton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
				.addComponent(textArea, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(editbutton)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	
//	public void textpanel(File f) {
//
//		subpanel = new JPanel();
//		subpanel.setBackground(Color.WHITE);
//		textarea = new JTextArea();
//		textarea.setFont(new Font("Gothic", Font.BOLD, 25));
//		
//		try {
//		      File myFile = f;            
//		      FileReader fileReader = new FileReader(myFile);
//		      
//		      BufferedReader reader = new BufferedReader(fileReader);
//		      
//		      String line = null;
//		      
//		      while((line = reader.readLine()) != null)
//		      {
//		         textarea.append(line+"\n");
//		      }
//		      reader.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		
//		/*
//		int panelwidth = (int) panel.getSize().getWidth();
//		int panelheight = (int) panel.getSize().getHeight();
//		
//		int textwidth = (int) textarea.getSize().getWidth();
//		int textheight = (int) textarea.getSize().getHeight();
//	
//		if (textwidth > panelwidth || textheight > panelwidth) {
//			return;
//		}
//		
//		textarea.setLocation(panelwidth/2 - textwidth/2, panelheight/2 - textheight/2);
//		*/
//		subpanel.add(textarea);
//		
//		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));		
//		this.setBackground(Color.WHITE);
//		this.add(subpanel);
//	}

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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		texteditor = new TextEditor();
		texteditor.makeEditorFrom(textArea);
		
	}
}
