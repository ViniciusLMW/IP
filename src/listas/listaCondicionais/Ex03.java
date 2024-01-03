//Crie um programa que leia a hora de inicio e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e
//calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode inciar em um
//dia e terminar no dia seguinte.

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex03 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o horário de inicio em horas inteiras: ");
        int inicio = input.nextInt();
        System.out.print("Informe o horário do fim do jogo em horas inteiras: ");
        int fim = input.nextInt();
        
        int duracao;

        if(inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }
        System.out.println("A duração do jogo foi de " + duracao + " horas.");
        input.close();
    }
}
