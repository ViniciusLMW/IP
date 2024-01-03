//Crie um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar o ano com 365 dias e os meses com 30 dias.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex02 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantos anos completos você tem: ");
        int ano = input.nextInt();
        System.out.print("Informe quantos meses completos você tem: ");
        int meses = input.nextInt();
        System.out.print("Informe quantos dias completos você tem: ");
        int dias = input.nextInt();

        int diasViveu = (ano * 365) + (meses * 30) + dias;

        System.out.println("Você já viveu " + diasViveu + " dias!");
        
        input.close();
    }
}
