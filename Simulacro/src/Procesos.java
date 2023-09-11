import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	ArrayList<String> listaDatos;
	int cantMayores=0,cantMenores=0,cantPersonas=0;
	public Procesos() {
		miData = new ModeloDatos();
		iniciar();
	}
	private void iniciar() {
		cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que va a ingresar: "));
		for (int i = 0; i < cantPersonas; i++) {
			ingresarDatos();
		}
		imprimirResultados();
		
	}
	private void  ingresarDatos() {
		listaDatos = new ArrayList<String>();
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
		String documento = JOptionPane.showInputDialog("Ingrese el documento: ");
		String profesion = JOptionPane.showInputDialog("Ingrese la profesion: ");
		int edad = validarEdad("Ingrese la edad: ");
		
		listaDatos.add(nombre);
		listaDatos.add(documento);
		listaDatos.add(profesion);
		listaDatos.add(edad+"");
		miData.guardarDatos(listaDatos);
	}
	public int validarEdad(String edad) {
		int edad1 = 0;
		
		do {
			edad1 = Integer.parseInt(JOptionPane.showInputDialog(edad));
			llevarConteo(edad1);
			
			if(edad1<0) {
				JOptionPane.showMessageDialog(null, "Ha ingresado una edad invalida, por favor ingresela de nuevo");
			}
		}while(edad1 < 0);
		return edad1;
	}
	public void llevarConteo(int edad) {
		if(edad >= 18) {
			cantMayores++;
		}else {
			cantMenores++;
		}
	}
	public void imprimirResultados(){
		miData.imprimirMapa();
		System.out.println("La cantidad de personas registradas es: "+cantPersonas);
		System.out.println("La cantidad de mayores de edad es: "+cantMayores);
		System.out.println("La cantidad de menores de edad es: "+cantMenores);
	}
}
