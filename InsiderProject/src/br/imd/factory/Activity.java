package br.imd.factory;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe criada para gerar um tipo de atividade que
 * contem o id da atividade, data, hora, dominio,
 * qual usuario executou atividade, e em que equipamento
 * ela ocorreu.
 * Classe herda da classe abstrata Info.
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public abstract class  Activity {
	
	//A string com a identificacao da atividade.
	private String id;
	//Tipo LocalDate que vai conter o dia que ocorreu a atividade.
	private LocalDate date;
	//Tipo LocalTime que vai conter a hora que ocorreu a atividade.
	private LocalTime time;
	//String com o dominio do usuario que fez a atividade.
	private String domain;
	//String com o id do usuario que realizou a atividade.
	private String user;
	//String com o equipamento que ocorreu a atrividade.
	private String equipament;
	
	//public Activity(){}
	
	/**
	 * Construtor que vai instanciar a atividade
	 * @param userLine Array de string com os campos
	 * da linha do arquivo
	 */
	public Activity(String[] activityLine){
		this.id = activityLine[0];
		this.equipament = activityLine[3];
		converteDate(activityLine[1]);
		separete(activityLine[2]);
	}
	
	/**
	 * Metodo que separa o campo da linha que contem
	 * duas informaçoes separadas por uma barra (/).
	 */
	public void separete(String field){
		String[] aux = field.split("/");
		this.domain = aux[0];
		this.user = aux[1];
	}
	
	/**
	 * Metodo que converte uma string com data e hora numa LocalDate
	 * e outra LocalTima. Quando separa a informacaos ja instancia os 
	 * atribitutos de dada e hora.
	 */
	public void converteDate(String field){
		String[] dateSepareted = field.split(" ");
				
		DateTimeFormatter d = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.parse(dateSepareted[0],d);
		this.date = localDate;
				
		DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.parse(dateSepareted[1],t);
		this.time = localTime;
	}
	
	/**
	 * Metodo que retorna o numero de identificacao da atividade.
	 * @return string O numero de identificacao da atividade.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Metodo que retorna a data em que ocorreu a atividade.
	 * @return LocalDate A data que ocorreu atividade.
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * Metodo que retorna a hora em que ocorreu a atividade.
	 * @return LocalTime A hora que ocorreu atividade.
	 */
	public LocalTime getTime() {
		return time;
	}
	
	/**
	 * Metodo que retorna o dominio do usuario que realizou a atividade.
	 * @return String A string com o dominio do usuario que realizou a atividade.
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Metodo que retorna o usuario que realizou a atividade.
	 * @return String O usuario que realizou a atividade.
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * Metodo que retorna o equipamento que o usuario realizou a atividade.
	 * @return String O nome do equipamento em que o usuario realizou a atividade.
	 */
	public String getEquipament(){
		return equipament;
	}
	
}





	


