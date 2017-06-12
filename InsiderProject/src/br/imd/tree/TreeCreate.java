package br.imd.tree;

import java.util.ArrayList;

import br.imd.read.GenerateObjectUser;

public class TreeCreate {
	
	private ArrayList<User> forest;
	
	public TreeCreate(ArrayList<User> userList){
		
		
		forest = new ArrayList<User>(userList);
		
		for(int i = 0; i < forest.getUserList().size(); i++){
			System.out.println(forest.getUserList().get(i).getUserId());
		}
		/*for(int i = 0; i < forest.size(); i++){
			ArrayList<Value> children = new ArrayList<Value>();
			Value vRoot = new Value(forest.get(i));
			No root = new No(vRoot, children);
			Tree userTree = new Tree(root);
			System.out.println(root.getValue().getUser().getUserId());
		
		}*/
		
	}
	

		
		
}


