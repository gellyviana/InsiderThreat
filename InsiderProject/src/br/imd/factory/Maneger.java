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
 *
 */
public class Maneger {

	private ArrayList<User> userList;
	private ArrayList<Activity> activityList;
	
	public Maneger(){
		userList = new ArrayList<User>();
		activityList = new ArrayList<Activity>();
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
			}
			
		}
		instanceofManeger();
	}
	
	public void readUser(String filename){
		createObject(filename);	
	}
	
	public void readActivity(String filename){
		createObject(filename);
	}
	
	/**
	 * @author adriana
	 * @return /index /tamanho
	 * Função que retorna tamanho do ArrayList Usuários
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
	public void instanceofManeger(){
		for(User u : this.userList){
			No noUsers = new No(u);
			Tree tree = new Tree(noUsers);
		}
		
	}
}
