package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente
		 */
		double nota1, nota2, nota3, mediaPonderada;
		double peso1 = 2.0, peso2 = 3.0, peso3 =5.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		mediaPonderada = (nota1*peso1+nota2*peso2+nota3+peso3) / (peso1+peso2+peso3);
		
		System.out.println("Sua média é " +mediaPonderada);
	}
}
