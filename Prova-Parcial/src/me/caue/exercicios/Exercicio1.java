package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		double m, i, c;
		int t;
		
		System.out.print("Digite a taxa de juros aplicada(%) --> ");
		i = teclado.nextDouble();
		i = i/100;
		
		System.out.print("Digite o capital ou valor inicial --> ");
		c = teclado.nextDouble();
		
		System.out.print("Digite o tempo total da aplicação (em meses) --> ");
		t = teclado.nextInt();
		
		m = c * (Math.pow(1+i, t));
		
		System.out.println("");
		System.out.println("==========================");
		System.out.println("== Aplicação Financeira ==");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Capital ou valor inicial: R$" + String.format("%.2f", c));
		System.out.println("Taxa de juros aplicada: " + String.format("%.2f", i*100) + "%");
		System.out.println("Tempo total de aplicação: " + t + " meses");
		System.out.println("");
		System.out.println("Valor final: R$" + String.format("%.2f", m));
		System.out.println("");
		System.out.println("==========================");
		
	}

}
