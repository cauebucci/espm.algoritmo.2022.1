package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double cFabrica, cConsumidor;
		
		System.out.print("Digite o custo de fábrica --> R$");
		cFabrica = teclado.nextInt();
		
		if(cFabrica <= 12000) {
			cConsumidor = cFabrica + (5*cFabrica/100);
		}else if(cFabrica > 12000 && cFabrica <= 25000) {
			cConsumidor = cFabrica + (10*cFabrica/100) + (15*cFabrica/100); 
		}else {
			cConsumidor = cFabrica + (15*cFabrica/100) + (20*cFabrica/100); 
		}
		
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("Preço de Fábrica: R$" + String.format("%.2f", cFabrica));
		System.out.println("Preço do Consumidor: R$" + String.format("%.2f", cConsumidor));
		System.out.println("");
		System.out.println("===========================================");
	}
	
}
