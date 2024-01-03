package exemplos;

import java.util.Scanner;

public class UsandoIf {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = input.nextInt();

        if(num > 0) {
            System.out.println("O número é: " + num);
        }
        System.out.println("Fim do Programa!");

        input.close();
    }
}
