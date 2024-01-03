package exemplos;

import java.util.Scanner;

public class Saudacao {
    public static void main(String [] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = input.nextLine();
        System.out.println(mensagem);
        input.close();
    }
}