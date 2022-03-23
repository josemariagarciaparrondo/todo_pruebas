package colecciones;

public class Uso_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro ("p en Java", "Juan", 25);
		
		Libro libro2 = new Libro ("p en Java", "Juan", 25);
		
	
		
		
		if (libro1.equals(libro2)){
			
			System.out.println("Es el mismo");
		}else {
			
			System.out.println("No es el mismo");
		}
		
		System.out.println(libro1.hashCode());
		System.out.println(libro2.hashCode());
		

	}

}
