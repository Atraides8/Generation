/* Escriba una función que devuelva Verdadero si un 
número es primo y Falso en caso contrario.
Use su función en un programa que lea por teclado 
una cantidad indeterminada de números
positivos (que termina si se ingresa un 
número menor o igual a 1), e imprima sucesivamente si el
número es o no primo. */



package EstudioPersonal;
import java.io.Console;


public class Es_primo {
        
        static String Primo(int numero){

            
            Boolean condicion = true;

            if(numero == 2){
                return "Verdadero";
            }
            else if(numero <= 1){
                return null;
            }
            else{
                for(int i = numero - 1; ((1 < i) && (i < numero)) && condicion ; i--){

                    int primo = numero % i;
        
                    if(primo == 0){
                        condicion = false;
                        return "Falso";
                    }
                    else if((primo != 0) && (i == 2)){
                        return "Verdadero";
        
                    }
                }
            }
            return null;
        }
    

        public static void main(String[] args){
            Console console = System.console();
            Boolean condicion2 = true;

            while(condicion2){
                int numero = Integer.parseInt(console.readLine("Ingrese un numero: "));

                if(numero <= 1){
                    System.out.println("Programa cerrado.");
                    condicion2 = false;
                }
                else{
                    System.out.println(Primo(numero));
                }
            }
        }
}