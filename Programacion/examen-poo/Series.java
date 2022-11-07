class Series {
	private String nombre;
	private int temporadas;
	private int capitulos;
	
	Series(String nombre, int temporadas, int capitulos){
		this.nombre = nombre;
		this.temporadas = temporadas;
		this.capitulos = capitulos;
	}
	
	@Override
	public String toString() {
		String cadena;
		
		cadena = "Nombre: " + this.nombre + "\n";
		cadena+= "Temporadas: " + this.temporadas + "\n";
		cadena+= "Capitulos: " + this.capitulos;
		
		return cadena;
	}
	
	
}
