package DB;


import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class Connection {
	
	private static final String user_name = "diegojfcampos";
	private static final String password = "Diego@150786";
	private static final String db_url = "jdbc:mysql://localhost:3306/gymproject";
	
	
	public java.sql.Connection connectDB(){		
		
		java.sql.Connection conn = null;
		 
		try {
			//String url = "jdbc:mysql://localhost/gymproject?user=diegojfcampos&password=Diego@150786";
			conn = DriverManager.getConnection(db_url,user_name, password);			
			
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Connection Error" + erro.getMessage());
		}
		return conn;
			
	}	

}
