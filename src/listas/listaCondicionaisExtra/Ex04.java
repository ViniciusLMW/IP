//Escreva um programa que leia altura e o sexo de uma pessoa. O programa deve apresentar o peso
//ideal da pessoa considerando as fórmulas abaixo:
//- Homem = peso ideal=(72,7 * altura) - 58
//- Mulher = peso ideal=(62,1 * altura) - 44,7

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o sexo [F - feminino M - masculino]: ");
		String sexo = input.nextLine();
		System.out.println("Informe uma altura em metros: ");
        double altura = input.nextDouble();
        
		switch(sexo) {
		    case "F": {
			    System.out.println("Peso ideal: " + ((62.1 * altura) - 44.7));
			    break;
		    }
		    case "M": {
			    System.out.println("Peso ideal: " + ((72.7 * altura) - 58));
			    break;
		    }
		    default: {
			    System.out.println("Opção inválida!");
			    break;
		    }
		}
		input.close();
	}
}
