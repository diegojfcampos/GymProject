package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.UserDB;
import objects.Users;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtUserPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(96, 57, 70, 15);
		contentPane.add(lblUser);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(96, 79, 182, 26);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(96, 123, 70, 15);
		contentPane.add(lblPassword);
		
		txtUserPassword = new JPasswordField();
		txtUserPassword.setBounds(96, 150, 182, 26);
		contentPane.add(txtUserPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
				login();
			}
		});
		btnLogin.setBounds(128, 188, 117, 25);
		contentPane.add(btnLogin);
	}
	
	private void login() {
		try {
			String userName = txtUserName.getText();				
			String userPassword = String.valueOf(txtUserPassword.getPassword());
			Users users = new Users();
			users.setUserName(userName);
			users.setUserPassword(userPassword);
			
			UserDB objUserDB = new UserDB();
			ResultSet rsUserDB =  objUserDB.userAuthentication(users);
			
			if (rsUserDB.next() ) {
				MainFrameView objMainFrame = new MainFrameView();
				objMainFrame.setVisible(true);
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "User or Password wrong");				
			}
			
		}catch(SQLException error){
			JOptionPane.showConfirmDialog(null, "Login View" + error);
		}
	}
}
