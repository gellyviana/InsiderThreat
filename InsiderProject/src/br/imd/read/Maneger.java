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
	
	
	private GenerateObjectUser objectUser;
	private GenerateObjectActivity objectActivity;
	
	public Maneger(String filename){
		
		createObject(filename);
	}
		
	public void createObject(String filename){
		LogfileReader fileReader = new LogfileReader(filename);
		LogEntry aux = new LogEntry();
		aux =fileReader.nextEntry();
		if(aux.getField1().equals("id")){
			while (fileReader.hasMoreEntries()){
				aux = fileReader.nextEntry();
				String[] s1 = aux.getFields();
				objectActivity = new GenerateObjectActivity(s1);
			//for (int i = 0; i < s1.length; i++){
				//System.out.println(s1[i]);
			//}
			}
		} else{
			while (fileReader.hasMoreEntries()){
				aux = fileReader.nextEntry();
				String[] s1 = aux.getFields();
				objectUser = new GenerateObjectUser(s1);
				//for (int i = 0; i < s1.length; i++){
					//System.out.println(s1[i]);
				//}
			}
		}
	}

	public GenerateObjectUser getObjectUser() {
		return objectUser;
	}

	public void setObjectUser(GenerateObjectUser objectUser) {
		this.objectUser = objectUser;
	}

	public GenerateObjectActivity getObjectActivity() {
		return objectActivity;
	}

	public void setObjectActivity(GenerateObjectActivity objectActivity) {
		this.objectActivity = objectActivity;
	}

	
}
