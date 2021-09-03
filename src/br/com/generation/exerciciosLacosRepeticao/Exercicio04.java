package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

/* Programa: Exercicio 04
 * Autor: Patrícia
 * Data: 02/09/2021
 */


//4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto,
//a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: 
public class Exercicio04 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int idade, sexo, caracteristicas;
	int contador = 0;
	int contadorFeminino = 0;
	
	while(contador <= 3) {
	
	System.out.println("Digite sua idade: ");	
	idade = leia.nextInt();
	
	System.out.println("Digite seu sexo (1-Feminino / 2-Masculino / 3-Outros): ");
	sexo = leia.nextInt();
	
	switch (sexo) {
	case 1:
		contadorFeminino++;
		break;

	default:
		break;
	}
		
	}

	}

}
