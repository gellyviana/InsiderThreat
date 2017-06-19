package br.imd.tree;

import br.imd.factory.User;
/**
 * Classe 
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class UserValue extends Value{
	
	private String idUser;
	private String name;
	
	public UserValue(User user){
		this.idUser = user.getUserId();
		this.name = user.getName();
	}
	public String getIdUser() {
		return idUser;
	}

	public String getName() {
		return name;
	}
}
