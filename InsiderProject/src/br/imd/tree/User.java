package br.imd.tree;

import br.imd.read.GenerateObject;

public class User extends Value{
	
	private User userRoot;
	
	public User(){
		super();
		this.userRoot = takeUser();
	}

	public User takeUser(){
		GenerateObject.getUserList();
		
		return userRoot;
	}
}
