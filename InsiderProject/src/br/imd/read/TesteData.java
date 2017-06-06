package br.imd.read;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

public class TesteData {

	
	public void convertDate(String field1) throws ParseException{
		String[] dateSepareted = field1.split(" ");
		System.out.println(dateSepareted[0]);
		System.out.println(dateSepareted[1]);
		
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate sDate = LocalDate.parse(dateSepareted[0],d);
		
		//DateTimeFormatter t = DateTimeFormatter.ofPattern("hh:mm:ss");
		//LocalTime sTime = LocalTime.parse(dateSepareted[1],t);
		//DateFormat d = DateFormat.getDateTimeInstance();
		//Date d1 = d.parse(dateSepareted[0]);
		//Date d2 = d.parse(dateSepareted[1]);
		System.out.println("a data e: " + sDate);
		//System.out.println("a hora e: " + t);
		
	}
	
	
	//LocalDate sData = LocalDate.parse( stringData , fmt2 );

	public static void main(String[] args) throws ParseException{
		
		String field1 = "01/04/2010 07:12:31";
		TesteData test1 = new TesteData();
		test1.convertDate(field1);
		
		
		
		//Calendar c = Calendar.getInstance();
		//Date data = c.getTime();
		//DateFormat f = DateFormat.getDateInstance();
		
		//Date data2 = f.parse("12/01/1995");
		//System.out.println(data2);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println("Data formatada: "+sdf.format(data));
		
		//Converte Objetos
		//System.out.println(“Data convertida: ”+sdf.parse("02/08/1970"));
	}
}
