package br.com.generation.exerciciosIntrodutoriosJava;

/*Programa: Exercício 01
*Autor: Patrícia
*Data: 31/08/2021
*/

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		int dias, meses, anos, totalDias;
		int diasAno = 365;
		int diasMes = 30;
		
		System.out.println("Digite sua idade em anos: ");
		anos = entradaDados.nextInt();
		
		System.out.println("Digite quantos meses passou do seu último aniversário: ");
		meses = entradaDados.nextInt();
		
		System.out.println("Digite quantos dias passou do seu último mêsversário: ");
		dias = entradaDados.nextInt();
		
		dias = anos*diasAno;
		meses = meses*diasMes;
		totalDias = dias + meses;
		
		System.out.println("Você tem " + totalDias + " dias de idade");
	
		entradaDados.close();
		
	}

}