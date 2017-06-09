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

/**
 * Classe que gera a primeira tela para o usuário poder visualizar e manusear o
 * sistema.
 * 
 * Baseado no projeto InterfaceGrafica02 e MyIMD e Java2s.com
 * @link http://www.java2s.com/Tutorials/Java/Swing_How_to/JFileChooser/Make_JFileChooser_to_save_file.html
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04
 */
public class PrimeView extends JFrame implements ActionListener {

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

	JTextArea textArea;
	JButton save;

	public PrimeView() {
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
	public void salveFile() {
		JFileChooser fileChooser = new JFileChooser();
		int retval = fileChooser.showSaveDialog(save);
		if (retval == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			System.out.println("Aqui" + file);
			if (file == null) {
				return;
			}
			if (!file.getName().toLowerCase().endsWith(".txt")) {
				file = new File(file.getParentFile(), file.getName() + ".txt");
			}
			try {
				textArea.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
				Desktop.getDesktop().open(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals(mDevice)) {
			salveFile();
		} else if (e.getActionCommand().equals(mLdap)) {
			salveFile();
		} else if (e.getActionCommand().equals(mHttps)) {
			salveFile();
		} else if (e.getActionCommand().equals(mHttpc)) {
			salveFile();
		} else {
			salveFile();
		}
			
	}



}
