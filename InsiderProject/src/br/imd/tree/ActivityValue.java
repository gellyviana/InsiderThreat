package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Device;
import br.imd.factory.Logon;

public class ActivityValue extends Value{
	
	String activity;
	
	public ActivityValue(Activity activity){
		if(activity instanceof Logon){
			this.activity = ((Logon)activity).getAction();
		}else if(activity instanceof Device){
			this.activity = ((Device)activity).getAction();
		}
	}
	public String getActivity(){
		return this.activity;
	}
}
