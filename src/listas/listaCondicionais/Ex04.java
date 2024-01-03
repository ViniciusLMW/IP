//A jornada de trabalho de um funcionário é de 40 horas semanais. Pode ocorrer do funcionário fazer hora extra, cujo cálculo
//é o valor da hora regular com um acréscimo de 50%. Desenvolva um programa que leia o número de horas trabalhadas em um mês,
//o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido
//trabalhadas (considere que o mês possua 4 semanas exatas).

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantas horas trabalhou no mês: ");
        int horasMes = input.nextInt();
        System.out.print("Informe o sálario por hora: ");
        double salarioHora = input.nextDouble();
        
        double salarioTotal = horasMes * salarioHora;

        if(horasMes > 160) { //até 40 horas semanais (4 semanas x 40 horas = 160 horas)
            double horasExtras = horasMes - 160; 
            salarioTotal += (salarioHora * horasExtras * 0.5);
        }

        System.out.println("O salário total de um funcionário é de R$" + salarioTotal);
        input.close();
    }
}
