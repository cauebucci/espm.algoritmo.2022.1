package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		double imc, peso, altura;
		String situacao;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual o peso? ");
		peso = teclado.nextDouble();
		
		System.out.print("Qual a altura? ");
		altura = teclado.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc < 25) {
			situacao = "normal";
		}else { 
			situacao = "irregular";
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Peso: " + String.format("%.2f", peso) + "kg");
		System.out.println("Altura: " + String.format("%.2f", altura) + "m");
		System.out.println("");
		System.out.println("IMC: " + String.format("%.2f", imc));
		System.out.println("");
		System.out.println("O seu IMC está " + situacao + ".");
		System.out.println("");
		System.out.println("======================");
	}
}
