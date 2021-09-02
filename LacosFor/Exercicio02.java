package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int cont, num;
		int impar=0, par=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 10 números: ");
		
		for(cont=0;cont<10;cont++) {			
			num = leia.nextInt();			
			
			if(num % 2 ==0) {
				par++; 
			}
			else{
				impar++;
			}			
		}		
		System.out.println(par + "são pares e " +impar+ "são impares");
		

	}

}
