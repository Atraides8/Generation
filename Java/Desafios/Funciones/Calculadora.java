package Desafios.Funciones;
import java.io.Console;

public class Calculadora {
    //SUMA:
    static void Suma(double num1, double num2){
        double num1_double = num1;
        double num2_double = num2;
        float num1_float = (float) num1_double;
        float num2_float = (float) num2_double;
        Float resultado = 0f;

        resultado = num1_float + num2_float;
        System.out.println("Sus resultado es de: " +resultado);
    }

    //RESTA:
    static void Resta(double num1, double num2){
        double num1_double = num1;
        double num2_double = num2;
        float num1_float = (float) num1_double;
        float num2_float = (float) num2_double;
        Float resultado = 0f;

        resultado = num1_float - num2_float;
        System.out.println("Su resultado es de: " + resultado);
    }

    //MULTIPLICACION:
    static void Multiplicacion(double num1, double num2){
        double num1_double = num1;
        double num2_double = num2;
        float num1_float = (float) num1_double;
        float num2_float = (float) num2_double;
        Float resultado = 0f;

        resultado = num1_float * num2_float;
        System.out.println("Su resultado es de: " + resultado);
    }

    //DIVISION:
    static void Division (double num1, double num2){
        double num1_double = num1;
        double num2_double = num2;
        float num1_float = (float) num1_double;
        float num2_float = (float) num2_double;
        float resultado = 0f;

        resultado = num1_float / num2_float;
            System.out.println("Su resultado es de: "+ resultado);
        }

    public static void main(String[] args){
        Console console = System.console();
        String condicion2 = "si";

        System.out.println("Calculadora");
        while("si".equalsIgnoreCase(condicion2)){
            System.out.println("<Ingrese una de las siguientes opciones>");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir del programa");
            int opcion = Integer.parseInt(console.readLine("Ingrese el numero de la opcion que quiera:"));
            // NOTA, SOLO DEVUELVE LA OPCION CUANDO ES UN NUMERO....
            //PREGUNTAR POR SI UNA FUNCION SE PUEDE VOLVER A REPETIR DENTRO DE ELLA.
            if((opcion <= 5) && (opcion >= 1)){

                switch(opcion){

                    case 1:
                        Suma(Double.parseDouble(console.readLine("Ingrese el primer numero: ")), Double.parseDouble(console.readLine("Ingrese el segundo numero: ")));
                        condicion2 = console.readLine("Desea seguir usando el programa? Si/No :");
                        break;
    
                    case 2:
                        Resta(Double.parseDouble(console.readLine("Ingrese el primer numero: ")), Double.parseDouble(console.readLine("Ingrese el segundo numero: ")));
                        condicion2 = console.readLine("Desea seguir usando el programa? Si/No :");
                        break;
    
                    case 3:
                        
                        Multiplicacion(Double.parseDouble(console.readLine("Ingrese el primer numero: ")), Double.parseDouble(console.readLine("Ingrese el segundo numero: ")));
                        condicion2 = console.readLine("Desea seguir usando el programa? Si/No :");
                        break;
    
                    case 4:
                        
                        Double num1 = Double.parseDouble(console.readLine("Ingrese el primer numero: "));
                        Double num2 = Double.parseDouble(console.readLine("Ingrese el segundo numero: "));
                        Boolean condicion = true;
    
                        while(condicion){
                            if((num1 == 0) && (num2 == 0)){
                                System.out.println("Su resultado es indefinido, intente nuevamente.");
                                num1 = Double.parseDouble(console.readLine("Ingrese el primer numero: "));
                                num2 = Double.parseDouble(console.readLine("Ingrese el segundo numero: "));
    
                            }
                            else if(num2 == 0){
                                System.out.println("No se puede devidir un numero entre cero, intente nuevamente.");
                                num1 = Double.parseDouble(console.readLine("Ingrese el primer numero: "));
                                num2 = Double.parseDouble(console.readLine("Ingrese el segundo numero: "));
    
                            }
                            else{
                                Division(num1, num2);
                                condicion = false;
                            }
                        }
                        condicion2 = console.readLine("Desea seguir usando el programa? Si/No :");
                        break;
                
                    case 5:
                        
                        condicion2 = "no";
                        break;
                    }
            }
            else{
                System.out.println("Eligio una opcion no valida, intente nuevamente.");
            }
            }
        System.out.println("Cerrando programa...");
    }
}