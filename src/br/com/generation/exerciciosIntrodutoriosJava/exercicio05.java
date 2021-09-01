package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 05
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a 1ª nota do aluno: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a 2ª nota do aluno: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a 3ª nota do aluno: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /  10;
		
		System.out.println("A média do aluno é " + media);
		
		leia.close();

		}
}
