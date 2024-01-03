package exemplos;

import java.util.Scanner;

public class UsandoDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador = 0; //se for valor 10, terá valor "false" e executará apenas uma vez.
		do {
			System.out.print("Informe a nome do aluno: ");
			String nome = input.nextLine();
			System.out.print("Informe a nota da primeira avaliação: ");
			double nota1 = input.nextDouble();
			System.out.print("Informe a nota da segunda avaliação:" );
			double nota2 = input.nextDouble();
			
			double media = (nota1 + nota2) / 2;
			System.out.println("O aluno(a) " + nome + " - Média " + media);
			contador++;
			input.nextLine();
		} while(contador < 2);
		
		input.close();

	}

}