package br.imd.tree;

import br.imd.tree.Tree;

public class UserTree{
	
	private String name;
	private String userId;
	private Tree root;
	
	public UserTree(String userId, String name){
		this.name = name;
		this.userId = userId;
		root = new Tree();
	}
	public String getName() {
		return name;
	}

	public String getUserId() {
		return userId;
	}

	public String toString(){
		return this.userId +" " + this.name ;
	}
	
}
