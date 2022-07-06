package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import objects.Members;
import objects.Users;

public class MembersDB {
	Connection conn;
	PreparedStatement pstm;
	
	public void registerMember(Members objMember) {
		
		String mysql = "INSERT into members(MemberFirstName, MemberLastName, MemberBirthday, MemberCellphoneNumber,"
				+  "MemberStartDate, MemberEmail) VALUES (?,?,?,?,?,?);" ;
		
		conn = (Connection) new DB.Connection().connectDB();
		
		try {
			
			//Prepating Connection
			PreparedStatement pstm = conn.prepareStatement(mysql);		
			
			pstm.setString(1, objMember.getFirstName());
			pstm.setString(2, objMember.getLastName());
			pstm.setString(3, objMember.getBirthday());
			pstm.setString(4, objMember.getCellPhone());
			pstm.setString(5, objMember.getStartDate());
			pstm.setString(6, objMember.getEmail());
			
			pstm.execute();
			pstm.close();
						
		} catch(SQLException error) {
			JOptionPane.showConfirmDialog(null, "error in UserDB" +  error);			
		}
	}
}
