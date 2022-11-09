class Arbol {
	private String Entrada;
	private Integer Dato;
	private Integer NodoIzquierdo;
	private Integer NodoDerecho;
	private Integer Niveles;
	private Integer Salida;
	
	Arbol(String Entrada){
		this.Entrada = Entrada;
	}
	
	
	public void setHijos() {
		
	}
	
	public boolean getVacia(){
		if(this.Entrada.length() == 0) {
			return true;
		}
		return false;
	}
	
	public Integer getSalida() {
		return this.Salida;
	}
}