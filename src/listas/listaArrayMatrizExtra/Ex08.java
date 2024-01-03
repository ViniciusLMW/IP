//Escreva um programa que leia uma matriz 5x5 representando as vendas de produtos em uma loja. Cada linha representa um produto
//e cada coluna um dia da semana. Em seguida, exiba na tela o total de vendas de cada produto e o dia da semana que teve mais vendas

package listas.listaArrayMatrizExtra;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] dias = {"segunda", "terça", "quarta", "quinta", "sexta"};
		double[][] vendas = new double[5][5];
				
		for(int i = 0; i < vendas.length; i++) {
			for(int j = 0; j < vendas[i].length; j++) {
				System.out.print("Informe a quantidade de vendas do produto " + (j+1) + " realizada na " + dias[i] + "-feira: ");
				vendas[i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < vendas.length; i++) {
			for(int j = 0; j < vendas[i].length; j++) {
				System.out.println(vendas[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n---------------------\n");
		
		int totalVendasProduto = 0;
		for(int i = 0; i < vendas.length; i++) {
			for(int j = 0; j < vendas[i].length; j++) {
				totalVendasProduto += vendas [i][j];
			}
			System.out.println("Total de vendas do produto " + (i+1) + ": " + totalVendasProduto);
		}
		
		System.out.println("\n\n---------------------\n");
		
		double maiorVendas = 0;
		int indice = 0;
		for(int j = 0; j < vendas.length; j++) {
			double totalVendaDiaSemana = 0;
			for(int i = 0; i < vendas[i].length; i++) {
				totalVendaDiaSemana += vendas[i][j];
			}
			if(totalVendaDiaSemana > maiorVendas) {
				maiorVendas = totalVendaDiaSemana;
				indice = j;
			}
		}
		
		 System.out.println("O melhor dias da semana para vendas foi: " + dias[indice] + "-feira.");
		 System.out.println("Com um total de vendas: " + maiorVendas);
		 
		 input.close();
	}

}