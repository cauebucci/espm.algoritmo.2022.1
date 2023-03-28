package me.caue_taly.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n;
		String sb = "";
		System.out.print("Digite o número que deseja --> ");
		n = teclado.nextInt();
		
		System.out.println("================================");
		for(int i = 1; i <= n; i++) {
			sb = sb + "*";
			System.out.println(i + " - " + sb);
		}
		System.out.println("================================");
		
	}
}
