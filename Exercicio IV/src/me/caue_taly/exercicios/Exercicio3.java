package me.caue_taly.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int dividores = 0;
		String veri = "";
		do {
			System.out.print("Deseja iniciar o programa agora? (S/n) ");
			veri = teclado.nextLine();
			if(!veri.equalsIgnoreCase("s") && !veri.equalsIgnoreCase("n")) {
				System.out.println("Digite apenas 's' para iniciar ou 'n' para cancelar a execução.");
			}
		}while(!veri.equalsIgnoreCase("s") && !veri.equalsIgnoreCase("n"));
		
		if(veri.equalsIgnoreCase("s")) {
			for(int valor = 1; valor <= 1000000; valor++) { 
				dividores = 0;
				for(int divisor = 1; divisor <= valor; divisor++) { 
					if(valor % divisor == 0 && divisor != valor) {
						dividores = dividores + divisor;
					}
				}
				if(dividores == valor) {
					System.out.println(valor);
				}
			}
		}else {
			System.out.println("Certo. Obrigado!");
		}
		
		
	}
}
