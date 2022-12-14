/*Escriba una función tal que, dados dos arreglos de números enteros
ya ordenados de menor a mayor, genere
un nuevo arreglo correspondiente a la lista ordenada
de la mezcla de ambos. Por ejemplo, si se reciben los
arreglos [1, 3, 6, 9, 17] y [2, 4, 10, 17], 
entonces la función debe devolver [1, 2, 3, 4, 6, 9, 10, 17, 17]. */


package EstudioPersonal;

import java.io.Console;
import java.util.ArrayList;

public class Ordenar_arreglos {
    public static void main(String [] args){
        Console console = System.console();

        ArrayList<Integer> lista_1 = new ArrayList<Integer>();
        ArrayList<Integer> lista_2 = new ArrayList<Integer>();
        


        int i = 0;
        int cont = 0;


        while(i != 5){
            lista_1.add(Integer.parseInt(console.readLine("Ingrese numeros: ")));
            i++;
        }
        
        while(cont != 4){
            lista_2.add(Integer.parseInt(console.readLine("Ingrese numeros: ")));
            cont++;
        }


        int const_2 = lista_2.size();
        
        //FUNCIONA PARA EL EJEMPLO DE ARRAYLIST PERO FALTA GENERALIZARLO!.
        for(int x = 0; x < const_2; x++){

            for(int y = 0; y < lista_1.size(); y++){
                if( lista_2.get(x) < lista_1.get(y)){

                    lista_1.add(y, lista_2.get(x));
                    break;
                }
            }
        }

        System.out.println(lista_1);
    }


    
}
