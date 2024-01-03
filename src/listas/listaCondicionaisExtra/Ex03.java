//Faça um programa onde o usuário irá informar um ano e o programa informará se esse ano é um ano bissexto.

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex03 {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = input.nextInt();
		
		
		String mensagem = "Esse ano não é bissexto.";
		
		if(ano % 4 == 0) {
			if(ano % 100 == 0) {
				if(ano % 400 == 0) {
					mensagem = "Esse ano é bissexto.";
				}
			} else {
				mensagem = "Esse ano é bissexto.";
			}
		}
		System.out.println(mensagem);
        
		input.close();
	}

}
