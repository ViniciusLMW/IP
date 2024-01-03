//Faça um programa que leia uma matriz A de tamanho 4x4. O programa deve identificar qual o menor elemento e a sua posição na
//matriz.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] matrizA = new int [4][4];

		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Digite o valor da posição [" + i + "] [" + j + "]: ");
				matrizA[i][j] = input.nextInt();
			}
		}
		
		int menorNum = matrizA[0][0];
		int linha = 0;
		int coluna = 0;
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				if(matrizA[i][j] < menorNum) {
					menorNum = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("O menor elemento da matriz é de: " + menorNum);
		System.out.println("O menor elemnto está na posição [" + linha + "] [" + coluna + "] do array!");
		
		input.close();
	}

}