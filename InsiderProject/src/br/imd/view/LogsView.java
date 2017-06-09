package br.imd.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

/**
 * Classe responsável em permitir que o usuário poder grave um arquivo.
 * 
 * Baseado no projeto InterfaceGrafica02 e MyIMD
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04 
 */
public class LogsView extends JInternalFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel lNomeArquivo = new JLabel("Nome do Arquivo");
	
	//Campos para preencher
	JTextField tNomeArquivo = new JTextField();
	String[] nameFiles = {"device.csv", "http-sumarizado", "ldap.csv", "logon-completo.csv", "logon-sumarizado.csv"};
	JList<String> listaFiles = new JList<String>();

	JScrollPane scrollLista = new JScrollPane(listaFiles);
	//Buttons
	JButton salve = new JButton("Salvar");
	JButton exit = new JButton("Sair");
	public LogsView(String nameView){
		super(nameView, false, true);
		start(nameView);
		
	}
	
	public void start(String nameView){
		//super(nameView, false, true);
	
		Container c = this.getContentPane();
		c.setLayout(null);
		
		lNomeArquivo.setBounds(10,100,70,30);
		
		
		salve.setBounds(10 ,140,100,30);
		exit.setBounds(120,140,100,30);
		
		c.add(lNomeArquivo);
		c.add(listaFiles);
		
		salve.addActionListener(this);
		exit.addActionListener(this);
		
		setSize(350,230);
		setTitle(nameView);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}