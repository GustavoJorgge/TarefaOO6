package questao1;

public class Publicacao {
	private String dataPublicacao,textoPublicacao, linkMidia;
	public static double contadorPublicacao = 0;
	
	public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.textoPublicacao = textoPublicacao;
		this.linkMidia = linkMidia;
		contadorPublicacao++;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getTextoPublicacao() {
		return textoPublicacao;
	}

	public void setTextoPublicacao(String textoPublicacao) {
		this.textoPublicacao = textoPublicacao;
	}

	public String getLinkMidia() {
		return linkMidia;
	}

	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}
	
	public static double getContadorPublicacao() {
		return contadorPublicacao;
	}
	
	
	
	
}
