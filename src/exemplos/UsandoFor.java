package exemplos;

import java.util.Scanner;

public class UsandoFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int contador = 0; contador < 2; contador++) {
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
		}
		
		input.close();

	}

}