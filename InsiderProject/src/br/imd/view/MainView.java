package br.imd.view;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

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

	//
	JDesktopPane dtp;
	JMenuBar mnbar;
	JMenu fileLogs;
	JMenu fileRela;
	JMenu exit;
	
	
	JMenuItem mDevice;
	JMenuItem mLdap;
	JMenuItem mHttps;
	JMenuItem mHttpc;
	JMenuItem mLogon;

	//JTextArea textArea;
	JButton save;

	public MainView() {
		dtp = new JDesktopPane();
		mnbar = new JMenuBar();
		fileLogs = new JMenu("Logs");
		fileRela = new JMenu("Relatórios");
		exit = new JMenu("Sair");
		mDevice = new JMenuItem("Device");
		mLdap = new JMenuItem("LDAP");
		mHttps = new JMenuItem("Http- Sumarizado");
		mHttpc = new JMenuItem("Http- Completo");
		mHttpc = new JMenuItem("Http- Completo");
		mLogon = new JMenuItem("Logon");

	}

	public void start() {
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());

		//mDevice.addActionListener(e -> salveFile());
		fileLogs.add(mDevice);
		fileLogs.add(mLdap);
		fileLogs.add(mHttps);
		fileLogs.add(mHttpc);
		fileLogs.add(mLogon);

		mnbar.add(fileLogs);
		mnbar.add(fileRela);
		mnbar.add(exit);
		setJMenuBar(mnbar);
		
		ct.add(BorderLayout.CENTER, dtp);

		setSize(800, 600);
		setResizable(false);
		setTitle("Insidser Project");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		exit.addMenuListener(new MenuListener() {
			public void menuSelected(MenuEvent e) {
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
		
		mDevice.addActionListener(this);
		mLdap.addActionListener(this);
		mHttps.addActionListener(this);
		mHttpc.addActionListener(this);
		mLogon.addActionListener(this);

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

	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals(mDevice)) {
			try {
				salveFile();
			} catch (NullWayException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		} else if (e.getActionCommand().equals(mLdap)) {
			try {
				salveFile();
			} catch (NullWayException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getActionCommand().equals(mHttps)) {
			try {
				salveFile();
			} catch (NullWayException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getActionCommand().equals(mHttpc)) {
			try {
				salveFile();
			} catch (NullWayException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			try {
				salveFile();
			} catch (NullWayException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			
	}

	private void openTree() throws NullWayException {
		FileTree ft = new FileTree(salveFile());
	}

}
