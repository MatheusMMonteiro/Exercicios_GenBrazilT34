package br.com.generation.exercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		quantas foram as ocorr�ncias da maior pontua��o. */
		
		int[] v = new int[10];
		int maior =0;
		int media=0;
		Scanner leia = new Scanner(System.in);
		Random rand = new Random();	
		
		
		for(int i =0; i<10; i++) {
			v[i] = rand.nextInt(9);	
			media += v[i]; 
		}
		Arrays.sort(v);
		for(int i =0; i<5; i++) {
			System.out.print(v[i] + " | ");			
		}
		
		
		
	}

}
