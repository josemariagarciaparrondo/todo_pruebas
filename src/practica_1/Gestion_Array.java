package practica_1;


import java.util.Scanner;

//Alumno: Jose Maria Garcia Parrondo

public class Gestion_Array {
	
	static double[] array = new double[10];	
	public static void main(String[] args) {	
		
		

		//LLamamos al metodo rellenarArray para rellenar el array (no opcional)
		
		Gestion_Array.rellenaArray(array);
		
		//Despues muestra las opciones y ejecuta el metodo segun la opcion elegida
		
		Gestion_Array.mostrarOpciones();
		
		
		// los metodos reciben como parametro el array rellenado por  teclado

	}
	private static void rellenaArray (double[]array) { 
		
		System.out.println("_______________________________________");
		System.out.println("INTRODUCE LOS 10 NUMEROS REALES DEL ARRAY (NEGATIVOS Y DECIMALES TAMBIEN)");
		System.out.println("¡¡¡¡¡¡ OJO DECIMALES CON COMA !!!!!!!!");
		System.out.println("_______________________________________");
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		while (i < array.length) {
			System.out.println("Introduce el numero " + (i + 1));
			double num = entrada.nextDouble();
			array[i] = num;
			i++;
		} 
		
	}
	private static void mostrarOpciones () {
		
		Scanner entrada = new Scanner(System.in);
		int opcion = -1; // inicializamos a un numero distinto de 0 para entrar en el bucle
		do {
			System.out.println("\n");
			System.out.println("M E N U");
			System.out.println("________________________________________");
			System.out.println("Opcion 1: Mostrar array");
			System.out.println("Opcion 2: Mostrar el numero mayor");
			System.out.println("Opcion 3: Mostrar el numero menor");
			System.out.println("Opcion 4: Mostrar la suma");
			System.out.println("Opcion 5: Mostrar la media");
			System.out.println("Opcion 0: Salir del programa");
			

			// almacenamos la entrada elegida en la variable opcion
			
			opcion = entrada.nextInt();

			// comprobamos que el numero introducido esta entre 0 y 5, que son las opciones
			
			if (opcion < 0 || opcion > 5) {
				
				// si no esta comprendido entre 0 y 5, nueva introduccion
				
				System.out.println("La opcion debe estar entre 1 y 5 ó 0 para salir, elige otra");
			}
			
			// segun la opcion elegida, asi llamaremos al metodo correspodiente
			
			switch (opcion) {

			case 1:
				Gestion_Array.mostrarNumeros(array);
				break;
			case 2:
				System.out.println("El numero mayor es " + Gestion_Array.mostrarMayor(array));
				break;
			case 3:
				System.out.println("El numero menor es " + Gestion_Array.mostrarMenor(array));
				break;
			case 4:
				System.out.println("La suma de los numeros es (sin decimales por el casting a long): " + Gestion_Array.mostrarSuma(array));				
				break;
			case 5:
				System.out.printf("La media de los numeros es %.2f " ,   Gestion_Array.mostrarMedia(array));				
				break;

			}			
		
		} while (opcion != 0);
		System.out.println("ADIOS.....!!!!!"); // al elegir la opcion 0, sale del bucle y finaliza el programa
		
	} 
	
	
	private static void mostrarNumeros(double[] array) { // meto el array rellenado por el usuario como parametro
														
		System.out.println("Los numeros elegidos son: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	private static double mostrarMayor(double[] array) {
		double numMayor = 0;
		for (int i = 0; i < array.length; i++) {
			if (numMayor < array[i]) {
				numMayor = array[i];
			}
		}
		return numMayor;
	}

	private static double mostrarMenor(double[] array) {
		double numMenor = 0;
		for (int i = 0; i < array.length; i++) {
			if (numMenor > array[i]) {
				numMenor = array[i];
			}
		}
		return numMenor;
	}

	private static long mostrarSuma(double [] array) { // la practica ordena que sea metodo long
		
		long suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return (long)suma;
		//por tanto al resultado hay que hacerle un casting a long
		//notese que al imprimir, no dara decimales

	}

	private static double mostrarMedia(double [] array) {
		double suma = 0;
		double media = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / array.length;
		return media;
	}
	
}
