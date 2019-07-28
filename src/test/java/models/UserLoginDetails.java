package models;

public class UserLoginDetails {
	public static UserLoginDetails valid_User_details=new UserLoginDetails("Admin","admin123");

	private String username;
	private String password;
	public UserLoginDetails(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
}
