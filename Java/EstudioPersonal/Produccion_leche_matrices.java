/* En una granja hay un conjunto de N vacas.
Escriba un programa que guarde en una matriz de dimensiones
7 x N la producción de leche generada por cada vaca diariamente,
durante una semana. Finalmente, calcule
la producción total de leche de la granja al cabo de la semana
y cuál vaca dio más leche cada día. */

package EstudioPersonal;

import java.io.Console;

public class Produccion_leche_matrices {
    public static void main(String[] args){

        Console console = System.console();


        int num_vacas = Integer.parseInt(console.readLine("Ingrese el numero de vacas: "));

        double [][] producc_leche = new double[7][num_vacas];

        //mat.length = Cantidad de filas de la matriz.
        //math[i].length = Cantidad de elementos de la fila asociada por i.
        double total_generado = 0;
        for(int i = 0; i < producc_leche.length ; i++){
            for(int j = 0; j < producc_leche[i].length; j++){
                producc_leche[i][j] = Double.parseDouble(console.readLine("Ingrese la produccion de litros de leche de la vaca "+j+" el dia "+i+" : "));
                total_generado += producc_leche[i][j];

            }

        }
        double vaca = 0;
        for(int j = 0; j < num_vacas; j++){
            for(int i = 0; i < producc_leche.length; i++){
                vaca += producc_leche[i][j];
            }
            System.out.println("La vaca "+j+" genero un total de: "+vaca+" litros de leche.");
            vaca = 0;
        }
        System.out.println("La granja genero un total de "+total_generado+" litros de leche en una semana.");
    }
    
}
