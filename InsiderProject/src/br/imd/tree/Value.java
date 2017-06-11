package br.imd.tree;

public class Value {
	
	private User user;
	private DateGroup dateGroup;
	private Equipament equipament;
	private Activity activity;
	
	public Value(){
	
		this.user = null;
		this.dateGroup = null;
		this.equipament = null;
		this.activity = null;
		
	}
		
	
	public User getUser(){
		return this.user;
	}
	
	public DateGroup getDataGroup(){
		return this.dateGroup;
	}
	
	public Equipament getEquipament(){
		return this.equipament;
	}

	public Activity getActivity(){
		return this.activity;
	}
}
