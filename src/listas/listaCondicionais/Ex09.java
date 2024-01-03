//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//Morango:
//- Até 5KG = R$2,50 por KG
//- Acima de 5KG = R$2,20 por KG
//Maçã:
//- Até 5KG = R$1,80 por KG
//- Acima de 5KG = R$1,50 por KG
//Se o cliente comprar mais de 8KG em frutas ou o valor total da compra ultrapassar R$25,00,
//receberá ainda um desconto de 10% sobre este total. Desenvolva um programa para ler a quantidade(em KG)
//de morangos e a quantidade(em KG) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex09 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de morangos em KG: ");
        int morangoKG = input.nextInt();
        System.out.print("Informe a quantidade de maçãs em KG: ");
        int macaKG = input.nextInt();

        double precoMorango;
        if(morangoKG <= 5) {
            precoMorango = morangoKG * 2.50;
        } else {
            precoMorango = morangoKG * 2.20;
        }
        double valorMorango = morangoKG * precoMorango;
    
        double precoMaca;
        if(macaKG <= 5) {
            precoMaca = macaKG * 1.80;
        } else {
            precoMaca = macaKG * 1.50;
        }
        double valorMaca = macaKG * precoMaca;

        double valorTotal = valorMaca + valorMorango;

        if(morangoKG + macaKG > 8 || valorTotal > 25) {
            valorTotal *= 0.10;
        }
        System.out.println("Você terá pago o total de R$" + valorTotal);
        input.close();
    }
}
