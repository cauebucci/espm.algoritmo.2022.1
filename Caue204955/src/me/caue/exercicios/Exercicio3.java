package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		double i, f, c;
		
		System.out.print("Temperatura inicial (mínima) --> ");
		i = teclado.nextDouble();
		
		System.out.print("Temperatura final (máxima) --> ");
		f = teclado.nextDouble();
		System.out.println("");
		System.out.println("Celsius  ||  Fahrenheit");
		while(i <= f) {
			c = 9 * i / 5 + 32;
			System.out.println(String.format("%.4f", i) + "    ||    " + String.format("%.4f", c));
			i++;
		}
	}
}
