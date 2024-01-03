//Joaquim foi na padaria e realizou a compra de vários produtos. Crie um programa que leia o preço dos produtos 
//comprados por Joaquim e ao final informe quantos produtos foram comprados, qual o preço total da compra e o
//preço médio por produto

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int continuar = 1;
        int totalProduto = 0;
        int acumuladorProduto = 1;
        double precoTotal = 0;
        double mediaProdutos = 0;

        do{
            System.out.print("Informe o preço do " + acumuladorProduto + " produto: ");
            double precoProduto = input.nextDouble();
            precoTotal += precoProduto;
            acumuladorProduto++;
            totalProduto++;

            System.out.print("Deseja continuar? 1- Sim | 2- Não: ");
            continuar = input.nextInt();

            mediaProdutos = precoTotal / totalProduto; 

            if(continuar == 2) {
                System.out.println("Foram comprados " + totalProduto + " produtos");
                System.out.println("O total dos produtos é: R$" + precoTotal);
                System.out.println("A média dos produtos é: R$" + mediaProdutos);
            }
            if(continuar > 2) {
                System.out.println("Número incorreto, tente novamente!");
            }
        } while(continuar == 1);

        input.close();
    }
    
        
    
}
