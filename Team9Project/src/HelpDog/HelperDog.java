package HelpDog;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Chapter.Chapter;
import Chapter.SearchKeyword;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class HelperDog extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1,caller;
	private ImageIcon helperDog = new ImageIcon("HelperDog_Message_pop_up.jpg");
	SearchKeyword dialog;
	/**
	 * Create the frame.
	 */
	public HelperDog(JButton caller_input) {
		this.setResizable(false);
		caller=caller_input;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 234, 208);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(helperDog.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("1. Search");
		btnNewButton.setFont(new Font("MD¾Æ·ÕÃ¼", Font.BOLD, 15));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("2. About");
		btnNewButton_1.setFont(new Font("MD¾Æ·ÕÃ¼", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(42))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_1)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
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
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).equals(btnNewButton)) {
			btnNewButton.setEnabled(false);
			
			dialog = new SearchKeyword(this,"Search Keyword",btnNewButton);
			dialog.setVisible(true);
			
			
		}
		if (((JButton)e.getSource()).equals(btnNewButton_1)) {
			JOptionPane.showMessageDialog(HelperDog.this, 
					"JAVA Education Program for oop developer: ±ÇÅÂÇ³, ±ÇÇý¹Î, ¸ÍÁÖÈñ, ¹ÚÁØ±Ô, ¿ø¹Î¼·\n"
					+ "Version: 1.0"
					+ "build id: 0.0"
					+ "\n"
					+ "(c) copyright: oop course 2017-06-14, all rights reserved.",
					"About ", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
