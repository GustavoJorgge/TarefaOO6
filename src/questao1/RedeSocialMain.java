package questao1;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

public class RedeSocialMain {
	public static void main(String[]args) {
		String dataCriacao,nomeUsuario,dataNascimento,senha;
		String dataPublicacao, textoPublicacao, linkMidia;
		int opc = 0;
		
		dataCriacao = JOptionPane.showInputDialog("Entre com o nome do usuario");
		nomeUsuario = JOptionPane.showInputDialog("Entre com a data de criacao");
		dataNascimento = JOptionPane.showInputDialog("Entre com a data de Nascimento");
		senha = JOptionPane.showInputDialog("Entre com a senha");
		
		RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);
		
		ArrayList publi = new ArrayList<>();
		Publicacao publi1;
			
		for(int i = 0 ; i < 3 ; i++) {
			dataPublicacao = JOptionPane.showInputDialog("Entre com a data da publicacao");
			textoPublicacao = JOptionPane.showInputDialog("Entre com uma descricao:");
			linkMidia = JOptionPane.showInputDialog("Entre com o link:");
			
			publi1 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
			publi.add(publi1);
			redeSocial.inserePublicacao(publi1);
		}
		redeSocial.imprimePublicacao();
		
	}
}
