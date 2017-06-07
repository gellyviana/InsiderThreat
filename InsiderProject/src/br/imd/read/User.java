package br.imd.read;


public class User {
	
	private String name;
	private String userId;
	private String email;
	private String domain;
	private String role;
	
	public User(String[] userLine){
		this.name = userLine[0];
		this.userId = userLine[1];
		this.email = userLine[2];
		this.domain = userLine[3];
		this.role = userLine[4];
	}
	public String getName() {
		return name;
	}

	public String getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getDomain() {
		return domain;
	}

	public String getRole() {
		return role;
	}

}
