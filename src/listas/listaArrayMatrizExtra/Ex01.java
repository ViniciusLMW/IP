//Escreva um programa que leia a quantidade de quartos de 10 apartamentos. Em seguida, calcule o total
//de quartos dos apartamentos e informe a quantidade de apartamentos com 3 quartos.

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int [] apartamentos = new int[10];

        int totalQuartoApartamentos = 0;
        int contApartamento3Quarto = 0;
        for(int i = 0; i < apartamentos.length; i++) {
            System.out.print("Informe quantos quartos tem no apartamento " + (i+1) + ": ");
            apartamentos[i] = input.nextInt();
            totalQuartoApartamentos += apartamentos[i];

            if(apartamentos[i] == 3) {
                contApartamento3Quarto++;
            }
        }
        System.out.println("O total de quartos que tem nos apartamentos é de: " + totalQuartoApartamentos);
        System.out.println("A quantidade de apartamentos com 3 quartos é de: " + contApartamento3Quarto);

        input.close();
    }
}
