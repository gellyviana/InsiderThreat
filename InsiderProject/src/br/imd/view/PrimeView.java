package br.imd.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;



/**
 * Classe que gera a primeira tela para o usuário poder visualizar e manusear o sistema.
 * 
 * Baseado no projeto InterfaceGrafica02 e MyIMD
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04 
 */
public class PrimeView extends JFrame implements ActionListener{

	/**
	 * Precisamos perguntar pra que serve isso!!!!
	 */
	private static final long serialVersionUID = 1L;

	JDesktopPane dtp = new JDesktopPane();
	
	JMenuBar mnbar   = new JMenuBar();	
	JMenu fileLogs   = new JMenu("Logs");
	JMenu fileRela   = new JMenu("Relatórios");
	JMenu exit = new JMenu("Sair");
	
	public PrimeView(){
		start();
	}
	
	public void start(){
		
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		
		setJMenuBar(mnbar);
		mnbar.add(fileLogs);
		mnbar.add(fileRela);
		mnbar.add(exit);

		
		ct.add(BorderLayout.CENTER, dtp);
		
		setSize(800,600);
		setResizable(false);
		setTitle("Insidser Project");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		exit.addMenuListener(new MenuListener(){
					public void menuSelected(MenuEvent e){
						System.exit(0);
					}

					@Override
					public void menuDeselected(MenuEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void menuCanceled(MenuEvent e) {
						// TODO Auto-generated method stub
						
					}
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(fileLogs)){
			LogsView r = new LogsView("Logs de Usuários");
			r.setVisible(true);
		}
	}

}
