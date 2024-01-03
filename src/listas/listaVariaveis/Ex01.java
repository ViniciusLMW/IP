//Crie um algoritmo que leia um valor numérico inteiro e apresente como resultado o seu antecessor e
//o seu sucessor

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex01 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva um número inteiro: ");
        int num = teclado.nextInt();

        int sucessor = num + 1;
        int antecessor = num - 1;

        System.out.println("Seu sucessor é: " + sucessor);
        System.out.println("Seu antecessor é: " + antecessor);

        teclado.close();

    }
}
