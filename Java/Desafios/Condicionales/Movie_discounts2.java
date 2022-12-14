import java.io.Console;

public class Movie_discounts2 {
    public static void main(String[] args){
        Console console = System.console();

        Boolean condicion = true;
        String comprar = (console.readLine("Desea comprar entradas para el cine Si/No : "));

        while(condicion){
            if (comprar.equalsIgnoreCase("si")){
                while(comprar.equalsIgnoreCase("si")){
                    int edad = Integer.parseInt(console.readLine("Ingrese su edad: "));
                    int cantidad_tickets = Integer.parseInt(console.readLine("Ingrese la cantidad de boletos que quiere: "));
        
                    if (edad >= 60){
                        System.out.println("El total seria de: "+ cantidad_tickets * 3.15 + " Euros.");
                    }
                    else if (edad <= 5){
                        System.out.println("El total seria de: "+ cantidad_tickets * 2.8 + " Euros.");
                    }
                    else if(cantidad_tickets >= 2){
                        System.out.println("El total seria de: "+ cantidad_tickets * 4.9 + " Euros.");
                    }
                    else{
                        System.out.println("Su total seria de: " + cantidad_tickets * 7 + " Euros.");
                    }
                    comprar = (console.readLine("Desea comprar mas entradas? Si/No: "));

                    if(comprar.equalsIgnoreCase("no")){
                        System.out.println("Tenga un excelente dia!");
                        condicion = false;
                    }
                }
            }
            else if(comprar.equalsIgnoreCase("no")){
                System.out.println("Tenga muy buen dia!");
                condicion = false;
            }
            else{
                System.out.println("Ingreso una opcion no valida, intente nuevamente.");
                comprar = (console.readLine("Desea comprar mas entradas? Si/No: "));

    
            }
        }
    }
}
