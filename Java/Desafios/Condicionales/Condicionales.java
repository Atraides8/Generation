import java.io.Console;

public class Condicionales {
    public static void main(String[] args){
        Console console = System.console();
        
        int nota = Integer.parseInt(console.readLine("Ingrese la nota del estudiante: "));

        if((nota <= 3) && (nota >= 1)){
            System.out.println("Suspendido");
        }
        else if((nota > 3) && (nota <= 5)){
            System.out.println("Insuficiente.");
        }
        else if((nota > 5) && (nota <= 8)){
            System.out.println("Bueno.\n");
        }
        else if((nota > 8) && (nota <= 10 )){
            System.out.println("Excelente.\n");
        }
        else{
            System.out.println("Ingreso un numero fuera del rango.\n");
        }

    }
    
}
