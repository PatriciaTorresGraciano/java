package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

/* Programa: Exercicio 04
 * Autor: Patrícia
 * Data: 04/09/2021
 */

public class Exercicio04 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int idade, sexo, caracteristicas;
	int contador = 0;
	int contFemininoNervosa = 0;
	int contMasculinoAgressivo = 0;
	int contPessoaCalma=0;
	int contOutrosCalmos=0;
	int contPessoasNervosasMais40=0;
	int contPessoasCalmaMenos18=0;
	
	
	while(contador <= 7) {
	
	System.out.println("Digite sua idade: ");	
	idade = leia.nextInt();
	
	System.out.println("Digite seu sexo (1-Feminino / 2-Masculino / 3-Outros): ");
	sexo = leia.nextInt();
	
	System.out.println("Digite o numero correspondente a sua caracteristica (1-Calma, 2 -Nervosa, 3-Agressiva: ");
	caracteristicas = leia.nextInt();
	
	switch (sexo) {
	case 1:
		if(caracteristicas==1) {
			contPessoaCalma++;
		}
		
		if(caracteristicas==2) {
			contFemininoNervosa++;
		}
		
		if(idade > 40 && caracteristicas==2) {
			contPessoasNervosasMais40++;
		}
		
		if(idade < 18 && caracteristicas==1) {
			contPessoasCalmaMenos18++;
		}
		
		break;
	case 2:
		if(caracteristicas==1) {
			contPessoaCalma++;
		}
		
		if(caracteristicas==3) {
			contMasculinoAgressivo++;
		}
		
		if(idade > 40 && caracteristicas==2) {
			contPessoasNervosasMais40++;
		}
		
		if(idade < 18 && caracteristicas==1) {
			contPessoasCalmaMenos18++;
		}
		
		break;
	case 3:
		if(caracteristicas==1) {
			contPessoaCalma++;
			contOutrosCalmos++;
		}
		
		if(idade > 40 && caracteristicas==2) {
			contPessoasNervosasMais40++;
		}
		
		if(idade < 18 && caracteristicas==1) {
			contPessoasCalmaMenos18++;
		}
		break;
	default:
		System.out.println("Valor informado para sexo inválido!!");
		break;
	}
	
	contador++;
		
	}
	
	System.out.println("O número de pessoas calmas é: " + contPessoaCalma); 
	System.out.println("O número de mulheres nervosas é: " + contFemininoNervosa); 
	System.out.println("O número de homens agressivos é: " + contMasculinoAgressivo);
	System.out.println("O número de outros calmos é: " + contOutrosCalmos);
	System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + contPessoasNervosasMais40);
	System.out.println("O número de pessoas calmas com menos de 18 anos é: " + contPessoasCalmaMenos18);

	leia.close();
	}

}
