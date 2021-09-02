package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

/* Programa: Exercicio 02
 * Autor: Patrícia
 * Data: 01/09/2021
 */

//Faça um programa que entre com três números e coloque em ordem crescente.
public class exercicio02 {

	public static void main(String[] args) {
	
		Scanner entradaDados = new Scanner(System.in);
		
		int numero1, numero2 , numero3, maiorNumero=-999999999, menorNumero = -999999;
		
		System.out.println("Digite o valor do número 1: ");
		numero1 = entradaDados.nextInt();
		
		System.out.println("Digite o valor do número 2: ");
		numero2 = entradaDados.nextInt();
		
		System.out.println("Digite o valor do número 3:");
		numero3 = entradaDados.nextInt();
		
		
		//Condição para identificar o número maior
		if(numero1 > numero2 && numero1 > numero3) {
		    maiorNumero = numero1;
		}
		else if(numero2 > numero3 && numero2 > numero1) {
			maiorNumero = numero2;
		}
		
		else if (numero3 > numero1 && numero3 > numero2) {
			maiorNumero = numero3;
		}
		
		//Condição para identificar o menor número
		if(numero1 < numero2 && numero1 < numero3) {
		    menorNumero = numero1;
		}
		else if(numero2 < numero3 && numero2 < numero1) {
			menorNumero = numero2;
		}
		
		else if (numero3 < numero1 && numero3 < numero2) {
			menorNumero = numero3;
		}
		
		//Condição para identificar o número do meio
	
		
		System.out.println("A ordem crescente dos números é igual a " + maiorNumero + menorNumero);
		
		entradaDados.close();

	}

}
