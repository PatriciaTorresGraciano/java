package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

/* Programa: Exercicio 02
 * Autor: Patr�cia
 * Data: 01/09/2021
 */

//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
public class exercicio02 {

	public static void main(String[] args) {
	
		Scanner entradaDados = new Scanner(System.in);
		
		int numero1, numero2 , numero3, maiorNumero=-999999999, menorNumero = -999999;
		
		System.out.println("Digite o valor do n�mero 1: ");
		numero1 = entradaDados.nextInt();
		
		System.out.println("Digite o valor do n�mero 2: ");
		numero2 = entradaDados.nextInt();
		
		System.out.println("Digite o valor do n�mero 3:");
		numero3 = entradaDados.nextInt();
		
		
		//Condi��o para identificar o n�mero maior
		if(numero1 > numero2 && numero1 > numero3) {
		    maiorNumero = numero1;
		}
		else if(numero2 > numero3 && numero2 > numero1) {
			maiorNumero = numero2;
		}
		
		else if (numero3 > numero1 && numero3 > numero2) {
			maiorNumero = numero3;
		}
		
		//Condi��o para identificar o menor n�mero
		if(numero1 < numero2 && numero1 < numero3) {
		    menorNumero = numero1;
		}
		else if(numero2 < numero3 && numero2 < numero1) {
			menorNumero = numero2;
		}
		
		else if (numero3 < numero1 && numero3 < numero2) {
			menorNumero = numero3;
		}
		
		//Condi��o para identificar o n�mero do meio
	
		
		System.out.println("A ordem crescente dos n�meros � igual a " + maiorNumero + menorNumero);
		
		entradaDados.close();

	}

}
