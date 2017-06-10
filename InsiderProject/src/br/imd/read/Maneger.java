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
	
	private String file;
	private static ArrayList<GenerateObject> userGuide;
	
	public Maneger(String filename){
		
		this.file = " ";//nao sei se e necessario
		userGuide = new ArrayList<GenerateObject>();
		createObject(filename);
	}
		
	public void createObject(String filename){
		LogfileReader fileReader = new LogfileReader(filename);
		LogEntry aux = new LogEntry();
		while (fileReader.hasMoreEntries()){
			aux = fileReader.nextEntry();
			String[] s1 = aux.getFields();
			GenerateObject object = new GenerateObject(s1);
			if ( !(s1[0].contains("{")) || (s1[0].contains("}"))){
				userGuide.add(object);
			}
			//for (int i = 0; i < s1.length; i++){
				//System.out.println(s1[i]);
			//}
		}
		
		//estou tentando ver se esta sendo criado o arrayList, mas nao estou conseguindo
		for(int i = 0; i < userGuide.size(); i++){
			System.out.println(userGuide.get(i).toString());
		}
		/**Iterator it = userGuide.iterator();
        while (it.hasNext()) {
        	System.out.println(it.next());
        }*/
        
	}
}
