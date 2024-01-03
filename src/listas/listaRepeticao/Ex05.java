//Desenvolva um programa para ler 10 números e escreva quantos desses números lidos são negativos

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int negativos = 0;
		
		for(int i = 1; i <=10; i++) {
			System.out.print("Digite o " + i + " número: ");
			double numero = input.nextDouble();
			
			//identificar quantos numeros negativos tem "se o numero(num) for menor que 0"
			//acrescentar um numero a mais(negativos++)
			if(numero < 0) {
				negativos++;
			}
		}
		System.out.println("A quantidade de números negativos lidos é: " + negativos);
		
		input.close();
	}
}