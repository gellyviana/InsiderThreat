package br.imd.master;

import br.imd.view.MainView;
/**
 * Classe Principal que chama o metodo para interface do Usuário.
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.14
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Visualização da tela 
		MainView v = new MainView();
		v.setVisible(true);
		
		//Exemplo para se usar.
//		String [] line1 = {"Gelly", "102", "gellyviana@outlook.com", "ufrn", "nada"};
//		String [] line2 = {"nocbjbvo","01/03/2010 07:35:19", "DTAA/AMA0606","PC-1514", "http://cnet.com"};
//		String [] line3 = {"Marciel", "24", "maciel@outlook.com", "ufrn", "nadica"};
//		String [] line4 = {"M0F6-O2FY64UM-9526UMPP","01/04/2010 08:29:40", "DTAA/RQH0770","PC-4225", "Connect"};
//		String [] line5 = {"Miguel", "145", "miguel@outlook.com", "ufrn", "wherever"};
//		String [] line6 = {"H9W1-X0MC70BT-6065RPAT","01/04/2010 01:28:34", "DTAA/KEE0997","PC-2670", "Logon"};
//		//String [] line7 = {"Miguel", "145", "miguel@outlook.com", "ufrn", "wherever"};
//		String [] line8 = {"H9W1-X0MC70BT-6065RPAT","01/05/2010 01:28:34", "DTAA/KEE0997","PC-2670", "Desconnect"};
//			
//		Activity activity1 = new Http(line2);
//		Activity activity2 = new Device(line4);
//		Activity activity3 = new Logon(line6);
//		Activity activity4 = new Logon(line8);
//		
//		User u1 = new User(line1);
//		User u2 = new User(line3);
//		User u3 = new User(line5);
//		Tree t1 = new Tree(u1, "01/04/2010", "01/04/2010");
//		Tree t2 = new Tree(u2,"01/04/2010", "01/04/2010");
//		Tree t3 = new Tree(u3,"01/04/2010", "01/04/2010");
//		t1.insert(activity1);
//		t2.insert(activity2);
//		t3.insert(activity3);
//		t3.insert(activity4);
//		t1.printTree();
//		t2.printTree();
//		t3.printTree();
	}

}

