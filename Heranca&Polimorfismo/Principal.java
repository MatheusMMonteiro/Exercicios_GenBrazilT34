package br.com.generation.exercicios;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
		
		Scanner leia = new Scanner(System.in);
		TestaAnimal objeto = new TestaAnimal();
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		Preguica preguica = new Preguica();
		
		
		System.out.println("Digite o nome do seu cavalo: ");
		cavalo.setNome(leia.nextLine());		
		System.out.println("Digite a idade do seu cavalo: ");
		cavalo.setIdade(leia.nextInt());
		
		System.out.println("Digite o nome do seu cachorro: ");
		cachorro.setNome(leia.nextLine());		
		System.out.println("Digite a idade do seu cachorro: ");
		cachorro.setIdade(leia.nextInt());
		
		System.out.println("Digite o nome da preguiça: ");
		preguica.setNome(leia.nextLine());
		
		System.out.println("Digite a idade da preguiça: ");
		preguica.setIdade(leia.nextInt());
		
		
		
		
		System.out.println("O "+ cavalo.getNome());
		objeto.funcaoAnimal(new Cavalo());
		System.out.println("O "+ cachorro.getNome());
		objeto.funcaoAnimal(new Cachorro());
		System.out.println("A "+ preguica.getNome());
		objeto.funcaoAnimal(new Preguica());
		
		
		leia.close();
	 
	
		
		
	}
}
