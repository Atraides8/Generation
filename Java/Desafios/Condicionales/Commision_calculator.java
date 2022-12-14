import java.io.Console;

public class Commision_calculator {
    public static void main(String[] args){
        Console console = System.console();

        float numero = Float.parseFloat(console.readLine("Ingrese la cantidad de dinero que vendio: "));

        if(numero >= 10000 ){
            float commision = ((30 * numero)/100);
            System.out.println("Usted recibira una comision de: "+commision);
        }
        else if((10000 > numero) && (numero >= 5000)){
            float commision = ((20 * numero)/100);
            System.out.println("Usted recibira una comision de: "+commision);

        }
        else if((5000 > numero) && (numero >= 1001)){
            float commision = ((10 * numero)/100);
            System.out.println("Usted recibira una comision de: "+commision);
        }
        else if(numero <= 1000){
            System.out.println("Usted no recibira una comision.");
        }
        else{
            System.out.println("No ingreso una cantidad valida.");
        }
    
    }
}
