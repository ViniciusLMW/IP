//Faça um programa que imprima os números de 1 a 10 em ordem crescente e depois em ordem decrescente. (Não possui
//com o usuário)

package listas.listaRepeticao;

public class Ex02 {

	public static void main(String[] args) {
		
		//a variavel (num) tem o valor 1, se o valor de (num) for menor ou igual(<=) a 10, acrescentar um numero na variavel (num)"
		for (int num = 1; num <=10; num++) {
			System.out.print(num);
		}
		
		System.out.println(" ");
		
		//a variavel (num) tem o valor 10, se o valor de (num) for maior ou igual(>=) a 1, diminnuir um numero na variavel (num)"
		for (int num = 10; num >= 1; num--) {
			System.out.print(num);
		}
	}

}