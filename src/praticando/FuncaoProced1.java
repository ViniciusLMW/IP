//Crie uma função em java chamada "soma" que receba dois números inteiro como paramêtros e retorne a soma desses números.

package praticando;

import java.util.Scanner;

public class FuncaoProced1 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe dois números inteiros: ");
        int num = input.nextInt();
        int num2 = input.nextInt();

        int soma = somaNumeros(num, num2);
        System.out.println("A soma dos números é " + soma);
        input.close();
    }

    static int somaNumeros(int num, int num2) {
        int soma = num + num2;
        return soma;
    }
}
