package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 07
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*c) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println(" O valor de X é = " + x + " e Y é = " + y );
				
		leia.close();
		
	}

}
