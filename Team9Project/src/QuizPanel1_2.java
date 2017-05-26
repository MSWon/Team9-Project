import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class QuizPanel1_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public QuizPanel1_2() {
		
		JLabel lblQuizPart = new JLabel("Quiz - Part2");
		lblQuizPart.setFont(new Font("±¼¸²", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(193))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(lblQuizPart, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(516, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQuizPart, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(308, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
