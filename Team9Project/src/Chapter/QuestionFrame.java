package Chapter;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class QuestionFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollpane;
	private JButton btnEnter, btnExit;

	/**
	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QuestionFrame frame = new QuestionFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public QuestionFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 334, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		scrollpane = new JScrollPane();
		JLabel lblWhatIsYour = new JLabel("What is your Question?");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(this);
		
		btnExit = new JButton("Save&Exit");
		btnExit.addActionListener(this);
		textArea = new JTextArea();
		try {
			File myFile = new File("question.txt");
			FileReader fileReader = new FileReader(myFile);
		    BufferedReader reader = new BufferedReader(fileReader);
		    String line = null;
		    while((line = reader.readLine()) != null)
		    {
		       textArea.append(line+"\n");
		    }
		    reader.close();
			
		} catch(Exception E) {
			JOptionPane.showMessageDialog(null, "There is an error!!");
			E.printStackTrace();
		}
		scrollpane.setViewportView(textArea);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblWhatIsYour)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(133, Short.MAX_VALUE)
					.addComponent(btnEnter)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
				.addComponent(scrollpane, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblWhatIsYour)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollpane, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnExit)
						.addComponent(btnEnter))
					.addGap(153))
		);
		contentPane.setLayout(gl_contentPane);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == btnEnter) {
			String newline = textField.getText();
			textArea.append(newline+"\n");
			textField.setText(null);
			textArea.updateUI();
		}
		else if (source == btnExit) {
			try {
				File myFile = new File("question.txt");
				FileWriter fileWriter = new FileWriter(myFile);
			    BufferedWriter writer = new BufferedWriter(fileWriter);
			    
			    String add = textArea.getText();
			    writer.write(add);
			    
			    writer.close();
			} catch (Exception E) {
				JOptionPane.showMessageDialog(null, "There is an error!!");
				E.printStackTrace();
			}
			this.dispose();
		}
	}
}