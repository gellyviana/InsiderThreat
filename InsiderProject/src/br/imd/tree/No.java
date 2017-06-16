package br.imd.tree;

import java.util.ArrayList;

import br.imd.factory.Info;
import br.imd.factory.User;
import br.imd.tree.Value;

public class No {
		
	//private Info value;
	private Value value;
	//private ArrayList<Value> children;
	private int[] histogram;
	private int level;

	public No(User user) {
		this.value = new Value(user);
    	//this.children = new ArrayList<Value>(); 
    	//Haveria necessidade de um histograma em No usuário?
    	this.histogram = new int[24];
    	this.level = 0;
    	//this.consultChildren(value);
	}
	
	public No(Value value, int level) {
    	this.value = value;
    	//this.children = new ArrayList<Value>(); 
    	this.histogram = new int[24];
    	this.level = level;
    }
    
	public Value getValue(){
		return this.value;
	}
	
	 public void setValue(Value value) {
	        this.value = value;
	 }

    /*public boolean consultChildren(Value value){
        	
    	for(Value v: children){
    		if(value == v){
    			return true;
    		}else
    			return false;
    		} 
    	return false;
    }
    
    public void insertChildren(Value value){
    	if(children.isEmpty()){
    		children.add(value);
    	}else if(consultChildren(value)){
        		//pega a hora da atividade para passar como parametro no setHistogram 
        		//setHistogram(1);
    	}else{
    		insertChildren(value);
    		//precisa da hora da atividade para setHistogram
    		//setHistogram(1);
    	}
    }*/
    public int getLevel(){
    	return this.level;
    }
    public void defineTimeHistogram(Info value){
    	
    }
    public void setLevel(int level){
    	this.level = level;
    }
    public void setHistogram(int i){	
    	histogram[i]++;
    }
    
    public int[] showHistrogram(){
    	return histogram;
    }
}
