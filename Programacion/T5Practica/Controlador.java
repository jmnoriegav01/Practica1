class Controlador {
	int arbol;
	String arboles;
	int puntero;
	Nodo n;
	int altura;
	int nodosHijos;
	
	Controlador(int arbol, String arboles, int puntero, Nodo n, int altura,int nodosHijos) {
		this.arbol = arbol;
		this.arboles = arboles;
		this.puntero = puntero;
		this.altura = altura;
		this.nodosHijos = nodosHijos;
		this.n = new Nodo(this.arboles,this.nodosHijos,this.puntero,this.altura);
	}
	
	void setPuntero(int puntero){
		this.puntero = puntero;
	}
	
	void setNodo(Nodo n){
		this.n = new Nodo(this.arboles,0,0,0);
	}
	

	void setAltura(int altura){
		this.altura = altura;
	}
	
	int getArbol(){return this.arbol;}
	String getArboles(){return this.arboles;}
	int getPuntero(){return this.puntero;}
	int getAltura(){return this.altura;}
	Nodo getNodo() {return this.n;}
}