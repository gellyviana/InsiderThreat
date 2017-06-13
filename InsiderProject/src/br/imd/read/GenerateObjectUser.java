package br.imd.read;

import java.util.ArrayList;

public class GenerateObjectUser extends GenerateObject{

	private User user;
	private ArrayList<User> userList;
	
	public GenerateObjectUser(String[] line){
		
		userList = new ArrayList<User>();
		setAux(line);
		captureUser();
		//printObject();
	}
	
	public void captureUser(){
		user = createUser(getAux());
		userList.add(user);
	}
	
	public User createUser(String[] userLine){
		User user = new User(userLine);
		return user;
	}
	
	/**
	public User createUser(String[] userLine){
		User user = new User(userLine);
		//no.add(user);
		/**for(int i=0; i< userLine.length; i++){
				System.out.println(user.getName());
				System.out.println(user.getUserId());
				System.out.println(user.getEmail());
				System.out.println(user.getDomain());
				System.out.println(user.getRole());
			}
		return user;
		
		//return new User(userLine);
		
	}*/
	
	public User getUser() {
		return user;
	}
	
	public ArrayList<User> getUserList(){
		return userList;
	}
	
	public void printObject(){
		for(int i = 0; i < userList.size(); i++){
			System.out.println(userList.get(i).getUserId());
		}
	}
}
