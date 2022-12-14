/* package ClasesJava;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.processing.SupportedOptions;
import javax.sound.sampled.SourceDataLine;

public class ClaseBucArr { */
    /*BUCLES en JS:
    for, for each, while y do while.

    for en JS --> for(var i = 0; i < 2 ; i++){}
    for en Java --> for(int = 0; i < 2; i++){}

    for each en JS --> nomArreglo.forEach(element) // Siendo element cada objeto de arreglo.
    for each en Java --> for(String nomArreglo: element){}

    while en JS --> while(condicion){} //Verfificar que en algun momento se cumpla la condicion.
    while en Java --> while(condicion){} //Funciona igual que JS.

    do while en JS --> do{Se hace la operacion}while(condicion);
    do while Java --> do{Se hace la operacion}while(condicion);
    NOTA: El do while se ocupa en casos donde si o si al menos una vez, se debe realizar la operacion. */

   /*  public static void main(String[] args){
        Console console = System.console();
        int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular: "));
        int contador = 0;

        while(contador != repeticiones){
            float numero = Float.parseFloat(console.readLine("Ingrese la cantidad de dinero que vendio: "));

            if(numero >= 10000 ){
                float commision = ((30 * numero)/100);
                System.out.println("Usted recibira una comision de: "+commision);
                contador += 1;
            }
            else if((10000 > numero) && (numero >= 5000)){
                float commision = ((20 * numero)/100);
                System.out.println("Usted recibira una comision de: "+commision);
                contador += 1;

            }
            else if((5000 > numero) && (numero >= 1001)){
                float commision = ((10 * numero)/100);
                System.out.println("Usted recibira una comision de: "+commision);
                contador += 1;
            }
            else if(numero <= 1000){
                System.out.println("Usted no recibira una comision.");
                contador += 1;
            }
            else{
                System.out.println("No ingreso una cantidad valida.");
                contador += 1;
            }
        }
    
    }*/

    /********************************************************************************************
     
    ARREGLOS O ARRRAYS, HASHMAP --> colecciones:
    Son variables (u objetos) que nos permiten ir guardando datos.

    Tipos que existen en Java:
    - arreglos --> Se usa en casos puntuales.
    - ArrayList --> Se usa mas por tener menos restricciones.
    - HashMap --> Es como un diccionario


    1) Ej arreglos:
    Definicion: int [] miArreglo = new int[dimension] {1, 2, 3, 4}  //Se tiene que definir desde el inicio
    el largo del arreglo.

    Metodo de insercion: miArreglo[0] = 7 -> [7, , , ]

    2) Ej ArrayList:
    Definicion: ArrayList <Integer> miArray = newArrayList <Integer>;
    Metodo de insercion -> miArray.add(7);

    3) Ej HashMap
    Definicion: Map<String,  Integer> miHashMap = newHashMap
    Metodo de insercion -> miHashMap.put("llave",2);

    miHashMap.put("Benja",26);
    miHashMap.put("Pame",25);
    miHashMap.put("Hector",29);

    De lo anterior se imprime --> [{"Benja":26}, {"Pame":25}, {"Hector":29}]


     */
   /* Map<String, ArrayList> miHashMap = new HashMap <String, ArrayList>(); */

    


