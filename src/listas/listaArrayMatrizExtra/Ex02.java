//Crie um programa que leia a área construida de 10 casas. Em seguida, informe a quantidade de casas
//que estão abaixo da média da área.

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double [] areaCasas = new double [10];

        double totalAreaCasas = 0;
        for(int i = 0; i < areaCasas.length; i++) {
            System.out.print("Informe a área da casa construida " + (i+1) + ": ");
            areaCasas[i] = input.nextDouble();
            totalAreaCasas += areaCasas[i];
        }

        double mediaArea = totalAreaCasas / 10;

        int contCasaAbaixoMedia = 0;
        for(int i = 0; i < areaCasas.length; i++) {
            if(areaCasas[i] < mediaArea) {
                contCasaAbaixoMedia++;
            }
        }

        System.out.println("A média da área das casas é de: " + mediaArea);
        System.out.println("Existem no total " + contCasaAbaixoMedia + " casas abaixo da média.");

        input.close();
    }
}
