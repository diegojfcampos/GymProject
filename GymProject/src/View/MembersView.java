package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.MembersDB;
import objects.Members;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class MembersView extends JFrame {

	private JPanel contentPane;
	private JTextField textFNMembers;
	private JTextField textLNMembers;
	private JTextField textEmailMembers;
	private JTextField textCellPhoneMembers;
	private JTextField textSDateMembers;
	private JTextField textBirthdayMembers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MembersView frame = new MembersView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MembersView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 10, 253);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(33, 21, 108, 15);
		contentPane.add(lblNewLabel);
		
		textFNMembers = new JTextField();
		textFNMembers.setBounds(27, 48, 114, 19);
		contentPane.add(textFNMembers);
		textFNMembers.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Nanel");
		lblNewLabel_1.setBounds(277, 21, 100, 15);
		contentPane.add(lblNewLabel_1);
		
		textLNMembers = new JTextField();
		textLNMembers.setBounds(277, 48, 114, 19);
		contentPane.add(textLNMembers);
		textLNMembers.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(33, 79, 70, 15);
		contentPane.add(lblEmail);
		
		textEmailMembers = new JTextField();
		textEmailMembers.setBounds(27, 106, 222, 21);
		contentPane.add(textEmailMembers);
		textEmailMembers.setColumns(10);
		
		JLabel lblCellphone = new JLabel("Cellphone");
		lblCellphone.setBounds(277, 79, 114, 15);
		contentPane.add(lblCellphone);
		
		textCellPhoneMembers = new JTextField();
		textCellPhoneMembers.setBounds(277, 106, 142, 19);
		contentPane.add(textCellPhoneMembers);
		textCellPhoneMembers.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Birthday");
		lblNewLabel_2.setBounds(33, 137, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Start Date");
		lblNewLabel_3.setBounds(277, 137, 114, 15);
		contentPane.add(lblNewLabel_3);
		
		textSDateMembers = new JTextField();
		textSDateMembers.setBounds(277, 164, 114, 19);
		contentPane.add(textSDateMembers);
		textSDateMembers.setColumns(10);
		
		JList list = new JList();
		list.setBounds(270, 169, 1, 1);
		contentPane.add(list);
		
		JButton btnC = new JButton("Register");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertMember();
			}
		});
		btnC.setBounds(154, 212, 117, 25);
		contentPane.add(btnC);
		
		textBirthdayMembers = new JTextField();
		textBirthdayMembers.setText("dd/mm/yyyy");
		textBirthdayMembers.setBounds(27, 164, 114, 19);
		contentPane.add(textBirthdayMembers);
		textBirthdayMembers.setColumns(10);
	}
	private void insertMember() {
		
		try {
			String firstName = textFNMembers.getText();
			String lastName = textLNMembers.getText();
			String email = textEmailMembers.getText();
			String cellphoneNum = textCellPhoneMembers.getText();
			String birthday = textBirthdayMembers.getText();
			String startDate = textSDateMembers.getText();
			
			Members member = new Members();
			member.setFirstName(firstName);
			member.setLastName(lastName);
			member.setEmail(email);
			member.setCellphone(cellphoneNum);
			member.setBirthday(birthday);
			member.setStartDate(startDate);
			
			MembersDB objMemberDB = new MembersDB();
			objMemberDB.registerMember(member);
			
			JOptionPane.showMessageDialog(null, "Member Registered");
			dispose();
				
		}catch(Exception error) {
			JOptionPane.showMessageDialog(null, "Error View" + error);
		}
		
		
		
	}
}
