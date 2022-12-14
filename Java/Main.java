import java.io.Console;

public class Main {
    public static void main(String [] args){
        //Para mostrar en consola JavaScript --> console.log()
        //Para mostrar en consola en Java --> System.out.print()
        System.out.print("Este es un menseje en consola");

        //Este imprime con salto de linea al final del mensaje:
        System.out.println("Hola");

        //Para pedirle informacion al usuario se ocupa --> console.readLine()
        Console console = System.console();
        String nombre = console.readLine("Inserte nombre: ");
        System.out.println("Este es el nombre: "+nombre);

        // Vamos a pedir a usuarios 2 numeros:
        String num = console.readLine("Inserte un numero: ");
        int nuevoNum = Integer.parseInt(num);
        String num2 = console.readLine("Inserte un numero: ");
        int nuevoNum2 = Integer.parseInt(num2);
        int suma = nuevoNum + nuevoNum2;
        /* Tambien se puede directamente con:
         * int suma = Integer.parseInt(num) + Integer.parseInt(num2) */

        System.out.println("El numero es: " + suma);

    }
}
