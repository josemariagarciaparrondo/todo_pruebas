package colecciones;

import java.util.*;

public class Cuentas_Usuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);

		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);

		Cliente cl3 = new Cliente("Pen�lope", "00003", 300000);

		Cliente cl4 = new Cliente("Julio Iglesias", "00004", 500000);

		Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000);

		Set<Cliente> clientesBanco = new HashSet<Cliente>();

		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);

		Iterator<Cliente> it = clientesBanco.iterator();

		while (it.hasNext()) {

			String nombre_cliente = it.next().getNombre();

			if (nombre_cliente.equals("Julio Iglesias")) {
				it.remove();
			}

			

			/*
			 * Iterator <Cliente> it = clientesBanco.iterator();
			 * 
			 * while(it.hasNext()) {
			 * 
			 * String nombre_cliente = it.next().getNombre();
			 */

		}
		for (Cliente cliente : clientesBanco) {

			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
		}

	}

}
