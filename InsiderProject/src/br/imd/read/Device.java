package br.imd.read;

public class Device extends Activity{
	
	private String action;
	
	public Device(String[] activityLine){
		super(activityLine);
		this.action = activityLine[4];
	}
	
	public String getAction(){
		return this.action;
	}
	
	public String toString(){
		
		return this.action;
		//+ model.getUser() + model.getEquipament();
	}

}
