package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio03 {
	/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos
	 *  e mostre-o expresso em horas, minutos e segundos. 
	 */

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int hor, min, seg, resto;
	
	System.out.println("Quantos segundos ocorrer� o evento: ");
	seg = leia.nextInt();
	
	hor = seg / 3600;
	resto = seg % 3600;
	min = resto / 60;
	seg = resto % 60;	

	System.out.println(hor+ ":" + min + ":"+ seg);

	leia.close();
	
	}
}
