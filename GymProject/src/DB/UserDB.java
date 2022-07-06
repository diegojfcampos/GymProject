package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.PreparableStatement;
import objects.*;
import DB.*;

public class UserDB {
	Connection conn;
	
	public ResultSet userAuthentication(Users userObject) {
		conn = (Connection) new DB.Connection().connectDB();
		
		try {
			
			String mysql = "Select * from users where UserName = ? and UserPassword = ?" ;
			
			//Prepating Connection
			PreparedStatement pstm = conn.prepareStatement(mysql);			
			pstm.setString(1, userObject.getUserName());
			pstm.setString(2, userObject.getUserPassword());
			
			ResultSet rs = pstm.executeQuery();
			
			return rs;
			
			
			
		} catch(SQLException error) {
			JOptionPane.showConfirmDialog(null, "error in UserDB" +  error);
			return null;
		}
	}
}
