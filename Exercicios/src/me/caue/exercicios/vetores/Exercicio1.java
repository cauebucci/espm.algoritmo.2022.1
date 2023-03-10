package me.caue.exercicios.vetores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int[] ns = new int[6];
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "º número: ");
			ns[i] = teclado.nextInt();
			
		}
		
		int maior = 0;
		int menor = 0;
		for(int i = 0; i <= 5; i++) {
			if(ns[i] < menor || i == 1) {
				menor = ns[i];
			}
			if(ns[i] > maior || i == 1) {
				maior = ns[i];
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
	}
}
