package br.imd.read;

public class GenerateObject {
	
	private User user;
	private Activity activity;
		
	public GenerateObject() {}
	
	public GenerateObject(String[] line){
		this.user = null;
		this.activity = null;
		if ((line[0].contains("{")) || (line[0].contains("}"))){
			activity = createActivity(line);
		}else{
			user = createUser(line);
			System.out.println(user.toString());
		}
	}
	
	
	public User createUser(String[] userLine){
		return new User(userLine);
	}
	
	public Activity createActivity(String[] activityLine){
		if((activityLine[4].equals("connect")) || (activityLine[4].equals("disconnect"))){
			return new Device(activityLine);
		}else{
			if((activityLine[4].equals("logon")) || (activityLine[4].equals("logon"))){
				return new Logon(activityLine);
			}else{
				return new Http(activityLine);
			}
		}
		
	}

	public User getUser() {
		return user;
	}

	public Activity getActivity() {
		return activity;
	}
	

}
