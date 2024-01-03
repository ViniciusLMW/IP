//Crie um programa que dado um valor numérico digitado pelo usuário, imprima cada um dos seus dígitos por extenso.
//-Exemplo: o número 4571
//-Deve apresentar o seguinte resultado: Quatro, cinco, sete, um

package listas.listaStrings;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        String numero = input.nextLine();

        String[] numeroPorExtenso = new String[numero.length()];
		for(int i = 0; i < numero.length(); i ++) {
			switch(numero.charAt(i)) {
				case '0': {
					numeroPorExtenso[i] = "Zero";
					break;
				}
				case '1': {
					numeroPorExtenso[i] = "Um";
					break;
				}
				case '2': {
					numeroPorExtenso[i] = "Dois";
					break;
				}
				case '3': {
					numeroPorExtenso[i] = "Três";
					break;
				}
				case '4': {
					numeroPorExtenso[i] = "Quatro";
					break;
				}
				case '5': {
					numeroPorExtenso[i] = "Cinco";
					break;
				}
				case '6': {
					numeroPorExtenso[i] = "Seis";
					break;
				}
				case '7': {
					numeroPorExtenso[i] = "Sete";
					break;
				}
				case '8': {
					numeroPorExtenso[i] = "Oito";
					break;
				}
				case '9': {
					numeroPorExtenso[i] = "Nove";
					break;
				}
			}
		}
		for(int i = 0; i < numeroPorExtenso.length; i++) {
			if(i == numeroPorExtenso.length-1) {
				if(i == 0) {
					System.out.print(numeroPorExtenso[i] + ".");
				} else {
					System.out.print(numeroPorExtenso[i].toLowerCase() + ".");
				}
			} else {
				if(i == 0) {
					System.out.print(numeroPorExtenso[i] + ", ");
				} else {
					System.out.print(numeroPorExtenso[i].toLowerCase() + ", ");
				}
			}
		}

        /*Outra alternativa:

        //transformando int em String
        String numeroString = Integer.toString(numero);

        String[] digitosPorExtenso = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};

        
        System.out.print("Por extenso: ");
        for(int i = 0; i < numeroString.length(); i++) {
            //pegando valor numerico de cada caracter da String
            int digito = Character.getNumericValue(numeroString.charAt(i));
            System.out.print(digitosPorExtenso[digito]);
            if(i < numeroString.length() - 1) {
                System.out.print(", ");
            }
        }
        */
        input.close();
    }
}
