package clases_propias;

public class Empleado {
	
public Empleado (String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String dameDatos () {
		
		return "El empleado: " + nombre + " ,tiene una edad de " + edad + " y un salario de " + salario + " euros";
	}
	
	private String nombre;
	private int edad;
	private double salario;
}


