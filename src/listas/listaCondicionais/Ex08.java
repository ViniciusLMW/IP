//Suponha que o código de acesso de um usuário a um sistema seja igual a 12345 e que a senha de acesso seja
//54321. Faça um programa para ler o código de acesso do usuário. Caso este código seja diferente do código
//armazenado internamente o programa deve apresentar a mensagem "Usuário inválido!". Caso o código seja correto,
//deve ser lido a senha. Se esta senha estiver incorreta o programa deve mostrar a mensagem "Senha incorreta!".
//Caso a senha esteja correta, deve ser mostrada a mensagem "Acesso permitido!".

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex08 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu código de usuário: ");
        int codUser = input.nextInt();

        switch(codUser) {
            case 12345: {
                System.out.print("Digite sua senha: ");
                int senha = input.nextInt();
                switch(senha) {
                    case 54321: {
                        System.out.println("Acesso permitido!");
                        break;
                    }
                    default: {
                        System.out.println("Senha inválida");
                        break;
                    }
                }
                break;
            }
            default: {
                System.out.println("Usuário inválido");
                break;
            }
        }
        input.close();
    }
}