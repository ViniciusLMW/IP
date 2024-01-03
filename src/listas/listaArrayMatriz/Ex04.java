//Desenvolva um programa que leia 10 números(aceitar somente números positivos) e armazene em um array. O programa deve informar o 
//valor do maior e do menor número e as suas respectivas posições no array.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int [] numerosPositivos = new int [10];

        System.out.println("Informe 10 números positivos: ");

        int maiorNum = 0;
        int menorNum = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        
        for(int i = 0; i < numerosPositivos.length; i++) {
            do {
            	System.out.print("Informe o número positivo " + (i+1) + ": ");
            	numerosPositivos[i] = input.nextInt();

            	if(numerosPositivos[i] < 0) {
            		System.out.println("Número errado!");
            	}
            } while(numerosPositivos[i] < 0);

            if(i == 0 || numerosPositivos[i] > maiorNum) {
                maiorNum = numerosPositivos[i];
                posicaoMaior = i;
            }
            if(i == 0 || numerosPositivos[i] < menorNum) {
                menorNum = numerosPositivos[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O valor do maior número é de " + maiorNum + " e esta na posição " + posicaoMaior + " do Array!");
        System.out.println("O valor do menor número é de " + menorNum + " e esta na posição " + posicaoMenor + " do Array!");

        input.close();
    }
}