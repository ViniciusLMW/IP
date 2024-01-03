//Desenvolva um programa que faça cinco perguntas investigativas sobre um crime. As perguntas são:
//- Você já trabalhou com a vítima?
//- Você telefonou para a vítima?
//- Você mora próxima a vítima?
//- Você devia dinheiro a vítima?
//- Você esteve no local do crime?
//O programa ao final deve emitir uma classificação sobre a participação do entrevistado no crime segundo a tabela abaixo:
//Quantidade de SIM:
//- 0 ou 1 = Inocente
//- 2 = Suspeita
//- 3 ou 4 = Cúmplice
//- 5 = Assasino

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Você já trabalhou com a vítima? [S - SIM | N - NÃO]: ");
		String resp1 = input.nextLine();
		System.out.print("Você telefonou para a vítima? [S - SIM | N - NÃO]: ");
		String resp2 = input.nextLine();
		System.out.print("Você mora próxima a vítima? [S - SIM | N - NÃO]: ");
		String resp3 = input.nextLine();
		System.out.print("Você devia dinheiro a vítima? [S - SIM | N - NÃO]: ");
		String resp4 = input.nextLine();
		System.out.print("Você esteve no local do crime? [S - SIM | N - NÃO]: ");
		String resp5 = input.nextLine();

		int contador = 0;
		if(resp1.equals("s") || resp1.equals("S")) {
			contador++;
		}
		if(resp2.equals("s") || resp2.equals("S")) {
			contador++;
		}
		if(resp3.equals("s") || resp3.equals("S")) {
			contador++;
		}
		if(resp4.equals("s") || resp4.equals("S")) {
			contador++;
		}
		if(resp5.equals("s") || resp5.equals("S")) {
			contador++;
		}

		if(contador == 0 || contador == 1) {
			System.out.println("O entrevistado é Inocente");
		} else if(contador == 2) {
			System.out.println("O entrevistado é Suspeito");
		} else if(contador == 3 || contador == 4) {
			System.out.println("O entrevistado é Cúmplice");
		} else if(contador == 5) {
			System.out.println("O entrevistado é o Assasino");
		}

		input.close();
	}
}
