package br.com.generation.exerciciosIntrodutoriosJava;

import java.util.Scanner;

/*Programa: Exerc�cio 03
*Autor: Patr�cia
*Data: 31/08/2021
*/

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		double segundosEvento, minutosEvento, horasEvento;
		int tempo = 60;
		
		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		segundosEvento = entradaDados.nextInt();
		
		minutosEvento = segundosEvento / tempo;
		horasEvento = minutosEvento / tempo;
		
		System.out.println(" A dura��o do evento na f�brica foi de " + minutosEvento+ " minutos ou " + horasEvento
		+ " horas ou " + segundosEvento + " segundos");
		
		entradaDados.close();
	

	}

}
