package br.com.generation.exerciciosLacosRepeticao;

/* Programa: Exercicio 02
 * Autor: Patr�cia
 * Data: 02/09/2021
 */

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. 

import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "� n�mero: ");
			numeros = entrada.nextInt();
	
			if(numeros % 2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}
			
		}

		System.out.println("A quantidade de n�meros pares s�o: " + contadorPar);
		System.out.println("\nA quantidade de n�meros �mpares s�o: " + contadorImpar);
		
		entrada.close();
		
	}

}
