/**
 * Armazena a data de uma simples linha do
 * serviço web do arquivo log.
 * Campos individual são disponibilizados através de
 * getHour() e getMinute().
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class LogEntry implements Comparable<LogEntry>{
	//Onde os valores da data de uma simples linha de log 
	//são armazenados
	//private int[] dataValues;
	private String[] fieldValues;
	//Em qual índice em dataValues ​​os diferentes campos
	//de uma linha de registro são armazenados.
	//private static final int YEAR = 0, MONTH = 1, DAY = 2, 
	//					     HOUR = 3, MINUTE = 4;
	private static final int ID = 0, DATE = 1, USER = 2,
					            PC = 3, ACTIVITY = 4;
		
	/**
	 * Decomponhe a linha de log em campos individuais
	 * são disponíveis
	 * @param logline Uma simple linha do log.
	 */
	public LogEntry(String logline){
		// A array que armazena o data da linha simples.
		//dataValues = new int[5];
		fieldValues = new String[5];
		// Separa a linha log.
		LoglineTokenizer tokenizer = new LoglineTokenizer();
		//tokenizer.tokenize(logline, dataValues);
		tokenizer.tokenize(logline, fieldValues);
	}
	
	public String getId(){
		return fieldValues[ID];
	}
	
	public String getDate(){
		return fieldValues[DATE];
	}
	
	public String getUser(){
		return fieldValues[USER];
	}
	
	public String getPc(){
		return fieldValues[PC];
	}
	
	public String getActivity(){
		return fieldValues[ACTIVITY];
	}
	
	/**
	 * Cria uma string com representação da data.
	 * Essa não é necessariamente igual ao texto 
	 * original da linha de log.
	 * @return Uma string representando a data desse entry.
	 */
	//public String toString(){
		//StringBuffer buffer = new StringBuffer();
		//for (int value : dataValues){
			// Coloca um zero nos números de um só digito.
		//	if (value < 10){
		//		buffer.append('0');
		//	}
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
   
}