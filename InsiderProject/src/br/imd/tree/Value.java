package br.imd.tree;

import java.time.LocalTime;
import java.util.ArrayList;

import br.imd.factory.Activity;
import br.imd.factory.User;

public class Value {
	
	private User user;
	private LocalTime dateGroup;
	private String equipament;
	private Activity activity;
	
	public Value(User user){
		this.user = user;
	}
	
	public Value(LocalTime dateGroup){
		this.dateGroup = dateGroup;
	}
	public Value(String equipament){
		this.equipament = equipament;
	}
	
	public Value(Activity activity){
		this.activity = activity;
	}
	public void setUser(User user){
		this.user = user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public LocalTime getDataGroup(){
		return this.dateGroup;
	}
	
	public String getEquipament(){
		return this.equipament;
	}

	public Activity getActivity(){
		return this.activity;
	}
}
