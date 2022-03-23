package arrayList;
import java.util.*;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Trabajadores emp1 = new Trabajadores ("Jose", 85000);
		Trabajadores emp2 = new Trabajadores ("Luis", 85000);
		Trabajadores emp3 = new Trabajadores ("Antonio", 85000);
		Trabajadores emp4 = new Trabajadores ("María", 85000);
	}
	
}
class Trabajadores {
	
	public Trabajadores (String nombre, int sueldo) {
		
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	private String nombre;
	private int sueldo;
}