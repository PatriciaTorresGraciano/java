package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

/* Programa: Exercicio 05
 * Autor: Patrícia
 * Data: 02/09/2021
 */

//Crie um programa que leia um número do teclado até que encontre um número 
//igual a zero. No final, mostre a soma dos números digitados.

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int numero = -9999;
		int soma = 0;
		
		do {
			System.out.println("Digite um número");
			numero = leia.nextInt();
			
			soma = soma +numero;
			
		} while(numero !=0);
		System.out.println("A soma dos números digitados é igual a " + soma);
		
		leia.close();
	}

}
