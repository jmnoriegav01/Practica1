import java.time.LocalDate;
import java.time.Period;

class Prestamo {
	private String lector;
	private String libro;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	Prestamo(String lector,String libro){
		this.lector = lector;	
		this.libro = libro;
		this.fechaDevolucion = null;		
	
	}
	
	public int getDiferencia(){
	
		return Period.between(this.fechaPrestamo, this.fechaDevolucion);
	}
	
	public String getLector(){ return this.lector;}
	public String getLibro(){return this.libro;}
	
}