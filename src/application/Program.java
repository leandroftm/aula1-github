package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * faça um programa que preencha uma matriz 20x10 com numeros inteiros, e some
		 * cada uma das colunas, armazenando o resultado da soma em um vetor. A seguir o
		 * programa devera multiplicar cada elemento da matriz pela soma da coluna e
		 * mostrar a matriz resultante.
		 */

		int[][] mat = new int[20][10];
		int[] vet = new int[mat[0].length];

		// PREENCHENDO A MATRIZ
		for (int i = 0; i < mat.length; i++) {

			System.out.printf("%d - [", i + 1);

			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = 20 + i + j;

				print(j, mat[i].length, mat[i][j]);

			}
		}

		System.out.println();

		// ARMAZENANDO SOMA NO VETOR
		System.out.print("Vetor - [");
		for (int i = 0; i < vet.length; i++) {

			int soma = 0;

			for (int j = 0; j < mat.length; j++) {

				soma += mat[j][i];

			}

			vet[i] = soma;

			print(i, vet.length, vet[i]);
			
		}

		System.out.println();

		// MULTIPLICACAO MATRIZ x VETOR SOMA
		for (int i = 0; i < mat.length; i++) {

			System.out.printf("%d - [", i + 1);

			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] *= vet[j];

				print(j, mat[i].length, mat[i][j]);
			}
		}
	}

	public static void print(int i, int length, int number) {

		if (i + 1 != length) {

			System.out.printf("%d, ", number);

		} else {

			System.out.printf("%d]%n", number);

		}

	}

}
