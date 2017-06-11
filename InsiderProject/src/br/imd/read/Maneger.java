package br.imd.read;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe criada para conduzir uma linha de um arquivo
 * ao processo de criação de objeto
 *  
 * @author Adriana Azevedo e Gelly Viana
 *
 */
public class Maneger {
	
	
	public Maneger(String filename){
		
		createObject(filename);
	}
		
	public void createObject(String filename){
		LogfileReader fileReader = new LogfileReader(filename);
		LogEntry aux = new LogEntry();
		while (fileReader.hasMoreEntries()){
			aux = fileReader.nextEntry();
			String[] s1 = aux.getFields();
			GenerateObject object = new GenerateObject(s1);
			//for (int i = 0; i < s1.length; i++){
				//System.out.println(s1[i]);
			//}
		}        
	}
}
