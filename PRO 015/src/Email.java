
public class Email {
	private String user;
	private String host;
	private String extension;
	
	public Email(String email){
		int u = email.indexOf('@');
		user = email.substring(0,u);
		int h = email.indexOf('.');
		host = email.substring(u,h);
		extension = email.substring(h);
	}
	//did not include get & set because it was not being implemented
	public String toString(){
		return "User Name: " + user + "\nService Provider: " 
				+ host + "\nExtension: " + extension;
	}
}
