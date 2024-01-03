//Faça um programa para ler as 3 notas obtidas por um aluno nas 3 avaliações e a média dos exercícios
//que fazem parte da avaliação. Calculer a média, usando a fórmular abaixo e escreva o conceito do aluno
//de acordo com a tabela de conceitos mais abaixo:
//- Média de aproveitamento = (N1 + (N2 * 2) + (N3 * 3) + Média dos exercicios))/7
//A atribuição de conceitos obedece a tabela abaixo:
//Média aproveitamento:
//- >= 9,0 = A;
//- >= 7,5 e < 9,0 = B;
//- >= 6,0 e < 7,5 = C;
//- < 6,0 = D.

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex11 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a nota da avaliação 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a nota da avaliação 2: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe a nota da avaliação 3: ");
        double nota3 = input.nextDouble();

        double mediaNota = (nota1 + nota2 + nota3) / 3;
        double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaNota) / 7;

        if(mediaAproveitamento >= 9.0) {
            System.out.println("O aluno tirou nota A!!");
        }
        if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            System.out.println("O alundo tirou nota B!!");
        }
        if(mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            System.out.println("O aluno tirou nota C!!");
        }
        if(mediaAproveitamento < 6.0) {
            System.out.println("O alundo tirou nota D!!");
        }
        input.close();
    }
}
