package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String tipo;
		int a,b,c,d;
		
		System.out.print("Digite o primeiro n�mero --> ");
		a = teclado.nextInt();
		
		System.out.print("Digite o segundo n�mero --> ");
		b = teclado.nextInt();
		
		System.out.print("Digite o terceiro n�mero --> ");
		c = teclado.nextInt();
		
		System.out.print("Digite o quarto n�mero --> ");
		d = teclado.nextInt();
		
		if(a > b && b > c && c > d) {
			tipo = "decrescente";
		}else if(a < b && b < c && c < d) {
			tipo = "crescente";
		}else {
			tipo = "n�o ordenada";
		}
		
		System.out.println("Os n�meros " + a + ", " + b + ", " + c + " e " + d + " est�o em ordem " + tipo + ".");
	}
}
