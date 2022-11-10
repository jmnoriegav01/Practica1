import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int cuantosArboles;
		int i;
		int dato;
		
		System.out.println("Cuantos arboles quieres");
		cuantosArboles = teclado.nextInt();
		
		for(i=0;i<cuantosArboles;i++){
			System.out.println("Introduce el Arbol Numero " + (i+1));
			cadena = teclado.next();
			String[] resultadoSplit = cadena.split(",");
 
			for (String item : resultadoSplit) {
				
				System.out.println(item);
			}
			
		}
		
		
	}

}