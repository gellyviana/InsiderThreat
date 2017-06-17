package br.imd.tree;

import java.time.LocalDate;
import java.time.LocalTime;

import br.imd.factory.Activity;

public class Equipament {
	private LocalDate date;
	private LocalTime time;
	private String equipament;
	
	public Equipament(Activity activity){
		this.date = activity.getDate();
		this.time = activity.getTime();
		this.equipament = activity.getEquipament();
	}
}
