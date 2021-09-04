package br.com.generation.exerciciosVetorMatriz;

import java.util.Scanner;

//Programa: Exercicio 03 --> Matriz
//Autor: Patr�cia
//Data: 03/09/2021

public class Exercicio01 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

        double pontuacoes[] = new double[3];
        double maiorPontuacao = -99999;

        //Entrada de valores no vetor
        for(int i = 0; i < 3; i++){
            System.out.println("Digite a " + (i+1) + "� Pontua��o: ");
            pontuacoes[i] = leia.nextDouble();
        }

        //Exibindo valores no vetor
        System.out.println("As pontua��es da atividade s�o: ");
        for(int i = 0; i < 3; i++){
            System.out.println(pontuacoes[i]);
        }

        //Encontrando o maior valor
        for(int i = 0; i < 3; i++){

            if (pontuacoes[i] > maiorPontuacao){
                maiorPontuacao = pontuacoes[i];
            }
        }
        System.out.println("A maior pontua��o � " +maiorPontuacao);

        leia.close();
    }
}

