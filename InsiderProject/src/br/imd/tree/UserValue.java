package br.imd.tree;

import br.imd.factory.User;

public class UserValue extends Value{
	
	private String idUser;
	private String name;
	
	public UserValue(User user){
		this.idUser = user.getUserId();
		this.name = user.getName();
	}

}
