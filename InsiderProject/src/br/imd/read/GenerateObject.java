package br.imd.read;

public abstract class GenerateObject {
	
	private String[] aux;
			
	public GenerateObject() {}
	
	public GenerateObject(String[] line){
		/**this.user = null;
		this.activity = null;
		userList = new ArrayList<User>();
		activityList = new ArrayList<Activity>();
		if ((line[0].contains("{")) || (line[0].contains("}"))){
			activity = createActivity(line);
			activityList.add(activity);
		}else{
			user = createUser(line);
			userList.add(user);
		}
		printObject();*/
	}

	public String[] getAux() {
		return aux;
	}

	public void setAux(String[] aux) {
		this.aux = aux;
	}	
	
}
