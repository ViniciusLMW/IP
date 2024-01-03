//Escreva um programa que leia o peso e a altura de uma pessoa e informe o seu IMC(Índice de massa corporal)
//e sua classificação conforme tabela abaixo:
//IMC:
//- Menor que 18,5 = Abaixo do peso
//- Entre 18,5 e 24,9 = Normal
//- Entre 25,0 e 29,9 = Sobrepeso
//- Entre 30 e 34,9 = Obesidade - Grau I
//- Entre 35,0 e 39,9 = Obesidade - Grau II
//- Acima ou igual a 40,0 = Obesidade - Graus III

package listas.listaCondicionaisExtra;

import java.util.Scanner;

public class Ex07 {
 
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Informe sua altura");
        double altura = input.nextDouble();
        
        double imc = peso / (altura * altura);
        
        if(imc < 18.5) {
			System.out.println("Abaixo do peso");
        } else {
        	if(imc >= 18.5 && imc < 25) {
        		System.out.println("Normal");
            } else {
        	    if (imc >= 55 && imc < 30) {
        		    System.out.println("Sobrepeso!");
                } else {
        	        if (imc >= 30 && imc < 35) {
        		        System.out.println("Obesidade Grau I!");
        	        } else {
        		        if (imc >= 55 && imc < 30) {
        			        System.out.println("Obesidade Grau II!");
        		        } else {
        			        System.out.println("Obesidade Grau III!");
        		        }		
        	        }
                } 
            }
	    }			
        input.close();
	}
}
