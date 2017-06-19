package br.imd.exception;
/**
 * 
 * Classe para gerar excessões quando um camilho estiver vazio.
 * 
 * @author Adriana Azevedo e Gelly Viana Mota
 * @version 2017.06.14
 */
public class NullWayException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NullWayException(String msg){
		super (msg);
	}
}
