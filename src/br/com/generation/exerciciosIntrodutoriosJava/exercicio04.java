package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 04
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		real a, b, c, r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a = entradaDados.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entradaDados.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entradaDados.nextDouble();
		
		r = (a + b)Math.pow(2);
		s = (b+c)Math.pow(2);
		d = (r+s) /2;
		
		System.out.println("O resultado da expressão é igual a " + d);
		
		entradaDados.close();
	}

}
