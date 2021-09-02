package br.com.generation.exercicio;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,sexo,situacao, numeroPessoas =0;
		int sexoMasculino=0, sexoFemino=0, sexoOutro=0;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0,
		pessoasNervosas40=0, pessoasCalmas18=0;
		
		
		
		Scanner leia = new Scanner(System.in);
		while(numeroPessoas<3) {
			System.out.println("Digite a sua idade :");
			idade = leia.nextInt();
			System.out.println("-----------------------------------------------");
			
			System.out.println("Sexo\n"
					+ "(1) Masculino\n"
					+ "(2) Feminino\n"
					+ "(3) Outro\n"
					+ "Digite o seu sexo: ");				
			sexo = leia.nextInt();	
			System.out.println("-----------------------------------------------");
			System.out.println("Tipo\n"
					+ "(1) Calma\n"
					+ "(2) Nervosa\n"
					+ "(3) Agressiva\n"
					+ "Digite o seu tipo: ");
			situacao = leia.nextInt();
			System.out.println("-----------------------------------------------");
						
			if(sexo==1) {
				sexoMasculino++;				
			}
			else if(sexo==2) {
				sexoFemino++;
			}
			else if(sexo==3) {
				sexoOutro++;
			}
			else {
				System.out.println("Valor inválido");
			}
						
			if(situacao==1) {
				pessoasCalmas++;
				if(idade<18) {
					pessoasCalmas18++;
				}
				if(sexo==3) {
					outrosCalmos++;
				}
			}
			else if(situacao==2) {
				if(sexo==2) {
					mulheresNervosas++;					
				}
				if(idade>40) {
					pessoasNervosas40++;
				}
			}
			else if(situacao==3){				
				if(sexo==1) {
					homensAgressivos++;
				}
			}
			else {
				System.out.println("Numero inválido");
			}
			numeroPessoas++;
		}
		leia.close();
		System.out.print("Pessoas calmas: "+ pessoasCalmas);
		System.out.print("\nMulheres Nervosas: "+ mulheresNervosas);
		System.out.print("\nHomens Agressivos: "+ homensAgressivos);
		System.out.print("\nOutros calmos: "+ outrosCalmos);
		System.out.print("\nPessoas nervosas com mais de 40: "+ pessoasNervosas40);
		System.out.print("\nPessoas calmas com menos de 18: "+ pessoasCalmas18);
		
		
	}

}
