class Nodo {
	int nodosHijos;
	String arboles;
	int puntero;
	int alturaPadre;
	
	Nodo(String arboles,int puntero, int alturaPadre){
		this.arboles = arboles;
		this.puntero = puntero;
		this.alturaPadre = alturaPadre;
	}
	
	int getAltura(){
		return this.alturaPadre;
	}

	int getPuntero(){
		return this.puntero;
	}
}