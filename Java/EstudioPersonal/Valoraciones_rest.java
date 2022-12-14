/*El dueño de un restaurante entrevista a cinco clientes
y les pide que califiquen de 1 a 10 los siguientes
aspectos: atención, calidad de la comida, precio, ambiente.
Escriba un programa que le pida las valoraciones
anteriores a los cinco clientes y luego imprima en pantalla 
el promedio obtenido en cada uno de los criterios.
Indicación: use un arreglo de dos dimensiones:
las filas representan las calificaciones otorgadas por cada
cliente, mientras que las columnas representan los distintos criterios de evaluación.*/

/*FILA X COLUMNA */


package EstudioPersonal;

import java.io.Console;

public class Valoraciones_rest {
    public static void main(String [] args){
        Console console = System.console();

        Integer matriz[][] = new Integer[5][4];
        

        matriz[0][0] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[0][1] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[0][2] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[0][3] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));

        matriz[1][0] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[1][1] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[1][2] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[1][3] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));

        matriz[2][0] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[2][1] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[2][2] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[2][3] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));

        matriz[3][0] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[3][1] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[3][2] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[3][3] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));

        matriz[4][0] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[4][1] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[4][2] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));
        matriz[4][3] =  Integer.parseInt(console.readLine("Ingrese una nota del 1 al 7 la atencion que tuvo: "));

       for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
        
        int promedio = 0;
        for(int y = 0; y < 4;y++){
            for(int x= 0; x < matriz.length; x++){
                promedio += matriz[x][y];

                switch(y){
                    case 0:
                    if((x == 4)){
                        System.out.println("Promedio de la atencion: " + promedio / 5);
                        promedio = 0;
                    }
                    break;

                    case 1:
                    if((x == 4)){
                        System.out.println("Promedio de la calidad de la comida: " + promedio / 5);
                        promedio = 0;
                    }
                    break;

                    case 2:
                    if((x == 4)){
                        System.out.println("Promedio del precio: " + promedio / 5);
                        promedio = 0;
                    }
                    break;

                    case 3:
                    if((x == 4)){
                        System.out.println("Promedio del ambiente: " + promedio / 5);
                        promedio = 0;
                    }
                    break;

                }
            }
        }
    }
}
