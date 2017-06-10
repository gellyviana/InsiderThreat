package br.imd.read;

public class Logon extends Activity{

	private String action;
	
	public Logon(String[] activityLine){
		super(activityLine);
		this.action = activityLine[4];
	}
	
	public String getAction(){
		return this.action;
	}
	
	public String toString(){
		
		return this.action;
	}

}
