//Crie um programa que solicite a data de nascimento (DD/MM/AAAA) do usuário e imprima a data com o nome do mês por extenso
//-Exemplo: para data 15/03/1998
//-Deve apresentrar o seguinte resultado: Você nasceu em 15 de março de 1998

package listas.listaStrings;

//import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a data de nascimento (DD/MM/AAAA): ");
        String dataNascimento = input.nextLine();

        String[] partesData = dataNascimento.split("/");
		String mes = "";
		switch(partesData[1]) {
			case "01": {
				mes = "Janeiro";
				break;
			}
			case "02": {
				mes = "Fevereiro";
				break;
			}
			case "03": {
				mes = "Março";
				break;
			}
			case "04": {
				mes = "Abril";
				break;
			}
			case "05": {
				mes = "Maio";
				break;
			}
			case "06": {
				mes = "Junho";
				break;
			}
			case "07": {
				mes = "Julho";
				break;
			}
			case "08": {
				mes = "Agosto";
				break;
			}
			case "09": {
				mes = "Setembro";
				break;
			}
			case "10": {
				mes = "Outubro";
				break;
			}
			case "11": {
				mes = "Novembro";
				break;
			}
			case "12": {
				mes = "Dezembro";
				break;
			}
		}
		System.out.println("Você nasceu em " + partesData[0] + " de " + mes + " de " + partesData[2] + ".");

        /*Outra alternativa:
        String[] partesData = dataNascimento.split("/");

        //dividindo as partes da data
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);

        //pegando o nome do mês
        String nomeMes = new DateFormatSymbols().getMonths()[mes - 1];

        System.out.println("Você nasceu em " + dia + " de " + nomeMes + " de " + ano);
        */
        input.close();
    }
}
