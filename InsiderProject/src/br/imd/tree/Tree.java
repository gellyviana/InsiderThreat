package br.imd.tree;

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
	 * e com os três nos filhos. 
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
	 * Classe que inseri  a atividade na  arvore, sempre comparando
	 * pai com os filhos
	 * @author Adriana Azevedo e Gelly Viana Mota
	 * @param Activity
	 */
	public boolean insert(Activity activity){
		No dad = null;
		No child = null;
		//Inserção dos Nos correspondente aos agrupamento de datas.
		for (No no : root.getChildren()){
			if(((DateGroup) no.getValue()).isInGroup(activity.getDate())){
				dad = no;
				break;
			}
		}
		//Parte para a criação e inserção do Array correspondente aos Equipamentos.
		child = dad.consultChildren(new Equipament(activity));
		if(child == null ){
			child = dad.insertChildren(new Equipament(activity));
			child.setHistogram(activity.getTime().getHour());
		}
		
		dad = child;
		//Criação e inserção de atividades
		child = dad.consultChildren(new ActivityValue(activity));
		if(child == null ){
			child = dad.insertChildren(new ActivityValue(activity));
			child.setHistogram(activity.getTime().getHour());
		}
		
		dad = child;
		//Criação e inserção de Url's.
		child = dad.consultChildren(new UrlValue(activity));
		if(child == null ){
			child = dad.insertChildren(new UrlValue(activity));
			child.setHistogram(activity.getTime().getHour());
		}
		
		
		return false;
	}

	/**
	 * Metodo que imprime a raiz de uma arvore.
	 */
	public void printTree() {
		System.out.println(root);
	}
}
