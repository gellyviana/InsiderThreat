package br.imd.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.imd.tree.DateGroup;

public class CarregarArquivos extends JInternalFrame implements ActionListener {

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
		
		
		
		bBuscar.addActionListener(this);
		bLimpar.addActionListener(this);
		
		setSize(350,230);
		setTitle(n);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bBuscar){
//			CarregarArquivos f = new CarregarArquivos();
//			f.setIdFornecedor(tCodFornecedor.getText());
//			f.setNomeFornecedor(tNomeFornecedor.getText());
//			f.setCnpjFornecedor(tCnpj.getText());
			DateGroup dateGroup = new DateGroup(LocalDate.parse(tDataInicio.getText()), LocalDate.parse(tDataFim.getText()));
			tDataInicio.setText("");
			tDataFim.setText("");
			
//			Banco.inserirFornecedor(f);
		}
		else if(e.getSource() == bLimpar){
			tDataInicio.setText("");
			tDataFim.setText("");
		}
		
	}
	

}
