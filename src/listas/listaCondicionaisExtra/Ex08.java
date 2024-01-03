//Escreva um programa que calcule a conta de água. Para isso o usuário irá informar a leitura atual
//do medidor e a leitura do mês passado do medido(em metros cúbicos - m3). Irá informar se a conta é
//residencial ou predial. Caso a leitura seja residencial seguirá a primeira tabela, caso seja predial
//a leitrua segue a segunda tabela abaixo. Sabe-se também que existe a taxa mínima no valor de R$35,00
//e a taxa de coleta de esgoto no valor de R$35,00 tanto para as contas residenciais quanto prediais.
//Consumo Residencial:
//- Menor de 10 m3 = R$1,00 valor por m3
//- Entre 10 e 25 m3 = R$2,50 valor por m3
//- Acima de 25 m3 = R$4,25 valor por m3
//Consumo Predial:
//- Menor de 10 m3 = R$1,30 valor por m3
//- Entre 10 e 25 m3 = R$2,90 valor por m3
//- Acima de 25 m3 = R$4,50 valor por m3

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o tipo de conta " + "[R - Residencial, P - Predial]: ");
		String tipo = input.nextLine();
		System.out.print("Informe a leitura atual: ");
		double leituraAtual = input.nextDouble();
	    System.out.print("Informe a leitura do mês anterior: ");
		double leituraAnterior = input.nextDouble();
		
		double consumo = leituraAtual - leituraAnterior;
		double taxas = 70.00;
		switch(tipo) {
		    case "R": {
			    if(consumo < 10) {
				    System.out.println("Total a pagar: " + ((consumo * 1.00) + taxas));
			    } else {
				    if(consumo > 25) {
					    System.out.println("Total a pagar: " + ((consumo * 4.25) + taxas));
				    } else {
					    System.out.println("Total a pagar: " + ((consumo * 2.50) + taxas));
				    }
			    }
	        break;
		}
	        case "P": {
	        	if(consumo < 10) {
					System.out.println("Total a pagar: " + ((consumo * 1.30) + taxas));
				} else {
					if(consumo > 25) {
						System.out.println("Total a pagar: " + ((consumo * 4.50) + taxas));
					} else {
						System.out.println("Total a pagar: " + ((consumo * 2.90) + taxas));
					}
				}
            break;
	        }
		}
		input.close();
	}
}
