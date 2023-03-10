package me.caue_taly.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		String candidatoA, candidatoB, canditatoC, candidato;
		int vCandidatoA = 0;
		int vCandidatoB = 0;
		int vCandidatoC = 0;
		int vcandidato = 0;
		int branco = 0;
		int nulo = 0;
		int total;

		System.out.println("==========================");
		System.out.println("====== 1� Candidato ======");
		System.out.println("==========================");

		System.out.print("Digite o nome do 1� Candidato --> ");
		candidatoA = teclado.nextLine();

		System.out.println("==========================");
		System.out.println("====== 2� Candidato ======");
		System.out.println("==========================");

		System.out.print("Digite o nome do 2� Candidato --> ");
		candidatoB = teclado.nextLine();

		System.out.println("==========================");
		System.out.println("====== 3� Candidato ======");
		System.out.println("==========================");

		System.out.print("Digite o nome do 3� Candidato --> ");
		canditatoC = teclado.nextLine();

		boolean votacao = true;
		String veri = "";
		System.out.println("");
		System.out
				.println("AVISO | Para enceerrar as vota��es, apenas digite 'encerrar' ao inv�s de um n�mero de voto.");
		do {
			System.out.print("Tem certeza que deseja criar uma vota��o entre os candidatos " + candidatoA + ", "
					+ candidatoB + " e " + canditatoC + "? (S/n) ");
			veri = teclado.nextLine();
			if (!veri.equalsIgnoreCase("n") && !veri.equalsIgnoreCase("s")) {
				System.out.println("Inv�lido! Digite apenas 'S' para cofirmar e 'N' para negar.");
			}
		} while (!veri.equalsIgnoreCase("n") && !veri.equalsIgnoreCase("s"));

		if (veri.equalsIgnoreCase("n")) {
			votacao = false;
		} else {
			for (int i = 0; i <= 50; i++) {
				System.out.println("");
			}
			votacao = true;
		}

		while (votacao) {
			for (int i = 0; i <= 50; i++) {
				System.out.println("");
			}
			String voto;
			System.out.println("===================================");
			System.out.println("============= VOTA��O =============");
			System.out.println("===================================");
			System.out.println("");
			System.out.println("Op��es de voto:");
			System.out.println("   (1) - " + candidatoA);
			System.out.println("   (2) - " + candidatoB);
			System.out.println("   (3) - " + canditatoC);
			System.out.println("");
			System.out.println("   (0) - Branco");
			System.out.println("  (-1) - Nulo");
			System.out.println("");
			System.out.println("===================================");
			do {
				System.out.print("Qual op��o deseja votar? ");
				voto = teclado.nextLine();
				if (!voto.equalsIgnoreCase("1") && !voto.equalsIgnoreCase("2") && !voto.equalsIgnoreCase("3")
						&& !voto.equalsIgnoreCase("-1") && !voto.equalsIgnoreCase("0")
						&& !voto.equalsIgnoreCase("encerrar")) {
					System.out.println("Op��o inv�lida. Tente novamente!");
				}
			} while (!voto.equalsIgnoreCase("1") && !voto.equalsIgnoreCase("2") && !voto.equalsIgnoreCase("3")
					&& !voto.equalsIgnoreCase("-1") && !voto.equalsIgnoreCase("0")
					&& !voto.equalsIgnoreCase("encerrar"));

			if (voto.equalsIgnoreCase("1")) {
				vCandidatoA++;
			} else if (voto.equalsIgnoreCase("2")) {
				vCandidatoB++;
			} else if (voto.equalsIgnoreCase("3")) {
				vCandidatoC++;
			} else if (voto.equalsIgnoreCase("0")) {
				branco++;
			} else if (voto.equalsIgnoreCase("-1")) {
				nulo++;
			} else if (voto.equalsIgnoreCase("encerrar")) {
				votacao = false;
			}
			for (int i = 0; i <= 50; i++) {
				System.out.println("");
			}
			if (voto.equalsIgnoreCase("encerrar")) {
				System.out.println("Vota��o encerrada!");
				System.out.println("Contabilizando votos...");
				Thread.sleep(2000);
			} else {
				System.out.println("Voto computado com sucesso!");
				Thread.sleep(1000);
			}
			

		}

		if (vCandidatoA > vCandidatoB) {
			vcandidato = vCandidatoA;
			candidato = candidatoA;
			vCandidatoA = vCandidatoB;
			candidatoA = candidatoB;
			vCandidatoB = vcandidato;
			candidatoB = candidato;

		}

		if (vCandidatoA > vCandidatoC) {
			vcandidato = vCandidatoA;
			candidato = candidatoA;
			vCandidatoA = vCandidatoC;
			candidatoA = canditatoC;
			vCandidatoC = vcandidato;
			canditatoC = candidato;
		}

		if (vCandidatoB > vCandidatoC) {
			vcandidato = vCandidatoB;
			candidato = candidatoB;
			vCandidatoB = vCandidatoC;
			candidatoB = canditatoC;
			vCandidatoC = vcandidato;
			canditatoC = candidato;
		}

		total = vCandidatoA + vCandidatoB + vCandidatoC + branco + nulo;
		
		if (veri.equalsIgnoreCase("s")) {
			System.out.println("");
			System.out.println("===========================================");
			System.out.println("================ ELEI��ES =================");
			System.out.println("===========================================");
			System.out.println("");
			System.out.println("================= Ranking =================");
			System.out.println("");
			System.out.println("1� Lugar - " + canditatoC + " - " + vCandidatoC + " votos");
			System.out.println("2� Lugar - " + candidatoB + " - " + vCandidatoB + " votos");
			System.out.println("3� Lugar - " + candidatoA + " - " + vCandidatoA + " votos");
			System.out.println("");
			System.out.println("================== Dados ==================");
			System.out.println("");
			System.out.println("Votos em branco: " + branco + " votos");
			System.out.println("Votos nulos: " + nulo + " votos");
			System.out.println("");
			System.out.println("Total de votos: " + total + " votos");
			System.out.println("");
			System.out.println("===========================================");
		} else {
			System.out.println("Certo. Obrigado!");
		}

	}
}
