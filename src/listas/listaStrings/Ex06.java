//Crie um programa onde o usuário irá digitar uma palavra e apresente as seguintes informações:
//- O número de caracteres da palavra;
//- A palavra com todas as letras maiusculas;
//- O número de vogais da palavra;
//- Se a palavra digitada começa com um termo a ser digitado pelo usuário;
//- Se a palavra digitada termina com um termo a ser digitado pelo usuário;

package listas.listaStrings;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();
        System.out.print("Digite o termo: ");
        String termo = input.nextLine();
        
        System.out.println("=========================");
        System.out.println("O número de caracteres é: " + palavra.length());
        System.out.println("Palavra com letra maiuscula: " + palavra.toUpperCase());

        int qtdeVogais = 0;
        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.substring(i, i+1).toLowerCase().equals("a")
                || palavra.substring(i, i+1).toLowerCase().equals("e")
                || palavra.substring(i, i+1).toLowerCase().equals("i")
                || palavra.substring(i, i+1).toLowerCase().equals("o")
                || palavra.substring(i, i+1).toLowerCase().equals("u")) {
                qtdeVogais++;
            }
        }
        System.out.println("O número total de vogais é: " + qtdeVogais);

        System.out.println("A palavra inicia com o termo: " + (palavra.startsWith(termo)? "Sim" : "Não"));
        System.out.println("A palavra finaliza com o termo: " + (palavra.endsWith(termo)? "Sim" : "Não"));

        input.close();
        
    }
}
