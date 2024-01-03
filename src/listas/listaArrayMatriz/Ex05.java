//Escreva um programa que permita a leitura das notas de uma turma de 10 alunos. Armazene as notas em um array. O programa deve
//calcular a média da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escreva a média da turma e o 
//resultado da contagem.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notasAlunos = new double[10];
		
		double somaNotas = 0;
		for(int i = 0; i < notasAlunos.length; i++) {
			do {
				System.out.print("Informe a nota do aluno " + (i+1) + ": ");
				notasAlunos[i] = input.nextDouble();
				somaNotas += notasAlunos[i];
				
				if(notasAlunos[i] < 0 || notasAlunos[i] > 10) {
					System.out.println("Número errado!");
				}
			} while(notasAlunos[i] < 0 || notasAlunos[i] > 10);
		}
		
		double mediaTurma = somaNotas / 10;
		
		int notasAcima = 0;
		for(int i = 0; i < notasAlunos.length; i++) {
			if(notasAlunos[i] > mediaTurma) {
				notasAcima++;
			}
		}
		System.out.println("A média da turma é de: " + mediaTurma);
		System.out.println("Houve no total " + notasAcima + " pessoas acima da média da turma!");
		
		input.close();
	}

}