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
	//Array de No's.
	private ArrayList<No> children;
	//O Array de inteiros que contem o histograma.
	private int[] histogram;
	//Inteiro que representa o nivel do No na arvore.
	private final int level;
	
	
	/**
	 * Construtor que gera os demais Nos da arvore, que sao do 
	 * tipo valor. 
	 * @param value, level O valor do No e em qual nivel se encontra.
	 */
	public No(Value value, int level) {
    	this.value = value;
    	this.children = new ArrayList<No>(); 
    	this.histogram = new int[24];
    	this.level = level;
    }
	/**
	 * Contrutor para setar o o No na arvore
	 * @param value
	 */
	public No(Value value) {
    	this.value = value;
    	this.children = new ArrayList<No>(); 
    	this.histogram = new int[24];
    	this.level = 0;
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
	
	 /**
	  * Metodo que verificar a existencia de uma No no Array,
	  * retornando o mesmo.
	  * @param value
	  * @return no
	  */
    public No consultChildren(Value value){
        	
    	for(No v: children){
    		if(v.getValue().equals(value)){
    			return v;
    		}
    	} 
    	return null;
    }
    
	 /**
	  * Metodo que inseri um No no Array. 
	  * @param value
	  * @return No 
	  */
    public No insertChildren(Value value){
    		No no = new No(value,this.level+1);
    		children.add(no);
    		//precisa da hora da atividade para setHistogram
    		setHistogram(1);
    		return no;
    	//}
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
     * Metodo que retona um array de No.
     * @return Array de No
     */
    public ArrayList<No> getChildren(){
    	return children;
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
    /**
     * Classe que imprime o conteúdo de cada No
     * @return O conteudo do No.
     */
    public String toString(){
    	String output="";
    	
    	switch(level){
    	case 0:
    		output="User: "+((User)this.value)+"\n Tempos: "+this.children.toString();
        	break;
    	case 1:
    		output="Tempo: "+((DateGroup)this.value)+"\n Equipamentos: "+this.children.toString();
        	break;
    	case 2:
    		output="Equipamento: "+((Equipament)this.value)+"\n Atividade: "+this.children.toString();
        	break;
    	case 3:
    		output="Atividade: "+((ActivityValue)this.value)+"\n Atributos: "+this.children.toString();
        	break;
    	case 4:
    		output="Atributos: "+((UrlValue)this.value);
        	break;
    	}
    	return output;
    }
}
