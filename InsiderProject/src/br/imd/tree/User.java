package br.imd.tree;

import br.imd.read.GenerateObject;

public class User{
	
	private User userRoot;
	
	public User(){
		
	}

	public User takeUser(){
		GenerateObject.getUserList();
		
		return userRoot;
	}
}
