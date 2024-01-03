//Faça um programa para ler o nome de um produto, a quantidade adquirida e o preço unitário. Calcule
//e escreva o total(total = quantidade adquirida * preço unitário), o desconto e o total a pagar
//(total a pagar = total - desconto), sabendo-se que:
//- Se quantidade <= 5 o desconto será de 2%
//- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//- Se quantidade4 > 10 o desconto será de 5%

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex10 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = input.nextLine();
        System.out.print("Informe a quantidade: ");
        int quantidadeProduto = input.nextInt();
        System.out.print("Informe o preço: ");
        double precoProduto = input.nextDouble();

        double totalPagar = quantidadeProduto * precoProduto;

        if(quantidadeProduto <= 5) {
            totalPagar *= 0.2;
        }
        if(quantidadeProduto > 5 || quantidadeProduto <= 10) {
            totalPagar *= 0.3;
        }
        if(quantidadeProduto > 10) {
            totalPagar *= 0.5;
        }

        System.out.println("Será pago R$" + totalPagar + " do produto " + nomeProduto);
        input.close();
    }
    
}
