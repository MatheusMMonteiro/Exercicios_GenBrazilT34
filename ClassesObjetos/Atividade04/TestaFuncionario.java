package br.com.generation.exercicios;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		System.out.println("####Dados do funcion�rio####");
		
		
		System.out.println("Nome: "+func.getNome());
		System.out.println("Profiss�o: " + func.getProfissao() +" "+ func.getNivel());
		System.out.println("Sal�rio: " + func.getSalario());
		System.out.println("Tempo de empresa: " + func.getTempoEmpresa() + " anos");
		
		
		
	}

}
