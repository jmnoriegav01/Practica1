class Prueba
{
	 
	public static void main(String[] args){
		
		Posicion p = new Posicion(3,2,15);
		Series s = new Series("The Wire",5,10);
		
		Posicion p1 = new Posicion();
		
		p1.setTemporada(4);
		p1.setCapitulo(6);
		p1.setPosicion(27);
		
		Series s1 = new Series("It Crew",4,6);
		
		System.out.println("Series");
		System.out.println("------");
		System.out.println(s1.toString());
		System.out.println("Posicion");
		System.out.println("--------");
		System.out.println(p1.toString());
		
	
	}
}


