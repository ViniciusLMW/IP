//Faça um programa que leia o valor das receitas e despesas de uma empresa e exiba na tela o resultado
//do mês dessa empresa. Caso o resultado seja negativo exiba a mensagem "A empresa ficou no prejuizo esse mês",
//caso contrário informe a mensagem "Tivemos um resultado positivo esse mês".

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		double totalReceitas = 0;
		double totalDespesas = 0;
		int continuar = 0;
		do {
			System.out.print("Informe o valor do gasto: R$");
			double valor = input.nextDouble();
			System.out.println("Categorias");
			System.out.println("1 - Receitas");
			System.out.println("2 - Despesas");
			System.out.print("Digite a opção: ");
			int opcao = input.nextInt();
			switch(opcao) {
				case 1: {
					totalReceitas += valor;
					break;
				}
				case 2: {
					totalDespesas += valor;
					break;
				}
			}
			System.out.print("Deseja inserir mais um valor? 1- Sim | 2- Não: ");
			continuar = input.nextInt();
		} while(continuar == 1);
		
		double resultado = totalReceitas - totalDespesas;
		System.out.println("Resultado de mês: R$" + resultado);
		
		if(resultado >= 0) {
			System.out.println("Tivemos um resultado positivo no mês");
		} else {
			System.out.println("A empresa ficou no prejuizo esse mês");
		}
	
		input.close();
    }
}
