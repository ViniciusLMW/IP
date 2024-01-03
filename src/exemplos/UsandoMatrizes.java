package exemplos;

public class UsandoMatrizes {

	public static void main(String[] args) {
		 
		int[] numeros = {3, 7, 1, 4};
		System.out.println(numeros);
		System.out.println(numeros[2]);
		
		String[] meias = {"Meia Branca", "Meia Vermelha", "Meia Azul"};
		System.out.println(meias);
		System.out.println(meias[0]);
		
		System.out.println("=========================");
		
		for(int i = 0; i < meias.length; i++) {
			System.out.println(meias[i]);
		}
		
		System.out.println("=========================");
		
		int[][] matriz = { {1, 2, 5} , {2, 4, 6} };
		System.out.println(matriz);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
	}

}