//Crie um programa onde o usuário irá digitar uma frase. Depois o programa deverá solicitar que o usuário digite uma palavra.
//O programa deve apresentar a frase digitada, a palavra digitada, bem como a quantidade de vezes que a palavra digitada aparece
//na frase.

package listas.listaStrings;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = input.nextLine();
        System.out.print("Informe a palavra de busca: ");
        String palavra = input.nextLine();

        String[] listaPalavras = frase.split(" ");

        int contadorPalavra = 0;
        for(int i = 0; i < listaPalavras.length; i++) {
            if(listaPalavras[i].equals(palavra)) {
                contadorPalavra++;
            }
        }

        System.out.println("==========================");
        System.out.println("A Frase digitada:");
        System.out.println(frase);
        System.out.println("==========================");
        System.out.println("A palavra de busca:");
        System.out.println(palavra);
        System.out.println("Quantas vezes se repetiu: " + contadorPalavra);
        System.out.println("==========================");

        input.close();
    }

}
