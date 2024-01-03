//Crie um programa que leia o número de empréstimos de cada livro da biblioteca. Ao final o programa
//deve informar o título do livro mais emprestrado e quanto foi essa quantidade de empréstimos

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
		
		String tituloMaisEmprestado = "";
		int quantidadeMaisEmprestada = 0;
		int continuar = 0;
		do {
			System.out.print("Informe o título: ");
			String titulo = input.nextLine();
			System.out.print("Informe o total de empréstimos: ");
			int emprestimo = input.nextInt();
			
			if(emprestimo > quantidadeMaisEmprestada) {
				tituloMaisEmprestado = titulo;
				quantidadeMaisEmprestada = emprestimo;
			}
			System.out.print("Deseja inserir mais um livro? 1 Sim | 2 - Não: ");
			continuar = input.nextInt();
			
			input.nextLine();
		} while(continuar == 1);
		System.out.println("Título mais emprestado: " + tituloMaisEmprestado);
		System.out.println("Quantidade de empréstimos: " + quantidadeMaisEmprestada);
		
		input.close();
    }
}