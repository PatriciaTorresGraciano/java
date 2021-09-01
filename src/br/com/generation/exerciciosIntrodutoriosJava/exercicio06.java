package br.com.generation.exerciciosIntrodutoriosJava;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/*Programa: Exerc�cio 06
*Autor: Patr�cia
*Data: 31/08/2021
*/

public class exercicio06 {
	
	//Fun��o para a realiza��o de Ra�z Qadrada de tipo double
	public static double calculaRaiz(double valor) {
		double fatorCalculo = 0.00001;
		//quanto menor o fatorcalculomaior a precis�o. Ex.0.0001
		while(fatorCalculo * fatorCalculo < valor) {
			fatorCalculo+=0.00001;
			
		}
		return fatorCalculo;
		
	}

	public static void main(String[] args) {
		
		DecimalFormat formatarDecimal = new DecimalFormat("0.00");		
		Scanner leia = new Scanner(System.in);
		
		
		double x1, x2, y1, y2, d;

		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		
		d = calculaRaiz(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

		
		System.out.println("A dist�ncia entre o ponto P(" + x1+ "," + y1 +") e P(" + x2+ "," + y2 +") � igual a " + formatarDecimal.format(d));
		
		leia.close();
		
	}
	


}
