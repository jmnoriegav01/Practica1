import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arboles = 0;
		int puntero = 0;
		int narboles = 0;
		char nodosHijos = 0;
		int nHijos = 0;
		int altura = 0;
		
		Scanner sn = new Scanner(System.in);
		sn.useDelimiter("\n");
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos arboles quieres");
		narboles = entrada.nextInt();	
						
		for(int i = 0; i < narboles; i++){
			System.out.println("\nDescribe el arbol numero " + (i+1));
			String cadena = sn.next();

			if(cadena.length() == 1){
				System.out.println("\n\nLa altura del arbol es " + altura);
			}
			else {
				for (int k = 0; k < cadena.length(); k = k + 2) {
					nodosHijos = cadena.charAt(k);
					nHijos = Character.getNumericValue(nodosHijos);
					
					String salida = "Nodo: " + nodosHijos + " - Altura: " + altura + " - Puntero: " + k;
					System.out.println(salida);
				}
			}
		}
	}
}

