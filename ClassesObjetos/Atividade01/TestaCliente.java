package br.com.generation.exercicios;
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		
		cli1.setNome("Julio");
		cli1.setCpf("123.322.454-11");
		cli1.setEmail("julio@gmail.com");
		cli1.setEndereco("Rua dos Atibais, 121");
		cli1.setIdade(23);
		
		System.out.println("Nome do cliente: " + cli1.getNome());
		System.out.println("Idade do cliente: " + cli1.getIdade());
	}

}
