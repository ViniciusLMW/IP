//Desenvolva um programa para simular uma calculadora com as operações de adição, subtração, divisão e 
//multiplicação. As operações são apenas de dois números. Desenvolva métodos para as operações e o programa
//além de mostrar o resultado da operação selecionada pelo usuário deve permitir que ele possa executar
//quantas operações ele desejar até que ele decida encerrar o programa

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int continuar = 0;
		do {
			apresentarOpcoesMenu();
			int operacao = input.nextInt();
			System.out.print("Informe o primeiro número: ");
			double numeroA = input.nextDouble();
			System.out.println("Informe o segundo número: ");
			double numeroB = input.nextDouble();
			switch(operacao) {
				case 1: {
					double soma = somar(numeroA, numeroB);
					System.out.println("Resultado de soma: " + soma);
					break;
				}
				case 2: {
					System.out.println("Resultado da subtração: " + subtrair(numeroA, numeroB));
					break;
				}
				case 3: {
					multiplicar(numeroA, numeroB);
					break;
				}
				case 4: {
					dividir(numeroA, numeroB);
					break;
				}
				default: {
					System.out.println("Opção inválida!");
				}
			}
			
			System.out.print("Deseja continuar? [1 - Sim | 2 - Não]: ");
			continuar = input.nextInt();
		} while (continuar == 1);
		
		input.close();
	}
	
	static void apresentarOpcoesMenu() {
		System.out.println("Cálculadora Básica");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
	}

	static double somar(double numA, double numB) {
		return numA + numB;
	}
	
	static double subtrair(double numA, double numB) {
		double resultado = numA - numB;
		return resultado;
	}
	
	static void multiplicar(double numA, double numB) {
		System.out.println("O resultado da multiplicação é: " + (numA * numB));
	}
	
	static void dividir(double numA, double numB) {
		//double resultado = 0;
		//if(numB != 0) {
		//	resultado = numA / numB;
		//} else {
		//		System.out.println("Não é possivel dividir um número por zero!");
		
		double resultado = numA / numB;
		System.out.println("O resultado da divisão é: " + resultado);
    }
}
