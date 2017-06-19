package br.imd.wayTree;

import br.imd.factory.Http;

/**
 * Classe criada para imprimir todas as atividades
 * desempenhadas por determinado usuario.
 * 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class PrintTree {
	
	Arvore arvore = new Arvore();
	
	public void oi(){
		for(Http http: arvore.getHttpHist().getHttpRegs()){
			System.out.println();
		}
	}
}
