package br.imd.tree;

import java.time.LocalDate;
import java.time.LocalTime;

import br.imd.factory.Activity;

public class Equipament extends Value{
	
	private String equipament;
	
	public Equipament(Activity activity){
		this.equipament = activity.getEquipament();
	}
}
