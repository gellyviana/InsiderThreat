package br.imd.read;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;

public class TesteData {

	public void converteDate(String field)throws ParseException{
		
			String[] dateSepareted = field.split(" ");
			System.out.println(dateSepareted[0]);
			System.out.println(dateSepareted[1]);
			
			DateTimeFormatter d = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			LocalDate date = LocalDate.parse(dateSepareted[0],d);
			System.out.println("A data e: " + date);
			
			DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime time = LocalTime.parse(dateSepareted[1],t);
			System.out.println("A hora e: " + time);
			
			
			/**
			SimpleDateFormat dte = new SimpleDateFormat("MM/dd/yyyy");
			Date date = dte.parse(dateSepareted[0]);
			System.out.println("A data e: " + date);
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date hour = sdf.parse(dateSepareted[1]);
			System.out.println("A hora e: " + hour.toString());
			*/
		
	}


	public static void main(String[] args) throws ParseException{
		
		String field1 = "01/04/2010 07:12:31";
		TesteData test1 = new TesteData();
		try{
		test1.converteDate(field1);	
		}
		catch(ParseException e){
			e.printStackTrace();
		}
	}
	
}
