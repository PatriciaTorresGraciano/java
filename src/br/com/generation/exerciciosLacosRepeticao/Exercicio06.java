package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

/* Programa: Exercicio 06
 * Autor: Patrícia
 * Data: 02/09/2021
 */

//Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int numero = -9999;
		int soma = 0;
		double media = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			
			if(numero % 3 ==0) {
				contador++;
				soma = soma +numero;
				
			}
		
		} while(numero !=0);
		
		media = soma / (contador-1);
		
		System.out.println("A média dos multiplos de 3 é igual a " + media);
		
		leia.close();

	}

}
