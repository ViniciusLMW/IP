//Faça um programa que calcule e apresente o salário líquido de um funcionário. O usuário irá informar o salário bruto.
//Sabe-se que o desconto do INSS corresponde a de 10% do salário bruto e o imposto de renda segue a tabela abaixo:
//Salário(descontado o INSS):
//- Menor que R$1000,00 = 5% de imposto
//- Entre R$1000,00 e R$3000,00 = 10% de imposto
//- Acima de R$3000,00 = 20% de imposto

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        double salario = input.nextDouble();

        salario *= 0.9; // salario = salario * 0.9

        if(salario < 1000) {
            salario *= 0.95; //5%
            } else {
                if(salario > 3000) {
                        salario *= 0.80; //20%
            } else {
                salario *= 0.90; //10%
            }
        }
            System.out.println("Salário líquido: R$" + salario);

        input.close();
    }
}
