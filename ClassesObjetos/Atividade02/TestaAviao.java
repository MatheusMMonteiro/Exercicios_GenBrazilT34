package br.com.generation.exercicios;
/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. 
 */
public class TestaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao = new Aviao();				
		
		System.out.println("########Informa��es do Avi�o###########");
		
		System.out.println("Nome: " +aviao.getNome());
		System.out.println("Marca: " + aviao.getMarca());
		System.out.println("Porte: "+ aviao.getPorte());
		System.out.println("Capacidade de Pessoas: "+ aviao.getCapacidadePessoas());
		System.out.println("Ano de Fabrica��o: " + aviao.getAnoFabricacao());
		
		aviao.decolar();
		
	}

}
