import java.io.*;

class main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static void main(String[] args) {

        String[] alumnos = {"Jose Maria", "Juan\t", "Pedro\t", "Juan Jose"};
        String[] modulos = {"Programacion", "Sistemas", "BBDD\t", "L. Marcas"};
         
        int[][] notas = {
                            {5, -1, 10, 3},
                            {7, 8, -1, 6},
                            {5, 3, 10, 9},
                            {-1, 10, 5, -1},
                        };
        

        int sumaModulo = 0;
        float mediaModulo = 0;
        float mediaAlumno = 0; 
        int NumeroDeModulos = 0;
        int NumeroDeModulosAlumno = 0;
      
        System.out.print("\t");
        for(int i = 0; i < modulos.length; i++){
            System.out.print("\t" + modulos[i]);
        }

        System.out.print("\tMedia\n\n");

        for(int i = 0; i < alumnos.length; i++){
            
            NumeroDeModulos = 0;
            sumaModulo = 0;
            System.out.print(alumnos[i] + "\t");
        
            for(int j = 0; j < notas.length; j++){
                if(notas[j][i] == -1) {
                    System.out.print(ANSI_RED + "SIN MATRICULAR\t" + ANSI_RESET);    
                } 
                else {
                    System.out.print(notas[j][i] + "\t\t");
                    sumaModulo = sumaModulo + notas[j][i];
                    NumeroDeModulos++;
                }
            }
        
            mediaAlumno = sumaModulo / NumeroDeModulos;
            
            System.out.print(ANSI_BLUE + mediaAlumno + ANSI_RESET + "\n");
    
        }

        System.out.print(ANSI_BLUE + "MEDIA MODULOS\t" + ANSI_RESET);
        
        int suma = 0;
        int sumaParaMedia = 0;

        for(int modulo = 0; modulo < modulos.length; modulo++){
            suma = 0;
            NumeroDeModulosAlumno = 0;
            for (int alumno = 0; alumno < alumnos.length; alumno++){
                if(notas[modulo][alumno] != -1){
                    suma = suma + notas[modulo][alumno];
                    NumeroDeModulosAlumno++;
                }
            }
            System.out.print(ANSI_BLUE + (suma / NumeroDeModulosAlumno) + ANSI_RESET + "\t\t");
            sumaParaMedia = sumaParaMedia + (suma / NumeroDeModulosAlumno);
        }

        float mediaTotal = sumaParaMedia / modulos.length;

        System.out.print(ANSI_BLUE + mediaTotal + ANSI_RESET);

        
    }
}