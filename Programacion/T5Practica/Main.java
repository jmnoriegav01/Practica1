import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int i;
			String arboles;
			int puntero;
			int altura;
			int narboles;

	
			char nodosHijos;
			int nHijos;
			
			Scanner sn = new Scanner(System.in);
	 	 	sn.useDelimiter("\n");
	 	 		
	  		Scanner entrada = new Scanner(System.in);
	  		
	  		System.out.println("Cuantos arboles quieres");
	  		narboles = entrada.nextInt();	
	  				     	
	  		for(i=0;i<=narboles;i++){
		  			System.out.println("\nDescribe el arbol numero " + (i+1));
		 			String cadena = sn.next();
		 			
		   			Nodo n = new Nodo(cadena,0,0);
		  					   		 	
		   		 	altura = n.getAltura();	
		   		 	puntero = n.getPuntero();
					
		   		   	for (int k=0;k<cadena.length()/2;k++) {
		   				
			   				nodosHijos = cadena.charAt(n.getPuntero());
			   				nHijos = Character.getNumericValue(nodosHijos);
			   											
			   			  	if(nHijos!=0){
			   							
										altura = n.getAltura();
										altura++;
																							
										puntero = n.getPuntero();
										puntero++;
										
										n = new Nodo(cadena,puntero,altura);
			   			    
			   				}	
			
							String salida = "nodo " + nodosHijos + " - ";
							       salida+= "altura " + n.getAltura() + " - ";
							       salida+= "puntero " + n.getPuntero() + "\n";
							       
							System.out.print(salida);      	
			
							
					}
	   		}
	  	}
}

