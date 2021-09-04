package br.com.generation.exercicios;

import java.util.Scanner;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;

b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
* 
*/
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int cont;
		
		System.out.println("Digite os valores");
		for(cont = 0; cont < 6; cont++) {
			for(int conta = 0; cont < 4; cont++) {
				N1[cont][conta] = leia.nextInt();
				N2[cont][conta] = leia.nextInt();				
			}
			
		}
		
	}
}
