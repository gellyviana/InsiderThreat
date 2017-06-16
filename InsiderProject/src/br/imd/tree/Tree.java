package br.imd.tree;

import java.util.ArrayList;

import br.imd.factory.Info;
import br.imd.factory.User;

public class Tree {
	//private User user;
	private No root;
	//private ArrayList<No> activyts;
	
	public Tree(User user){
	//public Tree(No root, User user){
		//user = new User(user);
		//this.root = root;
		//activyts = new ArrayList<No>();
		this.root = new No(user);
		System.out.println("passou por aqui");
	}
	public Tree(Info no){
		
	}
	public No getRoot() {
	        return root;
	 }

	public void setRoot(No root) {
	        this.root = root;
	}
	/**public boolean searchNo(No no){
		for(No node : activyts){
			if(no == node){
				return true;
			}
		}
		return false;
	}*/
	
	//todos esses metodos tem que vim do mesmo usuario
	// esse metodo deve analizar a data para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void dateAnalizer(){
		
		
	}
	
	// esse metodo deve analizar a equipament para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	/**public void equipamentAnalizer(No no){
		if(!this.searchNo(no)){
			activyts.add(no);
		}
	}*/
	
	// esse metodo deve analizar a activity para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void activityanalizer(){
		
	}
	
	// esse metodo deve analizar a data para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void existUrl(){
		
	}
	private void setUser(User user){
		
	}
	/**public void printTree(){
			System.out.println(no.getValue());
		}
	}*/
	
	/**public void printTree(){
		for(No no : ){
			System.out.println(no.getValue().getUser().getName());
		}
	}*/
}
