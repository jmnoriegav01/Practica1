class nodoArbol {
	private int dato;
	private int nodoAnterior;
	private int nodoSiguiente;
		
	nodoArbol(){
		dato = 0;
		nodoAnterior = 0;
		nodoSiguiente = 0;
	}
	
	public void setNodo(int dato){
		this.dato = dato;
	}
	
	public void setNodoAnterior(int dato){
		this.nodoAnterior = dato;
	}
	
	public void setNodoSiguente(int dato) {
		this.nodoSiguiente = dato;
	}
	
	public int getDato(){
		return this.dato;
	}
	
	public int getNodoAnterior(){
		return this.nodoAnterior;
	}
	
	public int getNodoSiguiente(){
		return this.nodoSiguiente;
	}
	
}