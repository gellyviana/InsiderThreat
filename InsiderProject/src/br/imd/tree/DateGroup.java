package br.imd.tree;

import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe para representar um intervalo de tempo.
 * Temos dateEnd e dateBegin.
 * Se os dois forem diferentes de nulo então considero um intervalo
 * Se dateFim for igual a nulo então tenho um dia especifico e 
 * Se me dateInicio for nula eu tenho o passado.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */

public class DateGroup extends Value {
	private LocalDate dateEnd;
	private LocalDate dateBegin;
	/**
	 * 
	 * @param String dateFim
	 * @param String dateInicio
	 */
	public DateGroup(String date1, String date2){
	
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if(date1 != null){
			dateBegin = LocalDate.parse(date1,d);
		}else{
			dateBegin = null;
		}
		if(date2 != null){
			dateEnd = LocalDate.parse(date2,d);
		}else{
			dateEnd = null;
		}
	}
	/**
	 * Método verifica a faixa de intervalo de tempo para um No.
	 * @param localDate
	 * @return Boolean
	 */
	public boolean isInGroup(LocalDate localDate){
		if(dateBegin == null){
			return localDate.isBefore(dateEnd) || localDate.equals(dateEnd);
		}else if(dateEnd == null){
			return localDate.isAfter(dateBegin) || localDate.equals(dateBegin);
		}
		return localDate.isBefore(dateEnd) && localDate.isAfter(dateBegin);
	}
	/**
	 * 
	 * @return dataEnd
	 */
	public LocalDate getLocalDateEnd(){
		return this.dateEnd;
	}
	
	/**
	 * 
	 * @return dateBegin
	 */
	public LocalDate getLocalDateBegin(){
		return this.dateBegin;
	}
	/**
	 * 
	 * @return 
	 */
	public String toString(){
		String output="";
		if(dateBegin==null){
			output="null"+","+dateEnd.toString();
		}else if (dateEnd == null){
			output= dateBegin.toString()+",null";
		}else
			output=dateBegin.toString()+","+dateEnd.toString();
		return "Intervalo: ["+output+"]";
	}
}
