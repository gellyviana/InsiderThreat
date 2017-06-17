package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Http;

public class UrlValue extends Value{
	
	private String urlValue;
	
	public UrlValue(Activity activity){
		if(activity instanceof Http){
			Http url = (Http)activity;
			this.urlValue = url.getAction();
		}	
	}

}
