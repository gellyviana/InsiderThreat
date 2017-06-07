package br.imd.read;

public class Log extends Activity{

	private String action;
	
	public Log(String[] activityLine){
		super(activityLine);
		this.action = activityLine[4];
	}
	
	public String getAction(){
		return this.action;
	}

}
