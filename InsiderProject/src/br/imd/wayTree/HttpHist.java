package br.imd.wayTree;

import java.util.ArrayList;
import br.imd.factory.Http;

/**
 * Classe criada para capturar o historico de 
 * Url's que um determinado usuario utilizou.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class HttpHist {

	private ArrayList<Http> httpRegs;
	
	public HttpHist(){
		httpRegs = new ArrayList<Http>();
	}

	public ArrayList<Http> getHttpRegs() {
		return httpRegs;
	}

	public void setHttpRegs(ArrayList<Http> httpRegs) {
		this.httpRegs = httpRegs;
	}
	
	
}
