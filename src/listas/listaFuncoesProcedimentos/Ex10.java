//Faça um programa onde o usuário defina a quantidade de números a serem lidos e em seguida leia os
//números e armazene-os em um array. Depois desenvolva métodos ("Procedimentos ou funções") para identificar
//o maior, o menor elemento do array e que calcule a média dos números. O programa deve apresentar essas
//informações.

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de números a serem lidos: ");
		int quantidade = input.nextInt();
		int[] numeros = new int [quantidade];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i+1) + " valor: ");
			numeros[i] = input.nextInt();
		}
		
		identificarMenorElemento(numeros);
		int maiorElemento = identificarMaiorElemento(numeros);
		System.out.println("O maior elemento é: " + maiorElemento);
		double media = calcularMedia(numeros);
		System.out.println("A media é: " + media);
		input.close();
	}
	
	static void identificarMenorElemento(int[] numeros) {
		int menor = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("O menor elemento é: " + menor);
	}

	static int identificarMaiorElemento(int[] numeros) {
		int maior = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	static double calcularMedia(int[] numeros) {
		int acumulador = 0;
		for(int i = 0; i < numeros.length; i++) {
			acumulador += numeros[i];
		}
		return acumulador * 1.0 / numeros.length;
    }
}
