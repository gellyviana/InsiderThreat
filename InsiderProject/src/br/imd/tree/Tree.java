package br.imd.tree;

import java.time.LocalDate;
import java.util.ArrayList;

import br.imd.factory.Activity;
import br.imd.factory.User;

/**
 * Classe criada para gerar uma arvore que
 * contem uma raiz e um ArrayList com subarvores.
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Tree {
	
	//O No raiz da arvore.
	private No root;

	/**
	 * Construtor que gera o no raiz da arvore, 
	 * e a imprime. 
	 * @param user Um usuario.
	 */
	public Tree(User user) {
		this.root = new No(user);
		this.printTree();
	}
	
	/**
	 * Metodo que retorna a raiz da arvore.
	 * @return root A raiz da arvore.
	 */
	public No getRoot() {
		return root;
	}

	/**
	 * Metodo que altera a raiz da arvore.
	 * @param root A raiz da arvore.
	 */
	public void setRoot(No root) {
		this.root = root;
	}

	/**
	 * Classe que inseri No na arvore
	 * @author Adriana Azevedo e Gelly Viana Mota
	 * @param Activity
	 */
	public void insert(Activity activity){
		
	}
	/**
	 * Metodo que verifica se a subarvore
	 * contem um no.
	 * @param no A arvore. (????)
	 * @return true Se o No se encontra na arvore.
	 * 		   false Se o No nao se encontra na arvore
	 */
//	public boolean searchNo(Tree no){
//		for(Tree tree: this.subTree){
//			if(no.root.getValue() == tree.getRoot().getValue()){
//				return true;
//			}
//		}
//		return false;
//	}
	
	/**
	 * 
	 * @param no
	 */
//	public void insert(No no){
//		// Cria o primeiro nivel da Arvore que são os usuarios
//		if(this.subTree == null){
//			this.subTree = new ArrayList<Tree>();
//			this.subTree.get(0).setRoot(no);
//		}else{
//		//Se a subTree estiver vazia, alocamos duas posições no subTree 
//		//vazia para representar No anomolo e No não anomolo.
//			if(no.getLevel() == 1){
//				for(int i = 0; i< 2; i++){
//					subTree.add(new Tree());
//					subTree.get(i).setRoot(no);
//				}
//			}else{
//				subTree.add(new Tree());
//				subTree.get(subTree.size()-1);
//			}
//		}
//	}


	// todos esses metodos tem que vim do mesmo usuario
	// esse metodo deve analizar a data para saber se ela esta no array filho,
	// se tiver tem que incrementar, senao tem que adicionar
	public void dateAnalizer(Value date){
		if(!root.analizerLevel(date)){
			root.setValue(date);
			root.setLevel(1);
		}
	}

	// esse metodo deve analizar a equipament para saber se ela esta no array
	// filho, se tiver tem que incrementar, senao tem que adicionar
	public void equipamentAnalizer(Value equipament){ 
		if(!root.analizerLevel(equipament)){
			root.insertChildren(equipament);
			root.setLevel(2);
		}
	}
	 

	// esse metodo deve analizar a activity para saber se ela esta no array
	// filho, se tiver tem que incrementar, senao tem que adicionar
	
	public void activityAnalizer(Value activity) {
		if(!root.analizerLevel(activity)){
			root.insertChildren(activity);
			root.setLevel(3);
		}
			
	}


	// esse metodo deve analizar a data para saber se ela esta no array filho,
	// se tiver tem que incrementar, senao tem que adicionar
	public void existUrl(Value url) {
		if(!root.analizerLevel(url)){
			root.insertChildren(url);
			root.setLevel(4);
		}
	}

	public void printTree() {
		System.out.println(root.getValue());
	}
}
