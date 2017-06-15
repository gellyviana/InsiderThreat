package br.imd.factory;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public abstract class  Activity extends Info{
	private String id;
	private LocalDate date;
	private LocalTime time;
	private String domain;
	private String user;
	private String equipament;
	
	public Activity(){}
	
	public Activity(String[] activityLine){
		this.id = activityLine[0];
		this.equipament = activityLine[3];
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
				
		DateTimeFormatter d = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.parse(dateSepareted[0],d);
		this.date = localDate;
				
		DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.parse(dateSepareted[1],t);
		this.time = localTime;
	}
	
	public String getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalTime getTime() {
		return time;
	}

	public String getDomain() {
		return domain;
	}

	public String getUser() {
		return user;
	}
	
	public String getEquipament(){
		return equipament;
	}
	
}





	


