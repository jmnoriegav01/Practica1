

public class LibroPrueba {
	public static void main(String[] args) {
		Libro l = new Libro();
		String cadena; 
		
		l.setTitulo("El Quijote");
		l.setAutor("Cervantes");
		l.setNumeroEjemplaresLibros(3);
		l.setNumeroEjemplaresPrestados(4);
		
		System.out.print(l.toString() + "\n");
		
		System.out.print("Datos del Libro\n");
		System.out.print("---------------\n");
		System.out.print("Título del libro: " + l.getTitulo() + "\n");
		System.out.print("Autor: " + l.getAutor() + "\n\n");
		
		System.out.print("Prestamos\n");
		System.out.print("---------\n");
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.getNumeroEjemplaresLibros();
			
			System.out.print(cadena);
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.numeroEjemplaresLibros();
			
			System.out.print(cadena);
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.numeroEjemplaresLibros();
			
			System.out.print(cadena);
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		if(l.Prestamo()){
			cadena = l.getTitulo() + " se ha prestado ";
			cadena+= l.getNumeroEjemplaresPrestados() + "/" + l.numeroEjemplaresLibros();
			
			System.out.print(cadena);
			
		}
		else{
			System.out.print(l.getTitulo() + " no esta disponible\n");
		}
		
		l.setTitulo("El Nombre de la Rosa");
		l.setAutor("Umberto Eco");
		l.setNumeroEjemplaresLibros(2);
		l.setNumeroEjemplaresPrestados(1);
		
		System.out.print("\nDevoluciones\n");
		System.out.print("------------\n\n");
		
		System.out.print("Datos del Libro\n");
		System.out.print("---------------\n");
		System.out.print("Título del libro: " + l.getTitulo() + "\n");
		System.out.print("Autor: " + l.getAutor() + "\n\n");
		
		if(l.Devolucion()){
			System.out.print(l.getTitulo() + " se ha devuelto correctamente\n");
		}
		else{
			System.out.print(l.getTitulo() + "  esta disponible\n");
		}
		
		
	}
}