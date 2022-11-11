import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, narboles, puntero, altura;
     	char dato;
     	
		Scanner sn = new Scanner(System.in);
 	 	sn.useDelimiter("\n");
 	 		
  		Scanner entrada = new Scanner(System.in);
  		
  		System.out.println("Cuantos arboles quieres");
  		narboles = entrada.nextInt();	
  				     	
  		for(i=0;i<=narboles;i++){
  			System.out.println("Describe el arbol numero " + (i+1));
 		
 			String cadena = sn.next();
   			String[] tokens = cadena.split(" ");
   			
   			Nodo n = new Nodo(cadena,0,0,0);
  			Controlador c = new Controlador(0,cadena,0,n,0,0);
   		   			
   			for (String token : tokens) {
   				int nodosHijos = Integer.parseInt(token);
   			   				
   				if(nodosHijos != 0){
   						String arboles = cadena;
   						altura = n.getAltura();
   						altura++;
   						puntero = n.getPuntero();
   						n = new Nodo(arboles,nodosHijos,puntero,altura);
   				}	
				
				puntero = n.getPuntero();
				puntero = puntero + 2;
				n.setPuntero(puntero);
				
				String salida = "nodo " + nodosHijos + " - ";
				       salida+= "altura " + c.getAltura() + " - ";
				       salida+= "puntero " + n.getPuntero() + "\n";
				       
				System.out.print(salida);      					  					
   			}
   		}
  	}
}

