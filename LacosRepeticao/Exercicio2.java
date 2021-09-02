package br.com.generation.exercicios;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Exercicio2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente
		Scanner leia = new Scanner(System.in);
		int numero1,numero2,numero3;
		
		
		System.out.println("Digite 3 números");
		numero1 = leia.nextInt();
		numero2 = leia.nextInt();
		numero3 = leia.nextInt();
		
		int[] array = {numero1,numero2,numero3};
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		leia.close();
	}
	

}