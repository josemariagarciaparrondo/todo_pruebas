package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		listaEmpleados.add(new Empleado("ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio" , 55, 2000));
		listaEmpleados.add(new Empleado("María" , 25, 2600));
		listaEmpleados.add(new Empleado("Jose" , 35, 2200));
	
		
		
		
		
		
		Iterator <Empleado> mi_Iterator = listaEmpleados.iterator();
		
		while(mi_Iterator.hasNext()) {
			
			double elSalario = mi_Iterator.next().getSalario();
			if(elSalario < 2500) {
				mi_Iterator.remove();
			}
		}
		for(Empleado e: listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		


	}

}
 class Empleado {
	
	public Empleado (String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String dameDatos () {
		
		return "El empleado: " + nombre + " ,tiene una edad de " + edad + " y un salario de " + salario + " euros";
	}
	

	public String getNombre () {
		
		return nombre;
	}
	
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	private String nombre;
	private int edad;
	private double salario;
}
