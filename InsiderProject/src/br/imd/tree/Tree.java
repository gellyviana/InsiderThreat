package br.imd.tree;

import java.time.LocalTime;
import java.util.ArrayList;

import br.imd.factory.Activity;
import br.imd.factory.Info;
import br.imd.factory.User;

public class Tree {
	private No root;
	private ArrayList<Tree> subTree;

	public Tree() {
		this.root = null;
		this.subTree = null;
	}

	public Tree(User user) {
		this.root = new No(user);
		this.printTree();
	}

	public No getRoot() {
		return root;
	}

	public void setRoot(No root) {
		this.root = root;
	}

	public boolean searchNo(Tree no){
		for(Tree tree: this.subTree){
			if(no.root.getValue() == tree.getRoot().getValue()){
				return true;
			}
		}
		return false;
	}
	
	public void insert(No no){
		// Cria o primeiro nivel da Arvore que são os usuarios
		if(this.subTree == null){
			this.subTree = new ArrayList<Tree>();
			this.subTree.get(0).setRoot(no);
		}else{
		//Se a subTree estiver vazia, alocamos duas posições no subTree 
		//vazia para representar No anomolo e No não anomolo.
			if(no.getLevel() == 1){
				for(int i = 0; i< 2; i++){
					subTree.add(new Tree());
					subTree.get(i).setRoot(no);
				}
			}else{
				subTree.add(new Tree());
				subTree.get(subTree.size()-1);
			}
		}
	}


	// todos esses metodos tem que vim do mesmo usuario
	// esse metodo deve analizar a data para saber se ela esta no array filho,
	// se tiver tem que incrementar, senao tem que adicionar
	public boolean dateAnalizer(LocalTime date){
		for(Tree tree: subTree){
			if(tree.getRoot().getValue().getDataGroup() == date){
				return true;
			}
		}
		return false;
	}

	// esse metodo deve analizar a equipament para saber se ela esta no array
	// filho, se tiver tem que incrementar, senao tem que adicionar
	/**
	 * public void equipamentAnalizer(No no){ if(!this.searchNo(no)){
	 * activyts.add(no); } }
	 */

	// esse metodo deve analizar a activity para saber se ela esta no array
	// filho, se tiver tem que incrementar, senao tem que adicionar
	public boolean activityAnalizer(Activity activity) {
		for(Tree tree: subTree){
			if(tree.getRoot().getValue().getActivity() == activity){
				return true;
			}
		}
			return false;
	}


	// esse metodo deve analizar a data para saber se ela esta no array filho,
	// se tiver tem que incrementar, senao tem que adicionar
	public void existUrl() {

	}

	public void printTree() {
		System.out.println(root.getValue().getUser());
	}
}
