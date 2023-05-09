package questao2;

public class Empresa {
	String nome;
	String cnpj;
	int qtde_de_funcionario;
	Funcionario funcionario [] = new Funcionario [100];
	
	void imprimirFuncionarios() {
		for(int i = 0 ; i < funcionario.length ; i++) {
			funcionario[i].mostrarDados();
			System.out.printf("Funcionario %d\n", i+1);
		}
	}
}
