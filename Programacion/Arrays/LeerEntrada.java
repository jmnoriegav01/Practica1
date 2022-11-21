import java.util.Scanner;

class LeerEntrada {
	LeerEntrada(Mensaje){
		Scanner teclado = new Scanner(System.io);
		int entrada;
		
		System.out.println(Mensaje);
		entrada = teclado.nextInt();
		
		return entrada;
	}
}