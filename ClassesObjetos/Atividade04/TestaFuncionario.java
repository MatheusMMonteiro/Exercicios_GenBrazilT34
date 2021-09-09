package br.com.generation.exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		System.out.println("####Dados do funcionário####");
		
		
		System.out.println("Nome: "+func.getNome());
		System.out.println("Profissão: " + func.getProfissao() +" "+ func.getNivel());
		System.out.println("Salário: " + func.getSalario());
		System.out.println("Tempo de empresa: " + func.getTempoEmpresa() + " anos");
		
		
		
	}

}
