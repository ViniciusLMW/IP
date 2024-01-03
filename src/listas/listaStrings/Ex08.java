//Crie um programa que dado um texto digitado pelo usuário o programa troque todas as ocorrencias de uma palavra por outra. Para isso
//o usuário deverá digitar o texto, a palavra a ser procurada e a palavra a ser trocada. Ao final o programa deve mostrar o texto
//original, o texto novo e informar quantas ocorrencias de troca ocorreram.

package listas.listaStrings;

import java.util.Scanner;

public class Ex08 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Digite um texto: ");
        String texto = input.nextLine();
        System.out.print("Digite a palavra de busca: ");
        String busca = input.nextLine();
        System.out.print("Digite a palavra de troca: ");
        String troca = input.nextLine();

        String textoAlterado = "";
        textoAlterado = texto.replace(busca, troca);

        System.out.println("===========================");
        System.out.println("Texto original:");
        System.out.println(texto);
        System.out.println("===========================");
        System.out.println("Texto novo: ");
        System.out.println(textoAlterado);

        //Quantidade de trocas
        String[] palavras = texto.split(" ");
		int qtdeTrocas = 0;
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equals(busca)) {
				qtdeTrocas++;
			}
		}
		System.out.println("Quantidade de trocas: " + qtdeTrocas);
        
        input.close();
    }
}
