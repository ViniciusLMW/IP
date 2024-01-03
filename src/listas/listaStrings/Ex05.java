//Crie um programa onde o usuário irá digitar uma frase e o programa irá contabilizar a quantidade de cada vogal da frase digitada.
//Considere que a frase não possua nenhuma acentuação. Por fim, apresente a frase e a quantidade de cada vogal.

package listas.listaStrings;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        
        int qtdeVogalA = 0;
        int qtdeVogalE = 0;
        int qtdeVogalI = 0;
        int qtdeVogalO = 0;
        int qtdeVogalU = 0;

        char[] letras = frase.toCharArray();
        for(int i = 0; i < letras.length; i++) {
            switch(letras[i]){
                case 'a': {
                    qtdeVogalA++;
                    break;
                }
                case 'e': {
                    qtdeVogalE++;
                    break;
                }
                case 'i': {
                    qtdeVogalI++;
                    break;
                }
                case 'o': {
                    qtdeVogalO++;
                    break;
                }
                case 'u': {
                    qtdeVogalU++;
                    break;
                }
            }
        }

        System.out.println("===================");
        System.out.println("A frase digitada:");
        System.out.println(frase);
        System.out.println("===================");
        System.out.println("Quantas vogal A: " + qtdeVogalA);
        System.out.println("Quantas vogal E: " + qtdeVogalE);
        System.out.println("Quantas vogal I: " + qtdeVogalI);
        System.out.println("Quantas vogal O: " + qtdeVogalO);
        System.out.println("Quantas vogal U: " + qtdeVogalU);

        input.close();
    }
}
