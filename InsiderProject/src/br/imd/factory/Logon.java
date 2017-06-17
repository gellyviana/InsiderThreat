package br.imd.factory;

/**
 * Classe criada para gerar um tipo de atividade
 * que e Logon. Classe herdada da classe abstrata
 * Activity, so contem o tipo de acao, se e logon
 * ou logoff.Objeto e criado a partir de um arquivo
 * de log. 
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Logon extends Activity{
	
	//A string que vai conter o atividade de log.
	private String action;
		
	/**
	 * Construtor que vai instanciar a atividade do 
	 * tipo Logon.
	 * @param activityLine Array de string com os campos
	 * da linha do arquivo
	 */
	public Logon(String[] activityLine){
		super(activityLine);
		this.action = activityLine[4];
	}
	
	/**
	 * Metodo que retorna a acao que foi executada.
	 * @return string A acao.
	 */
	public String getAction(){
		return this.action;
	}
	
	/**
	 * Metodo que retorna uma string que 
	 * contem a acao.
	 * @return String A acao.
	 */
	public String toString(){
		
		return this.action;
	}

}
