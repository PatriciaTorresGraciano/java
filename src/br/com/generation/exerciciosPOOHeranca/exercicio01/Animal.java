package br.com.generation.exerciciosPOOHeranca.exercicio01;

public abstract class Animal {

	//Atributos de Animal
	private String nome;
	private int idade;
	public String getNome() {
		return nome;
	}
	
	//Método de Animal
	public abstract void emitirSom();
	public abstract void locomocao();
	
	
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
