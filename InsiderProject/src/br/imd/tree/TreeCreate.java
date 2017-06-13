package br.imd.tree;

import java.util.ArrayList;

import br.imd.read.GenerateObjectUser;

public class TreeCreate {
	
	//private ArrayList<User> forest;
	private GenerateObjectUser userList;
	//private GenerateObjectUser user;
	
	//public TreeCreate(){
		
	//}
	
	
	public TreeCreate(GenerateObjectUser userList){
		
		
		//forest = new ArrayList<User>(userList);
		
		for(int i = 0; i < userList.getUserList().size(); i++){
			userList.printObject();
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


