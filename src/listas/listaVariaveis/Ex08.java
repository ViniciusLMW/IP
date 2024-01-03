//Mariazinha comprou um saco de ração para gatos com peso em quilos. Ela possui dois gatos, o Caramelo e o Frajola,
//para os quais fornece a quantidade de ração em gramas. A quantidade diária de ração fornecida para cada gato é
//sempre a mesma. Faça um algoritmo que receba o peso do saco de ração e a quantidade de ração fornecida para cada
//gato, calcule e apresente quanto restará de raçao no saco após cinco dias.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex08 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o peso do saco de ração em KG: ");
        double pesoSacoRacao = input.nextDouble();
        System.out.print("Informe a quantidade em gramas da ração do Frajola: ");
        double racaoGramasFrajola = input.nextDouble();
        System.out.print("Informe a quantidade em gramas de ração de Caramelo: ");
        double racaoGramasCaramelo = input.nextDouble();

        double consumoGato = (racaoGramasCaramelo + racaoGramasFrajola) * 5;
        double restoRacaoSaco = (pesoSacoRacao * 1000) - consumoGato;

        System.out.println("Resta no saco de ração: " + restoRacaoSaco + " gramas.");
        System.out.println("Resta no saco de ração: " + (restoRacaoSaco/1000) + " quilos.");

        input.close();
    }
}
