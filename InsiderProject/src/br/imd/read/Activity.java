package br.imd.read;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Activity{
	private String id;
	private Date date;
	private Date time;
	private String domain;
	private String user;
	
	public Activity(String[] activityLine){
		this.id = activityLine[0];
		converteDate(activityLine[1]);
		separete(activityLine[2]);
	}
	
	public void separete(String field){
		String[] aux = field.split("/");
		this.domain = aux[0];
		this.user = aux[1];
	}
	
	public void converteDate(String field){
		String[] dateSepareted = field.split(" ");
		System.out.println(dateSepareted[0]);
		System.out.println(dateSepareted[1]);
		
		DateTimeFormatter d = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(dateSepareted[0],d);
		System.out.println("A data e: " + date);
		
		DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.parse(dateSepareted[1],t);
		System.out.println("A hora e: " + time);
	}
		
	public String getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public Date getTime() {
		return time;
	}

	public String getDomain() {
		return domain;
	}

	public String getUser() {
		return user;
	}	
}





	


