/* Escriba una función que reciba un arreglo de números enteros y un número N,
e imprima en pantalla todos
los índices del arreglo donde aparece el valor N.
Por ejemplo, si el arreglo es [1, 2, 3, 100, 23, 2, 2, 1] y da el
valor 2, entonces la función debe imprimir los números 1, 5 y 6 
(pues esos son los índices donde aparece el número 2). */

package EstudioPersonal;

import java.util.ArrayList;
import java.io.Console;

public class Posicion_elem {
    public static void main (String [] args){
        Console console = System.console();
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 0;

        while(i != 5){
            lista.add(Integer.parseInt(console.readLine("Ingrese numeros: ")));
            i++;
        }

    }
    
}
