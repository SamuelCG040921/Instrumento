import javax.swing.JOptionPane;

public class Procesos {
	int arr1[] = new int[5];
    int arr2[] = new int[5];
	public Procesos(){
		iniciar();
	}
	private void iniciar() {
		for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
           
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
            
        }
		 sumaArreglos(arr1,arr2);
		 System.out.println("Primer arreglo: ");
		 for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " " );
			
		}
		 System.out.println();
		 System.out.println("Segundo arreglo: ");
		 for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " " );
			
			
		}
		 System.out.println();
		
	}
       
		
	public int[] sumaArreglos(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
            System.out.println("Los arreglos deben ser del mismo tamaño para poder sumarlos.");
            
        }
        
        int[] resultado = new int[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] + arr2[i];
        }
        
        System.out.println("Resultado de la suma:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
            
    }
        System.out.println();
		return resultado;
}
}