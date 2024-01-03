//Crie um programa onde o usuário irá digitar um verbo regular terminado em "AR" e mostre a conjugação no tempo presente.
//-Exemplo: verbo andar

//Eu ando
//Tu andas
//Ele anda
//Nós andamos
//Vós andais
//Eles andam

package listas.listaStrings;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um verbo terminado em 'AR': ");
        String verbo = input.nextLine();

        //Verificar se o verbo termina em "AR"
        if(verbo.endsWith("ar") || verbo.endsWith("AR")) {
            System.out.println("Eu " + verbo.substring(0, verbo.length() - 2) + "o");
            System.out.println("Tu " + verbo.substring(0, verbo.length() - 2) + "as");
            System.out.println("Ele/Ela " + verbo.substring(0, verbo.length() - 2) + "a");
            System.out.println("Nós " + verbo.substring(0, verbo.length() - 2) + "amos");
            System.out.println("Vós " + verbo.substring(0, verbo.length() - 2) + "ais");
            System.out.println("Eles/Elas " + verbo.substring(0, verbo.length() - 2) + "am");
        } else {
            System.out.println("Tente novamente. Insira um verbo terminado em 'AR'.");
        }

        /*
        Outra alternativa:

        verbo = verbo.substring(0, verbo.length()-2);
		
		System.out.println("Eu " + verbo + "o");
		System.out.println("Tu " + verbo + "as");
		System.out.println("Ele " + verbo + "a");
		System.out.println("Nós " + verbo + "amos");
		System.out.println("Vós " + verbo + "áis");
		System.out.println("Eles " + verbo + "am");
        */
        input.close();
    }
}
