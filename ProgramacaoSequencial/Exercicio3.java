package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*Fa�a um sistema que leia o tempo de dura��o de um evento 
		em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos
		*/
		Scanner leia = new Scanner(System.in);
		
		int segundos, horas, minutos;
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = leia.nextInt();
		
		minutos = segundos /60;
		
		horas = minutos / 60;
		
		System.out.println("O tempo � de " +horas+"h, "+minutos+"min e "+segundos+"s");
		
		leia.close();
	}
}
