//Uma revendedora de carros usados paga ao seu vendedo um salário fixo por mês, mais uma comissão fixa
//para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escreva um algoritmo que leia 
//o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
//recebe por carro vendido. O algoritmo deve calcular e paresentar o salário final do vendedor.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex06 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de carro vendidos: ");
        int carrosVendidos = input.nextInt();
        System.out.print("Informe o valor total das vendas: ");
        double totalVendas = input.nextDouble();
        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = input.nextDouble();
        System.out.print("Informe a comissão por carro vendido: ");
        double comissaoPorCarro = input.nextDouble();

        double salario = salarioFixo + (carrosVendidos * comissaoPorCarro) + (totalVendas * 0.05);

        System.out.println("O salário do funcionário: " + salario);

        input.close();
    }
}
