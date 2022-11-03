/**
 * @(#)Libros.java
 *
 *
 * @author 
 * @version 1.00 2022/11/3
 */

public class T4Practica {
        
    /**
     * Creates a new instance of <code>Libros</code>.
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
	    
	    Libro(String Titulo, Integer NumeroEjemplaresLibros)
	    {
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
			if(this.NumeroEjemplaresLibros == 0){
				return false;
			}
			this.NumeroEjemplaresPrestados++;
			return true;
		}
		
		public boolean Devolucion(){
			if(this.NumeroEjemplaresPrestados == 0){
				return false;
			}
			this.NumeroEjemplaresPrestados--;
			return true;
			
		}
		
		@Override
		public String toString() {
    		return "Libro [Titulo] = " + Titulo + " [Autor] = " + Autor  + "[Numero de Ejemplares Libros] = " + NumeroEjemplaresLibros + "[Numero Ejemplares Prestados] = " + NumeroEjemplaresPrestados;
		}
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
