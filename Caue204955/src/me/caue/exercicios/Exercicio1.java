package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double juros, taxa, valor;
		int dias;
		boolean veri = true;
		
		do {
			System.out.print("Informe o valor principal do empréstimo (-1 para terminar) -> R$");
			valor = teclado.nextDouble();
			if(valor == -1) {
				veri = false;
				System.out.println("Programa finalizado.");
			}else {
				do {
					System.out.print("Informe a taxa de juros (valor entre 0 e 1) -> ");
					taxa = teclado.nextDouble();
					if(taxa > 1 || taxa < 0) {
						System.out.println("\nValor inválido! A taxa deve ser um valor entre 0 e 1.");
					}
				}while(taxa > 1 || taxa < 0);
				do {
					System.out.print("Informe o prazo do empréstimo em dias -> ");
					dias = teclado.nextInt();
					if(dias <= 0) {
						System.out.println("\nValor inválido! A quantidade de dias deve ser maior que 0");
					}
				}while(dias <= 0);
				
				juros = valor * taxa * dias / 365;
				
				System.out.println("O valor dos juros é de R$" + String.format("%.2f", juros) + "\n");
				
			}
		}while(veri);
		
		
	}
}
