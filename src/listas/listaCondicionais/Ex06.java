//Crie um programa para ler o nome de 2 times de futebol e o número de gols marcados na partida (para cada time).
//Escreva o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra "Empate".

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex06 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o time que jogou a partida de futebol: ");
        String time1 = input.nextLine();
        System.out.print("Informe o time adversário que jogou a partida de futebol: ");
        String time2 = input.nextLine();
        System.out.println("Quantos gols o " + time1 + " realizou?");
        int time1Gol = input.nextInt();
        System.out.println("Quantos gols o " + time2 + " realizou?");
        int time2Gol = input.nextInt();

        if(time1Gol == time2Gol) {
            System.out.println("Houve empate!!");
            if(time1Gol > time2Gol)
            System.out.println("O time " + time1 + " ganhou a partida com " + time1Gol + " gols!!");
        } else {
            System.out.println("O time " + time2 + "ganhou a partida com " + time2Gol + " gols!!");
        }
        input.close();
    }
}
