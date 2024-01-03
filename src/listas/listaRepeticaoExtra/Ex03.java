//Faça um programa que leia a distância (em metros) e o tempo (em minutos) das últimas cinco provas de um corredor.
//O programa ainda deve perguntar qual a distância da proxima prova que o corredor irá participar. Em posse dessas
//informações o programa deve calcular a velocidade média (em metros por segundo) do corredor e informar o tempo
//estimado que o corredor levará para finalizar a próxima corrida.

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int somaTempo = 0;
        double somaMetros = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.print("Informe a distância em metros: ");
            double distancia = input.nextDouble();
            somaMetros += distancia;
            System.out.print("Informe o tempo em minutos: ");
            int tempo = input.nextInt();
            somaTempo += tempo;
        }
        double velocidadeMedia = somaMetros / (somaTempo * 60);
        
        System.out.println("Deseja informar quanto tempo irá levar sua próxima corrida? [S - Sim | N - Não]");
        String continuar = input.next();

        switch(continuar) {
            case "s":
                System.out.println("Qual a distância que você irá percorrer em metros?");
                double proximaDistancia = input.nextDouble();
                double proximaCorrida = (proximaDistancia / velocidadeMedia) / 60;
                System.out.println("O tempo estimado para finalizar é de: " + proximaCorrida + " minutos.");
                break;

            case "n":
                System.out.println("A velocidade média das 5 provas é de: " + velocidadeMedia + "m/s");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        
        input.close();
    }
}
