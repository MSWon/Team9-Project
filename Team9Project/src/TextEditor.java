
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TextEditor implements ActionListener{

	private JFrame editorFrame;
	private JPanel editorPanel;
	private JPanel innerPanel;
	private JTextArea textToShow;
	private JTextArea edtitedText;
	private JScrollPane scrollPaneForText;
	private JButton editButton;
	private JButton cancelButton;
	private JLabel emptyLabel;
	private Border borderForPane;
	private Color backgroundColor;
	
	public void makeEditorFrom(JTextArea textToEdit) {
		
		editorFrame = new JFrame();
		editorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		editorFrame.setTitle("Text Editor");
		editorPanel = new JPanel();
		backgroundColor = editorPanel.getBackground();
		editorPanel.setLayout(new BoxLayout(editorPanel, BoxLayout.LINE_AXIS));
		editorFrame.add(editorPanel);
		textToShow = new JTextArea(textToEdit.getText());
		textToShow.setBackground(backgroundColor);
		scrollPaneForText = new JScrollPane(textToShow);
		borderForPane = new TitledBorder("Edit Text");
		scrollPaneForText.setBorder(borderForPane);
		editorPanel.add(scrollPaneForText);
		edtitedText = textToEdit;
		
		innerPanel = new JPanel();
		innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
		editorPanel.add(innerPanel);
		
		editButton = new JButton("Edit submit");
		editButton.addActionListener(this);
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		emptyLabel = new JLabel(" ");
		innerPanel.add(editButton);
		innerPanel.add(emptyLabel);
		innerPanel.add(cancelButton);
		editorFrame.setSize(400, 200);
		editorFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).equals(editButton))
			edtitedText.setText(textToShow.getText());
		editorFrame.dispose();
	}
	
}
