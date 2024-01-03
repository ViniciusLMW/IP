//Desenvolva um programa que leia um texto digitado pelo usuário e exiba o texto com cada palavra em uma linha

package listas.listaStrings;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = input.nextLine();

        texto = texto.replace(".", "");
        texto = texto.replace(",", "");
        texto = texto.replace("!", "");
        texto = texto.replace("?", "");
        texto = texto.replace(";", "");

        String[] palavras = texto.split(" ");

        for(int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

        input.close();
    }
}
