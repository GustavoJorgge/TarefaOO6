package questao2;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		String nome,email,telefone,departamento,dtaEntrada,RG;
		Double salario;
				
		Funcionario funcionario1 = new Funcionario("Gustavo","Gustavo@gmail.com","31994603457","Sistemas",3000.0,"12-06-2022","MG2080080");
		Funcionario funcionario2 = new Funcionario("Maria","Maria@gmail.com","3193131157","RH",2500.0,"08-06-2023","MG240500");
		Funcionario[] funcionarios = {funcionario1, funcionario2};
		
		Empresa empresa = new Empresa();
		
		empresa.nome = "voke";
		empresa.cnpj = "552552443";
		empresa.funcionario = funcionarios;
		
		
		try {
			for(Funcionario funcionario : funcionarios) {
				funcionario.mostrarDados();
			}
		}catch(Exception e) {
			System.out.printf("Possui menos que a quantidade maxima!!\n");
			System.out.print(e);
		}
		
		System.out.printf("\nDemitindo\n");
		funcionarios[0].demitir();
		for(Funcionario funcionario : funcionarios) {
			funcionario.mostrarDados();
		}
		
		System.out.printf("\nAumentando salario\n");
		funcionarios[1].bonificar(0.50);
		for(Funcionario funcionario : funcionarios) {
			funcionario.mostrarDados();
		}
		
	}

}
