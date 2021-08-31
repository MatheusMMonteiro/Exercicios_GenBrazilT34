package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos,
		 *  meses e dias e mostre-a expressa apenas em dias. 
		 *  
		 *  Calculo dias = anos*diasAno + meses*diasMes +dias
		*/	
		Scanner leia = new Scanner(System.in);
		int diasAno = 365, diasMes = 30;
		int dias, meses, anos;
		
		System.out.print("Informe sua idade em \nAnos: ");
		anos = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Dias: ");
		dias = leia.nextInt();
		
		dias = (anos*diasAno) + (meses*diasMes) + dias;
		
		System.out.print("Sua idade em dias é: " + dias);
		leia.close();
	}

}
