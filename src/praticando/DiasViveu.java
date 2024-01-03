package praticando;

import java.util.Scanner;

public class DiasViveu {
     public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();

        int tempoViveu = idade * 365; //365 dias

        System.out.println("Você viveu " + tempoViveu + " dias!");

        input.close();
    }
}