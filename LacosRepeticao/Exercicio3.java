package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída
		 *  em qual categoria ela se encontra:
		 *  10-14 infantil         15-17 juvenil         18-25 adulto
		 */
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<10 || idade>25) {
			System.out.println("Idade Incorreta!");			
		}
		else if(idade<15) {
			System.out.println("Categoria Infantil");
		}
		else if(idade<18) {
			System.out.println("Categoria Juvenil");
		}
		else {
			System.out.println("Categoria Adulto");
		}


	}

}
