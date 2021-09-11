package br.com.generation.exerciciosPOOHeranca.exercicio01;

public class Cachorro extends Animal{

	public String correr() {
		return "corre";
	}

	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}

	@Override
	public void locomocao() {
		System.out.println("Correndo");
	}
}
