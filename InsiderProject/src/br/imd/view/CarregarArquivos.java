package br.imd.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.imd.factory.Maneger;
import br.imd.tree.DateGroup;

public class CarregarArquivos extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel lDataInicio = new JLabel("Data Início:");
	JLabel lDataFinal = new JLabel("Data Final:");

	JTextField tDataFim = new JTextField();
	JTextField tDataInicio = new JTextField();
	
	JButton bBuscar = new JButton("Buscar");
	JButton bLimpar = new JButton("Limpar");
	
	
	public CarregarArquivos(String n){
		
		super(n, false, true);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		lDataInicio.setBounds(10,10,100,30);
		tDataInicio.setBounds(130,10,100,25);
		lDataFinal.setBounds(10,60,100,30);
		tDataFim.setBounds(130,60,100,25);
		

		bBuscar.setBounds(40 ,140,100,30);
		bLimpar.setBounds(200,140,100,30);
		
		c.add(lDataInicio);
		c.add(tDataInicio);
		c.add(lDataFinal);
		c.add(tDataFim);
		c.add(bBuscar);
		c.add(bLimpar);
		
		bBuscar.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
            	
    			Maneger maneger = new Maneger();
    			maneger.readUser("ldap.csv", tDataInicio.getText(), tDataFim.getText());
    			tDataInicio.setText("");
    			tDataFim.setText("");
            }});
		
		bLimpar.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
            	tDataInicio.setText("");
    			tDataFim.setText("");
    		}});
		
		setSize(350,230);
		setTitle(n);
	}
}
