package br.imd.read;

public class Http extends Activity{

	private String action;
	
	public Http(String[] activityLine){
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
