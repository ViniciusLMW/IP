//Um empresário de taxi aéreo deseja saber qual das suas aeronaves é a mais econômica. Para isso ele
//lhe contratou para desenvolver um programa que leia o modelo, a distância(em KM) e o combustível
//(em litros) gasto pelas aeronaves. Deseja-se saber qual o modelo e o consumo da aeronave mais econômica

package listas.listaRepeticaoExtra;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		int continuar = 0;
		String modeloAeronave = "";
		double oerformanceAeronave = 0;
		do {
			
			System.out.print("Informe o modelo da aeronave: ");
			String modelo = teclado.nextLine();
			System.out.print("Informe a distância percorrida pela aeronave: ");
			double distancia = teclado.nextDouble();
			System.out.print("Informe a quantidade de litros utilizado pela aeronave: ");
			double litros = teclado.nextDouble();
			
			double distanciaPorLitro = distancia / litros;
			if(distanciaPorLitro > oerformanceAeronave) {
				modeloAeronave = modelo;
				oerformanceAeronave = distanciaPorLitro;
			}
			
			System.out.print("Deseja continuar? [1 - Sim, 2 - Não]: ");
			continuar = teclado.nextInt();
			
			teclado.nextLine();
		} while(continuar == 1);
		
		System.out.println("Modelo mais econômico: " +  modeloAeronave);
		System.out.println("Consumo por litro: " +  oerformanceAeronave);
		teclado.close();
    }
}
