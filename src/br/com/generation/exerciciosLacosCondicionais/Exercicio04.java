package br.com.generation.exerciciosLacosCondicionais;

/*Programa: Exercicio 04
 * Autor: Patrícia
 * Data: 01/09/2021
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("O número é Par");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada é: " + raiz);
		}
		else if(num % 2 == 1) {
			System.out.println("O número é Ímpar");
			potencia = Math.pow(num, 2);
			
			System.out.println("A Potência é: " + potencia);
			}
		
		leia.close();
		}
	

	}


