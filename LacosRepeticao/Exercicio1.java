package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int numero1,numero2,numero3,numeroMaior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros: ");
		numero1 = leia.nextInt();
		numero2 = leia.nextInt();
		numero3 = leia.nextInt();
		
		
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O n�mero maior �: "+numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O n�mero maior �: "+numero2);
		} 
		else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("O n�mero maior �: "+numero3);
		}		
		leia.close();
	}

}
