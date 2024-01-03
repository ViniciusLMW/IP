//Desenvolva um programa para ler 10 números e escreva a média desses números lidos

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double soma = 0;
		double media;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + " número: ");
			double num = input.nextDouble();
			//Acresentando um numero com a variavel "soma" e mudando o valor de "num" (+=)
			soma += num;
		}
		
		media = soma / 10;
		
		System.out.println("A média dos números lidos é: " + media);
		
		input.close();
	}

}