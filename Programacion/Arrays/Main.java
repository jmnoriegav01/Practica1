import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] vector = {1,5,9,3,45,23,45,12,87,9,6};
		int[] vectorFinal = new int[vector.length-1];	
		int elemento;
		int j=0;
		
		boolean primeralinea =  true;
		
		
		System.out.print("Vector = [");
		for(int i=0;i<vector.length;i++){
			if(primeralinea == true){	
				System.out.print(" "+vector[i]);
				primeralinea = false;
			}
			else {
				System.out.print(vector[i] + " ");
			}
		}
		System.out.print("]");
	
		System.out.println("\nElemento a borrar");
		elemento = teclado.nextInt();
		
		primeralinea = true;
		
		
		for(int i=0;i<vector.length;i++){
			if(elemento != vector[i]){
				vectorFinal[j] = vector[i];
				j++;
			}
		}
		
		primeralinea = true;
		
		System.out.print("Vector = [");
		
		for(int v : vectorFinal){
			if(primeralinea == true){	
				System.out.print(" " + v);
				primeralinea = false;
			}
			else {
				System.out.print(v + " ");
			}
		}
		System.out.print("]");
		
	}
}