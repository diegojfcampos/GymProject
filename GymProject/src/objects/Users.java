package objects;

public class Users {
	private int userId;
	private String userName;
	private String userPassword;
	
	public void setUserId(int userId) {
		this.userId = userId;		
	}
	public void setUserName(String userName) {
		this.userName = userName;		
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}	
	public int getUserId() {
		return this.userId;
	}
	public String getUserName() {
		return userName;
	}
	public  String getUserPassword() {
		return userPassword;
	}
	

}
