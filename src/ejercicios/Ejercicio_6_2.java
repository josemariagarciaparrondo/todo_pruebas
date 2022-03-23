package ejercicios;

public class Ejercicio_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * In the ShoppingCart class: 1. Declare and instantiate 2 objects of type Item.
		 * Initialize only the descr field in each, using different values for each. 2.
		 * Print the description for each item and run the code. 3. (Optional) Above the
		 * code that prints the descriptions, assign item2 to item1. Run it again.
		 */
		Item item1, item2;
		item1 = new Item();
		item2 = new Item();

		item1.desc = "Shirt";
		item2.desc = "Pants";

		item1 = item2;
		System.out.println("Item1: " + item1.desc);
		System.out.println("Item2: " + item2.desc);

	}

}
