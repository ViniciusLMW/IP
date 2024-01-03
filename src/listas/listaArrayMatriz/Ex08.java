//Faça um programa que leia uma matriz A e uma matriz B, ambas de tamanho 3x3. O programa deve gerar uma matriz Resultado que
//é a soma da matriz A com a matriz B. Apresente a matriz A, B e o Resultado.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] matrizA = new int [3][3];
		int [][] matrizB = new int [3][3];
		int [][] matrizResultado = new int [3][3];
		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Digite o valor da posição [" + i + "] [" + j + "] Matriz A:" );
				matrizA[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[i].length; j++) {
				System.out.print("Digite o valor da posição [" + i + "] [" + j + "] Matriz B:" );
				matrizB[i][j] = input.nextInt();
			}
		}
		
		//soma das matrizes
		for(int i = 0; i < matrizResultado.length; i++) {
			for(int j = 0; j < matrizResultado.length; j++) {
				matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		//resultado
		System.out.println("Matriz A:");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=======================");
		
		System.out.println("Matriz B:");
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		System.out.println("Matriz Resultado:");
		for(int i = 0; i < matrizResultado.length; i++) {
			for(int j = 0; j < matrizResultado[i].length; j++) {
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}

}
  