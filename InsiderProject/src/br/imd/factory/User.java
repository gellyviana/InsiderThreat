package br.imd.factory;

import br.imd.tree.Tree;
import br.imd.tree.Value;

/**
 * Classe criada para gerar um tipo usuario que
 * contem o nome, identificacao, email, dominio 
 * de trabalho, funcao, a linha do arquivo que
 * contem as informacoes do usuario e a arvore 
 * que vai ser gerada a partir desse usuario.
 * Classe herda da classe abstrata Info.
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class User extends Value{
	
	//A string com o nome do usuario.
	private String name;
	//A  string com a identificacao do usuario.
	private String userId;
	//A string com o email do usuario.
	private String email;
	//A string com o dominio do usuario.
	private String domain;
	//A string com a funcao do usuario.
	private String role;
	//O array que ira armazenar os campos da 
	//linha do arquivo de usuario lido. 
	private String[] userLine;
	//A arvore do usuario.
	private Tree tree;
	
	/**
	 * Construtor que vai instanciar o usuario
	 * @param userLine Array de string com os campos
	 * da linha do arquivo
	 */
	public User(String[] userLine){
		this.name = userLine[0];
		this.userId = userLine[1];
		this.email = userLine[3];
		this.domain = userLine[2];
		this.role = userLine[4];
	}
	
	/** Esse metodo vai se manter ou sair???????????????
	 * Metodo 
	 * @param user
	 */
	public User(User user){
		//tree = new Tree(Value no);
	}
	/**
	 * Metodo que retorna o nome do usuario.
	 * @return string O nome do usuario.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Metodo que retorna o numero de identificacao
	 * do usuario.
	 * @return string O numero de identificaçao do 
	 * usuario.
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * Metodo que retorna o email do usuario.
	 * @return string O email do usuario.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Metodo que retorna o domanio de trabalho
	 * do usuario.
	 * @return string O dominio do usuario.
	 */
	public String getDomain() {
		return domain;
	}
	/**
	 * Metodo que retorna a funcao do usuario.
	 * @return string A funcao do usuario.
	 */
	public String getRole() {
		return role;
	}
	
	/**
	 * Metodo que retorna uma string que 
	 * contem todos os dados do usuario.
	 * @return Array de string A linga do 
	 * arquivo de usuario.
	 */
	public String toString(){
		return this.userId +" " + this.name + " " + this.email + " "+ this.domain + " "+ this.role;
	}
	
}
