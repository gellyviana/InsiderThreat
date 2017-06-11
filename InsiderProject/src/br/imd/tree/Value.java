package br.imd.tree;

import java.util.ArrayList;

import br.imd.read.GenerateObject;

public class Value {
	
	private User user;
	private DateGroup dateGroup;
	private Equipament equipament;
	private Activity activity;
	
	public Value(){}
	
	public Value(ArrayList<GenerateObject> array){
		//if (array) se o array for do tipo usuario e para pegar um usuario e gerar User
		//else pegar as informações e gerar tipo dateGroup, equipament, activity
		
	}
	public Value(User user){
	
		this.user = user;
	
	}
	
	public Value(DateGroup dateGroup){
		
		this.dateGroup = dateGroup;
	
	}
	
	public Value(Equipament equipament){
		
		this.equipament = equipament;
	
	}
	
	public Value(Activity activity){
		
		
		this.activity = activity;
	
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
