import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe para ler a informação de um arquivo csv e colocar em 
 * um array de String com 5 campos.
 * 
 * Baseado no projeto weblog-analyzer (capítulo 4)
 * Livro Programação orientada a objetos com JAVA
 * David J. Barnes and Michael Kolling (versão 2008.03.30) 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04 */
public class LogfileReader
{
    // The data format in the log file.
    private String format;
    // Where the file's contents are stored in the form
    // of LogEntry objects.
    private ArrayList<LogEntry> entries;
    // An iterator over entries.
    private Iterator<LogEntry> dataIterator;
    
    /**
     * Cria um LogfileReader para fornecer dados de uma arquivo.
     */
    public LogfileReader()
    {
        this("ldap.csv");
    }
    
    /**
     * Cria um LogfileReader que that will supply data
     * from a particular log file. 
     * @param filename The file of log data.
     */
    public LogfileReader(String filename)
    {
        // O formato da linha do arquivo.
        format = "Field1 Field2 Field3 Field4 Field5";
        // Onde será armazenado os campos.
        entries = new ArrayList<LogEntry>();
        
        // Tentar ler o conjunto completo de dados do arquivo.
        boolean dataRead;
        try{
            // Locate the file with respect to the current environment.
            URL fileURL = getClass().getClassLoader().getResource(filename);
            if(fileURL == null) {
                throw new FileNotFoundException(filename);
            }
            Scanner logfile = new Scanner(new File(fileURL.toURI()));
            // Read the data lines until the end of file.
            while(logfile.hasNextLine()) {
                String logline = logfile.nextLine();
                // Break up the line and add it to the list of entries.
                LogEntry entry = new LogEntry(logline);
                entries.add(entry);
            }
            logfile.close();
            dataRead = true;
        }
        catch(FileNotFoundException e) {
            System.out.println("Problem encountered: " + e);
            dataRead = false;
        }
        catch(URISyntaxException e) {
            System.out.println("Problem encountered: " + e);
            dataRead = false;
        }
        // If we couldn't read the log file, use simulated data.
        if(!dataRead) {
            System.out.println("Failed to read the data file: " +
                               filename);
            System.out.println("Using simulated data instead.");
           // createSimulatedData(entries);
        }
        // Sort the entries into ascending order.
        Collections.sort(entries);
        reset();
    }
    
    /**
     * Does the reader have more data to supply?
     * @return true if there is more data available,
     *         false otherwise.
     */
    public boolean hasMoreEntries()
    {
        return dataIterator.hasNext();
    }
    
    /**
     * Analyze the next line from the log file and
     * make it available via a LogEntry object.
     * 
     * @return A LogEntry containing the data from the
     *         next log line.
     */
    public LogEntry nextEntry()
    {
        return dataIterator.next();
    }
    
    /**
     * @return A string explaining the format of the data
     *         in the log file.
     */
    public String getFormat()
    {
        return format;
    }
    
    /**
     * Set up a fresh iterator to provide access to the data.
     * This allows a single file of data to be processed
     * more than once.
     */
    public void reset()
    {
        dataIterator = entries.iterator();
    }

    /**
     * Print the data.
     */    
    public void printData()
    {
        for(LogEntry entry : entries) {
            System.out.println(entry);
        }
    }

    /**
     * Provide a sample of simulated data.
     * NB: To simplify the creation of this data, no
     * days after the 28th of a month are ever generated.
     * @param data Where to store the simulated LogEntry objects.
     */
    //private void createSimulatedData(ArrayList<LogEntry> data)
    //{
        // For each data item (year, month, day, hour, min) the lowest
        // valid value is listed.
      //  int[] lowest = { 2006, 1, 1, 0, 0, };
        // For each data item (year, month, day, hour, min) the range of
        // valid values is listed. (Note the simplification of having
        // only 28 days in any month to avoid generating invalid dates.)
        //int[] range = { 3, 12, 28, 24, 60 };
        // Use a fixed seed to generate the random data, so
        // that the data is reproducable.
        //Random rand = new Random(12345);
        // Build each simulated line in a string buffer.
        //StringBuffer line = new StringBuffer();
        // How many simulated lines we want.
        //int numLines = 100;
        // The number of data values per simulated line.
        //int itemsPerLine = lowest.length;
        //for(int i = 0; i < numLines; i++) {
          //  for(int j = 0; j < itemsPerLine; j++) {
            //    int value = lowest[j]+rand.nextInt(range[j]);
              //  line.append(value);
                //line.append(' ');
            //}
            // Convert the line to a LogEntry.
            //LogEntry entry = new LogEntry(line.toString());
            //data.add(entry);
            //line.setLength(0);
        //}
    //}
    
    //public static void main (String[] args){
    	
    	LogfileReader testeLer = new LogfileReader("device.csv");
    	
    	LogfileReader testeLer1 = new LogfileReader("ldap.csv");
    	//String test = "{S7A7-Y8QZ65MW-8738SAZP},01/04/2010 07:12:31,DTAA/RES0962,PC-3736,Connect";
    	//String test1 = "{G7A8-G1OB94NR-3006NTXH},01/04/2010 07:35:40,DTAA/BJC0569,PC-2588,Connect";
    	//LogEntry entry = new LogEntry(test);
    	//LogEntry entry1 = new LogEntry(test1);
    	//LoglineTokenizer log = new LoglineTokenizer();
		
		//String[] dataLine = new String[5];
		//log.tokenize(test, dataLine);
    	//System.out.println(entry.getId());
    	//System.out.println(entry.getDate());
    	//System.out.println(entry.getUser());
    	//System.out.println(entry.getPc());
    	//System.out.println(entry.getActivity());
    	
    	//System.out.println(entry.compareTo(entry1));
    	//System.out.println(entry.compareTo(entry));
    	
	//}
}


