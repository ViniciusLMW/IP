//Faça um programa que leia uma palavra digitada pelo usuário e a apresente invertida (de trás pra frente)

package listas.listaStrings;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        char[] letras = palavra.toCharArray();

        for(int i = palavra.length()-1; i >= 0; i--) {
            System.out.print(letras[i]);
        }

        input.close();
    }
}
