//O custo de um carro novo para o consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos(aplicados ao custo de fábrica). Supondo que o percentual do
//distribuidor seja de 28% e dos impostos de 45%. Escreva um algoritmo para ler o modelo de um carro,
//o seu custo de fábrica e escreva o modelo do carro e seu custo final ao consumidor.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex05 {
    //private static final double DISTRIBUICAO = 0.45;
    //private static final double IMPOSTO = 0.28;
    public static void main(String [] args ) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o modelo do carro: ");
        String modeloCarro = input.nextLine();
        System.out.print("Informe o custo de fábrica do carro: ");
        double custoFabrica = input.nextDouble();

        double distribuidor = custoFabrica * 0.28;
        double imposto = custoFabrica * 0.45;

        System.out.println("O modelo de carro é: " + modeloCarro);
        System.out.println("Possui o preço de venda de: R$" + (custoFabrica + distribuidor + imposto));

        //outra forma

        //double distribuidor = custoFabrica * DISTRIBUICAO;
        //double imposto = custoFabrica * IMPOSTO;
        //double precoFinal = custoFabrica * distribuidor + imposto;
        //System.out.println("O modelo do carro é: " + modelo);
        //System.out.println("Tem o preço de venda de: R$" + precoFinal);
       
        input.close();
    }
}
