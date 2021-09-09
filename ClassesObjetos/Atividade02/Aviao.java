package br.com.generation.exercicios;

public class Aviao {
	
	private String nome = "Aeros";
	private String marca = "GOL";
	private String porte = "Médio";
	private int capacidadePessoas = 40;
	private int anoFabricacao = 2018;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;	
	}
	
	
	
	public void decolar() {
		System.out.println("Decolando..................");
	}
	
}
