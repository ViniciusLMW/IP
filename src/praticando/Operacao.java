package praticando;

import java.util.Scanner;

public class Operacao {
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva 2 números inteiros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int soma = num1 + num2;
        int subtração = num1 - num2;
        int multiplicação = num1 * num2;
        int divisão = num1 / num2;

        System.out.println("A soma deles é: " + soma);
        System.out.println("A subtração deles é: " + subtração);
        System.out.println("A multiplicação deles é: " + multiplicação);
        System.out.println("A divisão deles é: " + divisão);

        input.close();
    }
}
