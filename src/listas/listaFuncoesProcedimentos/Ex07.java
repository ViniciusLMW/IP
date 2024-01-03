//Desenvolva um programa que identifique todos os números primos menores que 100. Desenvolva um método com retorno("função")
//que receba um número como paramêtro e informe se ele é um número primo. Lembrando que o número 1 não é primo e que todo número
//primo tem dois divisores (o número 1 e ele mesmo)

package listas.listaFuncoesProcedimentos;

public class Ex07 {
    
    public static void main(String [] args) {
        for(int i = 2; i < 100; i++) {
            if(isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //para ser um número primo, o número não pode ser divisivel por: 2, 3, 5 e 7.
    static boolean isPrimo(int numero) {
        boolean resultado = true;
        if(numero %2 == 0 && numero != 2) {
            resultado = false;
		}
		if(numero % 3 == 0 && numero != 3) {
			resultado = false;
		}
		if(numero % 5 == 0 && numero != 5) {
			resultado = false;
		}
		if(numero % 7 == 0 && numero != 7) {
			resultado = false;
		}
		return resultado;
    }
}

