package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */
		
		int[] v = new int[5];
		int maior =0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 5 valores:");
		
		for(int i =0; i<5; i++) {
			
			v[i] = leia.nextInt();
			if(maior < v[i]) {
				maior = v[i];
			}
		}
		for(int i =0; i<5; i++) {
			System.out.print(v[i] + " | ");
		}
		System.out.println("\nMaior Pontua��o: "+ maior);
		

	}

}
