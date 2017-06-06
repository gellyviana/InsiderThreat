package br.imd.read;

public class Activity {
	private String id;
	private Date date;
	private Date time;
	private String domain;
	private String user;
	
	public Activity(){
		
	}
	public String getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public Date getTime() {
		return time;
	}

	public String getDomain() {
		return domain;
	}

	public String getUser() {
		return user;
	}
	
	
}
/**

String[] textoSeparado = alunoRecebido.split(";\\s");

import java.util.Calendar;

import java.util.Date;



public class Conversao_Datas{

	//public static void main(String[] args) throws ParseException{
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();
		
		Date data2 = f.parse("12/01/1995");
		System.out.println(data2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+sdf.format(data));
		
		//Converte Objetos
		System.out.println(“Data convertida: ”+sdf.parse("02/08/1970"));
	}
//}
 */
