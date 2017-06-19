package br.imd.tree;

import br.imd.factory.Activity;
import br.imd.factory.Http;

/**
 * Classe para avaliar se a atividade é do tipo Http
 * e assim poder inserir essa atividade na Arvore.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class UrlValue extends Value{
	
	private String urlValue;
	
	public UrlValue(Activity activity){
		setHourActivity(activity.getTime().getHour());
		if(activity instanceof Http){
			urlValue= ((Http)activity).getAction();	
		}	
	}
	/**
	 * Metodo que retorna uma Url.
	 * @return urlValue
	 */
	public String getUrlValue(){
		return this.urlValue;
	}
	/**
	 * Metodo que retorna true caso receba um objeto como parametro 
	 * da instancia de UrlValue.
	 * @return boolean
	 */
	public boolean equals(Object o){
		if(o instanceof UrlValue){
			return urlValue.equals(((UrlValue)o).getUrlValue());
		}
		return false;
	}
}
