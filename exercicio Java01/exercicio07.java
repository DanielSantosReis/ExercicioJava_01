package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		//Declaração de Variaveis
		float A,B,C,D,U,F,X,Y;
		float recebeX1, recebeY1;
		
		// Local do Usuário
		System.out.println("Digite o valor de A: ");
		A = leia.nextFloat();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextFloat();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextFloat();
		
		System.out.println("Digite o valor de D: ");
		D = leia.nextFloat();
		
		System.out.println("Digite o valor de U: ");
		U = leia.nextFloat();
		
		System.out.println("Digite o valor de F: ");
		F = leia.nextFloat();
		
 		//Processamento de X
		recebeX1 = (C * U) - (B * F); 
		X = (A * U) - (B * D) / recebeX1;
		
		//Processamento de Y
		recebeY1 = (A * F) - (C * D);
		Y = (A * U) - (B * D) / recebeY1;

		System.out.println("\n O resultado de X: " + X +"\n O resultado de Y: " + Y);
		
		leia.close();
		
	}
}
