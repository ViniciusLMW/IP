package praticando;

import java.util.Scanner;

public class Soma {
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira 2 números inteiros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int soma = num1 + num2;

        System.out.print("A soma dos números é: " + soma);
        
        input.close();
    }
}
