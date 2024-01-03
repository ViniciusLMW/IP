//Crie um algoritmo para ler o número total de eleitores de um munícipio, o número de votos brancos, nulos
//e válidos. O algoritmo deve calcular e escrever o percentual que cada um representa em relação ao total de
//eleitores.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex03 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o total de votos brancos: ");
        int brancos = input.nextInt();
        System.out.print("Informe o total de votos nulos: ");
        int nulos = input.nextInt();
        System.out.print("Informe o total de votos válidos: ");
        int validos = input.nextInt();

        int totalVotos = brancos + nulos + validos;

        double percentualBrancos = brancos * 100.0 / totalVotos;
        double percentualNulos = nulos * 100.0 / totalVotos;
        double percentualValidos = validos * 100.0 / totalVotos;

        System.out.println("Percentual de votos brancos: " + percentualBrancos);
        System.out.println("Percentual de votos nulos: " + percentualNulos);
        System.out.println("Percentual de votos validos: " + percentualValidos);

        input.close();
    }
}
