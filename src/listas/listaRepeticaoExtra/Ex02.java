//Faça um programa que leia a idade e a altura dos jogadores de um time de basquete e imprima na tela a média de
//idade dos jogadores e qual a altura do menor jogador do time. Leve em consideração apenas os titulares(cinco
//jogadores)

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex02 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int jogador = 1;
        int totalJogadores = 0;
        double menorJogador = Double.MAX_VALUE;
        for(int i = 1; i <= 5; i++) {
            System.out.print("Informe a idade do " + jogador + " jogador: ");
            int idadeJogador = input.nextInt();
            totalJogadores += idadeJogador;

            System.out.print("Informe a altura do " + jogador + " jogador: ");
            double alturaJogador = input.nextDouble();
            jogador++;

            if(alturaJogador < menorJogador) {
                menorJogador = alturaJogador;
            }
        }
        int mediaIdade = totalJogadores / 5;

        System.out.println("A média da idade de jogadores é: " + mediaIdade);
        System.out.println("O jogador com menor altura do time tem: " + menorJogador);

        input.close();
    }
    
}
