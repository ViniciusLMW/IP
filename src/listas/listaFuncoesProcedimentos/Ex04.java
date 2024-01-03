//Faça um programa que leia uma matriz A de tamanho 3x4. Em seguida desenvolva um método com retorno("Função") que receba
//como parametro a matriz A e contabilize os numeros pares. o programa deve apresentar quantos números pares a matriz A possui.

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int[][] matriz = new int [3][4];
		
		lerMatriz(matriz);

		int quantidadePar = contandoNumPares(matriz);
		System.out.println("A quantidade de pares na Matriz A são no total: " + quantidadePar);
	}

	//forma de preencher com números aleatórios sem precisar usar escrever usando Scanner
	//public static void preencherMatriz(int[][] matriz) {
	//	Random gerador = new Random();
	//	for(int = 0; i < matriz.length; i++) {
	//		for(int j = 0; j < matriz[i].length; j++) {
	//			matriz[i][j] = gerador.nextInt(10);
	//		}
	//	}
	//}

	//imprimindo a matriz
	//public static void imprimirMatriz(int[][] matriz) {
	//	for(int i = 0; i < matriz.length; i++) {
	//		for(int j = 0; j < matriz[i].lenght; j++) {
	//			System.out.print(matriz[i][j] + " ");
	//		}
	//		System.out.println();
	//	}
	//}
	
	public static void lerMatriz(int [][] matriz) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe os números da matriz: ");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Coluna [" + i + "] Linha [" + j + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}
		input.close();
	}

	public static int contandoNumPares(int [][] matriz) {
		int quantidadePar = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] % 2 == 0) {
					quantidadePar++;
				}
			}
		}
		return quantidadePar;
	}
}