package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		String chapaA, chapaB, chapaC, chapa;
		int vChapaA, vChapaB, vChapaC, vchapa, branco, total;
		
		System.out.println("==========================");
		System.out.println("======== 1º Chapa ========");
		System.out.println("==========================");
		
		System.out.print("Digite o nome da 1º Chapa --> ");
		chapaA = teclado.nextLine();
		
		System.out.print("Digite a quantidade de votos da chapa " + chapaA + " --> ");
		vChapaA = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("==========================");
		System.out.println("======== 2º Chapa ========");
		System.out.println("==========================");
		
		System.out.print("Digite o nome da 2º Chapa --> ");
		chapaB = teclado.nextLine();
		
		System.out.print("Digite a quantidade de votos da chapa " + chapaB + " --> ");
		vChapaB = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("==========================");
		System.out.println("======== 3º Chapa ========");
		System.out.println("==========================");
		
		System.out.print("Digite o nome da 3º Chapa --> ");
		chapaC = teclado.nextLine();
		
		System.out.print("Digite a quantidade de votos da chapa " + chapaC + " --> ");
		vChapaC = teclado.nextInt();
		
		System.out.println("==========================");
		System.out.println("========= Branco =========");
		System.out.println("==========================");
		
		System.out.print("Digite a quantidade de votos em branco --> ");
		branco = teclado.nextInt();
		
		if(vChapaA > vChapaB) {
			vchapa = vChapaA;
			chapa = chapaA;
			vChapaA = vChapaB;
			chapaA = chapaB;
			vChapaB = vchapa;
			chapaB = chapa;
			
		}
		
		if(vChapaA > vChapaC) {
			vchapa = vChapaA;
			chapa = chapaA;
			vChapaA = vChapaC;
			chapaA = chapaC;
			vChapaC = vchapa;
			chapaC = chapa;
		}
		
		if(vChapaB > vChapaC) {
			vchapa = vChapaB;
			chapa = chapaB;
			vChapaB = vChapaC;
			chapaB = chapaC;
			vChapaC = vchapa;
			chapaC = chapa;
		}
		
		total = vChapaA+vChapaB+vChapaC+branco;
		
		System.out.println("");
		System.out.println("===========================================");
		System.out.println("====== Eleição do Grêmio Estudantil ======");
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("================= Ranking =================");
		System.out.println("");
		System.out.println("1º Lugar - " + chapaC + " - " + vChapaC + " votos");
		System.out.println("2º Lugar - " + chapaB + " - " + vChapaB + " votos");
		System.out.println("3º Lugar - " + chapaA + " - " + vChapaA + " votos");
		System.out.println("");
		System.out.println("================== Dados ==================");
		System.out.println("");
		System.out.println("Total de votos: " + total + " votos");
		System.out.println("Votos em branco: " + branco + " votos");
		System.out.println("");
		System.out.println("===========================================");
		
		
	}
}
