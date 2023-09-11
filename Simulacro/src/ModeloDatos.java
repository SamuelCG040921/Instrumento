import java.util.ArrayList;
import java.util.HashMap;

public class ModeloDatos {

	HashMap<String, ArrayList<String>> mapaPersonas;
	
	public ModeloDatos() {
		mapaPersonas = new HashMap<String, ArrayList<String>>();
	}
	public void guardarDatos(ArrayList<String> listaDatos) {
		mapaPersonas.put(listaDatos.get(0),listaDatos);
		System.out.println("Registro exitoso");
		
	}
	public void imprimirMapa() {
		for (String nombre:mapaPersonas.keySet()) {
		      System.out.println(nombre + " - "+mapaPersonas.get(nombre));
	}
}
}
