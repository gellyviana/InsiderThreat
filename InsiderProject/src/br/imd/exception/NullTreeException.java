package br.imd.exception;
/**
 * Classe para gerar excessões quando a árvore estiver vazia.
 * 
 * @author Adriana Azevedo e Gelly Viana Mota
 * @version 2017.06.14
 */
public class NullTreeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NullTreeException(String msg){
		super(msg);
	}
	
}
