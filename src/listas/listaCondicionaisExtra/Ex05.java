//Faça um programa para simular o saque em um caixa eletrônico. O usuário irá informar o valor que
//deseja sacar e o programa irá informar quantas notas de cada valor serão fornecidas. As notas disponíveis
//serão de 1, 5, 10, 50 e 100 reais. O valor mínimo é de R$10,00 e o máximo de R$1000,00.
//Exemplos: Para sacar a quantia de R$245,00 o programa deve fornecer duas notas de R$100,00, quatro notas
//de R$10,00 e uma nota de R$5,00.

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Informe o valor do saque: ");
        int saque = input.nextInt();
        
        if(saque >= 10 && saque <= 1000) {
        	if(saque >= 100) {
        		int notas100 = saque / 100;
        		saque = saque - (notas100 * 100);
        		System.out.println("Notas de R$100,00: " + notas100);
        	}
        	if(saque >= 50) {
        		int notas50 = saque / 50;
        		saque = saque - (notas50 * 50);
        		System.out.println("Notas de R$50,00: " + notas50);
        	}
        	if(saque >= 10) {
        		int notas10 = saque / 10;
        		saque = saque - (notas10 * 10);
        		System.out.println("Notas de R$10,00: " + notas10);
        	}
        	if(saque >= 5) {
        		int notas5 = saque / 5;
        		saque = saque - (notas5 * 5);
        		System.out.println("Notas de R$5,00: " + notas5);
        	}
        	if(saque >= 1) {
        		int notas1 = saque / 1;
        		System.out.println("Notas de R$1,00: " + notas1);
        	}
        } else {
        	System.out.println("Valor fora do limete de R$10,00 a R$1000,00");
        }
		input.close();
    }
}
