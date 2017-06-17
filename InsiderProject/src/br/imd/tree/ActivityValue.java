package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Device;
import br.imd.factory.Logon;

public class ActivityValue extends Value{
	
	String activity;
	
	public ActivityValue(Activity activity){
		if(activity instanceof Logon){
			Logon logon = (Logon)activity;
			this.activity = logon.getAction();
		}else if(activity instanceof Device){
			Device device = (Device)activity;
			this.activity = device.getAction();
		}
	}

}
