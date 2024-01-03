//Desenvolva um programa para ler 10 números e escreva quantos desses números lidos são pares

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numerosPares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print ("Digite o " + i + " número: ");
			double num = input.nextDouble();
			
			//calculo para saber se é numero par "se o numero(num) dividido por 2 ter o resto(%) igual a 0"
			//acrescentar um numero a mais(numerosPares++)
			if(num %2 == 0) {
				numerosPares++;
			}
		}
		
		System.out.println("A quantidade de números pares é: " + numerosPares);

		input.close();
	}

}