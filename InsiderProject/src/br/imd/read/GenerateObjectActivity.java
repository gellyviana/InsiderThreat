package br.imd.read;

public class GenerateObjectActivity extends GenerateObject{
	
	public GenerateObjectActivity(){}
	
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
