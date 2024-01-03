//Crie um programa que leia o tempo de corrida de 10 atletas em uma prova de atletismo. Em seguida, exiba na tela o tempo médio
//dos atletas e a diferença de tempo entre o atleta mais rápido e o mais lento em relação ao tempo médio.

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double[] tempoCorrida = new double [10];

        double acumuladorTempo = 0;
        for(int i = 0; i < tempoCorrida.length; i++) {
            System.out.print("Informe o tempo do " + (i+1) + "° atleta: ");
            tempoCorrida[i] = input.nextDouble();

            acumuladorTempo += tempoCorrida[i];
        }

        double media = acumuladorTempo / tempoCorrida.length;
        double maisRapido = tempoCorrida[0];
        double maisLento = tempoCorrida[0];

        for(int i = 0; i < tempoCorrida.length; i++) {
            if(tempoCorrida[i] < maisRapido) {
                maisRapido += tempoCorrida[i];
            }
            if(tempoCorrida[i] > maisLento) {
                maisLento += tempoCorrida[i];
            }
        }


        System.out.println("O tempo médio dos atletas é de: " + media);
        System.out.println("Diferença mais rapido: " + (media - maisRapido));
        System.out.println("Diferença mais lento: " + (maisLento - media));

        input.close();
    }
}
