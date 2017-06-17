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
	//Labels 
	JLabel lCodFornecedor = new JLabel("Codigo: ");
	JLabel lNomeFornecedor = new JLabel("Nome Fornecedor: ");
	JLabel lCnpj = new JLabel("CNPJ: ");
	
	//Campos para preencher
	JTextField tCodFornecedor = new JTextField();
	JTextField tNomeFornecedor = new JTextField();
	JTextField tCnpj = new JTextField();
	
	//Buttons
	JButton sub = new JButton("Submeter");
	JButton lim = new JButton("Limpar");
	
	
	public CarregarArquivos(String n){
		
		super(n, false, true);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		lCodFornecedor.setBounds(10,10,40,30);
		tCodFornecedor.setBounds(130,10,50,25);
		lNomeFornecedor.setBounds(10,40,100,30);
		tNomeFornecedor.setBounds(130,40,100,25);
		lCnpj.setBounds(10,70,100,30);
		tCnpj.setBounds(130,70,60,25);

		// idem
		sub.setBounds(10 ,140,100,30);
		lim.setBounds(120,140,100,30);
		
		c.add(lCodFornecedor);
		c.add(tCodFornecedor);
		c.add(lNomeFornecedor);
		c.add(tNomeFornecedor);
		c.add(lCnpj);
		c.add(tCnpj);
		c.add(sub);
		c.add(lim);
		
		
		
		sub.addActionListener(this);
		lim.addActionListener(this);
		
		setSize(350,230);
		setTitle(n);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == sub){
//			CarregarArquivos f = new CarregarArquivos();
//			f.setIdFornecedor(tCodFornecedor.getText());
//			f.setNomeFornecedor(tNomeFornecedor.getText());
//			f.setCnpjFornecedor(tCnpj.getText());
//			
			tCodFornecedor.setText("");
			tNomeFornecedor.setText("");
			tCnpj.setText("");
			
//			Banco.inserirFornecedor(f);
		}
		else if(e.getSource() == lim){
			tCodFornecedor.setText("");
			tNomeFornecedor.setText("");
			tCnpj.setText("");
		}
		
	}
	

}
