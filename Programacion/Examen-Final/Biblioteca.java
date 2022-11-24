
								
class Biblioteca {
	public static void main(String[] args){
		
		Lector lector1 = new Lector(1,'Ana Garcia');
		Lector lector2 = new Lector(2,'Roberto Sanchez');
		
		Libro libro1 = new Libro(1,'Cien Años de Soledad', 'Garcia Marquez');
		Libro libro2 = new Libro(2,'Rayuela','Julio Cortázar');
		
		Prestamo p1 = new Prestamo(1, 'Jose Maria');
		Prestamo p2 = new Prestamo(2, 'Jose Maria');
	}
	
	
}