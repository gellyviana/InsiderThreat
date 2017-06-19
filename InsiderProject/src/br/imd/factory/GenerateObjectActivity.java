package br.imd.factory;

/**
 * Classe gera um objeto do tipo atividade a partir  
 * de um array de String com 5 campos.Classe herda 
 * de GenerateObject.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04 */
public class GenerateObjectActivity extends GenerateObject{
	
	/**
	 * Contrutor padrao vazio.
	 */
	public GenerateObjectActivity(){}
	
	/**
	 * Metodo para criar um objeto do tipo atividade atraves 
	 * de uma linha de Array de string, podem ser criados 03 tipos 
	 * de atividades, Device, Logon e Http.
	 * @param userLine Array de string com a linha do arquivo 
	 * de atividades.
	 * @return Activity Atividade criada.
	 */
	public static Activity createActivity(String[] activityLine){
		if((activityLine[4].equals("Connect")) || (activityLine[4].equals("Disconnect"))){
			Device device = new Device(activityLine);
			return device;
		}else{
			if((activityLine[4].equals("Logon")) || (activityLine[4].equals("Logoff"))){
				Logon logon = new Logon(activityLine);
				return logon;
			}else{
				Http http = new Http(activityLine);
				return http;
			}
		}
	}
	
}
