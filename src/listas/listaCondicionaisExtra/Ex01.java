//Desenvolva um programa onde o usuário irá digitar um número de 1 a 7 e o programa deverá apresentar
//o dia da semana escrito por extenso (1 - Domingo, 2 - Segunda, 3 - Terça...).

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex01 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva um número de 1 a 7: ");
        int num = input.nextInt();

        switch(num) {
            case 1: {
                System.out.println("Domingo!");
                break;
            }
            case 2: {
                System.out.println("Segunda!");
                break;
            }
            case 3: {
                System.out.println("Terça!");
                break;
            }
            case 4: {
                System.out.println("Quarta!");
                break;
            }
            case 5: {
                System.out.println("Quinta!");
                break;
            }
            case 6: {
                System.out.println("Sexta!");
                break;
            }
            case 7: {
                System.out.println("Sabado!");
                break;
            }
            default: {
                System.out.println("Número inválido, tente novamente");
                break;
            }
        }
        input.close();
    }
}
