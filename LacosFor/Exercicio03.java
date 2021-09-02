package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int idade =0, total21 =0, total50=0;
		Scanner leia = new Scanner(System.in);
		while(idade!=-99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade <1) {
				System.out.println("Idade Incorreta!\n");
			}
			else if(idade <21) {
				total21++;
			}
			else if (idade > 50) {
				total50++;
			}
						
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+ total21);
		System.out.println("Total de pessoas com mais de 50 anos: "+ total50);
		
		
	}
}
