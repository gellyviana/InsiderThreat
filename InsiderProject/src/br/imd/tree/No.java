package br.imd.tree;

import java.util.ArrayList;

import br.imd.tree.Value;

public class No {
		
	private Value value;
	private ArrayList<Value> children;
	private int[] histogram;

	public No() {}
	
	public No(Value value, ArrayList<Value> children) {
    	this.value = value;
    	this.children = new ArrayList<Value>(); 
    	this.histogram = new int[24];
    }
    
	public Value getValue(){
		return this.value;
	}
	
	 public void setValue(Value value) {
	        this.value = value;
	 }

    public boolean consultChildren(Value value){
        	
    	for(Value v: children){
    		if(value == v){
    			return true;
    		}else
    			return false;
    		} 
    	return false;
    }
    
    public void insertChildren(Value value){
    	if(this.consultChildren(value)){
    		this.setHistogram(1);
    	}else{
    		children.add(value);
    		this.setHistogram(1);
    	}
    }
    /*public void insertChildren(Value value){
    	if(consultChildren(value)){
    		this.setHistogram(0);//setHistogram(value.get)// precisa colocar a posiçao que vai ser incrementada
    	}else{
    		//precisa inserir o no (mas tem que saber que tipo, para saber se esta no nivel que pode acrescentar
    		this.insertChildren(this.getValue());
    	}
    }*/
 
    //return children.get(children.indexOf(value));

    /**public void setChildren(Value value) { // este metodo deve ser o metodo que vai adicionar o filho no arrayList
        if (value.consultChildren(value){
        
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
    public void setHistogram(int i){
    	histogram[i]++;
    }
    
    public int[] showHistrogram(){
    	return histogram;
    }
}
