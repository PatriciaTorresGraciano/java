package br.com.generation.exerciciosPOOHeranca.exercicio01;

public class Preguica extends Animal{

	public String subirArvore() {
		return "sube a árvore";
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de sono");
	}
	
	@Override
	public void locomocao() {
		System.out.println("Subindo em árvore");
	}
}
