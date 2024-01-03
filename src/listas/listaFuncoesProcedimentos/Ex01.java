//Desenvolva um programa que leia a idade de um nadador. Desenvolva um método sem retorno ("procedimento")que receba essa idade
//por parametro e informe a categoria do nadador conforme tabela abaixo:

//IDADE||CATEGORIA
//até 10 anos = Mirim
//11 a 14 anos = Infantil
//15 a 19 anos = Juvenil
//Acima de 19 anos = Adulto

package listas.listaFuncoesProcedimentos;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a idade do nadador: ");
		int idade = input.nextInt();
		
		verificarCategoria(idade);
		
		input.close();
	}
	
	public static void verificarCategoria(int idade) {
		if(idade <= 10) {
			System.out.println("Categoria: Mirim!");
		}
		
		if(idade >= 11 && idade <= 14) {
			System.out.println("Categoria: Infantil!");
		}
		
		if(idade >= 15 && idade <= 19) {
			System.out.println("Categoria: Juvenil!");
		}
		
		if(idade > 19) {
			System.out.println("Categoria: Adulto!");
		}
	}

}