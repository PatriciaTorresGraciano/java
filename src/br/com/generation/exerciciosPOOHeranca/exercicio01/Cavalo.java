package br.com.generation.exerciciosPOOHeranca.exercicio01;

public class Cavalo extends Animal {
 
	public String correr() {
		return "corre";
	}

	@Override
	public void emitirSom() {
		System.out.println("Relinchando");
	}
	
	@Override
	public void locomocao() {
		System.out.println("Correndo");
	}
}
