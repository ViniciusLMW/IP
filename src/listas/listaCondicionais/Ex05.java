//Faça um programa para ler a quantidade atual de um produto em estoque. Também deverá ser informado a quantidade
//máxima e a quantidade mínima que este produto pode ter em estoque. O programa deve calcular e escrever a quantidade
//média ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem "Não é necessário efetuar a compra deste produto", senão escrever a mensagem
//"Efetuar a compra deste produto".

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade atual do produto: ");
        int estoqueAtual = input.nextInt();
        System.out.print("Informe a quantidade máxima do estoque: ");
        int estoqueMax = input.nextInt();
        System.out.print("Informe a quantidade minima do estoque: ");
        int estoqueMin = input.nextInt();

        double mediaEstoque = (estoqueMax + estoqueMin) / 2;
        System.out.println("A média do estoque é " + mediaEstoque);

        if(estoqueAtual >= mediaEstoque) {
            System.out.println("Não é necessário efetuar a compra deste produto");
        } else {
            System.out.println("Efetuar a compra deste produto");
        }
        input.close();
    }
}
