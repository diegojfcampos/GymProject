package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import objects.Classes;

public class ClassesDB {
	Connection conn;
	PreparedStatement pstm;
	
	public void registerClasses(Classes classObject) {
		
		String mySql = "INSERT INTO classes(ClassName, ClassCapacity, ClassDescription, ClassDuration) VALUES(?,?,?,?)";
		conn = new DB.Connection().connectDB();
		
		try {
			PreparedStatement pstm = conn.prepareStatement(mySql);
			
			pstm.setString(1, classObject.getClassName());
			pstm.setString(2, classObject.getClassCapacity());
			pstm.setString(3, classObject.getClassDescription());
			pstm.setString(4, classObject.getClassDuration());
			
			pstm.execute();
			pstm.close();			
			
			
		}catch(Exception error) {
			JOptionPane.showMessageDialog(null, "Error in ClassesDB" + error);
		}
		
	}

}
