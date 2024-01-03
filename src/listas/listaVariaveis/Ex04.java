//Escreva um algoritmo para ler o salário atual de um funcionário e o percentual da data base.
//Calcular o valor do novo salário e escrever o salário atual e o novo salário do funcionário.

package listas.listaVariaveis;

import java.util.Scanner;

public class Ex04 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu salário: ");
        double salario = input.nextDouble();
        System.out.print("Informe o percentual da data base: ");
        double dataBase = input.nextDouble();

        double novoSalario = salario * (1 + (dataBase / 100));
        
        System.out.println("Salário atual: " + salario);
        System.out.println("Novo salário: " + novoSalario);

        //Outros exemplos, exemplo1://
        //double aumento = dataBase / 100 * salario;
        //double novoSalario2 = salario + aumento;
        //System.out.println("Novo salário 2: " + novoSalario2);

        //exemplo2://
        //System.out.println("Novo salário: " + salario * (1 + (dataBase / 100)));
        
        input.close();
    }
}
