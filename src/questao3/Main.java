package questao3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[]args) {
		
		ArrayList<Artigo> artigos = new ArrayList <Artigo>();
		Edicao edicao = new Edicao();
		RevistaCientifica revista = new RevistaCientifica();
		
		try {
			for(int i = 0 ; i < 1 ; i++) {
				String nome = JOptionPane.showInputDialog("Entre com o titulo do Artigo");
				String resumo = JOptionPane.showInputDialog("Faça um resumo:");
				String autores = JOptionPane.showInputDialog("Entre com o autor:");
				Artigo aux = new Artigo(nome,resumo,autores);
				artigos.add(aux);
			}
			
			edicao.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da edicao:")));
			edicao.setVolume(Integer.parseInt(JOptionPane.showInputDialog("Entre com o volume:")));
			edicao.setDataEdicao(JOptionPane.showInputDialog("Data:"));
			edicao.setTiragem(5);
			
			for(int i = 0 ; i < artigos.size(); i++ ) {
				edicao.adicionaArtigos(artigos.get(i));
			}
			
			revista.setTitulo(JOptionPane.showInputDialog("Entre com o nome da Revista:"));
			revista.setIssn(Long.parseLong(JOptionPane.showInputDialog("Entre com o ISSN:")));
			revista.setPeridiocidade(JOptionPane.showInputDialog("Entre com a Peridiocidade:"));
			revista.setEdicoes(edicao);
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Erro!!\n" + e ,"ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null,"REVISTA\n" + "Titulo: " + revista.getTitulo() + "\nISSN:" + revista.getIssn() + "\n Periodicidade " + revista.getPeridiocidade() + "\n Edicao:" + revista.getEdicoes() ,"Revista", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"EDICAO\n" + "Numero: " + edicao.getNumero() + "\nVolume:" + edicao.getVolume() + "\n Data:" + edicao.getDataEdicao() + "\nTiragem:" + edicao.getTiragem() + "\n Titulos:" + edicao.mostraArtigos(), "Edicao" , JOptionPane.INFORMATION_MESSAGE);
		
		String aux = "";
		for(int i = 0 ; i < artigos.size() ; i++) {
			aux = aux + " " + artigos.get(i).getTitulo();
		}
		
		JOptionPane.showMessageDialog(null, "ARTIGOS\n" + aux, "ARTIGOS", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
