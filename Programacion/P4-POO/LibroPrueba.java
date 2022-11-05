public class LibroPrueba {
	public static void main(String[] args) {
		Libro l = new Libro();
		String cadena; 
		
		l.setTitulo("El Quijote");
		l.setAutor("Cervantes");
		l.setNumeroEjemplaresLibros(3);
		l.setNumeroEjemplaresPrestados(4);
		
		
		System.out.print("Prestamos\n");
		System.out.print("-----------\n\n");
		System.out.print(l.toString());
		
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.getNumeroEjemplaresLibros() + "\n";
			
			System.out.print(cadena);
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.getNumeroEjemplaresLibros() + "\n";
			
			System.out.print(cadena);
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.getNumeroEjemplaresLibros() + "\n";
			
			System.out.print(cadena);
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		Libro l2 = new Libro();
				
		l2.setTitulo("El Nombre de la Rosa");
		l2.setAutor("Umberto Eco");
		l2.setNumeroEjemplaresLibros(4);
		l2.setNumeroEjemplaresPrestados(2);
		
		System.out.print("\nDevoluciones\n");
		System.out.print("--------------\n\n");
		System.out.print(l2.toString());
		
				
		if(l2.Devolucion()){
			cadena = l2.getTitulo() + " se ha devuelto ";
			cadena+= l2.getNumeroEjemplaresPrestados() + "/" + l2.getNumeroEjemplaresLibros() + "\n";
			
			System.out.print(cadena);
			
		}
		else{
			System.out.print(l2.getTitulo() + " esta disponible\n");
		}
		
		if(l2.Devolucion()){
			cadena = l2.getTitulo() + " se ha devuelto ";
			cadena+= l2.getNumeroEjemplaresPrestados() + "/" + l2.getNumeroEjemplaresLibros() + "\n";
			
			System.out.print(cadena);
			
		}
		else{
			System.out.print(l2.getTitulo() + " disponemos de todos sus ejemplares\n");
		}
		
		Libro l3 = new Libro("Luces de Bohemia",3);
		
		System.out.println("\n\nDatos del Libro");
		System.out.println("---------------");
		System.out.println("Titulo del Libro: " + l3.getTitulo());
		System.out.println("Numero de ejemplares: " + l3.getNumeroEjemplaresLibros());
		
	}
}