package br.imd.tree;

import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe para representar um intervalo de tempo.
 * Temos dateInicio e dateFim.
 * Se os dois forem diferentes de nulo então considero um intervalo
 * Se dateFim for igual a nulo então tenho um dia especifico e 
 * Se me dateInicio for nula eu tenho o passado.
 * @author Adriana Azevedo e Gelly Viana
 *
 */

public class DateGroup extends Value {
	private LocalDate dateEnd;
	private LocalDate dateBegin;
	//private LocalDate[] dateGroup;
	//private LocalTime time;
	//private String user;
	/**
	 * 
	 * @param dateFim
	 * @param dateInicio
	 */
	public DateGroup(String date1, String date2){
		
		DateTimeFormatter d = DateTimeFormatter.ofPattern("MM/dd/yyyy");
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
	
//	public void analyzerDate(){
//		if(dateEnd == null){
//			//Cria o meu No que é por uma data atual
//		}else if(dateEnd == dateBegin){
//			//Cria no No por data especifica
//		}else if(dateBegin == null){
//			//Cria pelo um data fim 
//		}else{
//			//Cria um intervalo de tempo.
//		}
//	}
	/**
	 * Método verifica a faixa de intervalo para um No.
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
	public LocalDate getLocalDateEnd(){
		return this.dateEnd;
	}
	public LocalDate getLocalDateBegin(){
		return this.dateBegin;
	}
}
