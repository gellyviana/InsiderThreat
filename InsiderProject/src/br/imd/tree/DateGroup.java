package br.imd.tree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import br.imd.factory.Activity;
import br.imd.factory.Http;
import br.imd.factory.Maneger;
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
	private LocalDate[] dateGroup;
	private LocalTime time;
	private String user;
	/**
	 * 
	 * @param dateFim
	 * @param dateInicio
	 */
	public DateGroup(String date1, String date2){
			DateTimeFormatter d = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			dateBegin = LocalDate.parse(date1,d);
			dateEnd = LocalDate.parse(date2,d);
			dateGroup[0] = dateEnd;
			if(date2 != null){
				for(int i = 1; dateGroup[i] == dateEnd ; i++){
					//dateGroup[i]++; //nao sei como incrementar a data dia a dia
				}
			}
			//if(date1 instanceof Activity){
				//this.dateInicio = ((Activity)date1).getDate();
			//}else{
				//this.dateFim = ((Activity)date2).getDate();
			//}
	}
	
	public void analyzerDate(){
		if(dateEnd == null){
			//Cria o meu No que é por uma data atual
		}else if(dateEnd == dateBegin){
			//Cria no No por data especifica
		}else if(dateBegin == null){
			//Cria pelo um data fim 
		}else{
			//Cria um intervalo de tempo.
		}
	}
	public LocalDate getLocalDateEnd(){
		return this.dateEnd;
	}
	public LocalDate getLocalDateBegin(){
		return this.dateBegin;
	}
}
