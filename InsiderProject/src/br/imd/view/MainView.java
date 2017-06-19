package br.imd.view;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import br.imd.exception.NullWayException;


/**
 * Classe que gera a primeira tela para o usuário poder visualizar e manusear o
 * sistema.
 * 
 * Baseado no projeto InterfaceGrafica02 e MyIMD e Java2s.com
 * @link http://www.java2s.com/Tutorials/Java/Swing_How_to/JFileChooser/Make_JFileChooser_to_save_file.html
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04
 */
public class MainView extends JFrame implements ActionListener {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JDesktopPane dtp;
	JMenuBar mnbar;
	JMenu fileLogs;
	JMenu fileOpcoes;
	
	JMenuItem fileRela;
	JMenuItem fileCarregar;
	JMenuItem mHelp;
	JMenuItem mSair;
	
	JButton save;

	public MainView() {
		
		dtp = new JDesktopPane();
		mnbar = new JMenuBar();
		fileLogs = new JMenu("Arquivos");
		fileCarregar = new JMenuItem("Carregar Arquivos");
		fileRela = new JMenuItem("Gerar Relatórios");
		fileOpcoes = new JMenu("Opções");
		mHelp = new JMenuItem("Help");
		mSair= new JMenuItem("Sair");
		start();
	}

	public void start() {
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());

		fileLogs.add(fileCarregar);
		fileLogs.add(fileRela);
		
		fileOpcoes.add(mHelp);
		fileOpcoes.add(mSair);
		
		mnbar.add(fileLogs);
		mnbar.add(fileOpcoes);
		setJMenuBar(mnbar);
		
		ct.add(BorderLayout.CENTER, dtp);

		setSize(800, 600);
		setResizable(false);
		setTitle("Insidser Project");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mHelp.addActionListener(this);
		mSair.addActionListener(this);
		fileCarregar.addActionListener(this);
		fileRela.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == mSair) {
				System.exit(0);	
		}else if(e.getSource() == mHelp){
			HelpUser help = new HelpUser("");
			dtp.add(help);
			help.setVisible(true);
		}else if(e.getSource() == fileCarregar){
			CarregarArquivos carregar = new CarregarArquivos("Seleção por Data");
			dtp.add(carregar);
			carregar.setVisible(true);
		}
	}

	private void openTree() throws NullWayException {
		//FileTree ft = new FileTree(salveFile());
	}
	
	/**
	 * Classe responsável em projetar os possíveis caminhos para buscar dos 
	 * arquivos de Logs.
	 */
		public File salveFile() throws NullWayException{
			JFileChooser fileChooser = new JFileChooser();
			int value = fileChooser.showSaveDialog(save);
			File file, way = null;
			
			if(value == JFileChooser.APPROVE_OPTION) {
				file = fileChooser.getSelectedFile();
				way = new File("file:" + file);
				System.out.println(way);
				if(way == null){
					throw new NullWayException("Caminho não encontrado");
				}
				return way;
			}
			return way;			
		}

}
