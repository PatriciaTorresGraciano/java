package br.com.generation.exerciciosLacosRepeticao;

//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 

public class Exercicio01 {

	public static void main(String[] args) {
		
		for(int numeros = 1000; numeros < 1999; numeros++) {
		
			if(numeros % 11 ==5) {
				System.out.println("\n" + numeros);
			}
			
		}
	}

}



