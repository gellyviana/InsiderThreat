package br.imd.read;

import br.imd.tree.TreeCreate;

import br.imd.view.PrimeView;

public class MainLeituraArquivo {

	public static void main(String[] args) {

		/*Maneger maneger = new Maneger();
		
		maneger.readUser("ldap.csv");
		
		maneger.readActivity("device.csv");
		
		maneger.readActivity("logon-sumarizado.csv");
		
		maneger.readActivity("http-sumarizado.csv");*/
	
		PrimeView v = new PrimeView();
		v.start();
		v.setVisible(true);

	}
}
