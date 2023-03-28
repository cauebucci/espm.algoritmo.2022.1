package me.caue.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int aulas;
		double sb, valoraula, ha, dsr, salario;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quntas aulas semanais o professor deu? ");
		aulas = teclado.nextInt();
		
		System.out.print("Qual o valor da aula do professor? ");
		valoraula = teclado.nextDouble();
		
		
		
		sb = aulas * 4.5 * valoraula;
		
		ha = (5 * sb) / 100;
		
		dsr = (sb+ha) / 6;
		
		salario = sb + ha + dsr;
		
		System.out.println("");
		System.out.println("");
		System.out.println("============================");
		System.out.println("");
		System.out.println("Salário base (SB): R$ " + String.format("%.2f", sb));
		System.out.println("Adicional de hora atividade (HA): R$ " + String.format("%.2f", ha));
		System.out.println("Descanso semanal remunerado (DSR): R$ " + String.format("%.2f", dsr));
		System.out.println("");
		System.out.println("Salário do professor: R$ " + String.format("%.2f", salario));
		System.out.println("");
		System.out.println("============================");
	}
}
