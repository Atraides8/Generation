import java.io.Console;

public class Movie_discounts {
    public static void main(String[] args){
        Console console = System.console();

        int edad = Integer.parseInt(console.readLine("Ingrese su edad: "));
        int cantidad_tickets = Integer.parseInt(console.readLine("Ingrese la cantidad de boletos que quiere: "));

        if (edad >= 60){
            System.out.println("El total seria de: "+ cantidad_tickets * 3.15 + "Euros.");
        }
        else if (edad <= 5){
            System.out.println("El total seria de: "+ cantidad_tickets * 2.8 + "Euros.");
        }
        else if(cantidad_tickets >= 2){
            System.out.println("El total seria de: "+ cantidad_tickets * 4.9 + "Euros.");
        }
        else{
            System.out.println("Su total seria de: " + cantidad_tickets * 7 + "Euros.");
        }
    }
}
