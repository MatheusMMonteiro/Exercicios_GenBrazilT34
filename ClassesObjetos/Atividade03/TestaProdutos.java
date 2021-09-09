package br.com.generation.exercicios;

public class TestaProdutos {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		System.out.println("####Descrição dos Produtos####");
		
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Preço: "+ produto.getPreco());
		

	}

}
