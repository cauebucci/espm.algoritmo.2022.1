package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String situacao;
		double valor, salario;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor total de vendas? ");
		valor = teclado.nextDouble();
		
		if(valor > 25000) {
			salario = (18.85 * valor) / 100;
			situacao = "atingiu";
		} else {
			salario = (17.5 * valor) / 100;
			situacao = "não atingiu";
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		System.out.println("Valor total de vendas: R$ " + String.format("%.2f", valor));
		System.out.println("");
		System.out.println("O vendendor " + situacao + " a meta de vendas!");
		System.out.println("Salário do vendedor: R$ " + String.format("%.2f", salario));
		System.out.println("");
		System.out.println("============================");
	}
}
