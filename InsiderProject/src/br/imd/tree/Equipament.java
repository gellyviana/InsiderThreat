package br.imd.tree;

import br.imd.factory.Activity;

public class Equipament extends Value{
	
	private String equipament;
	
	public Equipament(Activity activity){
		setHour(activity.getTime().getHour());
		this.equipament = activity.getEquipament();
	}
	public String getEquipament(){
		return this.equipament;
	}
	public boolean equals(Object o){
		if(o instanceof Equipament){
			return equipament.equals(((Equipament)o).getEquipament());
		}
		return false;
	}
}
