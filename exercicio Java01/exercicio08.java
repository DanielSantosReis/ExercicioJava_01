package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio08 {
	
/*	O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos 
	  impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos 
	  de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Declara��o de vari�veis
		int carroNew, impostoD , impostoI;   //impostoD = Distribuidor
											 //impostoI = Impostos
		
		// Local do usu�rio
		System.out.println("Digite o valor do carro Novo: ");
		carroNew = leia.nextInt();
		
		//Processamento de dados
		impostoD = ((carroNew * 28)/100) + carroNew;
		impostoI = ((impostoD * 45)/100) + carroNew;
		
		//Visualiza��o dos resultados
		System.out.println("\nValor do carro com o Imposto do Distribuidor: " + impostoD);
		System.out.println("Valor do carro novo com os Impostos: " + impostoI);
		
		leia.close();

	}

}
