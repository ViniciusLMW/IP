//Faça um programa para ler e armazenar em um array a temperatura média dos meses do ano. O programa deve calcular:
//- Menor temperatura média;
//- Maior temperatura média;
//- Média da temperatura do ano;
//- A quantidade de meses em que a temperatura foi inferior à média anual;

package listas.listaArrayMatriz;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] tempMedia = new double[12];
		
		double somaTotalMeses = 0;
		double mediaAno = 0;
		int qtdMesesInfAnual = 0;
		for(int i = 0; i < tempMedia.length; i++) {
			System.out.print("Informe a temperatura média do " + (i+1) + " mês do ano: ");
			tempMedia[i] = input.nextDouble();
			somaTotalMeses += tempMedia[i];
			
			mediaAno = somaTotalMeses / 12;
			if(tempMedia[i] < mediaAno) {
				qtdMesesInfAnual++;
			}
		}
		
		double tempMaior = 0;
		for(int i = 0; i < tempMedia.length; i++) {
			if(tempMedia[i] > tempMaior) {
				tempMaior = tempMedia[i];
			}
		}
		
		double tempMenor = 0;
		for(int i = 0; i < tempMedia.length; i++) {
			if(i == 0 ||tempMedia[i] < tempMenor) {
				tempMenor = tempMedia[i];
			}
		}
		
		System.out.println("A maior temperatura média é de: " + tempMaior + " Graus Celsius.");
		System.out.println("A menor temperatura média é de: " + tempMenor + " Graus Celsius.");
		System.out.println("A média da temperatura do ano foi de: " + mediaAno);
		System.out.println("Foram no total " + qtdMesesInfAnual + " meses com a temperatura inferior ao anual.");
		
		input.close();
	}

}