package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Declaração de Variáveis
		float A, B, C, D, R, S;

		//Local do usuário
		System.out.println("insira o valor de A: ");
		A = leia.nextFloat();

		System.out.println("insira o valor de B: ");
		B = leia.nextFloat();

		System.out.println("insira o valor de C: ");
		C = leia.nextFloat();
		

		// Processamento
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) /2;

		// Resultado da soma, multiplicação e divisão por 2
		
		
		System.out.println("\nDetermine o valor de D : " + D);
		
		leia.close();
		
	}

}
