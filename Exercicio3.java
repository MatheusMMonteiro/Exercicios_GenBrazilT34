package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duração de um evento 
		em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos
		*/
		Scanner leia = new Scanner(System.in);
		
		int segundos, horas, minutos;
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = leia.nextInt();
		
		minutos = segundos /60;
		
		horas = minutos / 60;
		
		System.out.println("O tempo é de " +horas+"h, "+minutos+"min e "+segundos+"s");
		
		leia.close();
	}
}
