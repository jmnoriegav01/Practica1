import java.util.Scanner;

class LeerEntrada {
	public String leerString(){
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public int leerEntero() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}