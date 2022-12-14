/*Cree una clase que se llame conversorPeso
cree un menú en donde se le pida al usuario ingresar:
1 si desea covertir el peso en marte
2 si desea convertir el peso en luna.
Luego pida al usuario el peso que desea convertir.
realice la busqueda de cuantos kilos en tierra son en marte y en la luna
calcule cuanto sería el peso ingresado
muestre en pantalla el siguente mensaje según la seleccion del usuario
"El peso ingresado en la luna sería de: ...."
"El peso ingresado en Marte sería de: ...."
 */


import java.io.Console;

public class Convertir_peso {
    public static void main(String[] args){
        Console console = System.console();

        int planeta = Integer.parseInt((console.readLine("Ingrese 1 si desea Marte o 2 si desea Luna:  ")));
        switch(planeta){
            case 1:
            Double peso_dou = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: "));
            //Funcion de peso del nico sobre marte
            Double peso_marte = (peso_dou / 9.81) * 3.711 ;
            System.out.println("El peso en marte es : " + peso_marte);
            break;

            case 2:
            Double peso_dou2 = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: "));
            //Funcion de peso del nico sobre luna
            Double peso_luna = (peso_dou2 / 9.81) * 1.622;
            System.out.println("El peso en la luna es: " + peso_luna);
            break;

            default:
            System.out.println("No seleccionaste un planeta");
        }
        }
    }
