package br.imd.tree;

import java.util.ArrayList;

import br.imd.tree.Value;

public class No {
		
	private Value value;
	private ArrayList<No> children;
	private int[] histogram;
	private int level;

	public No() {}
	
	public No(Value value) {
    	this.value = value;
    	this.children = new ArrayList<No>(); 
    	this.histogram = new int[24];
    	this.level = 0;
    }
    
	public Value getValue(){
		return this.value;
	}
	
	 public void setValue(Value value) {
	        this.value = value;
	 }

    public boolean consultChildren(No value){
        	
    	for(No v: children){
    		if(value == v){
    			return true;
    		}else
    			return false;
    		} 
    	return false;
    }
    
    public void insertChildren(No value){
    	if(this.consultChildren(value)){
    		//pega a hora da atividade para passar como parametro no setHistogram 
    		setHistogram(1);
    	}else{
    		children.add(value);
    		//precisa da hora da atividade para setHistogram
    		setHistogram(1);
    	}
    }
     
    //return children.get(children.indexOf(value));

    /**public void setChildren(Value value) { // este metodo deve ser o metodo que vai adicionar o filho no arrayList
        if ( !value.consultChildren(value)){
        	insertChildren(value);
        	}else{
        		setHistogram(1);
    	this.aluno = aluno;
    }

	public No getChildren(int i) {
		return children.get(i);
	}

	public void setLeft(No left) {
		this.left = left;
	}

	public No getRight() {
		return right;
	}

	public void setRight(No right) {
		this.right = right;
	}*/
    
    public void defineTimeHistogram(Value value){
    	
    }
    public void setHistogram(int i){	
    	histogram[i]++;
    }
    
    public int[] showHistrogram(){
    	return histogram;
    }
}
