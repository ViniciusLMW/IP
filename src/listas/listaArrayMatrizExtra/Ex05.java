//Faça um programa que leia a quantidade de medalhas de 10 paises em uma competição esportiva. Em seguida, exiba na tela o nome
//do pais com a maior quantidade de medalhas

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int[] medalhas = new int [10];
        String[] paises = new String [10];

        for(int i = 0; i < medalhas.length; i++) {
                System.out.print("Informe o nome do " + (i+1) + "° país: ");
            paises[i] = input.nextLine();
            System.out.print("Informe a quantidade de medalhas: ");
            medalhas[i] = input.nextInt();

            input.nextLine();
        }

        int indice = 0;
        int maisMedalhas = medalhas[0];
        for(int i = 0; i < medalhas.length; i++) {
            if(medalhas[i] > maisMedalhas) {
                maisMedalhas += medalhas[i];
                indice = i;
            }
        }

        System.out.println("O pais com mais medalhas é " + paises[indice] + " com " + maisMedalhas + " medalhas!");

        input.close();
    }
}
