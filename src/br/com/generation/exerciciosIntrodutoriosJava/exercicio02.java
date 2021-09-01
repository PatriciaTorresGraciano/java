package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 02
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio02 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		
		int dias, anos, meses;
		int mesesAno = 12;
		int diasAno = 365;
		
		System.out.println("Digite quantos anos você tem em dias: ");
		dias = entradaDados.nextInt();
		
		anos = dias / diasAno;
		meses = dias / mesesAno;
		
		System.out.println("Você tem " + anos + " anos 900de idade ou " + meses+ " meses de vida ou " + dias + " dias de vida");
		
		entradaDados.close();
			
		}

	}


