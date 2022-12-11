class Nodo {
	int nodosHijos;
	String arboles;
	int puntero;
	int altura;
	
	Nodo(String arbol, int puntero, int alturaPadre){
		this.arboles = arbol;
		this.puntero = puntero;
		this.altura = alturaPadre;
	}

	int getAltura(){
		return this.altura;
	}

	int getPuntero(){
		return this.puntero;
	}
}