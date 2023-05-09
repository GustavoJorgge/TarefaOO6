package questao1;

import java.util.ArrayList;

public class RedeSocial {
	private String dataCriacao;
	private String nomeUsuario;
	private String dataNascimento;
	private String senha;
	public static double contadorPublicacao = 0;
	ArrayList<Publicacao> publicacoes = new ArrayList<>();
	
	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		contadorPublicacao++;
	}

	
	void inserePublicacao (Publicacao publi) {
		publicacoes.add(publi);
	}
	
	void imprimePublicacao () {
		System.out.printf("Quantidade de publicacoes: %.2f\n", Publicacao.getContadorPublicacao());
		for( int i = 0 ; i < publicacoes.size() ; i++ ) {
			System.out.printf("Data da publicacao: %s\n", publicacoes.get(i).getDataPublicacao());
			System.out.printf("Descricao: %s\n", publicacoes.get(i).getTextoPublicacao());
		}
	}
	
}
