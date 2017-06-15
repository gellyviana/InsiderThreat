package br.imd.tree;

import java.util.ArrayList;

import br.imd.factory.Info;
import br.imd.factory.User;
import br.imd.tree.Value;

public class No {
		
	private Info value;
	private ArrayList<Info> children;
	private int[] histogram;
	private int level;

	public No(User user) {
		this.value = user;
    	this.children = new ArrayList<Info>(); 
    	this.histogram = new int[24];
    	this.level = 0;
	}
	
	public No(Info value) {
    	this.value = value;
    	this.children = new ArrayList<Info>(); 
    	this.histogram = new int[24];
    	this.level ++;
    }
    
	public Info getValue(){
		return this.value;
	}
	
	 public void setValue(Info value) {
	        this.value = value;
	 }

    public boolean consultChildren(Info value){
        	
    	for(Info v: children){
    		if(value == v){
    			return true;
    		}else
    			return false;
    		} 
    	return false;
    }
    
    public void insertChildren(Info value){
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
    }
    
    public void defineTimeHistogram(Info value){
    	
    }
    public void setHistogram(int i){	
    	histogram[i]++;
    }
    
    public int[] showHistrogram(){
    	return histogram;
    }
}
