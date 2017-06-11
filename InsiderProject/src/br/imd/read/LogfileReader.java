package br.imd.read;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    
    private String logline;
    
    /**
     * Cria um construtor da classe LogfileReader vazio.
     */
    public LogfileReader() {}
    
    /**
     * Cria um LogfileReader que recebe o nome de um arquivo
     * para ser lido, e coloca as linhas em array de String. 
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
        	String caminho = "file:///home/gelly/workspace/InsiderThreat/InsiderProject/log/";
        	//String caminho = "file:///home/adriana/Documentos/TI/Semestre3/LPII/workspace/InsiderThreat/InsiderProject/logs/";
            URL fileURL = new URL(caminho + filename);
            		//getClass().getClassLoader().getResource(filename); //getResouce pega o arquivo na pasta bin
            
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
            System.out.println("Problema encontrado: " + e);
            dataRead = false;
        }
        catch(URISyntaxException e) {
            System.out.println("Problema encontrado: " + e);
            dataRead = false;
        } 
        catch(MalformedURLException e){
        	System.out.println("Deu erro");
        	dataRead = false;
        }
        // If we couldn't read the log file, use simulated data.
        if(!dataRead) {
            System.out.println("Falha na leitura do arquivo: " + filename);
        }
        // Ordena a coleção em ordem crescente.
        Collections.sort(entries);
        reset();
    }
    
     /**
     * Metodo para verificar se existe mais dados para ler
     * @return true se há mais dados para ler
     *         false caso contrario.
     */
    public boolean hasMoreEntries()
    {
        return dataIterator.hasNext();
    }
    
    /**
     * Verifica se há próxima lina do arquivo
     * e se existe retorna um objeto LogEntry.
     * 
     * @return Um LogEntry contendo os dados da 
     *         proxima linha de log.
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
     * Imprime o dado.
     */    
    public void printData()
    {
        for(LogEntry entry : entries) {
            System.out.println(entry);
        }
    }
    
    public ArrayList<LogEntry> getLogEntry(){
    	return entries;
    }
}


