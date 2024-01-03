//Desenvolva um programa onde o usuário informa três números. Desenvolva um método com retorno ("Função")
//que verifique se esses valores(passados por parâmetros) formam  um triângulo. Caso formem um triângulo o
//sistema deve ter um método sem retorno("procedimento") que receba esses valores como parâmetros e classifique
//esse triângulo.

//Definições:
//- Para ser um triângulo o comprimento de cada lado de um triângulo deve ser menor que a soma do comprimento
//dois lados. Cada númeroi informado pelo usuário consiste em um lado.
//- Um triângulo equilátero tem todos os lados iguais, já o triângulo isósceles tem dois lados iguais e o triângulo
//escaleno tem os três lados diferentes.

//O sistema deve informar se os números formam ou não um triângulo e qual a sua classificação

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a primeira medida: ");
		double ladoA = input.nextDouble();
		System.out.print("Informe a segunda medida: ");
		double ladoB = input.nextDouble();
		System.out.print("Informe a terceira medida: ");
		double ladoC = input.nextDouble();
		
		if(isTriangulo(ladoA, ladoB, ladoC)) {
			classificarTriangulo(ladoA, ladoB, ladoC);
		} else {
			System.out.println("As medidas não formam um triângulo.");
		}
		input.close();
	}
	
	static boolean isTriangulo(double ladoA, double ladoB, double ladoC) {
		boolean retorno = true;
		if(ladoA > (ladoB + ladoC)) {
			retorno = false;
		}
		if(ladoB > (ladoA + ladoC)) {
			retorno = false;
		}
		if(ladoC > (ladoB + ladoA)) {
			retorno = false;
		}
		return retorno;
	}
	
	static void classificarTriangulo(double ladoA, double ladoB, double ladoC) {
		if(ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Triângulo Equilátero.");
		} else {
			if(ladoA != ladoB && ladoB != ladoC) {
				System.out.println("Triângulo Equilátero.");
			} else {
				System.out.println("Triângulo Isósceles.");
			}
		}
    }
}
