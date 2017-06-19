package br.imd.exception;
/**
 * Classe para gerar excessões quando um valor estiver vazia.
 * 
 * @author Adriana Azevedo e Gelly Viana Mota
 * @version 2017.06.14
 */
public class NullValueException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullValueException(String msg){
		super(msg);
	}
	
}
