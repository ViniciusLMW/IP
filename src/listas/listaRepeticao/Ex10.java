//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um programa para coletar os dados
//sobre o salário e número de filhos de cada habitante e após as leituras, escreva:
//- Média de salário da população
//- Média do número de filhos
//- Maior salário dos habitantes
//- Percentual de pessoas com salário menor que R$1000,00
//O programa deve perguntar ao usuário se ele deseja inserir as informações para mais um habitante

package listas.listaRepeticao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int continuar = 1;
		int contador = 0;
		double maiorSalario = 0;
		double acumuladorSalario = 0;
		int contadorMenorMil = 0;
		int acumuladorFilhos = 0;
		do {
			//salário
			System.out.print("Infome o salário: ");
			double salario = input.nextDouble();
			acumuladorSalario = acumuladorSalario + salario;
			contador++;
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			if(salario < 1000) {
				contadorMenorMil++;
			}
			
			//filhos
			System.out.println("Informe a quantidade de filhos: ");
			acumuladorFilhos = acumuladorFilhos + input.nextInt();
			
			//deseja prosseguir
			System.out.println("Deseja continuar: 1 - Sim | 2 - Não");
			continuar = input.nextInt();
		} while(continuar == 1);
		
		System.out.println("Média Salarial: " + (acumuladorSalario/contador));
		System.out.println("Média Filhos: " + (acumuladorFilhos * 1.0/contador));
		System.out.println("Maior Salário: " + (maiorSalario));
		System.out.println("Percentual Menor R$1000: " + (contadorMenorMil * 100.0 / contador));
		
		input.close();

	}

}