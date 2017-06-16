package br.imd.factory;

import java.util.ArrayList;

import java.util.Iterator;

import br.imd.read.LogEntry;
import br.imd.read.LogfileReader;
import br.imd.tree.No;
import br.imd.tree.Tree;
import br.imd.tree.Value;

/**
 * Classe criada para conduzir uma linha de um arquivo
 * ao processo de criação de objeto
 *  
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Maneger {

	//Local onde vai ser acumulado os usuarios
	private ArrayList<User> userList;
	//Local onde vai ser acumulado as atividades
	private ArrayList<Activity> activityList;
	//nao entendi esse arrayList ?????
	private ArrayList<Tree> forest;
	
	/**
	 * Construtor que instancia um ArrayList de 
	 * usuario e outro ArrayList de atividades
	 */
	public Maneger(){
		userList = new ArrayList<User>();
		activityList = new ArrayList<Activity>();
		forest = new ArrayList<Tree>();
	}
		
	public void createObject(String filename){
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
		} else{
			while (fileReader.hasMoreEntries()){
				aux = fileReader.nextEntry();
				String[] s1 = aux.getFields();
				User user = GenerateObjectUser.createUser(s1);
				userList.add(user);
				treeBegin(user);
			}
			
		}
	}
	
	public void readUser(String filename){
		createObject(filename);	
	}
	
	public void readActivity(String filename){
		createObject(filename);
	}
	
	/**
	 * Função que retorna tamanho do ArrayList Usuários
	 * @return /index /tamanho
	 * 
	 */
	public int getIndex(){
			return userList.size();
	}
	
	public ArrayList<User> getUserList(){
			return userList;
	}
	
	public ArrayList<Activity> getActivity(){
		return activityList;
	}
	
	public void printArrayList(){
		for(User u : userList){
			System.out.println(u.getUserId());
		}
	}
	
	public void treeBegin(User user){
		Tree tree = new Tree(user);
		forest.add(tree);
	}
	public ArrayList<Tree> getForest(){
		return this.forest;
	}
	public void printTree(){
		for(Tree t: forest){
			System.out.println(t.getRoot().getValue());
		}
	}
}
