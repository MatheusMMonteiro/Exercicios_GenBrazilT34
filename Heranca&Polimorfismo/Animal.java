package br.com.generation.exercicios;

public abstract class Animal {	
	
	public abstract void acao(); 
	public abstract void emitirSom();
	
	
	String nome;
	int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	} 
	
	
	
	
}
