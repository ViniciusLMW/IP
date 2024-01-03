//Faça um programa que leia uma matriz A de tamanho 3x3. Em seguida o programa deve solicitar um número ao usuário e gerar
//uma matriz Resultado (os elementos da matriz A multiplicado pelo valor informado pelo usuário). Apresente a matriz A e a
//matriz Resultado.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] matrizA = new int[3][3];
		int [][] matrizResultado = new int [3][3];
		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Digite o valor da posição [" + i + "] [" + j + "]: ");
				matrizA[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Digite o número a ser multiplicado pela matriz A: ");
		int numMulti = input.nextInt();
		
		for(int i = 0; i < matrizA.length;i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				matrizResultado[i][j] = matrizA[i][j] * numMulti;
			}
		}
		
		System.out.println("Matriz A:");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz Resultado: ");
		for(int i = 0; i < matrizResultado.length; i++) {
			for(int j = 0; j < matrizResultado[i].length; j++) {
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
		
	}

}