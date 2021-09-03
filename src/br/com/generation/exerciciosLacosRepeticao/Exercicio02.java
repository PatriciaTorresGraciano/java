package br.com.generation.exerciciosLacosRepeticao;

/* Programa: Exercicio 02
 * Autor: Patrícia
 * Data: 02/09/2021
 */

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. 

import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			numeros = entrada.nextInt();
	
			if(numeros % 2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}
			
		}

		System.out.println("A quantidade de números pares são: " + contadorPar);
		System.out.println("\nA quantidade de números ímpares são: " + contadorImpar);
		
		entrada.close();
		
	}

}
