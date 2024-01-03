//Faça um algoritmo que leia três notas de um aluno. Calcule e escreva a média final deste aluno.
//Considere que a média é ponderada e que o peso das notas é respectivamente 2, 3 e 5.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex07 {
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe suas 3 notas: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.println("Sua média é: " + media);

        input.close();
    }
}
