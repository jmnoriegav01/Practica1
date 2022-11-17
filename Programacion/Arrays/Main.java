import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] vector = {1,5,9,3,45,23,45,12,87,9,6};
		int[] vectorFinal = new int[vector.length-1];
		int elemento;
		int j=0;
		
		System.out.print("{ ");
		for(int v : vector){
			
			System.out.print(v + ", ");
		}
		System.out.print("}");
	
		System.out.println("\nElemento a borrar");
		elemento = teclado.nextInt();
		
		for(int i=0;i<vector.length;i++){
			if(elemento != vector[i]){
				vectorFinal[j] = vector[i];
				j++;
			}
		}
		
		for(int v : vectorFinal){
			System.out.print(v + "-");
		}
		
	}
}