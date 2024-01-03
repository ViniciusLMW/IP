//Escreva um programa que leia a altura obtida por 10 atletas em uma prova de salto em altura. Em seguida, exiba as alturas dos
//saltos que ficaram abaixo da média.

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double[] alturaSaltos = new double[10];

        double acumuladorSaltos = 0;
        for(int i = 0; i < alturaSaltos.length; i++) {
            System.out.print("Informe a altura do salto do " + (i+1) + "° atleta: " );
            alturaSaltos[i] = input.nextDouble();
            acumuladorSaltos += alturaSaltos[i];
        }
        
        double media = acumuladorSaltos / alturaSaltos.length;

        System.out.println("Lista dos dos saltos onde altura ficou abaixo da média:");
        for(int i = 0; i < alturaSaltos.length; i++) {
            if(alturaSaltos[i] < media) {
                System.out.println(alturaSaltos[i]);
            }
        }
        
        input.close();
    }
}
