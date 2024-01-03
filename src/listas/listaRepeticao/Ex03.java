//Faça um programa para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escreva a tabuada do valor lido

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.print("Digite um valor inteiro entre 1 e 10: ");
			valor = input.nextInt();
		} while (valor < 1 || valor > 10);
		
		System.out.println("Tabuada do valor" + valor + ":");
		//repetir de 1 a 10 "(i) tem valor 1, se o i for menor ou igual(<=) a 10, acrescentar um numero a mais(i++)"
		for (int i = 1; i <= 10; i++) {
			int resultado = valor * i;
			System.out.println(valor + "x" + i + " = " + resultado);
		}
		input.close();

	}

}