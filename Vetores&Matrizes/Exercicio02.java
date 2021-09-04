package br.com.generation.exercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação. */
		
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
