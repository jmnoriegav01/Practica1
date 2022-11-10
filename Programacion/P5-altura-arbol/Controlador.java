class Controlador {
	int arbol;
	String arboles;
	int puntero;
	Nodo n;
	int altura;
	
	Controlador(int arbol, String arboles, int puntero, Nodo n, int altura) {
		this.arbol = arbol;
		this.arboles = arboles;
		this.puntero = puntero;
		this.n = new Nodo();
		this.altura = altura;
		
	}
	
	void setPuntero(int puntero){
		this.puntero = puntero;
	}
	
	void setNodo(Nodo n){
		this.n = new Nodo(this.arboles,0,0);
	}
	
	Nodo getNodo(){
		return this.nodo;
	}

	void setAltura(int altura){
		this.altura = altura;
	}
	
	int getArbol(){return this.arbol;}
	String getArboles(){return this.arboles;}
	int getPuntero(){return this.puntero;}
	int getAltura(){return this.altura;}
}