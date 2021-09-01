package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 07
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner entradaA = new Scanner(System.in);
		Scanner entradaB = new Scanner(System.in);
		Scanner entradaC = new Scanner(System.in);
		Scanner entradaD = new Scanner(System.in);
		Scanner entradaE = new Scanner(System.in);
		Scanner entradaF = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = entradaA.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entradaB.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entradaC.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = entradaD.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = entradaE.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = entradaF.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*c) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println(" O valor de X é = " + x + " e Y é = " + y );
				
	
		entradaA.close();
		entradaB.close();
		entradaC.close();
		entradaD.close();
		entradaE.close();
		entradaF.close();
	}

}
