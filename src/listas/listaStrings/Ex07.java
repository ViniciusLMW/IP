//Faça um programa que leia uma palavra digitada pelo usuário e a demonstre conforme o exemplo abaixo:

//-J
//-JA
//-JAV
//-JAVA
//-JAV
//-JA
//-J

package listas.listaStrings;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe uma palavra: ");
		String palavra = input.nextLine();
		
		for(int i = 0; i < palavra.length(); i ++) {
			System.out.println(palavra.substring(0, i+1));
		}
		for(int i = palavra.length() - 1; i >= 0; i--) {
			System.out.println(palavra.substring(0, i));
		}
		
		input.close();
	}

}