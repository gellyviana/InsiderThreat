package br.imd.factory;

/**
 * Classe gera um objeto do tipo usuario a partir  
 * de um array de String com 5 campos.Classe herda 
 * de GenerateObject.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04 */
public class GenerateObjectUser extends GenerateObject{
	
	/**
	 * Contrutor padrao vazio.
	 */
	
	public GenerateObjectUser(){}
	
	/**
	 * Metodo para criar um objeto do tipo usuario atraves 
	 * de uma linha de Array de string.
	 * @param userLine Array de string com a linha do arquivo 
	 * de usuario.
	 * @return User Usuario criado.
	 */
	public static User createUser(String[] userLine){
		User user = new User(userLine);
		/**for(int i=0; i< userLine.length; i++){
		System.out.println(user.getName());
		System.out.println(user.getUserId());
		System.out.println(user.getEmail());
		System.out.println(user.getDomain());
		System.out.println(user.getRole());
		}
		return user;
	}*/

		return user;
	}
	
}
