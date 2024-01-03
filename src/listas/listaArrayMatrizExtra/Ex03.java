//Faça um programa que leia a quantidade de andares de 10 prédios. Em seguida, exiba na tela a quantidade
//de prédios com mais de 10 andares.

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int [] predios = new int [10];

        int contPredio10andar = 0;
        for(int i = 0; i < predios.length; i++) {
            System.out.print("Informe a quantidade de andares do prédio " + (i+1) + ": ");
            predios[i] = input.nextInt();

            if(predios[i] > 10) {
                contPredio10andar++;
            }
        }
        System.out.println("A quantidade de prédios com mais de 10 andares é de: " + contPredio10andar);

        input.close();
    }
}
