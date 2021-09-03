package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

/* Programa: Exercicio 03
 * Autor: Patr�cia
 * Data: 02/09/2021
 */

//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com 
//menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina
//quando idade for =-99.

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int contadorMenos21 = 0;
		int contadorMais50 = 0;
		
		while( idade != -99) {
			System.out.println("Digite a idade da pessoa: ");
			idade = leia.nextInt();
			
			if(idade < 21) {
				contadorMenos21++;
			}
			else if(idade > 50) {
				contadorMais50++;
			}
		}
		
		System.out.println("O total de pessoas com menos de 21 anos s�o: " + contadorMenos21);
		System.out.println("O total de pessoas com mais de 50 anos s�o: " + contadorMais50);
		
		leia.close();

	}

}
