package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String nome;
	
		int NAno, IAno;
		System.out.print("Digite seu nome --> ");
		nome = teclado.nextLine();
		
		System.out.print("Digite o ano que o(a) Sr(a) nasceu, Sr(a) " + nome + " --> ");
		NAno = teclado.nextInt();
		
		System.out.print("Digite o ano em que o(a) Sr(a) ingressou em sua empresa, Sr(a) " + nome + " --> ");
		IAno = teclado.nextInt();
		
		if(2022 - NAno >= 65 || 2022 - NAno >= 30 || (2022 - NAno >= 60 && 2022 - IAno >= 25)) {
			System.out.println("Você pode requerer sua aposentadoria!");
		}else {
			System.out.println("Você não pode requerer sua aposentadoria ainda!");
		}
		
		
		
	}
}
