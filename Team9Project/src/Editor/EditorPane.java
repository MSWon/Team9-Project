package Editor;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

import Chapter.Chapter;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EditorPane extends JFrame implements ActionListener{


	private JPanel editorPanel;
	private JPanel buttonPanel;
	private JTextPane paneHolder;
	private JTextPane editedPane;
	private String textNameHolder;
	private JScrollPane scrollPane;
	private JButton editButton,caller;
	private JButton cancelButton;
	private Border borderForPane;
	private String firsttext;
	
	
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public EditorPane(JTextPane paneToEdit, String textName,JButton input_caller){
		
		this.caller = input_caller;
		// frame
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Editor");
		setSize(819, 645);
		// outer panel
		editorPanel = new JPanel();
		getContentPane().add(editorPanel);
		
		// pane holder
		paneHolder = paneToEdit;
		// Initial JTextpane's text
		firsttext = paneHolder.getText();

		
		// text holder
		textNameHolder = textName;
		
		// edited pane
		editedPane = new JTextPane();
		editedPane.setDocument(paneHolder.getDocument());
		editedPane.setFont(paneHolder.getFont());

		
		// inner scroll panel
		scrollPane = new JScrollPane(editedPane);
		
		// border
		borderForPane = new TitledBorder("Edit Panel");
		editorPanel.setBorder(borderForPane);
		
		// buttons
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		editButton = new JButton("Edit submit");
		editButton.setFont(new Font("����", Font.BOLD, 15));
		
		editButton.addActionListener(this);
		cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("����", Font.BOLD, 15));
		cancelButton.addActionListener(this);
		GroupLayout gl_editorPanel = new GroupLayout(editorPanel);
		gl_editorPanel.setHorizontalGroup(
			gl_editorPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_editorPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_editorPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_editorPanel.createSequentialGroup()
							.addGap(115)
							.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(editButton)
						.addComponent(cancelButton))
					.addContainerGap())
		);
		gl_editorPanel.setVerticalGroup(
			gl_editorPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_editorPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(editButton)
					.addGap(110)
					.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
					.addComponent(cancelButton)
					.addGap(28))
				.addGroup(gl_editorPanel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
					.addContainerGap())
		);
		editorPanel.setLayout(gl_editorPanel);
		
        this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				caller.setEnabled(true);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.setVisible(true);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).equals(editButton)) {

			paneHolder.setDocument(editedPane.getDocument());
			// save to text, image
			try {
				String textToWrite = editedPane.getText();
				
				File myFile = new File(textNameHolder);
				FileWriter fileWriter = new FileWriter(myFile);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
				bufferedWriter.write(textToWrite);
				
				bufferedWriter.close();

			} catch (IOException ioe) {
				JOptionPane.showMessageDialog(null, "There is an IOexception error!!");
				ioe.printStackTrace();
			}
			
		}
		else{
			paneHolder.setText(firsttext);
		}
		dispose();
		
	}
	
}
