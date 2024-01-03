//Faça um programa para o mesmo exercicio anterior, mas agora não será informado o número de mercadorias em estoque.
//O programa deve perguntar se o usuário deseja informar mais uma mercadoria.("Deseja informar mais uma mercadoria?
//S - Sim, N - Não"). Ao final o programa deve imprimir o valor total em estoque e a média do valor das mercadorias.

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int continuar = 1;
		int contador = 0;
		double acumulador = 0;
		while(continuar == 1) {
			System.out.print("Informe o valor de mercadoria: ");
			acumulador = acumulador + input.nextDouble();
			System.out.print("Deseja continuar? 1 - Sim | 2 - Não: ");
			continuar = input.nextInt();
			contador++;
		}	
		
		System.out.println("Total do Estoque: R$" + acumulador);
		System.out.println("Média do Estoque: R$" + (acumulador/contador));
		
        input.close();
    }
}
