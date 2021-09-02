package br.com.generation.exerciciosIntrodutoriosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Programa: Exercício 03
*Autor: Patrícia
*Data: 31/08/2021
*/

public class Exercicio03 {

	public static void main(String[] args) {
		
		DecimalFormat formatarDecimal = new DecimalFormat("0.00");
		
		Scanner entradaDados = new Scanner(System.in);
		
		double segundosEvento, minutosEvento, horasEvento;
		int tempo = 60;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		segundosEvento = entradaDados.nextInt();
		
		minutosEvento = segundosEvento / tempo;
		horasEvento = minutosEvento / tempo;
		
		System.out.println(" A duração do evento na fábrica foi de " + formatarDecimal.format(minutosEvento)+ " minutos ou " + formatarDecimal.format(horasEvento)
		+ " horas ou " + formatarDecimal.format(segundosEvento) + " segundos");
		
		entradaDados.close();
	

	}

}
