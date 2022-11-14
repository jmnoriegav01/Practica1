import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int i, narboles, puntero, altura;
			int alturaControlador,alturaNodo;
	     	
			Scanner sn = new Scanner(System.in);
	 	 	sn.useDelimiter("\n");
	 	 		
	  		Scanner entrada = new Scanner(System.in);
	  		
	  		System.out.println("Cuantos arboles quieres");
	  		narboles = entrada.nextInt();	
	  				     	
	  		for(i=0;i<=narboles;i++){
		  			System.out.println("\nDescribe el arbol numero " + (i+1));
		 			String cadena = sn.next();
		 			int nHijos;
		   			String nodosHijos;
		   			
		   			Nodo n = new Nodo(cadena,0,0,0);
		  			Controlador c = new Controlador(0,cadena,0,n,0,0);
		   		 	
		   		 	alturaControlador = c.getAltura();	
		   		 	alturaNodo = n.getAltura();	
		   		   	
		   		   	for (int k=0;k<cadena.length()/2;k++) {
		   				
			   				nodosHijos = cadena.charAt(n.getPuntero());
			   				nHijos = Integer.parseInt(nodosHijos);
			   				
			   			   	c = new Controlador(0,cadena,puntero,n,alturaControlador,nHijos);
			   			    
			   				if(nHijos!=0){
			   							
			   								String arboles = cadena;
									
			   								altura = n.getAltura();
			   								altura++;
											n.setAltura(altura);
									
											altura = c.getAltura();
											altura++;
											c.setAltura(altura);
			   				
			   								n = new Nodo(cadena,nHijos,puntero,altura);
			   			    
			   				}	
			
							String salida = "nodo " + nodosHijos + " - ";
							       salida+= "altura " + c.getAltura() + " - ";
							       salida+= "puntero " + n.getPuntero() + "\n";
							       
							System.out.print(salida);      	
			
							puntero = n.getPuntero();
							puntero = puntero + 2;
							n.setPuntero(puntero);	
							
							puntero = c.getPuntero();
							puntero = puntero + 2;
							c.setPuntero(puntero);
					}
	   		}
	  	}
}

