package br.com.generation.exercicios;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console. 
 */
public class TestaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao = new Aviao();				
		
		System.out.println("########Informações do Avião###########");
		
		System.out.println("Nome: " +aviao.getNome());
		System.out.println("Marca: " + aviao.getMarca());
		System.out.println("Porte: "+ aviao.getPorte());
		System.out.println("Capacidade de Pessoas: "+ aviao.getCapacidadePessoas());
		System.out.println("Ano de Fabricação: " + aviao.getAnoFabricacao());
		
		aviao.decolar();
		
	}

}
