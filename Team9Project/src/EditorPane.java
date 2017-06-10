

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EditorPane implements ActionListener{

	private JFrame editorFrame;
	private JPanel editorPanel;
	private JPanel buttonPanel;
	private JTextPane paneHolder;
	private JTextPane editedPane;
	private String textNameHolder;
	private JScrollPane scrollPane;
	private JButton editButton;
	private JButton cancelButton;
	private Border borderForPane;
	private String firsttext;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void makeEditorFrom(JTextPane paneToEdit, String textName){
		// frame
		editorFrame = new JFrame();
		editorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		editorFrame.setTitle("Editor");
		// outer panel
		editorPanel = new JPanel();
		editorFrame.getContentPane().add(editorPanel);
		
		// pane holder
		paneHolder = paneToEdit;
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
		editButton = new JButton("Edit sumbit");
		
		editButton.addActionListener(this);
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		GroupLayout gl_editorPanel = new GroupLayout(editorPanel);
		gl_editorPanel.setHorizontalGroup(
			gl_editorPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_editorPanel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_editorPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_editorPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(editButton))
						.addGroup(gl_editorPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cancelButton)))
					.addContainerGap())
		);
		gl_editorPanel.setVerticalGroup(
			gl_editorPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_editorPanel.createSequentialGroup()
					.addGap(57)
					.addComponent(editButton)
					.addGap(65)
					.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
					.addComponent(cancelButton)
					.addContainerGap())
		);
		editorPanel.setLayout(gl_editorPanel);
		
		editorFrame.setVisible(true);
		editorFrame.setSize(600, 400);
		
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
				ioe.printStackTrace();
			}
			
		}
		else{
			paneHolder.setText(firsttext);
		}
		editorFrame.dispose();
		
	}
	
}
