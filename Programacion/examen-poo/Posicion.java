class Posicion {
	private int temporada;
	private int capitulo;
	private int posicion;
	
	Posicion(){
		this.temporada = 0;
		this.capitulo = 0;
		this.posicion = 0;
	}
	
	Posicion(int temporada, int capitulo, int posicion){
		this.temporada = temporada;
		this.capitulo = capitulo;
		this.posicion = posicion;
	}
	
	public void setTemporada(int temporada){
		this.temporada = temporada;
	}
	
	public void setCapitulo(int capitulo){
		this.capitulo = capitulo;
	}
	
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}           
	
	public int getTemporada(){return this.temporada;}
	public int getCapitulo(){return this.capitulo;}
	public int getPosicion(){return this.posicion;}
	
	@Override
	public String toString() {
		String cadena;
		
		cadena = "Temporada: " + this.temporada + "\n";
		cadena+= "Capitulos: " + this.capitulo + "\n";
		cadena+= "Posicion: " + this.posicion;
		
		return cadena;
	}
}