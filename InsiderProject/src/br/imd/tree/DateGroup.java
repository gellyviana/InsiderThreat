package br.imd.tree;

import java.time.LocalDate;
import java.time.LocalTime;
import br.imd.factory.Activity;
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
	private LocalDate dateFim;
	private LocalDate dateInicio;
	private LocalTime time;
	private String user;
	/**
	 * 
	 * @param dateFim
	 * @param dateInicio
	 */
	public DateGroup(LocalDate dateFim, LocalDate dateInicio){
			this.dateFim = dateFim;
			this.dateInicio = dateInicio;
	}
	
	public void analyzerDate(){
		if(dateFim == null){
			//Cria o meu No que é por uma data atual
		}else if(dateFim == dateInicio){
			//Cria no No por data especifica
		}else if(dateInicio == null){
			//Cria pelo um data fim 
		}else{
			//Cria um intervalo de tempo.
		}
	}
}
