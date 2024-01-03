//Desenvolva um programa que leia e armazene 10 números em um array. Depois desenvolva métodos
//("procedimentos ou funções") para ordenar o array de forma crescente e decrescente. O programa deve
//solicitar que o usuário defina se quer ordenamento crescente ou decrescente. Por final o programa deve
//apresentar o resultado.

package listas.listaFuncoesProcedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int[] numeros = new int[10];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um números: ");
			numeros[i] = input.nextInt();
		}
		
		System.out.println("Escolha o tipo de ordenação.");
		System.out.println("1 - Ordenação Crescente");
		System.out.println("2 - Ordenação Decrescente");
		System.out.println("Digite a sua opção: ");
		int opcao = input.nextInt();
		
		if(opcao == 1) {
			ordenarArrayCrescente(numeros);
		} else {
			ordenarArrayDecrescente(numeros);
		}
		input.close();
	}
	
	static void ordenarArrayCrescente(int[] numeros) {
		Arrays.sort(numeros);
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	static void ordenarArrayDecrescente(int[] numeros) {
		Arrays.sort(numeros);
		for(int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
    }
}
