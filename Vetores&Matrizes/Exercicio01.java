package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
		
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
		System.out.println("\nMaior Pontuação: "+ maior);
		

	}

}
