package Desafios.Variables;

import java.io.Console;

public class Calculo_circulo{
    public static void main(String [] args){
        
    Console console = System.console();

    String diametro_str = console.readLine("Inserte el diametro del circulo: ");
    Double radio_dou = ((Double.parseDouble(diametro_str)/2));

    Double perimetro = radio_dou * 3.14 * 2;
    Double area = (radio_dou * radio_dou) * 3.14;

    System.out.println("Su perimetro es: " + perimetro);
    System.out.println("Su area es: " + area);

    



    }
}
