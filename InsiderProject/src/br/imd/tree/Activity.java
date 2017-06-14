package br.imd.tree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import br.imd.factory.GenerateObject;
import br.imd.factory.User;

public class Activity extends Value{
	
	private String activityTipe;
	private User user;
	private LocalDate date;
	private LocalTime time;
	
	public Activity(ArrayList<GenerateObject> array){
		super(array);
	}
	

}
