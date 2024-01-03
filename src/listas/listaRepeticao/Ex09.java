//Faça um programa onde o usuário defina a quantidade de números a serem lidos e em seguida leia os números. Depois
//de ler todos números o programa deve apresentar na tela o maior dos números lidos, o menor do números lidos e a
//média dos números lidos.

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex09 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe uma quantidade de número: ");
        int numerosLidos = input.nextInt();

        System.out.print("Digite o 1 número: ");
        double numero = input.nextDouble();

        double soma = numero;
        double maiorNumero = numero;
        double menorNumero = numero;

        for(int i = 2; i <= numerosLidos; i++) {
            System.out.print("Digite o " + i + " número: ");
            numero = input.nextDouble();
            soma += numero;

            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
            if(numero < menorNumero) {
                menorNumero = numero;
            }
        }
        double media = soma / numerosLidos;

        System.out.println("O maior número lido foi: " + maiorNumero);
        System.out.println("O menor número lido foi: " + menorNumero);
        System.out.println("A média dos números lidos é: " + media);

        input.close();

    }
}

//MODELO PROFESSOR 

//package listaRepeticao;

//import java.util.Scanner;

//public class Ex9 {
    
//    public static void main(String [] args) {
//        Scanner input = new Scanner(System.in);

//        System.out.print("Informe uma quantidade de número: ");
//        int numerosLidos = input.nextInt();

//        double maior = 0;
//        double menor = 0; //double menor = 9999;
//        double acumulador = 0;
    
//        for(int i = 1; i < numerosLidos; i++) {
//        	System.out.print("Informe o número: ");
//        	double numero = input.nextDouble();
//        	acumulador = acumulador + numero; //acumulador += numero;
//        	if(numero > maior) {
//       		maior = numero;
//        	}
//        	if(numero < menor || i == 1) {
//        		menor = numero;
//        	}
//        }
//        System.out.println("Maior número: " + maior);
//        System.out.println("Menor número: " + menor);
//        System.out.println("Média: " + (acumulador/numerosLidos));
  
//        input.close();
//    }
//}      