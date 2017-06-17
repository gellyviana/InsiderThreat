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
			/**for(int i=0; i< activityLine.length; i++){
				System.out.println(device.getId());
				System.out.println(device.getDate());
				System.out.println(device.getTime());
				System.out.println(device.getDomain());
				System.out.println(device.getUser());
				System.out.println(device.getEquipament());
				System.out.println(device.getAction());
			}*/
			//return new Device(activityLine);*/
			return device;
		}else{
			if((activityLine[4].equals("Logon")) || (activityLine[4].equals("Logoff"))){
				Logon logon = new Logon(activityLine);
				/**for(int i=0; i< activityLine.length; i++){
					System.out.println(logon.getId());
					System.out.println(logon.getDate());
					System.out.println(logon.getTime());
					System.out.println(logon.getDomain());
					System.out.println(logon.getUser());
					System.out.println(logon.getEquipament());
					System.out.println(logon.getAction());
				}*/
				return logon;
				//return new Logon(activityLine);
			}else{
				Http http = new Http(activityLine);
				/**for(int i=0; i< activityLine.length; i++){
					System.out.println(http.getId());
					System.out.println(http.getDate());
					System.out.println(http.getTime());
					System.out.println(http.getDomain());
					System.out.println(http.getUser());
					System.out.println(http.getEquipament());
					System.out.println(http.getAction());
				}*/
				//return new Http(activityLine);
				return http;
			}
		}
	}
	
}
