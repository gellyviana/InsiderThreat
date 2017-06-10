package br.imd.tree;

import java.util.ArrayList;

import br.imd.tree.Value;

public class No {
		
	private Value value;
	private ArrayList<Value> children;

    public No(Value value, ArrayList<Value> children) {
    	
    	this.value = value;
    	this.children = children;  
    }
    
    public Value consultChildren(Value value){
        	
    	for(Value v: children){
    		if(value == v){
    			return value;
    		}
    	}
    	return children.get(children.indexOf(value));
    	
    }

    public Value getAluno() {
        return value;
    }

    /**public void setChildren(Value value) {
        if (value.)
    	this.aluno = aluno;
    }

	public No getLeft() {
		return left;
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
}
