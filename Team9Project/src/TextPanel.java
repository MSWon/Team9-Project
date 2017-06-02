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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TextPanel extends JPanel implements ActionListener {
	
	private EditorPane editorpane;
	private JPanel subpanel, btnpanel;
	private JPanel subpanel2;
	private JEditPane textpane;
	private JLabel label1, label2;
	
	public TextPanel(File f) {
		setBackground(Color.WHITE);
		
		subpanel = new JPanel();
		subpanel.setBackground(Color.WHITE);
		btnpanel = new JPanel();
		btnpanel.setBackground(Color.WHITE);
		
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
		
				
		JButton editbutton = new JButton("Edit");
		editbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		editbutton.addActionListener(this);
		subpanel.add(textpane);
		btnpanel.add(editbutton);
		GroupLayout gl_btnpanel = new GroupLayout(btnpanel);
		gl_btnpanel.setHorizontalGroup(
			gl_btnpanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnpanel.createSequentialGroup()
					.addContainerGap(584, Short.MAX_VALUE)
					.addComponent(editbutton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		gl_btnpanel.setVerticalGroup(
			gl_btnpanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnpanel.createSequentialGroup()
					.addContainerGap(461, Short.MAX_VALUE)
					.addComponent(editbutton)
					.addGap(33))
		);
		btnpanel.setLayout(gl_btnpanel);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(subpanel);
		this.add(btnpanel);
						

		
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
//		subpanel.add(textarea);
//		
//		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));		
//		this.setBackground(Color.WHITE);
//		this.add(subpanel);
//	}

	public void imagepanel(ImageIcon i)
	{
		subpanel2 = new JPanel();
		label1 = new JLabel("Image name");
		label1.setFont(new Font("Gothic",Font.BOLD,25));
		label1.setBackground(Color.WHITE);
		subpanel2.setBackground(Color.WHITE);
		subpanel2.add(label1);
		
		label2 = new JLabel(i);
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));	
		this.setBackground(Color.WHITE);
		this.add(subpanel2);
		this.add(label2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String resultStr = null;
		String correctAns = "pass";
		resultStr = JOptionPane.showInputDialog("Enter the admin's password\n\u203B Edit is only for administratior \u203B");
		try {
			if (resultStr.equals(correctAns))
			{
				editorpane = new EditorPane();
				editorpane.makeEditorFrom(textpane);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You enter wrong password");
			}
		} catch(NullPointerException NEX) {
			System.out.println("User enters null.");
		}
	}
}
