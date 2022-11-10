class Nodo {
	int nodosHijos;
	String arboles;
	int puntero;
	int altura;
	
	Nodo(String arboles,int ){
		this.nodosHijos = nodosHijos;
		this.arboles = arboles;
		this.puntero = puntero;
		this.altura = altura;
	}
	
	void setNodosHijos(int nodosHijos){
		this.nodosHijos = nodosHijos;
		
	}
	
	void setArboles(String arboles){
		this.arboles = arboles;
	}
	
	void setPuntero(int puntero){
		this.puntero = puntero;
	}
	
	void setAltura(int altura){
		this.altura = altura;
	}
	
	int getNodosHijos(){
		return this.nodosHijos;
	}
	
	String getArboles(){
		return this.arboles;
	}
	
	int getPuntero(){
		return this.puntero;
	}
	
	int getAltura(){
		return this.altura;
	}
	
}