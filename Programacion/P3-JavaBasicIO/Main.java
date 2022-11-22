import java.util.Scanner;
import java.util.Properties;

class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";
  	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int operador1, operador2;
		String Sistema = System.getProperty("os.name");
		String Usuario = System.getProperty("user.name");
		int division;
		int resto;
						
		System.out.println("El Sistema Operativo es: " + Sistema + "\n");
		System.out.println("El Nombre de Usuario es: " + Usuario + "\n");
		System.out.println("------------------------" + "\n\n");
		
		System.out.println("Introduce el Operador 1: ");
		operador1 = teclado.nextInt();
		
		System.out.println("Introduce el Operador 2: ");
		operador2 = teclado.nextInt();
		
		division = operador1 / operador2;
		resto = operador1 % operador2;
		
		System.out.println("La division es "
					+ ANSI_BLUE 
					+ division + " " 
					+ ANSI_RESET  
					+ "El resto es " 
					+ ANSI_RED 
					+ resto);
	}
}