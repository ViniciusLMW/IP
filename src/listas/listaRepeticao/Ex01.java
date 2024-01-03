//Desenvolva um programa para ler 2 números. Se o segundo número informado for "0" (zero), o programa deverá
//apresentar a mensagem de "Valor Inválido!", e deve ler o segundo número novamente, ou seja, o programa não pode
//aceitar o valor zero para o segundo número. O programa deve imprimir o resultado da divisão do primeiro número
//pelo segundo número

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe dois números abaixo:");
		System.out.print("Digite o primeiro número: ");
		double num1 = input.nextDouble();
		
		double num2;
		
		do {
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			if(num2 == 0) {
				System.out.println("Número Inválido!");
			}
		} while (num2 == 0);
		
		double divisao = num1 / num2;
		
		System.out.println("O resultado da divisão é: " + divisao);
		
		input.close();
	}

}