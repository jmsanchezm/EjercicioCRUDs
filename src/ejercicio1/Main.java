package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Se guardará la opcion
		int opcion = 0;

		// Se guardará el nombre del alumno
		String nombre = " ";

		// Se guardará la nota media del alumno
		double notaMedia = 0;

		// Creamos el array de objetos, en este caso de Alumnos
		Alumno[] alumnos = new Alumno[30];

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Recorremos el array de objetos, donde inicialmente estará todo inicializado a
		// null y cero
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno();
		}

		// Ordeno que ejecute el programa
		do {
			// Muestro por pantalla las siguientes opciones de seleccion
			System.out.println("ALUMNOS/AS");
			System.out.println("===============");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Alumno");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");

			// Leemos la opcion elegida
			opcion = read.nextInt();

			// Creamos el switch con la variable a comparar opcion
			switch (opcion) {

			// En el caso 1, mostrará el listado de alumnos
			case 1:

				// Recorremos el array
				for (int i = 0; i < alumnos.length; i++) {
					// Si el nombre del alumno de la posicion i es distinto a null
					if (alumnos[i].getNombre() != null) {
						// Mostraremos al alumno
						System.out.println(alumnos[i].toString());
					}
				}
				break;

			// En el caso 2, introducirá un nuevo alumno
			case 2:
				// Solicitamos el nombre del alumno
				System.out.println("Introduzca el nombre del alumno");
				// Leemos el dato
				nombre = read.next();

				// Solicitamos la nota del alumno
				System.out.println("Introduzca la nota media del alumno");
				// Leemos el dato
				notaMedia = read.nextDouble();

				// Mientras que la nota sea menor que cero
				while (notaMedia < 0) {
					// Le solicitará una nota correcta
					System.out.println("Introduzca de nuevo la nota media del alumno");
					notaMedia = read.nextDouble();
				}
				/*
				 * En caso de que no haya cumplido la condición del bucle anterior, Recorremos
				 * el array
				 */
				for (int i = 0; i < alumnos.length; i++) {
					// Si el nombre de la posición i está null
					if (alumnos[i].getNombre() == null) {
						// Actualizaremos el nombre con el nombre del alumno
						alumnos[i].setNombre(nombre);
						// Al igual que añadiremos la nota media
						alumnos[i].setNotaMedia(notaMedia);
					}
				}
				break;

			// En el caso 3, modificar alumno
			case 3:
				// Solicitamos el nombre del alumno que desea modificar
				System.out.println("Introduzca el nombre del alumno que desea modificar");
				// Leemos dato
				nombre = read.next();

				// Recorremos el array
				for (int i = 0; i < alumnos.length; i++) {
					// Si el nombre del array de la posición i es igual al nombre
					if (alumnos[i].getNombre().equals(nombre)) {
						// Le pediremos que introduzca la nueva nota
						System.out.println("Introduzca la nueva nota del alumno:");
						// Leemos dato
						notaMedia = read.nextDouble();
						// Pero mientras la nota sea menor que 0
						while (notaMedia < 0) {
							// Le solicitará la nota
							System.out.println("Introduzca de nuevo la nota media del alumno");
							notaMedia = read.nextDouble();
						}
					}
				}
				break;

			// En el caso 4, eliminación de un alumno
			case 4:
				// Solitamos el nombre del alumno
				System.out.println("Introduzca el nombre del alumno que desea eliminar:");
				// Leemos dato
				nombre = read.next();

				// Recorremos array
				for (int i = 0; i < alumnos.length; i++) {
					// Si el nombre de la posicion i es igual al nombre introducido
					if (alumnos[i].getNombre().equals(nombre)) {
						// El nombre del alumno se actualizará a null
						alumnos[i].setNombre(null);
					}
				}
				break;
			// En cualquier otro caso
			default:
				// Le mostrará un mensaje de error
				System.out.println("Introduzca una de las opciones válidas");
			}

			// Mientras que la opcion sea distinta de 5
		} while (opcion != 5);

		// Mostramos un mensaje de que se ha cerrado el programa en caso de que la
		// opcion haya sido 5
		System.out.println("El programa se ha cerrado correctamente");

		// Cerramos el Scanner
		read.close();
	}
}