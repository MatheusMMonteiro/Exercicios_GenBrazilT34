package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int numero1,numero2,numero3,numeroMaior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		numero1 = leia.nextInt();
		numero2 = leia.nextInt();
		numero3 = leia.nextInt();
		
		
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O número maior é: "+numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O número maior é: "+numero2);
		} 
		else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("O número maior é: "+numero3);
		}		
		leia.close();
	}

}
