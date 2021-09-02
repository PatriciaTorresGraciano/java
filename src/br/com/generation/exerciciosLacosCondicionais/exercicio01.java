package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

/* Programa: Exercicio 01
 * Autor: Patrícia
 * Data: 01/09/2021
 */

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		int numero1, numero2 , numero3, maiorNumero=-999999999;
		
		System.out.println("Digite o valor do número 1: ");
		numero1 = entradaDados.nextInt();
		
		System.out.println("Digite o valor do número 2: ");
		numero2 = entradaDados.nextInt();
		
		System.out.println("Digite o valor do número 3:");
		numero3 = entradaDados.nextInt();
		
		
		if(numero1 > numero2 && numero1 > numero3) {
		    maiorNumero = numero1;
		}
		else if(numero2 > numero3 && numero2 > numero1) {
			maiorNumero = numero2;
		}
		
		else if (numero3 > numero1 && numero3 > numero2) {
			maiorNumero = numero3;
		}
		
		System.out.println("O maior número é " + maiorNumero);
		
		entradaDados.close();
	}

}
