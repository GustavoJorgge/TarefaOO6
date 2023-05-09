package questao3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Edicao {
	private int numero;
	private int volume;
	private String dataEdicao;
	private int tiragem;
	private ArrayList<Artigo> artigos;
	
	public Edicao() {
	}
	
	public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
		super();
		this.numero = numero;
		this.volume = volume;
		this.dataEdicao = dataEdicao;
		this.tiragem = tiragem;
		this.artigos = new ArrayList<>();		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getDataEdicao() {
		return dataEdicao;
	}
	public void setDataEdicao(String dataEdicao) {
		this.dataEdicao = dataEdicao;
	}
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	public ArrayList<Artigo> getArtigos() {
		return artigos;
	}
	public void setArtigos(ArrayList<Artigo> artigos) {
		this.artigos = artigos;
	}
	
	void adicionaArtigos(Artigo artigo) {
		artigos.add(artigo);
	}
	
	public String mostraArtigos() {
		String aux = "";	
		
		try {
			for(int i = 0 ; i < artigos.size() ; i++) {
				aux = aux + " " + artigos.get(i).getTitulo();
			}
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null,"Objeto vazio!" + e);
		}		
		return aux;
	}
}
