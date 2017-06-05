import java.util.Scanner;

/**
 * Separa os campos de uma linha de arquivo, através
 * da utilização de um token
 * 
 * Baseado no projeto weblog-analyzer (capítulo 4)
 * Livro Programação orientada a objetos com JAVA
 * David J. Barnes and Michael Kolling (versão 2008.03.30) 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04
 */
public class LoglineTokenizer {

	/**
	 * Construtor da classe LoglineTokenizer
	 */
	public LoglineTokenizer(){}
	
	/**
	 * Método tokenize coloca em cada posiçao de
	 * de um array os campos da linha do arquivo.
	 * @param logline A linha que vai sofrer o token
	 * @param dataLina Array onde será armazenar os campos
	 */
	public void tokenize(String logline, String[] dataLine){
		// Scan o logline de String, utilizando o separador dos campos (",").
		Scanner tokenizer = new Scanner(logline).useDelimiter(",");
		try {
			for (int i = 0; i < dataLine.length; i++){
				dataLine[i] = tokenizer.next();
				System.out.println(dataLine[i] + " Campo " + i);
			}
		}
		catch(java.util.NoSuchElementException e){
			System.out.println("Insuffient data items on log line: " + logline);
			throw e;
		}
		finally{
			//Esse não é a maneira de fechar???
			tokenizer.close();
		}
	}
	
}




