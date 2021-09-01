package ExerciciosProgramacaoSequencial;

import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		/* Escreva  um sistema que leia três números 
		 * inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		 D = (R+S)/2 onde R = (A+B)^2 e S =(B+C)^2
		 */
		Scanner leia = new Scanner(System.in);

		int D,R,S,A,B,C;
		
		System.out.println("Digite os números");
		
		System.out.print("A: ");
		A =leia.nextInt();
		
		System.out.print("B: ");
		B = leia.nextInt();
		
		System.out.print("C: ");
		C = leia.nextInt();
		
		
		R = (int) Math.pow(A+ B,2);
		
		S = (int) Math.pow(B+ C, 2);
		
		
		D = (R + S) /2;
		
		System.out.println("R = ("+A+"+"+B+")^2 = "+ R);
		System.out.println("S = ("+B+"+"+C+")^2 = "+S);
		System.out.println("D = ("+R+"+"+S+") / 2 = " +D);
		
		leia.close();
		
		
	}

}
