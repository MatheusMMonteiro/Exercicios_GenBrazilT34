package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*O custo ao consumidor de um carro novo � a soma do custo 
		 * de f�brica com a percentagem do distribuidor e dos impostos 
		 * (aplicados ao custo de f�brica). Supondo que a percentagem do 
		 * distribuidor seja de 28% e os impostos de 45%, escrever um sistema 
		 * que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
		 */
		
		Scanner leia = new Scanner(System.in);
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de F�brica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.println("Custo ao consumidor: "+ custoConsumidor);
		
		leia.close();

	}

}
