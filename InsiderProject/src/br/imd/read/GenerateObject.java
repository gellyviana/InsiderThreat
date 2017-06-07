package br.imd.read;

public class GenerateObject {
	
	public User createUsuario(String[] userLine){
		return new User(userLine);
	}
	
	public Activity createActivity(String[] activityLine){
		if((activityLine[4].equals("connect")) || (activityLine[4].equals("disconnect"))){
			return new Device(activityLine);
		}else{
			if((activityLine[4].equals("logon")) || (activityLine[4].equals("logon"))){
				return new Log(activityLine);
			}else{
				return new Http(activityLine);
			}
		}
		
	}

}
