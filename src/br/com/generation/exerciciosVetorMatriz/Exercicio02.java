package br.com.generation.exerciciosVetorMatriz;

import java.util.Scanner;

//Programa: Exercicio 02 --> Vetor
//Autor: Patr�cia
// Data: 04/09/2021

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int tamanhoVetor = 10;
		int dado[] = new int [tamanhoVetor];
		double soma = 0;
		int maiorValor = 0;
		int contadorMaiorValor = 0;
		
		//Entrada de valores e vadida��es
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite o valor do "+ (i+1) + "� lan�amento do dado:");
			dado[i] = leia.nextInt();
			soma = soma + dado[i];
			
			if(dado[i] > maiorValor) {
				maiorValor = dado[i];
			}			
		}
		
		//Exibi��o dos valores e contando ocorr�cia da maior pontua��o
		for(int i = 0; i < tamanhoVetor; i++) {
			if(dado[i]==maiorValor) {
				contadorMaiorValor++;
			}
			
			System.out.println("O valor digitado na " + (i+1) + " � rodada �: " + dado[i]);
		}
		
		System.out.println("\nA m�dia dos valores digitados �: "+ (soma / tamanhoVetor));
		System.out.println("O maior pontua��o foi: "+ maiorValor + " e apareceu " + contadorMaiorValor + " vezes");
		
		leia.close();
	}
	
}
