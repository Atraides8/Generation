/*Escriba un programa que solicite al usuario el tamaño de un arreglo y un número entero, e
imprima en pantalla el resultado de llenar dicho arreglo con los múltiplos del número dado. Por
ejemplo, si se define un arreglo de tamaño 5 y se indica el valor 3, el resultado será el arreglo
formado por los valores [3, 6, 9, 12, 15].*/

package EstudioPersonal;

import java.util.Arrays;
import java.io.Console;

public class Arreglo_ejercicio1 {
    public static void main(String [] args){
        Console console = System.console();

        
        
        int dimension = Integer.parseInt(console.readLine("Ingrese la dimension de la lista: "));
        int num_entero = Integer.parseInt(console.readLine("Ingrese un numero entero: "));

        int[] lista_enteros = new int[dimension];

        for(int i = 1; i <= dimension; i++){

            lista_enteros[i - 1] = num_entero * i ;

        }
        System.out.println(Arrays.toString(lista_enteros));
    }
}
