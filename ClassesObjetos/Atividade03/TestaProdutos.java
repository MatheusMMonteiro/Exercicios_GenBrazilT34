package br.com.generation.exercicios;

public class TestaProdutos {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		System.out.println("####Descri��o dos Produtos####");
		
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Descri��o: " + produto.getDescricao());
		System.out.println("Categoria: " + produto.getCategoria());
		System.out.println("Pre�o: "+ produto.getPreco());
		

	}

}
