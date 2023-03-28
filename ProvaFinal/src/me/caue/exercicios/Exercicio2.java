package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int x, y;
		double z;
		int mx = 0;
		int my = 0;
		double mz = 0;
		int pontos;
		System.out.print("Qual a quantidade de pontos que serão informados? --> ");
		pontos = teclado.nextInt();
		
		for(int i = 1; i <= pontos; i++) {
			System.out.println("Ponto " + i + ":");
			System.out.print("  x -> ");
			x = teclado.nextInt();
			System.out.print("  y -> ");
			y = teclado.nextInt();
			
			z = Math.sqrt((x * x) + (y * y));
			
			System.out.println("Distância até a origem --> " + String.format("%.4f", z) + "\n");
			
			if(z > mz) {
				mz = z;
				my = y;
				mx = x;
			}
			
		}
		
		System.out.println("O ponto mais distante tem coordenadas --> (" + mx + "," + my + ")");
	}
}
