//Desenvolva um programa que leia a quantidade de pontos de um aluno em uma avaliação. Desenvolva um método sem retorno
//("Procedimento") que receba essa pontuação por parametro e informe o conceito do aluno na avaliação conforme a tabela abaixo:

//PONTOS||CONCEITO
//até 60 pontos = Insatisfátorio
//61 a 75 pontos = Satisfátorio
//76 a 90 pontos = Bom
//Acima de 90 pontos = Ótimo

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a quantidade de pontos que o aluno tirou na avaliação: ");
		int pontos = input.nextInt();

		conceitoAvaliacao(pontos);

		input.close();
	}

	public static void conceitoAvaliacao(int pontos) {
		if (pontos <= 60) {
			System.out.println("Sua nota é insatisfatório");
		}

		if (pontos >= 61 && pontos <= 75) {
			System.out.println("Sua nota é satisfátorio");
		}
		
		if (pontos >= 76 && pontos <= 90) {
			System.out.println("Sua nota é bom!");
		}
		
		if (pontos > 90) {
			System.out.println("Sua nota é ótimo!");
		}
	}
}