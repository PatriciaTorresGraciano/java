package br.com.generation.exerciciosIntrodutoriosJava;

/*Programa: Exerc�cio 01
*Autor: Patr�cia
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
		
		System.out.println("Digite quantos meses passou do seu �ltimo anivers�rio: ");
		meses = entradaDados.nextInt();
		
		System.out.println("Digite quantos dias passou do seu �ltimo m�svers�rio: ");
		dias = entradaDados.nextInt();
		
		dias = anos*diasAno;
		meses = meses*diasMes;
		totalDias = dias + meses;
		
		System.out.println("Voc� tem " + totalDias + " dias de idade");
	
		entradaDados.close();
		
	}

}