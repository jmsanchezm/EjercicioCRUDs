package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion = 0; // Se guardará la opcion del usuario

		String codigo = ""; // Se guardará el código del producto

		String descripcion = ""; // Se guardará la descripcion del producto

		double precioCompra = 0; // Se guardará el precio de compra

		double precioVenta = 0; // Se guardará el precio de venta

		int stock = 0; // Se guardará la cantidad de stock

		int increm = 0; // Se guardará el incremento del stock

		int decrem = 0; // Se guardará el decremento del stock

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Creamos el array de objetos de tipo Gestisimal
		Gestisimal[] producto = new Gestisimal[10];

		// Recorremos el array para darle a cada posición del array los atributos de
		// cada producto
		for (int i = 0; i < producto.length; i++) {
			producto[i] = new Gestisimal();
		}

		// Ordeno que haga lo siguiente
		do {

			// Me muestre en pantalla el siguiente menú
			System.out.println("PRODUCTOS");
			System.out.println("==============");
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificación");
			System.out.println("5. Entrada de mercancía");
			System.out.println("6. Salida de mercancía");
			System.out.println("7. Salir");

			// Leemos el dato
			opcion = read.nextInt();

			// Creamos el switch con el valor de opcion
			switch (opcion) {

			// En el caso 1, el listado
			case 1:
				/*
				 * Se le mostrará al usuario el contenido del array de objeto de la siguiente
				 * forma Recorremos el array
				 */
				for (int i = 0; i < producto.length; i++) {
					// Si el código del producto no esta vacio
					if (!producto[i].getCodigo().equals("vacio")) {
						// Mostraremos el producto
						System.out.println(producto[i].toString());
					}
				}

				// En el segundo caso, dar de alta
			case 2:
				// Recorremos el array de objetos
				for (int i = 0; i < producto.length; i++) {
					// Si hay una posición en la que el código esté vacio
					if (producto[i].getCodigo().equals("vacio")) {

						// Solicitamos los campos correspondientes sobre el registro del producto
						System.out.println("Introduzca descripción del producto: ");
						descripcion = read.nextLine();

						System.out.println("Introduzca el precio de compra del producto");
						precioCompra = read.nextDouble();

						System.out.println("Introduzca el precio de venta del producto");
						precioVenta = read.nextDouble();

						System.out.println("Introduzca el stock del producto");
						stock = read.nextInt();

						// Mientras que los campos no sean válidos, solicitará de nuevo la informacion
						while (precioCompra < 0 && precioVenta < 0 && stock < 0) {

							System.out.println("Introduzca de nuevo descripción del producto: ");
							descripcion = read.nextLine();

							System.out.println("Introduzca de nuevo el precio de compra del producto");
							precioCompra = read.nextDouble();

							System.out.println("Introduzca de nuevo el precio de venta del producto");
							precioVenta = read.nextDouble();

							System.out.println("Introduzca de nuevo el stock del producto");
							stock = read.nextInt();
						}

						// En caso de que los valores sean correctos, se actualizaran a los datos dados
						producto[i].setDescripcion(descripcion);
						producto[i].setPrecioCompra(precioCompra);
						producto[i].setPrecioVenta(precioVenta);
						producto[i].setStock(stock);
						producto[i].setCodigo(Integer.toString(i));

						// Le mostraremos un mensaje como que el producto se ha registrado correctamente
						System.out.println("Producto registrado con éxito");

					}
				}
				break;

			// En el tercer caso, dar de baja a un producto
			case 3:

				// Solicitamos el código del producto
				System.out.println("Introduzca el código del producto:");
				codigo = read.next();

				// Recorremos el array
				for (int i = 0; i < producto.length; i++) {
					// Si el codigo de la posicion i es igual al codigo introducido
					if (producto[i].getCodigo().equals(codigo)) {
						// El código se actualizará a vacio
						producto[i].setCodigo("vacio");
						// Le mostramos al usuario un mensaje de que se ha realizado correctamente
						System.out.println("Producto dado de baja con éxito");

						/*
						 * Sólo actualizaremos el código ya que al introducir un nuevo producto, cogerá
						 * esa posición y sobreescribirá en los datos del antiguo producto
						 */
					}
				}
				break;

			//En el caso 4
			case 4:
				//Solictamos el codigo del producto a modificar
				System.out.println("Introduzca el código del producto a modificar");
				//Leemos el dato
				codigo = read.next();
				
				//Recorremos el array
				for (int i = 0; i < producto.length; i++) {
					//// Si hay una posición en la que el código sea igual al introducido
					if (producto[i].getCodigo().equals(codigo)) {
						
						//Solicitaremos los datos nuevos
						System.out.println("Introduzca la nueva descripción del producto: ");
						descripcion = read.nextLine();

						System.out.println("Introduzca el nuevo precio de compra del producto");
						precioCompra = read.nextDouble();

						System.out.println("Introduzca el nuevo precio de venta del producto");
						precioVenta = read.nextDouble();

						System.out.println("Introduzca el nuevo stock del producto");
						stock = read.nextInt();

						// Mientras que los campos no sean válidos, solicitará de nuevo la informacion
						while (precioCompra < 0 && precioVenta < 0 && stock < 0) {

							System.out.println("Introduzca de nuevo la descripción  nueva del producto: ");
							descripcion = read.nextLine();

							System.out.println("Introduzca de nuevo el nuevo precio de compra del producto");
							precioCompra = read.nextDouble();

							System.out.println("Introduzca de nuevo el nuevo precio de venta del producto");
							precioVenta = read.nextDouble();

							System.out.println("Introduzca de nuevo el nuevo stock del producto");
							stock = read.nextInt();
						}
						
						//En caso contrario, se actualizará 
						producto[i].setDescripcion(descripcion);
						producto[i].setPrecioCompra(precioCompra);
						producto[i].setPrecioVenta(precioVenta);
						producto[i].setStock(stock);

					}
				}
				break;
			case 5:
				System.out.println("Introduzca el código del artículo que quiere aumentar:");
				codigo=read.next();
				
				//Recorremos el array
				for (int i = 0; i < producto.length; i++) {
					// Si hay una posición en la que el código sea igual al introducido
					if (producto[i].getCodigo().equals(codigo)) {
						//Solicitamos cantidad a aumentar
						System.out.println("Introduzca la cantidad que desee aumentar:");
						//Leemos el dato
						increm=read.nextInt();
						//Mientras que la cantidad sea menor o igual a cero
						while (increm<=0) {
							//Le pedirá otra cantidad
							System.out.println("Introduzca la cantidad válida que desee aumentar:");
							increm=read.nextInt();
						}
						//En contrario, llamaremos a la funcion incrementoStock
						producto[i].incrementoStock(increm);
						//Le mostraremos que se ha realizado correctamente 
						System.out.println("Acción realizada correctamente");
					}
					
				}
				break;
				
			//En el caso 6, decremento del stock
			case 6:
				
				//Solicitamos el código del producto
				System.out.println("Introduzca el código del artículo que quiere decrementar:");
				//Leemos el dato
				codigo=read.next();
				
				//Recorremos el array
				for (int i = 0; i < producto.length; i++) {
					// Si hay una posición en la que el código sea igual al introducido
					if (producto[i].getCodigo().equals(codigo)) {
						//Solicitará una cantidad
						System.out.println("Introduzca la cantidad que desee decrementar:");
						//Leemos dato
						decrem=read.nextInt();
						//Mientras que la cantidad a decrementar sea igual o menor a 0
						while (decrem<=0) {
							//Le pedirá que introduzca una nueva cantidad
							System.out.println("Introduzca la cantidad válida que desee aumentar:");
							decrem=read.nextInt();
						}
						//En caso de que haya introducido una opcion válida, llamará a la función decrementoStock
						producto[i].decrementoStock(decrem);
						//Mostramos que se ha realizado correctamente
						System.out.println("Acción realizada correctamente");
					}
					
				}
				break;
				//En cualquier otro caso,
				default:
					//Se le mostrará un mensaje de error
					System.out.println("Seleccione una opción válida");
			}
		//Mientras que la opción sea distinta de 7
		} while (opcion != 7);
		
		//Habrá salido del bucle, mostrándole el siguiente mensaje
		System.out.println("El programa se ha cerrado correctamente");
		
		//Finalmente, cerramos el Scanner 
		read.close();
	}

}
