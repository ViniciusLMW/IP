//Escreva um programa que leia e armazene 10 números e armazene-os em um array. Após as leituras o programa deve solicitar ao
//usuário um novo número. O programa deve informar quantas vezes esse número aparece no array.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int [10];
		
		int contadorNum = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o número inteiro " + (i+1) + ":");
			numeros[i] = input.nextInt();
		}
		
		System.out.print("Informe um número: ");
		int numeroInformado = input.nextInt();

		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == numeroInformado) {
				contadorNum++;
			}
		}
		
		System.out.print("O número " + numeroInformado + " se repetiu " + contadorNum + " vezes!");
		
		input.close();
	}

}