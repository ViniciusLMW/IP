//Escreva um programa que leia 10 números e armazene-os em um array. Após as leituras o programa deve solicitar ao usuário um
//novo número. O programa deve fazer uma busca no array e escrever a mensagem "Achei!", se o número estiver entre os 10
//armazenados, ou "Não achei." caso contrário.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int [10];
		
		int encontrouCont = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número inteiro " + (i+1) + ":");
			numeros[i] = input.nextInt();
		}
		System.out.print("Digite um número para buscar: ");
		int buscarNumero = input.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == buscarNumero) {
				encontrouCont++;
			}
		}
		
		if(encontrouCont > 0) {
			System.out.println("Achei!");
		} else {
			System.out.println("Não achei.");
		}
		input.close();
	}

}