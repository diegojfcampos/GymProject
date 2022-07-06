package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import objects.Members;
import objects.Staff;

public class StaffDB {
	Connection conn;
	PreparedStatement pstm;
	
	public void registerStaff(Staff objStaff) {
		
		String mysql = "INSERT into staff(StaffFirstName, StaffLastName, StaffBirthday, StaffCellphoneNumber,"
				+  "StaffStartDate, StaffEmail, StaffIban, StaffID, StaffHouseNumber, StaffStreet,  StaffCountry, "
				+ "StaffAirCode, StaffAddressComplement, StaffSalary, StaffFunction) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
		
		conn = (Connection) new DB.Connection().connectDB();
		
		try {
			
			//Prepating Connection
			PreparedStatement pstm = conn.prepareStatement(mysql);		
			
			pstm.setString(1, objStaff.getFirstName());
			pstm.setString(2, objStaff.getLastName());
			pstm.setString(3, objStaff.getBirthday());
			pstm.setString(4, objStaff.getCellPhone());
			pstm.setString(5, objStaff.getStartDate());
			pstm.setString(6, objStaff.getEmail());
			pstm.setString(7, objStaff.getIbanAccount());
			pstm.setString(8, objStaff.getId());
			pstm.setString(9, objStaff.getHouseNumber());
			pstm.setString(10, objStaff.getStreet());
			pstm.setString(11, objStaff.getCountry());
			pstm.setString(12, objStaff.getAirCode());
			pstm.setString(13, objStaff.getAddressComplement());
			pstm.setString(14, objStaff.getSalary());
			pstm.setString(15, objStaff.getFunction());
			
			pstm.execute();
			pstm.close();
						
		} catch(SQLException error) {
			JOptionPane.showConfirmDialog(null, "error in UserDB" +  error);			
		}
	}
}
