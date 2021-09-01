package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma 
		 * pessoa expressa em dias e mostre-a expressa em anos, meses e dias
		 */
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.print("Digite a sua idade em Dias :");
		idadeDias = leia.nextInt();
		
		anos = idadeDias /365;
		meses = (idadeDias % idadeDias) / 30;
		dias = (idadeDias % 365) % 30;
		
		anos = idadeDias / 365;
		System.out.println("Sua idade é igual a: " + anos + " anos");
		
		meses = (idadeDias / 365) % 30;
		System.out.println("Sua idade é igual a: " + meses + " meses");
		
		dias = (idadeDias % 365) % 30;
		System.out.println("Sua idade é igual a: " + dias + " dias");
		
		leia.close();
		
	}

}
