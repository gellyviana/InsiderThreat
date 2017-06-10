package br.imd.tree;


public class Tree {
	
	private No root;
	
	public Tree(){
		this.root = null;
	}
	
	public No getRoot() {
	        return root;
	 }

	public void setRoot(No root) {
	        this.root = root;
	}
	
	//todos esses metodos tem que vim do mesmo usuario
	// esse metodo deve analizar a data para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void dateAnalizer(){
		
	}
	
	// esse metodo deve analizar a equipament para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void equipamentAnalizer(){
		
	}
	
	// esse metodo deve analizar a activity para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void activityanalizer(){
		
	}
	
	// esse metodo deve analizar a data para saber se ela esta no array filho, se tiver tem que incrementar, senao tem que adicionar
	public void existUrl(){
		
	}
	
	/**
	public void insertValue(Value value) {
        Value valor = new Value(value);
        No no = new No();
       inserir(no);
    }

	private void inserir(No no) {
		if(this.root == null){
		   this.root = no;
		}else {
			if (buscar(no.getValue())){
				no.setHistogram(1);
			}else{
				no.setChildren(no.getValue());
			}
		}
	}
				//if (this.root.getRight() == null){
					//this.root.setRight(no);
				//}
				//this.root.setLeft(no);
			//}
			//else if (no.getAluno().getMatricula() < this.root.getAluno().getMatricula()){
				//if (this.root.getLeft() == null){
					//this.root.setLeft(no);
				//}
				//this.root.setRight(no);
			//}
		
	
	public Value buscar(Value value, No root){
		if (root == null){
			return null;
		}
		if (getRoot().getValue() == value){
			return getRoot().getValue();
		}else {
			return buscar(value, root.getChildren());
		}
	}
	
	/**public void percorrerInOrdem(No root){
		if(root != null){
			if(root.getLeft() != null){
				percorrerInOrdem(root.getLeft());
			}
			System.out.println(root.getAluno().getNome());
			if (root.getRight() != null){
				percorrerInOrdem(root.getRight());
			}
		}
	}
		
	public void percorrerPosOrdem(No root){
		if(root != null){
			if(root.getLeft() != null){
				percorrerPosOrdem(root.getLeft());
			}
			if (root.getRight() != null){
				percorrerPosOrdem(root.getRight());
			}
			System.out.println(root.getAluno().getNome());
		}
	}
		
	public void percorrerPreOrdem(No root){
		if(root != null){
			System.out.println(root.getAluno().getNome());
			if(root.getLeft() != null){
				percorrerPreOrdem(root.getLeft());
			}
			if (root.getRight() != null){
				percorrerPreOrdem(root.getRight());
			}
		}
	}*/
}
