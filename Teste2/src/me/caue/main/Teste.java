package me.caue.main;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int valor1, valor2, resultado;
		double resultadoDiv;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		
		valor1 = teclado.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = teclado.nextInt();
		System.out.println("");
		System.out.println(" ================================================");
		System.out.println(" |  Calculadora                                 ");
		System.out.println(" |                                              ");
		System.out.println(" |  N�meros: " + valor1 + " e " + valor2 + "    ");
		System.out.println(" |                                              ");
		resultado = valor1+valor2;
		System.out.println(" |  Soma: " + resultado + "                     ");
		resultado = valor1-valor2;
		System.out.println(" |  Subtra��o: " + resultado + "                ");
		resultado = valor1*valor2;
		System.out.println(" |  Multiplica��o: " + resultado + "            ");
		resultadoDiv = (double)valor1/valor2;
		System.out.println(" |  Divis�o: " + resultadoDiv + "               ");
		resultado = valor1%valor2; 
		System.out.println(" |  Resto: " + resultado + "       		        ");
		System.out.println(" |                                              ");
		System.out.println(" ================================================");
		
		
		
		
		
		
		
		
	}

}

