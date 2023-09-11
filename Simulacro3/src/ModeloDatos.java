import java.util.ArrayList;
import java.util.HashMap;

public class ModeloDatos {
	HashMap <String, ArrayList<String>> mapaEmpleados;
	public ModeloDatos() {
		mapaEmpleados = new HashMap<String, ArrayList<String>>();
		
	}
	public void guardarDatos(ArrayList<String> datos) {
		mapaEmpleados.put(datos.get(0), datos);
		System.out.println("El empleado se ha registrado correctamente");
	}
	public void imprimirMapa() {
		for (String nombre:mapaEmpleados.keySet()) {
		      System.out.println(nombre + " - "+mapaEmpleados.get(nombre));
		}
	}
}

