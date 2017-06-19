package br.imd.tree;

import br.imd.factory.Activity;

/**
 * Classe que verifica se uma atividade é contem 
 * equipamento.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Equipament extends Value{
	
	private String equipament;
	
	public Equipament(Activity activity){
		setHourActivity(activity.getTime().getHour());
		this.equipament = activity.getEquipament();
	}
	/**
	 * Metodo para retorna um equipamento.
	 * @return equipament
	 */
	public String getEquipament(){
		return this.equipament;
	}
	/**
	 * Metodo para comparar se um objeto é instancia de Equipament
	 * @return boolean
	 */
	public boolean equals(Object o){
		if(o instanceof Equipament){
			return equipament.equals(((Equipament)o).getEquipament());
		}
		return false;
	}
}
