//Crie uma função em Java chamada "calculaMaior" que receba três números inteiros como parâmetros e retorne o maior número entre eles.

package praticando;

import java.util.Scanner;

public class FuncaoProced3 {
        public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i+1) + "° número inteiro: ");
            numeros[i] = input.nextInt();
        }
        int maior = maiorNumero(numeros);
        System.out.println("O maior número inteiro é: " + maior);

        input.close();
    }

    static int maiorNumero(int[] numeros) {
        int maior = numeros[0];
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
