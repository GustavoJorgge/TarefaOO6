package questao2;

public class Funcionario extends Pessoa{
	

	private String departamento;
	private Double salario;
	private String dtaEntrada;
	private String RG;
	private boolean ativo = true;

		
	public Funcionario(String nome, String email, String telefone, String departamento, Double salario,
			String dtaEntrada, String rg) {
		super(nome, email, telefone);
		this.departamento = departamento;
		this.salario = salario;
		this.dtaEntrada = dtaEntrada;
		this.RG = rg;
		this.ativo = true;
	}

	public void bonificar(double aumento) {
		this.salario = this.salario + (this.salario* aumento);
	}
	
	public void demitir () {		
			this.ativo = false;		
	}
	
	void mostrarDados() {
		System.out.printf("Nome: %s\n",nome );
		System.out.printf("RG: %s\n",RG );
		System.out.printf("Email: %s\n",email );
		System.out.printf("Telefone: %s\n",telefone );
		System.out.printf("Departamento: %s\n", departamento );
		System.out.printf("Salario: %.2f\n",salario );
		System.out.printf("Data de Admissao: %s\n",dtaEntrada);
		if(ativo)System.out.printf("Ativo!");
		else System.out.printf("Inativo");
		System.out.printf("\n");
		
		
	}
	
}
