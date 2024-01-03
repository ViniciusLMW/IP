//Crie um programa que leia a quantidade de chuva(em milímetro) registrada em uma semana e exiba na tela
//a média de chuva por dia e classifique o tempo conforme a tabela abaixo:
//Chuva(Milímetro):
//- Menor que 30 = Seca
//- Entre 30 e 70 = Normal
//- Acima de 70 = Chuvosa

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		double totalChuvas = 0;
		for(int i = 0; i < 7; i++) {
			System.out.print("Informe a quantidade de chuvas: ");
			double chuva = teclado.nextDouble();
			totalChuvas = totalChuvas + chuva;
		}
		double mediaChuvaDia = totalChuvas / 7;
		if(mediaChuvaDia < 30) {
			System.out.println("A classificação do nível de chuva da semana: SECA");
		} else {
			if(mediaChuvaDia > 70) {
				System.out.println("A classificação do nível de chuva da semana: CHUVOSA");
			} else {
				System.out.println("A classificação do nível de chuva da semana: NORMAL");
			}
		}
		teclado.close();
    }
}
