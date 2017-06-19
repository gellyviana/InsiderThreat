package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Device;
import br.imd.factory.Logon;

/**
 * Classe que verifica se uma atividade é uma instancia de 
 * Logon  ou Device.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class ActivityValue extends Value{
	
	private String activity;
	
	public ActivityValue(Activity activity){
		setHourActivity(activity.getTime().getHour());
		System.out.println(activity.getTime().getHour());
		if(activity instanceof Logon){
			this.activity = ((Logon)activity).getAction();
		}else if(activity instanceof Device){
			this.activity = ((Device)activity).getAction();
		}
	}
	/**
	 * Metodo que retorna uma atividade podendo ser Device ou Logon
	 * @return atividade 
	 */
	public String getActivity(){
		return this.activity;
	}
	public boolean equals(Object o){
		if(o instanceof ActivityValue){
			return activity.equals(((ActivityValue)o).getActivity());
		}
		return false;
	}
}
