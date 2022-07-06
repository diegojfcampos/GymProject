package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.MembersDB;
import DB.StaffDB;
import objects.Members;
import objects.Staff;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffView extends JFrame {

	private JPanel contentPane;
	private JTextField textFNStaff;
	private JTextField textLNStaff;
	private JTextField textStreetStaff;
	private JTextField textHouseNumberStaff;
	private JTextField textAirCodeStaff;
	private JTextField textCityStaff;
	private JTextField textCountryStaff;
	private JTextField textComplementStaff;
	private JTextField textCellPhoneStaff;
	private JTextField textEmailStaff;
	private JLabel lblCellphone;
	private JLabel lblBirthday;
	private JTextField textBirthdayStaff;
	private JLabel lblStartDate;
	private JTextField textSDateStaff;
	private JTextField textFunctionStaff;
	private JTextField textSalaryStaff;
	private JTextField textIdStaff;
	private JTextField textIbanStaff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffView frame = new StaffView();
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
	public StaffView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 25000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(12, 0, 114, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(271, 0, 81, 15);
		contentPane.add(lblLastName);
		
		textFNStaff = new JTextField();
		textFNStaff.setBounds(12, 27, 216, 19);
		contentPane.add(textFNStaff);
		textFNStaff.setColumns(10);
		
		textLNStaff = new JTextField();
		textLNStaff.setBounds(271, 27, 172, 19);
		contentPane.add(textLNStaff);
		textLNStaff.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Street");
		lblNewLabel.setBounds(12, 53, 70, 15);
		contentPane.add(lblNewLabel);
		
		textStreetStaff = new JTextField();
		textStreetStaff.setBounds(12, 78, 216, 19);
		contentPane.add(textStreetStaff);
		textStreetStaff.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(271, 58, 70, 15);
		contentPane.add(lblNumber);
		
		textHouseNumberStaff = new JTextField();
		textHouseNumberStaff.setBounds(271, 78, 62, 19);
		contentPane.add(textHouseNumberStaff);
		textHouseNumberStaff.setColumns(10);
		
		JLabel lblAirCode = new JLabel("Air Code");
		lblAirCode.setBounds(329, 109, 70, 15);
		contentPane.add(lblAirCode);
		
		textAirCodeStaff = new JTextField();
		textAirCodeStaff.setBounds(329, 131, 114, 19);
		contentPane.add(textAirCodeStaff);
		textAirCodeStaff.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(12, 109, 70, 15);
		contentPane.add(lblCity);
		
		textCityStaff = new JTextField();
		textCityStaff.setBounds(12, 131, 114, 19);
		contentPane.add(textCityStaff);
		textCityStaff.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(158, 109, 70, 15);
		contentPane.add(lblCountry);
		
		textCountryStaff = new JTextField();
		textCountryStaff.setBounds(158, 131, 149, 19);
		contentPane.add(textCountryStaff);
		textCountryStaff.setColumns(10);
		
		JLabel lblComplement = new JLabel("Complement");
		lblComplement.setBounds(12, 162, 98, 15);
		contentPane.add(lblComplement);
		
		textComplementStaff = new JTextField();
		textComplementStaff.setBounds(12, 184, 431, 19);
		contentPane.add(textComplementStaff);
		textComplementStaff.setColumns(10);
		
		textCellPhoneStaff = new JTextField();
		textCellPhoneStaff.setBounds(12, 243, 114, 19);
		contentPane.add(textCellPhoneStaff);
		textCellPhoneStaff.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(158, 222, 70, 15);
		contentPane.add(lblNewLabel_1);
		
		textEmailStaff = new JTextField();
		textEmailStaff.setBounds(158, 243, 285, 19);
		contentPane.add(textEmailStaff);
		textEmailStaff.setColumns(10);
		
		lblCellphone = new JLabel("Cellphone");
		lblCellphone.setBounds(12, 222, 86, 15);
		contentPane.add(lblCellphone);
		
		lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(12, 274, 70, 15);
		contentPane.add(lblBirthday);
		
		textBirthdayStaff = new JTextField();
		textBirthdayStaff.setBounds(12, 301, 114, 19);
		contentPane.add(textBirthdayStaff);
		textBirthdayStaff.setColumns(10);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(158, 274, 114, 15);
		contentPane.add(lblStartDate);
		
		textSDateStaff = new JTextField();
		textSDateStaff.setBounds(158, 301, 114, 19);
		contentPane.add(textSDateStaff);
		textSDateStaff.setColumns(10);
		
		textFunctionStaff = new JTextField();
		textFunctionStaff.setBounds(158, 349, 241, 19);
		contentPane.add(textFunctionStaff);
		textFunctionStaff.setColumns(10);
		
		JLabel lblJobFunction = new JLabel("Job Function");
		lblJobFunction.setBounds(158, 328, 129, 15);
		contentPane.add(lblJobFunction);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(12, 328, 70, 15);
		contentPane.add(lblSalary);
		
		textSalaryStaff = new JTextField();
		textSalaryStaff.setBounds(12, 349, 114, 19);
		contentPane.add(textSalaryStaff);
		textSalaryStaff.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertStaff();
			}
			
		});
		btnRegister.setBounds(190, 494, 117, 25);
		contentPane.add(btnRegister);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 380, 70, 15);
		contentPane.add(lblId);
		
		textIdStaff = new JTextField();
		textIdStaff.setBounds(12, 399, 114, 19);
		contentPane.add(textIdStaff);
		textIdStaff.setColumns(10);
		
		JLabel lblIban = new JLabel("IBAN");
		lblIban.setBounds(12, 430, 70, 15);
		contentPane.add(lblIban);
		
		textIbanStaff = new JTextField();
		textIbanStaff.setBounds(12, 457, 216, 19);
		contentPane.add(textIbanStaff);
		textIbanStaff.setColumns(10);
	}
	private void insertStaff() {
		
		try {
			String firstName = textFNStaff.getText();
			String lastName = textLNStaff.getText();
			String email = textEmailStaff.getText();
			String cellphoneNum = textCellPhoneStaff.getText();
			String birthday = textBirthdayStaff.getText();
			String startDate = textSDateStaff.getText();
			String street = textStreetStaff.getText();
			String houseNumber = textHouseNumberStaff.getText();
			String city = textCityStaff.getText();
			String country = textCountryStaff.getText();
			String airCode = textAirCodeStaff.getText(); 
			String addressComplement = textComplementStaff.getText();
			String id = textIdStaff.getText();
			String ibanAccount = textIbanStaff.getText();
			String salary = textSalaryStaff.getText();			
			
			
			Staff staff = new Staff();
			
			staff.setFirstName(firstName);
			staff.setLastName(lastName);
			staff.setEmail(email);
			staff.setCellphone(cellphoneNum);
			staff.setBirthday(birthday);
			staff.setStartDate(startDate);
			staff.setAirCode(airCode);
			staff.setCity(city);
			staff.setCountry(country);
			staff.setIbanAccount(ibanAccount);
			staff.setID(id);
			staff.setAddressComplement(addressComplement);
			staff.setSalary(salary);
			staff.setStreet(street);
			staff.setHouseNumber(houseNumber);
			
			StaffDB objStaffDB = new StaffDB();
			objStaffDB.registerStaff(staff);
			
			JOptionPane.showMessageDialog(null, "Member Registered");
			dispose();
				
		}catch(Exception error) {
			JOptionPane.showMessageDialog(null, "Error View" + error);
		}
	}
}
