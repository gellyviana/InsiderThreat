package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Http;

public class UrlValue extends Value{
	
	private String urlValue;
	
	public UrlValue(Activity activity){
		if(activity instanceof Http){
			urlValue= ((Http)activity).getAction();	
		}	
	}
	public String getUrlValue(){
		return this.urlValue;
	}
	public boolean equals(Object o){
		if(o instanceof UrlValue){
			return urlValue.equals(((UrlValue)o).getUrlValue());
		}
		return false;
	}
}
