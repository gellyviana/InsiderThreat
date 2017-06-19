package br.imd.factory;

import java.util.ArrayList;
import br.imd.read.LogEntry;
import br.imd.read.LogfileReader;
import br.imd.tree.Tree;


/**
 * Classe criada para gerar os ArrayList de 
 * usuarios, atividades e arvores, utilizando-se
 * de um array de string que representa uma linha 
 * do arquivo lido. 
 *  
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Maneger {

	//Local onde vai ser acumulado os usuarios
	private ArrayList<User> userList;
	//Local onde vai ser acumulado as atividades
	private ArrayList<Activity> activityList;
	//Local onde vai ser acumulado as arvores geradas
	private ArrayList<Tree> forest;
	private Tree tree;
	
	/**
	 * Construtor que instancia um ArrayList de 
	 * usuario, outro ArrayList de atividades e 
	 * o ArrayList de arvore
	 */
	public Maneger(){
		userList = new ArrayList<User>();
		activityList = new ArrayList<Activity>();
		forest = new ArrayList<Tree>();
	}
		
	/**
	 * Metodo de criacao do objeto, que apos a
	 * criacao do objeto do tipo usuario ja e
	 * adicionado no ArrayList de arvores o 
	 * usuario inicializando a arvore.
	 * @param filename O nome do arquivo lido
	 * @param String da data inicio
	 * @param String da data fim.
	 */
	public void readUser(String filename, String dateBegin, String dateEnd){
		LogfileReader fileReader = new LogfileReader(filename);
		LogEntry aux = new LogEntry();
		aux =fileReader.nextEntry(); 
		if(!aux.getField1().equals("id")){
			while (fileReader.hasMoreEntries()){
				aux = fileReader.nextEntry();
				String[] s1 = aux.getFields();
				User user = GenerateObjectUser.createUser(s1);
				userList.add(user);
				treeBegin(user,dateBegin,dateEnd);
			}
		}
	}
	
	/**
	 * Metodo para leitura do arquivo criando
	 * que ira resultar no usuario.
	 * @param filename Uma string com o nome do arquivo
	 */
//	public void readUser(String filename){
//		createObject(filename);	
//	}
	
	/**
	 * Metodo para leitura do arquivo criando
	 * que ira resultar numa lista de atividades.
	 * @param String filename nome do arquivo. 
	 */
	public void readActivity(String filename){
		LogfileReader fileReader = new LogfileReader(filename);
		LogEntry aux = new LogEntry();
		aux =fileReader.nextEntry();
		if(aux.getField1().equals("id")){
			while (fileReader.hasMoreEntries()){
				aux = fileReader.nextEntry();
				String[] s1 = aux.getFields();
				Activity activity = GenerateObjectActivity.createActivity(s1);
				activityList.add(activity);
			}
		}
	}
	
	/**
	 * Metodo que retorna tamanho do ArrayList
	 * usuários
	 * @return int O tamanho do ArrayList de 
	 * usuario
	 */
	public int getIndex(){
			return userList.size();
	}
	
	/**
	 * Metodo que retorna o ArrayList
	 * de usuários
	 * @return ArrayList O ArrayList de 
	 * usuarios
	 */
	public ArrayList<User> getUserList(){
			return userList;
	}
	
	/**
	 * Metodo que retorna o ArrayList
	 * de atividades
	 * @return ArrayList O ArrayList de 
	 * usuarios
	 */
	public ArrayList<Activity> getActivity(){
		return activityList;
	}
	
	/**
	 * Metodo que imprimi o Id dos usuarios
	 * do ArrayList de usarios
	 */
	public void printArrayList(){
		for(User u : userList){
			System.out.println(u.getUserId());
		}
	}
	
	/**
	 * Metodo que incializa a arvore do usuario
	 * e adiciona na floresta
	 * @param User é um usúario
	 * @param String data inicio 
	 * @param String data fim
	 */
	public void treeBegin(User user, String dateBegin, String dateEnd){
		tree = new Tree(user, dateBegin, dateEnd);
		forest.add(tree);
	}

	/**
	 * Metodo que retorna a floresta composta 
	 * por arvores de usuarios
	 * @return ArrayList O ArrayList de arvore que 
	 * e a floresta
	 */
	public ArrayList<Tree> getForest(){
		return this.forest;
	}
	
	/**
	 * Metodo que imprime a floresta 
	 */
	public void printTree(){
		for(Tree t: forest){
			System.out.println(t.getRoot().getValue());
		}
	}
}
