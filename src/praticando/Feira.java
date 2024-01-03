package praticando;

import java.util.Scanner;

public class Feira {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o quilo da maçã: ");
        double pesoMaca = teclado.nextDouble();

        System.out.print("Informe o quilo da laranja: ");
        double pesoLaranja = teclado.nextDouble();

        double precoMaca = 7.25;
        double precoLaranja = 5.50;

        double totalGasto = (pesoMaca * precoMaca) + (pesoLaranja * precoLaranja);

        System.out.println("Você terá gasto R$" + totalGasto);
        teclado.close();
    }
}
