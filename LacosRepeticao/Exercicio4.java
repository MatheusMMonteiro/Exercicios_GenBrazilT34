package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	/*Fa�a um programa em que permita a entrada de um n�mero
	 *  qualquer e exiba se este n�mero � par ou �mpar. 
	 *  Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 *  se for �mpar exiba o n�mero elevado ao quadrado.
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero inteiro: ");
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
