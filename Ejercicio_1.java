package ejercicios;

public class Ejercicio_1 {

	public static void main(String[] args) {

		/*
		 * 1. Use the indexOf method to get the index for the space character (" ")
		 * within custName. Assign it to spaceIdx. 2. Use the substring method and the
		 * spaceIdx to get the first name portion of custName. Assign it to firstName.
		 * Print firstName.
		 */
		
		String custName = "Steve Smith";
		String firstName;
		int spaceIdx;
		
		System.out.println("El espacio en blanco esta en la posicion " + custName.indexOf(" "));
		
		
		
		// Get the index of the space character (" ") in custName. 
		
		spaceIdx = custName.indexOf(" ");
		
		firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);



        // Use the substring method parse out the first name and print it
		
		
		
		

	}

}
