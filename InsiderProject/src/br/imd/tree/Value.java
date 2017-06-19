package br.imd.tree;

/**
 * Classe criada para um tipo unico que sera
 * utilizado na geracao do No da arvore. Esse 
 * valor pode ser de 4 tipos: usuario, agrupamento
 * de data, equipamento e atividade. 
 *   
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public abstract class Value {
	
	private int hourActivity;

	/**
	 * Metodo para retornar a hora da atividade.
	 * @return hourActivity
	 */
	public int getHourActivity() {
		return hourActivity;
	}
	/**
	 * Metodo para setar a hora da atividade.
	 * @param hourActivity
	 */
	public void setHourActivity(int hourActivity) {
		this.hourActivity = hourActivity;
	}
}
