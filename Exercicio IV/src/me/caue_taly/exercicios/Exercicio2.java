package me.caue_taly.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n;
		String f = "";
		
		System.out.print("Digite o número que deseja --> ");
		n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			f = f + i*2 + " ";
		}
		System.out.println("Resultado: " + f);
	}
}
