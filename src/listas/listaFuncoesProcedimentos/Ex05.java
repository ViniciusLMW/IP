//Faça um programa que leia uma matriz A de tamanho 4x4. Em seguida desenvolva um método com retorno ("Função") que receba como
//parametro a matriz A e some os valores da diagonal principal. O programa deve apresentar a soma da diagonal principal da matriz A.

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		
		lerMatriz(matriz);
		
		int soma = somaValoresDiagonal(matriz);
		System.out.print("A soma da diagonal principal é: " + soma);
	}
	
	public static void lerMatriz(int[][] matriz) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe os números da matriz:");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Coluna [" + i + "] Linha [" + j + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}
		input.close();
	}
	
	//matriz[i][i] = diagonal principal da matriz
	public static int somaValoresDiagonal(int[][]matriz) {
		int soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			soma += matriz[i][i];
		}
		return soma;
	}

}