/* Un histograma para una colección de datos es una secuencia de pares (d,f), donde d es un dato y f su
frecuencia (es decir, cuántas veces aparece en la colección). Por ejemplo, suponga que a 20 personas se les
pide calificar con las letras a, b, c, d y e qué tanto les gustó una película que acaban de ver en el cine,
obteniendo el siguiente conjunto de respuestas: c b c a b c d e e a b b d c a c c b d a. Luego, el histograma
para esta colección de datos se puede representar como:
a: 4 a: * * * *
b: 5 b: * * * * *
c: 6 c: * * * * * *
d: 3 d: * * *
e: 2 e: * * *
*/


package EstudioPersonal;

import java.io.Console;
import java.util.ArrayList;


public class Histograma_matrices {

    //Funcion que nos muestra la frecuencia del "elemento" en la lista char "datos".
    static int Frecuencia(char elemento, ArrayList<Character> datos){

        int frecuencia = 0;

        for(int i = 0; i < datos.size() ; i++){

            if(elemento == datos.get(i)){
                frecuencia += 1;
            }
        }
        
        return frecuencia;
    }


    //Funcion que imprime el simbolo ingresado N veces.
    static void Pintar(char simbolo, int N){
        String resultado = new String(new char[N]).replace('\0',simbolo );

        System.out.println(resultado);
        
    }

    public static void main (String[] args){
        Console console = System.console();

        int i = 0;
        ArrayList<Character> datos = new ArrayList<Character>();


        while(i != 5){
            String elemento = console.readLine("Ingrese la puntuacion de la pelicula: ");
            datos.add(elemento.charAt(0));

            i += 1;


        }

        System.out.println("a: "+ Frecuencia('a', datos));
        Pintar('*', Frecuencia('a', datos));



        System.out.println("b: "+ Frecuencia('b', datos));
        System.out.println("b: ");
        Pintar('*', Frecuencia('b', datos));

        System.out.println("c: "+ Frecuencia('c', datos));
        System.out.println("c: ");
        Pintar('*', Frecuencia('c', datos));

        System.out.println("d: "+ Frecuencia('d', datos));
        System.out.println("d: ");
        Pintar('*', Frecuencia('d', datos));

        System.out.println("d: "+ Frecuencia('d', datos));
        System.out.println("d: ");
        Pintar('*', Frecuencia('d', datos));







    }
}
