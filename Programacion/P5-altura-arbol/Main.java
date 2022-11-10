import java.util.Scanner;
import java.io.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		
		String teclado = "1 2 3 4 5 6 7";
		int j;
     
        Scanner cadena = new Scanner(teclado);
  
		for(j=0;j<=cadena.length();j++){
			char result = cadena.charAt(j);
			System.out.println(result);	
		}
 
       
        cadena.close();
		
	}

}