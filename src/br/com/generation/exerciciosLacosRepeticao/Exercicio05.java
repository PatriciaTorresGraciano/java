package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

/* Programa: Exercicio 05
 * Autor: Patr�cia
 * Data: 02/09/2021
 */

//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
//igual a zero. No final, mostre a soma dos n�meros digitados.

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int numero = -9999;
		int soma = 0;
		
		do {
			System.out.println("Digite um n�mero");
			numero = leia.nextInt();
			
			soma = soma +numero;
			
		} while(numero !=0);
		System.out.println("A soma dos n�meros digitados � igual a " + soma);
		
		leia.close();
	}

}
