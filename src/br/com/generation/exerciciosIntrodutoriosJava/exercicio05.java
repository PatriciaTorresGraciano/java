package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exerc�cio 05
*Autor: Patr�cia
*Data: 31/08/2021
*/

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner entradaNota1 = new Scanner(System.in);
		Scanner entradaNota2 = new Scanner(System.in);
		Scanner entradaNota3 = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a 1� nota do aluno: ");
		nota1 = entradaNota1.nextDouble();
		
		System.out.println("Digite a 2� nota do aluno: ");
		nota2 = entradaNota1.nextDouble();
		
		System.out.println("Digite a 3� nota do aluno: ");
		nota3 = entradaNota1.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /  10;
		
		System.out.println("A m�dia do aluno � " + media);
		
		entradaNota1.close();
		entradaNota2.close();
		entradaNota3.close();
	}

}
