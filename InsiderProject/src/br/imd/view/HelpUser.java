package br.imd.view;

import java.awt.Container;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * Classe como guia de ajuda para usuario do sistema.
 * 
 * Baseado no projeto MyIMD 
 * @author Adriana Azevedo e Gelly Viana
 * @version 2017.06.04
 */
public class HelpUser extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel titulo = new JLabel("Guia para Usuário");
	JTextArea information = new JTextArea();
	
	public HelpUser(String n){
		super(n, false, true);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		setSize(600,400);
		setTitle(n);
		
		titulo.setBounds(220, 20, 150, 30);
		information.setBounds(10, 60, 500, 400);
		
		c.add(titulo);
		c.add(information);
		
		information.append("****************************************************************************"+ "\n");
		information.append( "\n");
		information.append("Para utilizar o sistema é necessario:" + "\n");
		information.append( "\n");
		information.append("1.0 Para carregar as informaçẽos com o Logs de usuario, clique: " + "\n");
		information.append("1.1 Carregar Arquivos"+ "\n");
		information.append("1.2 Inserir a data para buscar por usuarios no formato:DD/MM/AAAA " + "\n");
		information.append("1.3 Sendo uma data Inicial e Final."+ "\n");
		information.append("1.4 Caso erro de digitação clique limpar" + "\n");
		information.append( "\n");
		information.append("2.0 Para gerar arquivo de clique em gerar arquivo" + "\n");
		information.append( "\n");
		information.append("3.0 Para sair da aplicação clique na aba Opções e depois clique sair"+ "\n");
		information.append( "\n");
		information.append("****Caso de dúvidas em que este guia não resolva procure o suporte." + "\n"); 
		information.append("\n");
	}
		
}