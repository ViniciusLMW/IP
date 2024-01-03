//Desenvolva um programa que leia as notas da primeira e segunda avaliações de um aluno. Calcule a média aritmética simples e
//escreva uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 7 o aluno é aprovado).
//Escreva também a média calculada.

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex02 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua nota da 1 avaliação: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe sua nota da 2 avaliação: ");
        double nota2 = input.nextDouble();

        double mediaNota = (nota1 + nota2) / 2;

        if(mediaNota >= 7) {
            System.out.println("Você foi aprovado e tirou " + mediaNota + " na média!!");
        } else {
            System.out.println("Você foi reprovado e tirou " + mediaNota + " na média!!");
        }
        input.close();
    }
}
