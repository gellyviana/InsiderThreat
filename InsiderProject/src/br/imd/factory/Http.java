package br.imd.factory;

/**
 * Classe criada para gerar um tipo de atividade
 * que e Http, que ira conter o endereco que foi 
 * acessado. Classe herdada da classe abstrata
 * Activity, so contem a url que foi acessada.
 * Objeto e criado a partir de um arquivo
 * de log. 
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Http extends Activity{

	//A string que vai conter a url acessada.
	private String action;
	
	/**
	 * Construtor que vai instanciar a atividade do 
	 * tipo Http.
	 * @param activityLine Array de string com os campos
	 * da linha do arquivo
	 */
	public Http(String[] activityLine){
		super(activityLine);
		this.action = activityLine[4];
	}
	
	/**
	 * Metodo que retorna o endereco de url que foi acessado.
	 * @return string O endereco da url.
	 */
	public String getAction(){
		return this.action;
	}
	
	/**
	 * Metodo que retorna uma string que 
	 * contem o endereco da url.
	 * @return String O endereco da url.
	 */
	public String toString(){
		return this.action;
	}
}
