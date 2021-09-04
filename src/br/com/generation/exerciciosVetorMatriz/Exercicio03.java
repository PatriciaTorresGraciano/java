package br.com.generation.exerciciosVetorMatriz;

//Programa: Exercicio 03 --> Matriz
//Autor: Patrícia
//Data: 03/09/2021
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		        Scanner leia = new Scanner(System.in);
		        int linha=4;
		        int coluna=6;
		        int n1[][] = new int[linha][coluna];
		        int n2[][] = new int[linha][coluna];
		        int m1[][] = new int[linha][coluna];
		        int m2[][] = new int[linha][coluna];

		        for (int i=0; i<linha;i++){
		            for (int j=0;j<coluna;j++){
		                System.out.println("Digite o n1["+i+"],["+j+"]: ");
		                n1[i][j]=leia.nextInt();
		            }
		        }

		        for (int i=0; i<linha;i++){
		            for (int j=0;j<coluna;j++){
		                System.out.println("Digite o n2["+i+"],["+j+"]: ");
		                n2[i][j]=leia.nextInt();
		            }
		        }

		        for (int i=0; i<linha;i++){
		            for (int j=0;j<coluna;j++){
		               m1[i][j]=n1[i][j]+n2[i][j];
		            }
		        }

		        for (int i=0; i<linha;i++){
		            for (int j=0;j<coluna;j++){
		                m2[i][j]=n1[i][j]-n2[i][j];
		            }
		        }

		        //Exibindo a soma das matrizes m1 = n1 + n2
		        for (int i=0; i<linha;i++){
		            for (int j=0;j<coluna;j++){
		                System.out.println("A soma das  matrizes N1 + N2 é igual a matriz  m1["+i+"],["+j+"] = "+m1[i][j]);
		            }
		        }
		        for (int i=0; i<linha;i++){
		            for (int j=0;j<coluna;j++){
		                System.out.println("A subtração das  matrizes N1 - N2 é igual a matriz  m2["+i+"],["+j+"] = "+m2[i][j]);
		            }
		        }

		    }
		}


