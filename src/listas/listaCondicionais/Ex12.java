//Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
//Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
//- Ter no mínimo 65 anos de idade
//- Ter trabalhado no mínimo 30 anos
//- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos

package listas.listaCondicionais;

import java.util.Scanner;

public class Ex12 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.print("Informe ano que nasceu: ");
        int nascimentoAno = input.nextInt();
        System.out.print("Informe o ano que entrou na empresa: ");
        int empresaAno = input.nextInt();

        int idadeMin = 2023 - nascimentoAno;
        int trabalhoMin = 2023 - empresaAno;

        if(idadeMin >= 65 || trabalhoMin >= 30 || idadeMin >= 60 && trabalhoMin >= 25){
            System.out.println(nome + " tem " + idadeMin + " anos e " + trabalhoMin + " anos na empresa e pode requerer aposentadoria.");
        } else {
            System.out.println(nome + " tem " + idadeMin + " anos e " + trabalhoMin + " anos na empresa e não pode requerer aposentadoria.");
        }
        input.close();
    }
}
