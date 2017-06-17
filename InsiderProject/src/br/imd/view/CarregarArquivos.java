package br.imd.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CarregarArquivos extends JInternalFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel lDataInicio = new JLabel("Data Inicio: ");
	JLabel lDataFinal = new JLabel("Data Final: ");
	JLabel lIdUsuario = new JLabel("Id Usuário: ");
	
	
	JTextField tDataFim = new JTextField();
	JTextField tDataInicio = new JTextField();
	JTextField tIdUsuario = new JTextField();
	
	
	JButton bBuscar = new JButton("Buscar");
	JButton bLimpar = new JButton("Limpar");
	
	
	public CarregarArquivos(String n){
		
		super(n, false, true);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		lDataInicio.setBounds(10,10,40,30);
		tDataInicio.setBounds(130,10,50,25);
		lDataFinal.setBounds(10,40,100,30);
		tDataFim.setBounds(130,40,100,25);
		lIdUsuario.setBounds(10,70,100,30);
		tIdUsuario.setBounds(130,70,60,25);

		bBuscar.setBounds(10 ,140,100,30);
		bLimpar.setBounds(120,140,100,30);
		
		c.add(lDataInicio);
		c.add(tDataInicio);
		c.add(lDataFinal);
		c.add(tDataFim);
		c.add(lIdUsuario);
		c.add(tIdUsuario);
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
//			
			tDataInicio.setText("");
			tDataFim.setText("");
			tIdUsuario.setText("");
			
//			Banco.inserirFornecedor(f);
		}
		else if(e.getSource() == bLimpar){
			tDataInicio.setText("");
			tDataFim.setText("");
			tIdUsuario.setText("");
		}
		
	}
	

}
