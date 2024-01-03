//Crie um programa que leia um texto digitado pelo usuário, conte o número de palavras e exiba o resultado

package listas.listaStrings;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = input.nextLine();

        texto = texto.replace(".", "");
        texto = texto.replace(",", "");
        texto = texto.replace("?", "");
        texto = texto.replace("!", "");
        texto = texto.replace(";", "");

        String[] palavras = texto.split(" ");

        System.out.println("A quantidade de palavras é: " + palavras.length);

        input.close();
    }
}
