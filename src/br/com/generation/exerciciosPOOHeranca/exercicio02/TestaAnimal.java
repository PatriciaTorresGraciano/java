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
		cachorroObjeto.setSom("latido");

		System.out.println("Nome do cachorro: " + cachorroObjeto.getNome());
		System.out.println("Idade do cachorro: " + cachorroObjeto.getIdade() + " anos");
		System.out.println("Som do cachorro: " + cachorroObjeto.emitirSom(cachorroObjeto.getSom()));
		System.out.println("O " + cachorroObjeto.getNome() + " " + cachorroObjeto.correr());
		
		cavaloObjeto.setNome("Sansão");
		cavaloObjeto.setIdade(5);
		cavaloObjeto.setSom("Relincha");
		
		System.out.println("\nNome do cavalo: " + cavaloObjeto.getNome());
		System.out.println("Idade do cavalo: " + cavaloObjeto.getIdade() + " anos");
		System.out.println("Som do cavalo: " + cavaloObjeto.emitirSom(cavaloObjeto.getSom()));
		System.out.println("O " + cavaloObjeto.getNome() + " " + cavaloObjeto.correr());
		
		preguicaObjeto.setNome("Soninho");
		preguicaObjeto.setIdade(2);
		preguicaObjeto.setSom("zzzz");
		
		System.out.println("\nNome da preguiça: " + preguicaObjeto.getNome());
		System.out.println("Idade da preguiça: " + preguicaObjeto.getIdade());
		System.out.println("Som da preguiça: " + preguicaObjeto.emitirSom(preguicaObjeto.getSom()));
		System.out.println("A preguiça: " + preguicaObjeto.getNome() + " " + preguicaObjeto.subirArvore());
		
		
		
		
		
	}
	
	

}
