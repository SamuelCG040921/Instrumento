import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	ArrayList<String> datos;
	double sueldo = 0;
	double sueldoFinal;
	public Procesos() {
		miData = new ModeloDatos();
		iniciar();
	}
	public void iniciar(){
		ingresarDatos();
		miData.imprimirMapa();
		System.out.println("Hola, su sueldo final es: "+sueldoFinal);
	}
	public void ingresarDatos() {
		datos = new ArrayList<String>();
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo base: "));
		int estrato = evaluarEstrato("Ingrese su estrato");
	
		datos.add(nombre);
		datos.add(estrato+"");
		datos.add(sueldo+"");
		datos.add(sueldoFinal+"");
		miData.guardarDatos(datos);
	}
	public int evaluarEstrato(String estrato) {
		int estrato1 = 0;
		double descuento = 0;
		do {
			estrato1 = Integer.parseInt(JOptionPane.showInputDialog(estrato));
			switch(estrato1) {
			case 1:
				descuento = sueldo * 0.2;
				sueldoFinal = sueldo - descuento;
				System.out.println("Tiene un descuento del 2%");
				break;
			case 2:
				descuento = sueldo * 0.2;
				sueldoFinal = sueldo - descuento;
				System.out.println("Tiene un descuento del 2%");
			case 3:
				descuento = sueldo * 0.4;
				sueldoFinal = sueldo - descuento;
				System.out.println("Tiene un descuento del 4%");
				break;
			case 4:
				descuento = sueldo * 0.4;
				sueldoFinal = sueldo - descuento;
				System.out.println("Tiene un descuento del 4%");
				break;
			case 5:
				descuento = sueldo * 0.8;
				sueldoFinal = sueldo - descuento;
				System.out.println("Tiene un desucneot del 8%");
				break;
			case 6:
				descuento = sueldo * 0.10;
				sueldoFinal = sueldo - descuento;
				break;
			default:
				System.out.println("Ingrese un estado valido");
				break;
				
			
			
			}
			if(estrato1 <0 || estrato1 >6);
			
		} while (estrato1 <0 || estrato1 >6);
		return estrato1;
		
		
	}
}
