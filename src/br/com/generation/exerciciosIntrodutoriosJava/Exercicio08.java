package br.com.generation.exerciciosIntrodutoriosJava;

/*Programa: Exerc�cio 01
*Autor: Patr�cia
*Data: 31/08/2021
*/

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de F�brica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica * 0.28);
		
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.printf("Custo ao Consumidor: %.2f", custoConsumidor);
		
		leia.close();

	}

}
