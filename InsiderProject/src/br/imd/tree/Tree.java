package br.imd.tree;

import java.time.LocalDate;

import br.imd.factory.Activity;
import br.imd.factory.Device;
import br.imd.factory.Http;
import br.imd.factory.Logon;
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
	public Tree(User user, String dateBegin, String dateEnd ) {
		this.root = new No(user);
		DateGroup dateLeft = new DateGroup(null, dateBegin);
		DateGroup dateMid = new DateGroup(dateBegin, dateEnd);
		DateGroup dateRight = new DateGroup(dateEnd, null);
		root.insertChildren(dateRight);
		root.insertChildren(dateMid);
		root.insertChildren(dateLeft);
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
	public boolean insert(Activity activity){
		No dad = null;
		No child = null;
		for (No no : root.getChildren()){
			if(((DateGroup) no.getValue()).isInGroup(activity.getDate())){
				dad = no;
				break;
			}
		}
		child = dad.consultChildren(new Equipament(activity));
		if(child == null ){
			child = dad.insertChildren(new Equipament(activity));
		}
		dad = child;

		child = dad.consultChildren(new ActivityValue(activity));
		if(child == null ){
			child = dad.insertChildren(new ActivityValue(activity));
		}
		
		dad = child;

		child = dad.consultChildren(new UrlValue(activity));
		if(child == null ){
			child = dad.insertChildren(new UrlValue(activity));
		}
		
		
		return false;
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


//	// todos esses metodos tem que vim do mesmo usuario
//	// esse metodo deve analizar a data para saber se ela esta no array filho,
//	// se tiver tem que incrementar, senao tem que adicionar
//	public void dateAnalizer(Value date){
//		if(!root.analizerLevel(date)){
//			root.setValue(date);
//			root.setLevel(1);
//		}
//	}
//
//	// esse metodo deve analizar a equipament para saber se ela esta no array
//	// filho, se tiver tem que incrementar, senao tem que adicionar
//	public void equipamentAnalizer(Value equipament){ 
//		if(!root.analizerLevel(equipament)){
//			root.insertChildren(equipament);
//			root.setLevel(2);
//		}
//	}
//	
//	// esse metodo deve analizar a activity para saber se ela esta no array
//	// filho, se tiver tem que incrementar, senao tem que adicionar
//	public void activityAnalizer(Value activity){
//		if(!root.analizerLevel(activity)){
//			root.insertChildren(activity);
//			root.setLevel(3);
//		}
//			
//	}
//
//
//	// esse metodo deve analizar a data para saber se ela esta no array filho,
//	// se tiver tem que incrementar, senao tem que adicionar
//	public void existUrl(Value url) {
//		if(!root.analizerLevel(url)){
//			root.insertChildren(url);
//			root.setLevel(4);
//		}
//	}

	public void printTree() {
		System.out.println(root);
	}
}
