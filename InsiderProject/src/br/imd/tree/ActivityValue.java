package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Device;
import br.imd.factory.Logon;

/**
 * Classe que verifica se uma atividade é instancia de 
 * Logon  ou Device.
 * @author Adriana Azevedo e Gelly Viana
 *
 */
public class ActivityValue extends Value{
	
	private String activity;
	
	public ActivityValue(Activity activity){
		setHour(activity.getTime().getHour());
		if(activity instanceof Logon){
			this.activity = ((Logon)activity).getAction();
		}else if(activity instanceof Device){
			this.activity = ((Device)activity).getAction();
		}
	}
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
