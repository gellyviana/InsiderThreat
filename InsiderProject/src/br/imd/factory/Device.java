package br.imd.factory;

/**
 * Classe criada para gerar um tipo de atividade
 * que e Device, que ira conter a informacao se 
 * foi conectado ou nao equipamento, tipo pen-drive.
 * Classe herda da classe abstrata Activity.
 * Objeto e criado a partir de um arquivo
 * de log. 
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Device extends Activity{
	
	//A string que vai conter a acao executada.
	private String action;
	
	/**
	 * Construtor que vai instanciar a atividade do 
	 * tipo Device.
	 * @param activityLine Array de string com os campos
	 * da linha do arquivo
	 */
	public Device(String[] activityLine){
		super(activityLine);
		this.action = activityLine[4];
	}
	
	/**
	 * Metodo que retorna a acao executada.
	 * @return string A acao executada.
	 */
	public String getAction(){
		return this.action;
	}
	
	/**
	 * Metodo que retorna uma string que 
	 * contem a acao executada.
	 * @return String A acao executada.
	 */
	public String toString(){
		
		return this.action;
		//+ model.getUser() + model.getEquipament();
	}

}
