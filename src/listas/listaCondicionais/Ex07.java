//Um posto de combustível está vendendo seus combustíveis com a seguinte tabela de descontos:
//Álcool:
//- Até 20 litros, desconto de 3% por litro
//- Acima de 20 litros, desconto de 5% por litro
//Gasolina:
//- Até 20 litros, desconto de 4% por litro
//- Acima de 20 litros, desconto de 6% por litro
//Desenvolva um programa que leia o número de litros vendidos e o tipo de combustível (codificado
//da seguinte forma: A -> Álcool, G -> Gasolina), calcule e imprima o valor a ser pago pelo cliente
//sabendo-se que o preço do litro da gasolina é R$6,90 e o preço do litro do álcool é R$6,20.

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex07 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantos litros de combustivel deseja: ");
        int litros = input.nextInt();
        System.out.print("Informe o tipo de combustivel, (1) Álcool (2) Gasolina: ");
        int tipoGas = input.nextInt();

        switch(tipoGas){
            case 1: {
                if(litros <= 20) {
                    double precoAlcoolDesconto3 = (litros * 6.20) * 0.3;
                    System.out.println("Você gastou um total de R$" + precoAlcoolDesconto3);
                } else {
                    double precoAlcoolDesconto5 = (litros * 6.20) * 0.5;
                    System.out.println("Você gastou um total de R$" + precoAlcoolDesconto5);
                }
            break;
            }
            case 2: {
                if(litros > 20) {
                    double precoGasolinaDesconto6 = (litros * 6.90) * 0.6;
                    System.out.println("Você gastou um total de R$" + precoGasolinaDesconto6);
                } else {
                    double precoGasolinaDesconto4 = (litros * 6.90) * 0.4;
                    System.out.println("Você gastou um total de R$" + precoGasolinaDesconto4);
                }
            break;
            }
            default: {
                System.out.println("Número inválido, tente novamente.");
                break;
            }
        }
        input.close();
    }
}
