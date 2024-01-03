package exemplos;

import java.util.Scanner;

public class UsandoMetodos2 {

	public static void main(String[] args) {
		String nome = "";
		System.out.println("Nome: " + nome);
		nome = lerNome();
		System.out.println("Nome: " + nome);
		nome = lerSobrenome(nome);
		System.out.println("Nome: " + nome);

	}
	
	static String lerNome() {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o seu primeiro nome: ");
        input.close();
		return input.nextLine();
	}

	static String lerSobrenome(String nome) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o seu sobrenome: ");
        input.close();
		return nome + " " + input.nextLine();
	}
}