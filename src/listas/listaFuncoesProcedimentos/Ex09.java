//Faça um programa que leia e armazene 10 números em um array. Desenvolva um método com retorno("função") que
//receba o array como parâmetro e devolva um array como retorno, sendo que os elementos deverão estar ordenados
//de forma crescente de pares seguido de forma crescente de ímpares. O programa deve apresentar o array original
//e o ajustado.

package listas.listaFuncoesProcedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número: ");
			numeros[i] = input.nextInt();
		}
		imprimirArray(numeros);
		System.out.println("\n------------------");
		numeros = ordenarArrayParImpar(numeros);
		imprimirArray(numeros);
		
		input.close();
	}
	
	static void imprimirArray(int[] numeros) {
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " ");
		}
	}
	
	static int[] ordenarArrayParImpar(int[] numeros) {
		Arrays.sort(numeros);
		int indice = 0;
		int[] ajustado = new int[numeros.length];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				ajustado[indice] = numeros[i];
				indice++;
			}
		}
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 != 0) {
				ajustado[indice] = numeros[i];
				indice++;
			}
		}
		return ajustado;
    }
}
