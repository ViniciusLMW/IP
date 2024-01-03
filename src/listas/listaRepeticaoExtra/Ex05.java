//Crie um programa onde o usuário irá informar o valor de cada gasto realizado no mês. Os gastos devem
//ser lançados de acordo com as categorias(Alimentação, Combustível e Saúde). Ao final o programa deve
//informar:
//- O total gasto no mês
//- Qual a categoria com mais gastos
//- Qual a categoria com menos gastos

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex05 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
		
		double totalAlimentacao = 0;
		double totalCombustivel = 0;
		double totalSaude = 0;
		int continuar = 0;
		do {
			System.out.print("Informe o valor do gasto: R$");
			double gasto = input.nextDouble();
			System.out.println("Categorias");
			System.out.println("1 - Alimentação");
			System.out.println("2 - Combustivel");
			System.out.println("3 - Saúde");
			System.out.print("Digite a opção: ");
			int opcao = input.nextInt();
			switch(opcao) {
				case 1: {
					totalAlimentacao += gasto;
					break;
				}
				case 2: {
					totalCombustivel += gasto;
					break;
				}
				case 3: {
					totalSaude += gasto;
					break;
				}
			}
			System.out.print("Deseja inserir mais um gasto? 1- Sim | 2- Não: ");
			continuar = input.nextInt();
		} while(continuar == 1);
		
		double total = totalAlimentacao + totalCombustivel + totalSaude;
		System.out.println("Total gasto no mês: R$" + total);
		
		if(totalAlimentacao >= totalCombustivel && totalAlimentacao >= totalSaude) {
			System.out.println("Categoria com maior gasto foi Alimentação.");
			System.out.println("Gasto da categoria Alimentação: R$" + totalAlimentacao);
		}
		if(totalCombustivel >= totalAlimentacao && totalCombustivel >= totalSaude) {
			System.out.println("Categoria com maior gasto foi Combustivel.");
			System.out.println("Gasto da categoria Combustivel: R$" + totalCombustivel);
		}
		if(totalSaude >= totalCombustivel && totalSaude >= totalAlimentacao) {
			System.out.println("Categoria com maior gasto foi Saúde.");
			System.out.println("Gasto da categoria Saúde: R$" + totalSaude);
		}
		
		
		
		if(totalAlimentacao <= totalCombustivel && totalAlimentacao <= totalSaude) {
			System.out.println("Categoria com maior gasto foi Alimentação.");
			System.out.println("Gasto da categoria Alimentação: R$" + totalAlimentacao);
		}
		if(totalCombustivel <= totalAlimentacao && totalCombustivel <= totalSaude) {
			System.out.println("Categoria com maior gasto foi Combustivel.");
			System.out.println("Gasto da categoria Combustivel: R$" + totalCombustivel);
		}
		if(totalSaude <= totalCombustivel && totalSaude <= totalAlimentacao) {
			System.out.println("Categoria com maior gasto foi Saúde.");
			System.out.println("Gasto da categoria Saúde: R$" + totalSaude);
		}
		
		input.close();
    }
}
