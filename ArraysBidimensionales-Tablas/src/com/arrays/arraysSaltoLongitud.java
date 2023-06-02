package com.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class arraysSaltoLongitud {

	public static void main(String[] args) {
		/*
		 * . Se pretende realizar un programa para gestionar la lista de participaciones
		 * en una competición de salto de longitud. El número de plazas disponible es de
		 * 10. Sus datos se irán introduciendo en el mismo orden que vayan
		 * inscribiéndose los atletas. Diseñar el programa que muestre las siguientes
		 * opciones: 1- Inscribir un participante. 2- Mostrar listado de datos. 3-
		 * Mostrar listado por marcas. 4- Finalizar el programa. Si se selecciona 1, se
		 * introducirán los datos de uno de los participantes: Dorsal, mejor marca del
		 * 2022, mejor marca del 2020 Si se elige la opción 2, se debe mostrar un
		 * listado por número de dorsal. La opción 3 mostrará un listado de las marcas
		 * de 2020, de mayor a menor. Tras procesar cada opción, se debe mostrar de
		 * nuevo el menú inicial, hasta que se seleccione la opción 4, que terminará el
		 * programaa
		 */

		int opcion = 0;
		int t[][];
		t = new int[5][3];
		int i1 = 0;
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);

		while (opcion != 4) {

			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Bienvenido al registro de los cinco atletas top de salto de longitud \n" + ""
					+ "pulsa 1 para introducir un atleta \n" + "" + "" + "pulsa 2 para mostrar el listado completo \n"
					+ "" + "pulsa 3 para mostrar el listado por marcas de 2020 \n" + "" + "pulsa 4 para salir");
			System.out.println("---------------------------------------------------------------------------------");

			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Introduce un valor valido  \n");
				sc.nextLine();

			}

			switch (opcion) {

			case 1:
				// completamos los datos y aumentamos i1, que nos sirve para avanzar una fila
				// por cada nuevo registro
				// si el registro está vacío, nos vamos
				if (i1 < 5) {
					do {
						i = 0;

						try {
							System.out.println("introduce el numero de dorsal");
							t[i1][0] = sc.nextInt();

							System.out.println("introduce la mejor marca personal de 2020 en centimetros");
							t[i1][1] = sc.nextInt();

							System.out.println("introduce la mejor marca personal de 2022 en centimetros");
							t[i1][2] = sc.nextInt();
							i1++;
							i++;
							System.out.print("¡Dorsal registrado con exito! \n");
						} catch (InputMismatchException ex) {
							System.out.println("Error en la insercion. Por favor, introduce datos validos");
							sc.nextLine();
						}

					} while (i < 1);
					break;

				}

				else {
					System.out.println("registro completo, inserte otra opcion");
					break;

				}

			case 2:

				if (t[0][0] == 0) {

					// si no se han grabado datos, mostramos que esta vacio
					System.out.println("El registro esta vacio, no hay datos que mostrar");
				}

				else {
					// con un for anidado, recorremos cada fila, y en función de en que columna nos
					// encontremos imprimimos el nombre de la misma
					// la variable x nos ubica en cada columna

					for (i = 0; i < t.length; i++) {
						System.out.println("Datos del atleta " + (i + 1) + " : \n");
						int x = 0;
						for (j = 0; j < t[i].length; j++) {
							if (x == 0) {
								System.out.println("Dorsal: ");
								System.out.println(t[i][j]);

							}
							if (x == 1) {
								System.out.println("Mejor marca 2020: ");
								System.out.println(t[i][j]);

							}
							if (x == 2) {
								System.out.println("Mejor marca 2022: ");
								System.out.println(t[i][j]);

							}
							x++;

						}

					}
				}
				break;

			case 3:
				// para extraer y ordenar las posiciones, creamos un nuevo array que se rellene
				// con la columna de mejores marcas de 2020
				int tMarcas[];
				tMarcas = new int[i1];
				for (i = 0; i < i1; i++) {

					tMarcas[i] = t[i][1];

					// ordenamos el array de mayor a menor

				}

				Arrays.sort(tMarcas);
				int o = 0;

				// partimos del indice maximo y descendemos para mostrar el ranking
				// la variable o solo es un contador del ranking para mostrar la posicion
				for (i = (i1 - 1); i >= 0; i--) {

					System.out.println("registro marca top numero " + (o + 1) + " de 2020: ");
					System.out.println(tMarcas[i] + " metros");
					o++;

				}
				break;
			case 4:
				System.exit(0);

			default:
				System.out.println("Introduce un numero valido \n");

			}

		}

	}
}
