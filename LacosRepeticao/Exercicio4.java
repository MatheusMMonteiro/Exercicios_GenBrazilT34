package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	/*Faça um programa em que permita a entrada de um número
	 *  qualquer e exiba se este número é par ou ímpar. 
	 *  Se for par exiba também a raiz quadrada do mesmo; 
	 *  se for ímpar exiba o número elevado ao quadrado.
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		
		if(num %2 ==0) {
			System.out.println("Par............");			
			System.out.println("Raiz quadrada: "+ Math.sqrt(num));
		}
		else {
			System.out.println("Impar............");			
			System.out.println("Raiz quadrada: "+ Math.pow(num,2));
		}
		
	

		

	}

}
