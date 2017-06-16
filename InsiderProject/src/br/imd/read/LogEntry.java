package br.imd.read;

/**
 * Armazena os campos de linha de um arquivo csv num 
 * array.
 * Os campos individuais são disponibilizados através de
 * 05 métodos gets.
 * 
 * Baseado no projeto weblog-analyzer (capítulo 4)
 * Livro Programação orientada a objetos com JAVA
 * David J. Barnes and Michael Kolling (versão 2008.03.30) 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04 */
public class LogEntry implements Comparable<LogEntry>{
	//Onde os valores dos campos de uma simples linha de 
	//um arquivo csv são armazenados
	private String[] fieldValues;
	//Em qual índice no array (fielValues) ​​os diferentes campos
	//de uma linha de registro são armazenados.
	private static final int FIELD1 = 0, FIELD2 = 1, FIELD3 = 2,
					            FIELD4 = 3, FIELD5 = 4;
		
	public LogEntry() {}
	
	/**
	 * Construtor que decomponhe a linha de registro em campos
	 * individuais colocando em um array o conteudo dos arquivos csv
	 * @param logline Uma simple linha do log.
	 */
	public LogEntry(String logline){
		// Um array que armazena os campos de uma linha do arquivo.
		fieldValues = new String[5];
		// Separa a linha do arquivo.
		LoglineTokenizer tokenizer = new LoglineTokenizer();
		tokenizer.tokenize(logline, fieldValues);
	}
	
	/**
	 * Método que retorna a string do campo1
	 * @return String   A String que tem no campo1 
	 */
	public String getField1(){
		return fieldValues[FIELD1];
	}
	
	/**
	 * Método que retorna a string do campo2
	 * @return String   A String que tem no campo2 
	 */
	public String getField2(){
		return fieldValues[FIELD2];
	}
	
	/**
	 * Método que retorna a string do campo3
	 * @return String   A String que tem no campo3 
	 */
	public String getField3(){
		return fieldValues[FIELD3];
	}
	
	/**
	 * Método que retorna a string do campo4
	 * @return String   A String que tem no campo4 
	 */
	public String getField4(){
		return fieldValues[FIELD4];
	}
	
	/**
	 * Método que retorna a string do campo5
	 * @return String   A String que tem no campo5 
	 */
	public String getField5(){
		return fieldValues[FIELD5];
	}
	
	public String[] getFields(){
		return fieldValues;
	}
	
	/**
	 * Cria uma string com representação da data.
	 * Essa não é necessariamente igual ao texto 
	 * original da linha de log.
	 * @return Uma string representando a data desse entry.
	 */
	//public String toString(){
		//StringBuffer buffer = new StringBuffer();
		//for (int value : fieldValues){
		//	buffer.append(value);
		//	buffer.append(' ');
		//}
		// Pula qualquer espaço final
		//return buffer.toString().trim();
	//}
    /**
     * Compare the date/time combination of this log entry
     * with another.
     * @param otherEntry The other entry to compare against.
     * @return A negative value if this entry comes before the other.
     *         A positive value if this entry comes after the other.
     *         Zero if the entries are the same.
     */
    public int compareTo(LogEntry otherEntry)
    {
      if(otherEntry == this) {
         // They are the same object.
    	  return 0;
      }else {
            // Compare corresponding fields.
    	  //for(int i = 0; i < dataValues.length; i++) {
           //     int difference = dataValues[i] - otherEntry.dataValues[i];
             //   if(difference != 0) {
               //     return difference;
                //}
            //}
    	  for(int i = 0; i < fieldValues.length; i++){
    	  	  if (fieldValues[i] != otherEntry.fieldValues[i] ){
    	  		  return 1;  
    		  }else{
    			  return 0;
    		  }  
    	  }
            // No value is different, so the two entries represent
            // identical times.
            //return 0;
        //}
    //}
      }
      return 0;
   }
    /**
     * Metodo retorna uma string com todos os campos criados
     * @return String Que contem todos os campos criados
     */
    public String toString(){
    	return this.getField1()+this.getField2()+this.getField3()+this.getField4()+this.getField5();
    }
   
}