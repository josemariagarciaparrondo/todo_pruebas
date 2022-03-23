package clases_propias;

import java.util.GregorianCalendar;



public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nombres = {"María", "Pepe","José"};
		System.out.println(MisMatrices.getMenor(nombres));
		
		GregorianCalendar [] fechas = {new GregorianCalendar(2015,07,03),
				new GregorianCalendar(2012,02,28),
				new GregorianCalendar(1998,11,03),
				new GregorianCalendar(2009,10,16),};
		System.out.println(MisMatrices.getMenor(fechas).getTime());
	}

}

class MisMatrices {
	
	public static <T extends Comparable> T getMenor (T[]a) {
		
		if(a == null || a.length == 0) {
			 return null;
		}
		T elementoMenor = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			if(elementoMenor.compareTo(a[i]) > 0){
				
				elementoMenor = a[i];
				
			}
		}
		return elementoMenor;
	}
	
}
