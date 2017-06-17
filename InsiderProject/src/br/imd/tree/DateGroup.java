package br.imd.tree;

import java.time.LocalDate;
import java.time.LocalTime;
import br.imd.factory.Activity;

public class DateGroup {
	
	private LocalDate date;
	private LocalTime time;
	private String user;
	
	public DateGroup(Activity activity){
		this.date = activity.getDate();
		this.time = activity.getTime();
		this.user = activity.getUser();
	}

}
