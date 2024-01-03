//Faça um programa que receba o nome de uma pessoa e o apresente conforme a formatação de autores em referências bibliográficas.
//-Exemplo: nome Carlos Roberto Andrade
//-Deve apresentar o seguinte resultado: ANDRADE. Carlos Roberto,

package listas.listaStrings;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um nome completo: ");
		String nomeCompleto = input.nextLine();
		
		String[] nomes = nomeCompleto.split(" ");
		String sobrenome = nomes[nomes.length-1];
		
		System.out.print(sobrenome.toUpperCase() + ". ");
		for(int i = 0; i < nomes.length-1; i++) {
			if(i == nomes.length-2) {
				System.out.print(nomes[i] + ",");
			} else {
				System.out.print(nomes[i] + " ");
			}
		}
        input.close();
    }
}
