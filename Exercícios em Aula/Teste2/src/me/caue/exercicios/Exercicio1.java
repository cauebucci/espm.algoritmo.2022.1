package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		double x,y,u,w,q,z;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor X: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor Y: ");
		y = teclado.nextDouble();
		System.out.print("Digite o valor U: ");
		u = teclado.nextDouble();
		System.out.print("Digite o valor W: ");
		w = teclado.nextDouble();
		System.out.print("Digite o valor Q: ");
		q = teclado.nextDouble();
		
		z = (x+y)/(u+w/q);
		
		System.out.println("O valor de sua operação é: " + z);
	} 
}
