package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 06
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner entradaX1 = new Scanner(System.in);
		Scanner entradaX2 = new Scanner(System.in);
		Scanner entradaY1 = new Scanner(System.in);
		Scanner entradaY2 = new Scanner(System.in);
		
		double x1, x2, y1, y2, calculoDistancia, d;

		System.out.println("Digite o valor de x1: ");
		x1 = entradaX1.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = entradaX2.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = entradaY1.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = entradaY2.nextDouble();
		
		d = mat.raiz(mat.potencia(x2-x1, 2.0) + mat.potencia(y2-y1, 2.0), 2.0);
		
		System.out.println("A distância entre o ponto P(" + x1+ "," + y1 +") e P(" + x2+ "," + y2 +") é igual a " + mat.arredondar(d,2));
		
		entradaX1.close();
		entradaX2.close();
		entradaY1.close();
		entradaY2.close();

	}

}
