//Faça um programa que leia e armazene 10 números em um array. Após isto, o programa deve ordenar os números e apresentar o
//array ordenado de forma crescente.

package listas.listaArrayMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numeros = new int [10];
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número " + (i+1) + ": ");
			numeros[i] = input.nextInt();
		}
		
		System.out.println("\n----------------");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		Arrays.sort(numeros);
		System.out.println("\n----------------");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//2 forma sem utilizar "Arrays.sort"
		
		//String[] nomes = ("Vicente", "Wesley", "Mateus", "Adriano", "Leonardo");
		//Arrays.sort(nomes);
		//System.out.println("\n----------------");
		//for(int i = 0; i < nomes.length; i++) {
		//	System.out.print(nomes[i] + " ");
		//}
		
		//for(int i = 0; i < numeros.length; i++) {
		//	System.out.print("Digite o número " + (i+1) + ": ")
		//	numeros[i] = input.nextInt();
		//}
		
		//System.out.println("\n----------------");
		
		//for(int i = 0; i < numeros.length; i++) {
		//	System.out.print(numeros[i] + " ");
		//}
	
		//for(int j = 0; j < numeros.length - 1; j++) {
		//	for(int i = 0; i < numeros.length - 1; i++) {
		//		if(numeros[i] > numeros[i+1]) {
		//			int auxiliar = numeros[i];
		//			numeros[i] = numeros[i+1];
		//			numeros[i+1] = auxiliar;
		//		}
		//	}
		//}
		
		//System.out.println("\n----------------");
		//for(int i = 0; i < numeros.length; i++) {
		//	System.out.print(numeros[i] + " ");
		//}
		
		input.close();
	}

}