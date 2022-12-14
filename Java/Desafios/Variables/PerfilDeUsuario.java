package Desafios.Variables;

import java.io.Console;

public class PerfilDeUsuario {
    public static void main(String [] args){
        Console console = System.console();

        String nombre = console.readLine("Inserte su nombre: ");

        String edad_str = console.readLine("Inserte su edad: ");

        String genero = console.readLine("Con que genero se define? ");

        String laboral = console.readLine("Cual es su profesion? ");

        String nacionalidad = console.readLine("Cual es su nacionalidad? ");

        String sangre = console.readLine("Cual es su tipo de sangre? ");

        int edad_num = Integer.parseInt(edad_str);

        int fecha = 2022 - edad_num;

        System.out.println("Su nombre es: " + nombre);

        System.out.println("Su edad es de " + edad_num + " años y nacio en el año "+ fecha);

        System.out.println("Ud se identifica con el genero: " +genero);

        System.out.println("Su profesion es de: " + laboral);

        System.out.println("Su nacionalidad es: " + nacionalidad);

        System.out.println("Su tipo de sangre es: " + sangre);

    }
    
}
