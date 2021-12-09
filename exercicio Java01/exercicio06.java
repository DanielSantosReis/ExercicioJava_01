package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double d;
		double p1, p2;
		
		System.out.println("Insira o valor de X no primeiro ponto:");
		x1 = leia.nextDouble();
		
		System.out.println("Insira o valor de Y no primeiro ponto:");
		y1 = leia.nextDouble();
		
		System.out.println("Insira o valor de X no segundo ponto:");
		x2 = leia.nextDouble();
		
		System.out.println("Insira o valor de Y no segundo ponto:");
		y2 = leia.nextDouble();
		
											//Potenciação de P1..
		p1 = Math.pow((x1 - x2),2);
											//Potenciação de P2.
		p2 = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(p1 + p2);				// Raiz Quadrada

		System.out.println("A Distancia entre os dois pontos é: " + d);
		
		leia.close();
		
	}

}
