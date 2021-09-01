package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exercício 03
*Autor: Patrícia
*Data: 31/08/2021
*/

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		double segundosEvento, minutosEvento, horasEvento;
		int tempo = 60;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		segundosEvento = entradaDados.nextInt();
		
		minutosEvento = segundosEvento / tempo;
		horasEvento = minutosEvento / tempo;
		
		System.out.println(" A duração do evento na fábrica foi de " + minutosEvento+ " minutos ou " + horasEvento
		+ " horas ou " + segundosEvento + " segundos");
		
		entradaDados.close();
	

	}

}
