package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String tipo;
		int a,b,c,d;
		
		System.out.print("Digite o primeiro número --> ");
		a = teclado.nextInt();
		
		System.out.print("Digite o segundo número --> ");
		b = teclado.nextInt();
		
		System.out.print("Digite o terceiro número --> ");
		c = teclado.nextInt();
		
		System.out.print("Digite o quarto número --> ");
		d = teclado.nextInt();
		
		if(a > b && b > c && c > d) {
			tipo = "decrescente";
		}else if(a < b && b < c && c < d) {
			tipo = "crescente";
		}else {
			tipo = "não ordenada";
		}
		
		System.out.println("Os números " + a + ", " + b + ", " + c + " e " + d + " estão em ordem " + tipo + ".");
	}
}
