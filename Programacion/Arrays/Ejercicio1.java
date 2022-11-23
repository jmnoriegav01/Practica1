class Ejercicio1 {
	public static void main(String[] args) {
		
		String cadena;
		String letra;
		int contador = 0;
		LeerEntrada entrada = new LeerEntrada();
		
		System.out.println("Introduce un texto");
		cadena = entrada.leerString();
		
		System.out.println("Introduce una letra");
		letra = entrada.leerString();
		
		int count = 0;
		for(int i =0; i < string.length(); i++){
			if(string.charAt(i) == letra){
				contador++;
			}
		}
		
	}
}