package Quizes;


import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Quiz extends JPanel implements ActionListener{

	
	public String title  = "Quiz - ";
	public String[] subtitle = {"GUI","Tutorial"};
	public static int i = 0;



	public Quiz() {
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 17));
		
		JLabel lblNewLabel = new JLabel(title+subtitle[i]);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(538, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(82))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(623, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(37))
		);
		setLayout(groupLayout);	
		
		i++;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
