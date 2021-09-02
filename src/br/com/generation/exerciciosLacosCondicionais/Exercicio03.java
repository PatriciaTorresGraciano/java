package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

/* Programa: Exercicio 03
 * Autor: Patrícia
 * Data: 01/09/2021
 */

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int idadePessoa;
		
		
		System.out.println("Digite a idade da pessoa: ");
		idadePessoa = entrada.nextInt();
		
		if(idadePessoa >= 10 && idadePessoa <= 14 ) {
			System.out.println("A pessoa tem " + idadePessoa + " anos, portanto está na categoria infantil");
		}
		else if(idadePessoa >= 15 && idadePessoa <= 17 ) {
			System.out.println("A pessoa tem " + idadePessoa + " anoss,portanto está na categoria juvenil");
		}
		else if(idadePessoa >= 18 && idadePessoa <= 25) {
			System.out.println("A pessoa tem " + idadePessoa + " anos, portanto está na categoria adulto");
		}
		
		entrada.close();
	}

}
