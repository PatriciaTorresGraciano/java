package br.com.generation.exerciciosPOOHeranca.exercicio02;

import br.com.generation.exerciciosPOOHeranca.exercicio01.Cachorro;
import br.com.generation.exerciciosPOOHeranca.exercicio01.Cavalo;
import br.com.generation.exerciciosPOOHeranca.exercicio01.Preguica;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorroObjeto = new Cachorro();
		Cavalo cavaloObjeto = new Cavalo();
		Preguica preguicaObjeto = new Preguica();
		
		cachorroObjeto.setNome("Pipoca");
		cachorroObjeto.setIdade(7);
		
	
	

		System.out.println("Nome: " + cachorroObjeto.getNome());
		System.out.println("Idade: " + cachorroObjeto.getIdade() + " anos");
		cachorroObjeto.emitirSom();
		cachorroObjeto.locomocao();
		
		
		
		
		cavaloObjeto.setNome("Sansão");
		cavaloObjeto.setIdade(5);
		
		
		System.out.println("\nNome do cavalo: " + cavaloObjeto.getNome());
		System.out.println("Idade do cavalo: " + cavaloObjeto.getIdade() + " anos");
		cavaloObjeto.emitirSom();
		cavaloObjeto.locomocao();
		
	
		
		preguicaObjeto.setNome("Soninho");
		preguicaObjeto.setIdade(2);
	
		
		System.out.println("\nNome da preguiça: " + preguicaObjeto.getNome());
		System.out.println("Idade da preguiça: " + preguicaObjeto.getIdade());
		preguicaObjeto.emitirSom();
		preguicaObjeto.locomocao();

	}
	
	

}
