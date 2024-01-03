//Desenvolva um programa que leia e armazene 10 nomes em um array. Apresente os nomes na ordem de leitura e depois na ordem inversa
//da leitura.

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nomes = new String [10];

		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Informe o nome " + (i+1) + ":");
			nomes[i] = input.nextLine();
		}
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("=======================");
		
		for(int i = nomes.length-1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
		input.close();
	}

}