package br.imd.tree;

//import br.imd.read.GenerateObject;

public class User extends Value{
	
	private String name;
	private String userId;
	private String email;
	private String domain;
	private String role;
	
	public User(String[] userLine){
		super();
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

	public String toString(){
		return this.name + this.role;
	}
	
	/**private User userRoot;
	
	public User(){
		super();
		this.userRoot = takeUser();
	}

	public User takeUser(){
		GenerateObject.getUserList();
		
		return userRoot;
	}*/
	
}
