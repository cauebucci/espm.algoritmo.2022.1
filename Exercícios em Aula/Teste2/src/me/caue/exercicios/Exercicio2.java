package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		double y,x;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor X: ");
		x = teclado.nextDouble();
		
		y = (Math.pow(x, 1.0/3))+(Math.pow(x+2, 3.0/5));
		
		System.out.println("O resultado da sua operação é: " + y);
	}
}
