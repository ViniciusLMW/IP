package exemplos;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Boas vindas Semestral!!");
        System.out.println("Digite 1 para semestre 1");
        System.out.println("Digite 2 para semestre 2");
        System.out.print("Digite o valor: ");
        int valor = input.nextInt();

        switch(valor) {
            case 1: {
                System.out.println("Bem vindo ao primeiro semestre do ano!");
                break;
            }
            case 2: {
                System.out.println("Bem vindo ao segundo semestre do ano!");
                break;
            }
            default: {
                System.out.println("Opção inválida!");
                break;
            }
        }
        System.out.println("Fim do programa!");
        input.close();
    }
}
