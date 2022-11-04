/**
 * T4Practica
 *
 *
 * @author Jose Maria Noriega Vazquez
 * 
 */
        
class Libro {

	private String Titulo;
	private String Autor;
	private Integer NumeroEjemplaresLibros;
	private Integer NumeroEjemplaresPrestados;
	
	Libro(){
		this.Titulo = "";
		this.Autor = "";
		this.NumeroEjemplaresLibros = 0;
		this.NumeroEjemplaresPrestados = 0;
	}
	
	Libro(String Titulo, Integer NumeroEjemplaresLibros){
		this.Titulo = Titulo;
		this.NumeroEjemplaresLibros = NumeroEjemplaresLibros;
	}
	
	public void setTitulo(String Titulo) {this.Titulo = Titulo; }
	public void setAutor(String Autor) {this.Autor = Autor;}
	public void setNumeroEjemplaresLibros(Integer NumeroEjemplaresLibros) {this.NumeroEjemplaresLibros = NumeroEjemplaresLibros;}
	public void setNumeroEjemplaresPrestados(Integer NumeroEjemplaresPrestados){this.NumeroEjemplaresPrestados = NumeroEjemplaresPrestados;}
	
	public String getTitulo() {return this.Titulo;}
	public String getAutor() {return this.Autor;}
	public Integer getNumeroEjemplaresLibros() {return this.NumeroEjemplaresLibros;}
	public Integer getNumeroEjemplaresPrestados() {return this.NumeroEjemplaresPrestados;}
	
	public boolean Prestamo() {
		if(this.NumeroEjemplaresPrestados < this.NumeroEjemplaresLibros){
			return false;
		}
		else {
			this.NumeroEjemplaresPrestados--;
			return true;
		}
	}
	
	public boolean Devolucion(){
		if(this.NumeroEjemplaresPrestados > this.NumeroEjemplaresLibros){
			return false;
		}
		else{
			this.NumeroEjemplaresPrestados++;
			return true;
		}
	}
	
	@Override
	public String toString() {
		
		String cadena;
		
		cadena = "Datos del libro\n";
		cadena+= "---------------\n\n";
		cadena+= "Titulo del libro: " + this.Titulo + "\n";
		cadena+= "Autor: " + this.Autor + "\n";
		cadena+= "Numero de Ejemplares: " + this.NumeroEjemplaresLibros + "\n\n";

		return cadena;
	}
}
	

