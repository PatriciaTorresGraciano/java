package br.com.generation.exerciciosLacosRepeticao;

/* Programa: Exercicio 01
 * Autor: Patrícia
 * Data: 02/09/2021
 */

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 

public class Exercicio01 {

	public static void main(String[] args) {
		
		for(int numeros = 1000; numeros < 1999; numeros++) {
		
			if(numeros % 11 ==5) {
				System.out.println("\n" + numeros);
			}
			
		}
	}

}



