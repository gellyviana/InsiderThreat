package br.imd.tree;

import br.imd.factory.User;
/**
 * Classe para receber um usuario e possibilitar
 * um mesmo tipo para armazenamento na Arvore.
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
	/**
	 * Metodo para retornar o ID de um usuario.
	 * @return idUser
	 */
	public String getIdUser() {
		return idUser;
	}
	/**
	 * Metodo para retornar um nome de usuario.
	 * @return name.
	 */
	public String getName() {
		return name;
	}
}
