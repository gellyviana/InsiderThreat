package br.imd.factory;

import br.imd.tree.Tree;

public class User extends Info{
	
	private String name;
	private String userId;
	private String email;
	private String domain;
	private String role;
	private String[] userLine;
	private Tree tree;
	
	public User(String[] userLine){
		this.name = userLine[0];
		this.userId = userLine[1];
		this.email = userLine[3];
		this.domain = userLine[2];
		this.role = userLine[4];
		this.userLine = userLine;
	}
	public User(User user){
		//tree = new Tree(Value no);
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
	public String[] getUserLine(){
		return this.userLine;
	}
	public String toString(){
		return this.userId +" " + this.name + " " + this.email + " "+ this.domain + " "+ this.role;
	}
	
}
