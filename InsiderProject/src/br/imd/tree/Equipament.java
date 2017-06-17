package br.imd.tree;

import br.imd.factory.Activity;

public class Equipament extends Value{
	
	private String equipament;
	
	public Equipament(Activity activity){
		this.equipament = activity.getEquipament();
	}
	public String getEquipament(){
		return this.equipament;
	}
}
