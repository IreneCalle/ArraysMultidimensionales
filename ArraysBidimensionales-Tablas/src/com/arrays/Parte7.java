package com.arrays;
import java.util.Scanner;

public class Parte7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1º. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es
		// decir si se obtiene la misma tabla al cambiar las filas por columnas

		int t[][];
		boolean simetrica;
		int i, j;
		t = new int[4][4];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print("Introduzca elemento " + " + i + " + " + j + ");
				t[i][j] = scanner.nextInt();
			}
		}
		simetrica = true;

		i = 0;
		while (i < 4 && simetrica == true) {
			j = 0;
			while (j < i && simetrica == true) {
				if (t[i][j] != t[j][i])
					simetrica = false;
				j++;
			}
			i++;
		}
		if (simetrica)
			System.out.println("SIMETRICA");
		else
			System.out.println("NO ES SIMETRICA");

		// 2º. Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila
		// y de cada columna

		int t2[][];
		int i2, j2;

		t2 = new int[10][10];
		int valorColumna = 0;
		int valorFila = 0;
		int sumaFila = 0;
		int sumaColumna = 0;
		int control = 0;
		int control2 = 1;

		for (i2 = 0; i2 < 10; i2++) {
			for (j2 = 0; j2 < 10; j2++) {
				System.out.print("Introduzca elemento " + i2 + "  " + j2);
				t2[i2][j2] = scanner.nextInt();
			}
		}

		for (i2 = 0; i2 < 10; i2++) {

			for (j2 = 0; j2 < 10; j2++) {
				if (i2 == control)
					valorColumna = t2[i2][j2];
				sumaColumna += valorColumna;
			}

			control++;

			System.out.println("valor columna " + i2 + " = " + sumaColumna);
			sumaColumna = 0;
		}

		for (j2 = 0; j2 < 10; j2++) {
			sumaFila = 0;

			for (i2 = 0; i2 < 10; i2++) {

				valorFila = t2[i2][j2];
				sumaFila += valorFila;

			}

			System.out.println("valor fila " + j2 + " " + sumaFila);

		}

	}

}
