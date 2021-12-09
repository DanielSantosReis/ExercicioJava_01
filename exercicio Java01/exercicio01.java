package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio01 {
	/* Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias. 
	 */

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		// Declaração de Variaveis
		int dias = 365, meses = 12, anos, idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		//Processamento dos dados
		anos = idade;
		meses = idade * meses;
		dias = idade * dias ;
		
		System.out.println("Você tem: " + anos + " anos.");
		System.out.println("Você tem: " + meses + " meses.");
		System.out.println("Você tem: " + dias + " dias.");
		
		leia.close();

	}

}
