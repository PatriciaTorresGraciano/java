package br.com.generation.exerciciosVetorMatriz;

import java.util.Scanner;

//Programa: Exercicio 04 --> Matriz
//Autor: Patrícia
//Data: 04/09/2021

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int linha = 3;
		int coluna = 3;
		int matriz [][] = new int[linha][coluna];
		int somaMatriz = 0;
		int somaDiagonal = 0;
		
		
		for(int l = 0; l < linha; l++) {
			for(int c = 0; c < coluna; c++) {
				System.out.println("Digite a posição Matriz["+l+"]["+c+"]: ");
				matriz[l][c] = leia.nextInt();
				somaMatriz = somaMatriz + matriz[l][c];
				
				if(l==c) {
					somaDiagonal = somaDiagonal + matriz[l][c];
				}
			}
		}
		
		System.out.println("A soma dos valores da matriz é: " + somaMatriz );
		System.out.println("A soma dos valores da diagonal principal da matriz é: " + somaDiagonal );
		
		leia.close();
	}

}
