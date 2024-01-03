//Desenvolva um programa que leia e armazene 3 notas de um aluno em um array. Desenvolva um método sem retorno("Procedimento")
//que receba o array de notas de um aluno e o tipo de cálculo a ser executado por parametro. O parametro tipo de cálculo será
//um inteiro (1 ou 2) e deve realizar o cálculo conforme especificado abaixo:

//1- O método calcula e apresenta a média aritimética das notas do aluno;
//2- O método calcula e apresenta a média ponderada (pesos: 5, 3 e 2).

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] notas = new double[3];
		
		//informando notas
		for(int i = 0; i < notas.length; i++) {
			do {
				System.out.print("Informe as 3 notas do aluno: ");
				notas[i] = input.nextDouble();
				
				if(notas[i] > 10 || notas[i] < 0) {
					System.out.println("Opção inválida!");
				}
			} while(notas[i] > 10 || notas[i] < 0);
		}
		
		//tipo do calculo
		int tipoCalculo = 0;
		do {
			System.out.print("Informe o tipo de cálculo que deseja [1- Aritimética | 2- Ponderada]: ");
			tipoCalculo = input.nextInt();
			
			if(tipoCalculo >= 3 || tipoCalculo < 0) {
				System.out.println("Opção inválida!");
			} else if(tipoCalculo == 1) {
				calculoAritimetica(notas);
			} else {
				calculoPonderada(notas);
			}
			
		} while(tipoCalculo >= 3 || tipoCalculo < 0);
		
		input.close();
	}
	
	public static void calculoAritimetica(double []notas) {
		double totalNotas = 0;
		for(int i = 0; i < notas.length; i++) {
			totalNotas += notas[i];
		}
		
		double media = totalNotas / notas.length;
		
		System.out.println("Sua média utilizando a média aritimética é: " + media);
	}
	
	public static void calculoPonderada(double []notas) {
		double[] pesos = {5, 3, 2};
		double totalComPesos = 0;
		double somaPesos = 0;
		
		for(int i = 0; i < notas.length; i++) {
			totalComPesos += notas[i] * pesos[i];
			somaPesos += pesos[i];
		}
		
		double media = totalComPesos / somaPesos;
		
		System.out.println("Sua média utilizando a média ponderada é: " + media);
		}
}