package br.imd.master;

import br.imd.factory.Maneger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maneger maneger = new Maneger();
		
		maneger.readUser("ldap.csv");
		
//		maneger.readActivity("device.csv");
		
//		maneger.readActivity("logon-sumarizado.csv");
		
//		maneger.readActivity("http-sumarizado.csv");
	
		//PrimeView v = new PrimeView();
		//v.start();
		//v.setVisible(true);

	}

}

