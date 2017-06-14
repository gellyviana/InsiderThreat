package br.imd.read;

import java.util.ArrayList;
import java.util.Iterator;

import br.imd.tree.TreeCreate;

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
	
	private TreeCreate tree;
	private GenerateObject help;
	
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
		//for (int i = 0; i < userList.size(); i++){
			//System.out.println(getUserList().get(i).toString());
		//}
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

}
