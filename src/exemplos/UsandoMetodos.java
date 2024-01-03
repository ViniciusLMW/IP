package exemplos;

import java.util.Scanner;

public class UsandoMetodos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int numeroA = input.nextInt();
		System.out.println("Informe um valor: ");
		int numeroB = input.nextInt();
		
		System.out.println("Soma: " + somar(numeroA, numeroB));
		System.out.println("Subtração: " + subtrair(numeroA, numeroB));
		System.out.println("Multiplicação: " + multiplicar(numeroA, numeroB));
		System.out.println("Divisão: " + dividir(numeroA, numeroB));
		
		System.out.println("Número A dentro do main: " + numeroA);
		System.out.println("Número B dentro do main: " + numeroB);
		
		input.close();
	}
	
	static int somar(int numeroA, int numeroB) {
		return numeroA + numeroB;
	}
	
	static int subtrair(int numeroA, int numeroB) {
		return numeroA - numeroB;
	}
	
	static int multiplicar(int numeroA, int numeroB) {
		return numeroA * numeroB;
	}
	
	static int dividir(int numeroA, int numeroB) {
		int resultado = 0;
		if(numeroB != 0) {
			resultado = numeroA / numeroB;
			numeroA = numeroA * numeroA * numeroB;
		} else {
			System.out.println("Não é possivel dividir por zero!");
		}
		System.out.println("Número A dentro da função: " + numeroA);
		System.out.println("Número B dentro da função: " + numeroB);
		return resultado;
	}
	
}