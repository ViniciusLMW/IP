//Faça um programa que leia uma matriz A de tamanho 3x3. Em seguida desenvolva um método sem retorno("procedimento") que receba como
//paramêtro a matriz A e identifique a posição do menor número da matriz. O programa deve apresentar a posição e o menor elemento da
//matriz A

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String [] args) {
        int[][] matrizA = new int[3][3];

        lerMatrizA(matrizA);
        impressaoMatrizA(matrizA);
        identificarMenorElemento(matrizA);
    }

    static void lerMatrizA (int[][] matrizA) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Informe a coluna [" + i + "] Linha [" + j + "]: ");
                matrizA[i][j] = input.nextInt();
            }
        }
        input.close();
    }

    static void impressaoMatrizA(int[][] matrizA) {
        System.out.println("===============Matriz A===============");
        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void identificarMenorElemento (int[][] matrizA) {
        int menorElemento = matrizA[0][0];
        int coluna = 0;
        int linha = 0;
        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                if(matrizA[i][j] < menorElemento) {
                    menorElemento += matrizA[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O menor elemento é: " + menorElemento);
        System.out.println("Está na coluna [" + coluna + "] Linha [" + linha + "]");
    }
}
