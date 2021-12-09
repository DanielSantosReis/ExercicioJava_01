package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio03 {
	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
	 *  e mostre-o expresso em horas, minutos e segundos. 
	 */

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int hor, min, seg, resto;
	
	System.out.println("Quantos segundos ocorrerá o evento: ");
	seg = leia.nextInt();
	
	hor = seg / 3600;
	resto = seg % 3600;
	min = resto / 60;
	seg = resto % 60;	

	System.out.println(hor+ ":" + min + ":"+ seg);

	leia.close();
	
	}
}
