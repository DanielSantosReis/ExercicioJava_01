package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio02 {
	
	/*Faça um sistema que leia a idade de uma pessoa expressa em dias
	  e mostre-a expressa em anos, meses e dias. 
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Declaração de Variaveis
		int dias , meses = 12, anos = 365, idadeemdias;
		
		System.out.println("Digite sua idade em Dias: ");
		idadeemdias = leia.nextInt();
		
		//Processamento dos dados
		anos = idadeemdias / anos;
		meses = anos * meses;
		dias = idadeemdias;
		
		System.out.println("Você tem: " + dias + " dias.");
		System.out.println("Você tem: " + meses + " meses.");
		System.out.println("Você tem: " + anos + " anos.");
		
		leia.close();

	}

}
