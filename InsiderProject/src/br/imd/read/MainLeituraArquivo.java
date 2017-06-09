package br.imd.read;

import br.imd.view.PrimeView;

public class MainLeituraArquivo {

	public static void main(String[] args) {

		// Maneger maneger = new Maneger("ldap.csv");

		// LogfileReader logfileReaderDevice = new LogfileReader("ldap.csv");
		// logfileReaderDevice.printData();

		// logfileReaderDevice.LogfileReader("device");
		PrimeView v = new PrimeView();
		v.start();
		v.setVisible(true);

	}
}
