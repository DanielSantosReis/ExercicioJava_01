package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio05 {
	/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
	  Considerar que a m�dia � ponderada e que o peso das notas �: 2, 3 e 5, respectivamente. 
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Declara��o de Variaveis
		
		float E,F,G,media;
		
		System.out.println("Digite o valor de E: ");
 		E = leia.nextFloat();
 		
 		System.out.println("Digite o valor de F: ");
 		F = leia.nextFloat();
  		
 		System.out.println("Digite o valor de G: ");
  		G = leia.nextFloat();
  		
  		// Processamento
  		E = (E * 2);
  	   	F = (F * 3);
  	   	G = (G * 5);
  	   	media = (E + F + G) /3;
  	   	
  	  System.out.println("\nSua m�dia final �: " + media);
  	  
  	  leia.close();

	}

}
