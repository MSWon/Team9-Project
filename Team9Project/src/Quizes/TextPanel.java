package Quizes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

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
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class TextPanel extends JPanel implements ActionListener {
	
	private EditorPane editorpane;
	private String FileNameHolder;
	private JPanel subpanel, btnpanel;
	private JPanel subpanel2;
	private JEditPane textpane;
	private JLabel label1, label2;
	private JLabel lblNewLabel;
	
	// main structure 
	public TextPanel(){
		
		this.setBackground(Color.WHITE);
		
		subpanel = new JPanel();
		subpanel.setBackground(Color.WHITE);
		btnpanel = new JPanel();
		btnpanel.setBackground(Color.WHITE);
		
		JButton editbutton = new JButton("Edit");
		editbutton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		editbutton.addActionListener(this);

		btnpanel.add(editbutton);
		
		JButton btnQuestion = new JButton("Question");
		btnQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String returnVal = JOptionPane.showInputDialog(null, "What is your question?");
				try {
					TextArea area = new TextArea();
					File myFile = new File("question.txt");
					FileReader fileReader = new FileReader(myFile);
				    BufferedReader reader = new BufferedReader(fileReader);
				    String line = null;
				    while((line = reader.readLine()) != null)
				    {
				       area.append(line+"\n");
				    }
				    reader.close();
				    
				    FileWriter fileWriter = new FileWriter(myFile);
				    BufferedWriter writer = new BufferedWriter(fileWriter);
				      
				    String addline = returnVal;
				    area.append(addline+"\n");
				    
				    
				    writer.close();
				} catch(Exception E) {
					System.out.println("exception");
				}
			}
		});
		btnQuestion.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		GroupLayout gl_btnpanel = new GroupLayout(btnpanel);
		gl_btnpanel.setHorizontalGroup(
			gl_btnpanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnpanel.createSequentialGroup()
					.addContainerGap(170, Short.MAX_VALUE)
					.addComponent(btnQuestion)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(editbutton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		gl_btnpanel.setVerticalGroup(
			gl_btnpanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnpanel.createSequentialGroup()
					.addContainerGap(218, Short.MAX_VALUE)
					.addGroup(gl_btnpanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnQuestion, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(editbutton))
					.addGap(33))
		);
		btnpanel.setLayout(gl_btnpanel);			
	}
	
	// Panel with only textfile you can adjust size of the font.
	public TextPanel(String filename,int fontsize) {
		
		FileNameHolder = filename;
		TextPanel tp = new TextPanel();	
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
		
		tp.subpanel.add(textpane);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(tp.subpanel);
		this.add(tp.btnpanel);
								
	}
	
	// Put textfile first and image second.
	public TextPanel(String filename, String imagename) {
		
		this.FileNameHolder = filename;
		TextPanel tp = new TextPanel();
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
		
		tp.subpanel.add(textpane);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(tp.subpanel);
		this.add(tp.btnpanel);
		
	}
	
	public TextPanel(String title , int fontsize, String imagename) {
		
		TextPanel tp = new TextPanel();
		
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
					
		tp.subpanel.add(textpane);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(tp.subpanel);
		this.add(tp.btnpanel);
		
	}
	
	// title first and textfile second can adjust both sizes.
	public TextPanel(String title , int titlesize, String filename , int filefont) {
		
		this.FileNameHolder = filename;
		TextPanel tp = new TextPanel();
		
		textpane = new JEditPane();
		textpane.setEditable(false);
		// This set to align both text in center
		SimpleAttributeSet as = new SimpleAttributeSet();
		StyleConstants.setAlignment(as,
		                    StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontSize(as, titlesize);
		StyleConstants.setFontFamily(as, "Gothic");
		StyleConstants.setBold(as, true);
		textpane.setParagraphAttributes(as,true);
		textpane.append(title);
		
		JEditPane textpane2 = new JEditPane();
		textpane2.setEditable(false);
		textpane2.setFont(new Font("Gothic", Font.BOLD, filefont));
	
		File f = new File(filename);
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;
		      
		      while((line = reader.readLine()) != null)
		      {
		         textpane2.append(line+"\n");
		      }
		      reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		tp.subpanel.setLayout(new BoxLayout(tp.subpanel, BoxLayout.Y_AXIS));
		JPanel content = new JPanel();
		content.setBackground(Color.WHITE);
		content.add(textpane2);
		
		tp.subpanel.add(textpane);
		tp.subpanel.add(content);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(tp.subpanel);
		this.add(tp.btnpanel);
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
				editorpane.makeEditorFrom(textpane,FileNameHolder);
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
