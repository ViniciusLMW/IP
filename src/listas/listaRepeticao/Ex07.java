//Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa que permita a entrada
//das seguintes informações:
//- O número total de mercadorias no estoque
//- O valor de cada mercadoria
//Ao final imprima o valor total em estoque e a média do valor das mercadorias

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex07 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número total do estoque: ");
        int totalMercadoria = input.nextInt();

        double soma = 0;

        for(int i = 1; i <= totalMercadoria; i++) {
            System.out.print("Digite o valor da mercadoria " + i + " R$");
            double valorMercadoria = input.nextDouble();
            soma += valorMercadoria;
        }

        double media = soma / totalMercadoria;

        System.out.println("O valor total em estoque é " + soma + " e a média das mercadorias é " + media);

        input.close();
    }
}
