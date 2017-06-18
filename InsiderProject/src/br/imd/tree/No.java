package br.imd.tree;

import java.util.ArrayList;

//import java.util.ArrayList;
import br.imd.factory.User;
import br.imd.tree.Value;

/**
 * Classe criada para gerar um No de uma arvore que
 * contem o conteudo do No, que e um valor, um Array 
 * de inteiros com que representa o histograma de cada 
 * No e o nivel da arvore que esta o No.
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class No {
		
	//O valor que vai conter no No.
	private Value value;
	private ArrayList<Value> children;
	//O Array de inteiros que contem o histograma.
	private int[] histogram;
	//Inteiro que representa o nivel do No na arvore.
	private int level;

	/**
	 * Construtor que gera a raiz arvore, que e do 
	 * tipo usuario. 
	 * @param user Um usuario.
	 */
	public No(User user) {
		this.value = user;
    	this.children = new ArrayList<Value>(); 
    	this.histogram = new int[24];
    	this.level = 0;
    	//this.consultChildren(value);
	}
	
	/**
	 * Construtor que gera os demais Nos da arvore, que sao do 
	 * tipo valor. 
	 * @param value, level O valor do No e em qual nivel se encontra.
	 */
	public No(Value value) {
    	this.value = value;
    	this.children = new ArrayList<Value>(); 
    	this.histogram = new int[24];
    	this.level ++;
    }
    
	/**
	 * Metodo que retorna o valor do No.
	 * @return value O valor do No.
	 */
	public Value getValue(){
		return this.value;
	}
	
	/**
	 * Metodo que altera o valor do No.
	 * @param value O valor que vai conter no No.
	 */
	 public void setValue(Value value) {
	        this.value = value;
	 }
	 public boolean analizerLevel(Value value){
		 if(value instanceof DateGroup){
			 for(Value v : children){
				 if(v.equals(value)){
					 return true;
				 }
			 }
		 }else if(value instanceof UrlValue){
			 for(Value v : children){
				 if(v.equals(value)){
					 return true;
				 }
			 }
		 }else if(value instanceof Equipament){
			 for(Value v : children){
				 if(v.equals(value)){
					 return true;
				 }
			 }
		 }else if(value instanceof ActivityValue){
			 for(Value v : children){
				 if(v.equals(value)){
					 return true;
				 }
			 }
		 }
		 return false;
	 }
    public boolean consultChildren(Value value){
        	
    	for(Value v: children){
    		if(value == v){
    			return true;
    		}
    	} 
    	return false;
    }
    
    public void insertChildren(Value value){
    	if(children.isEmpty()){
    		children.add(value);
    		
    	}else if(consultChildren(value)){
        		//pega a hora da atividade para passar como parametro no setHistogram 
        		setHistogram(1);
    	}else{
    		children.add(value);
    		//precisa da hora da atividade para setHistogram
    		setHistogram(1);
    	}
    }
	 
	/**
	 * Metodo que retorna em que nivel se encontra o No.
	 * @return level Inteiro que contem o nivel do No.
	 */
    public int getLevel(){
    	return this.level;
    }
    
    /**
     * Metodo sem retorno que define em qual hora do histograma a 
     * atividade se encontra.
     * @param value O valor que contem.
     */
    public void defineTimeHistogram(Value value){
    	
    }
    
    /**
     * Metodo que altera o nivel do No.
     * @param level Inteiro com qual nivel o No se encontra.
     */
    public void setLevel(int level){
    	this.level = level;
    }
    
    /**
     * Metodo que incrementa o histograma na posicao que se
     * encontra a hora que ocorreu a atividade.
     * @param i Inteiro com a posicao que ocorreu a atividade.
     */
    public void setHistogram(int i){	
    	histogram[i]++;
    }
    
    /**
     * Metodo que retorna o histograma.
     * @return histograma O Array que contem o histograma.
     */
    public int[] showHistrogram(){
    	return histogram;
    }
}
