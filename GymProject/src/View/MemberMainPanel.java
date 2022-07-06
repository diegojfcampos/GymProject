package View;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MemberMainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberMainPanel() {
		setLayout(null);
		
		JButton btnAddMember = new JButton("Add Member");
		btnAddMember.setBounds(26, 60, 170, 25);
		add(btnAddMember);
		
		JButton btnSearchMembers = new JButton("Search  Members");
		btnSearchMembers.setBounds(26, 124, 170, 25);
		add(btnSearchMembers);
		
		JButton btnDeletemembers = new JButton("DeleteMembers");
		btnDeletemembers.setBounds(26, 187, 170, 25);
		add(btnDeletemembers);

	}
}
