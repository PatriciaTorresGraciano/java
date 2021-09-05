package br.com.generation.exerciciosVetorMatriz;

import java.util.Scanner;

//Programa: Exercicio 02 --> Vetor
//Autor: Patrícia
// Data: 04/09/2021

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int tamanhoVetor = 10;
		int dado[] = new int [tamanhoVetor];
		double soma = 0;
		int maiorValor = 0;
		int contadorMaiorValor = 0;
		
		//Entrada de valores e vadidações
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite o valor do "+ (i+1) + "º lançamento do dado:");
			dado[i] = leia.nextInt();
			soma = soma + dado[i];
			
			if(dado[i] > maiorValor) {
				maiorValor = dado[i];
			}			
		}
		
		//Exibição dos valores e contando ocorrêcia da maior pontuação
		for(int i = 0; i < tamanhoVetor; i++) {
			if(dado[i]==maiorValor) {
				contadorMaiorValor++;
			}
			
			System.out.println("O valor digitado na " + (i+1) + " ª rodada é: " + dado[i]);
		}
		
		System.out.println("\nA média dos valores digitados é: "+ (soma / tamanhoVetor));
		System.out.println("O maior pontuação foi: "+ maiorValor + " e apareceu " + contadorMaiorValor + " vezes");
		
		leia.close();
	}
	
}
