import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Activity {
	private String id;
	private Date date;
	private Date time;
	private String domain;
	private String user;
	
	public Activity(){
		
	}
	
	public void ConvertDate(String field1){
		String[] dateSepareted = field1.split(" ");
		DateFormat d = DateFormat.getDateTimeInstance();
		Date d1 = d.parse(dateSepareted[0]);
		Date d2 = d.parse(dateSepareted[1]);
		
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
