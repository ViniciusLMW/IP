//Em uma feira, as maçãs custam R$1,30 cada se forem compradas menos de uma dúzia, e R$1,00 se forem compradas pelo menos 12.
//Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex01 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantas maçãs foram compradas: ");
        int quantidadeMaca = input.nextInt();

        if(quantidadeMaca > 12) {
            double duziaMaior = quantidadeMaca * 1;
            System.out.println("O total gasto da compra é de R$" + duziaMaior);
        } else {
            double duziaMenor = quantidadeMaca * 1.30;
            System.out.println("O total gasto da compra é de R$" + duziaMenor);
        }
        input.close();
    }
}
