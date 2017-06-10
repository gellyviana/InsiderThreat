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
	
	
	/**public void insertValue(int matricula, String nome) {
        Value valor = new Value(matricula, nome);
        No no = new No();
        inserir(no);
    }

	private void inserir(No no) {
		if(this.root == null){
		   this.root = no;
		}
		else {
			if (no.getAluno().getMatricula() > this.root.getAluno().getMatricula()){
				if (this.root.getRight() == null){
					this.root.setRight(no);
				}
				this.root.setLeft(no);
			}
			else if (no.getAluno().getMatricula() < this.root.getAluno().getMatricula()){
				if (this.root.getLeft() == null){
					this.root.setLeft(no);
				}
				this.root.setRight(no);
			}
		}
		
	}
	
	public Aluno buscar(int matricula, No root){
		if (root == null){
			return null;
		}
		if (getRoot().getAluno().getMatricula() == matricula){
			return getRoot().getAluno();
		}
		if (getRoot().getAluno().getMatricula() > matricula){
			return buscar(matricula, root.getLeft());
		}else {
			return buscar(matricula, root.getRight());
		}
	}
	
	public void percorrerInOrdem(No root){
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
