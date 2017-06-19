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
 * @version 2017.06.04 
 * */
public class LogfileReader
{
	// O formato dos dados no arquivo de log.
    private String format;
    // Local onde sera armazenado o conteudo do arquivo 
    // na forma de objetos do tipo LogEntry
    private ArrayList<LogEntry> entries;
    // An iterator over entries.
    private Iterator<LogEntry> dataIterator;
    //String que contem a linha do arquivo
    private String logline;
    
    /**
     * Cria um construtor da classe LogfileReader vazio.
     */
    public LogfileReader() {}
    
    /**
     * Construtor que cria  um LogfileReader, recebe o nome de um arquivo
     * para ser lido, e coloca as linhas em array de String. 
     * @param filename O arquivo comos dados do log.
     */
    public LogfileReader(String filename){
    	// O formato da linha do arquivo.
        format = "Field1 Field2 Field3 Field4 Field5";
        // ArrayList que armazenara as linhas do arquivo de log.
        entries = new ArrayList<LogEntry>();
        
        // Tentar ler o conjunto completo de dados do arquivo.
        boolean dataRead;
        try{
            // Locate the file with respect to the current environment.
        	//String caminho = "file:///home/gelly/workspace/InsiderThreat/log/";
        	String caminho = "file:///home/gelly/workspace/InsiderThreat/log/";
            URL fileURL = new URL(caminho + filename);
            
            if(fileURL == null) {
                throw new FileNotFoundException(filename);
            }
            Scanner logfile = new Scanner(new File(fileURL.toURI()));
            // Ler as linhas de dados até nao haver mais linha no arquivo.
            while(logfile.hasNextLine()) {
                logline = logfile.nextLine();
             // Quebra a linha e adiciona no ArrayList entries.
                LogEntry entry = new LogEntry(logline);
                entries.add(entry);
            }
            //Fecha o arquivo apos a leitura.
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
        	System.out.println("Deu erro "+e);
        	dataRead = false;
        }
        // Se nao foi possivel ler o arquivo informa.
        if(!dataRead) {
            System.out.println("Falha na leitura do arquivo: " + filename);
        }
        // Ordena a coleção em ordem crescente.
        Collections.sort(entries);
        reset();
    }
    
    /**
     * Metodo que retornna a linha de log. 
     * @return logline A linha do arquivo
     */
     public String getLogline() {
		return logline;
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
     * Metodo que retorna a proxima lina do arquivo
     * @return Um LogEntry contendo os dados da 
     *         proxima linha de log.
     */
    
    public LogEntry nextEntry()
    {
        return dataIterator.next();
    }
    
    /**
     * Metodo que retorna o formato que esta sendo salvo os dados
     * @return Uma string com o formato dos dados no arquivo de log.
     */
    public String getFormat()
    {
        return format;
    }
    
    /**
     * Metodo 
     * Set up a fresh iterator to provide access to the data.
     * This allows a single file of data to be processed
     * more than once.
     */
    public void reset()
    {
        dataIterator = entries.iterator();
    }

    /**
     * Metodo que imprime uma linha de entries.
     */    
    public void printData()
    {
        for(LogEntry entry : entries) {
            System.out.println(entry);
        }
    }
    
    /**
     * Metodo que retorna o ArrayList de entries.
     * @return O ArrayList de entries
     */
    public ArrayList<LogEntry> getEntries(){
    	return entries;
    }
}


