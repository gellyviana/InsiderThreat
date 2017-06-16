package br.imd.master;

import java.util.ArrayList;

import br.imd.factory.Maneger;
import br.imd.tree.Tree;
import br.imd.view.MainView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Maneger maneger = new Maneger();
	    maneger.readUser("ldap.csv");
//		ArrayList<Tree> forest = maneger.getForest();
		//maneger.readUser("ldap.csv");
		
//		maneger.readActivity("device.csv");
		
//		maneger.readActivity("logon-sumarizado.csv");
		
//		maneger.readActivity("http-sumarizado.csv");
	
		//MainView v = new MainView();
		//v.start();
		//v.setVisible(true);

	}

}

