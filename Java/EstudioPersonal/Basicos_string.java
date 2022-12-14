package EstudioPersonal;
// EJERCICIO 1:
public class Basicos_string {
    public static String abbrevName(String name) {
        String[] names = name.split(" ");
          
        return (names[0].charAt(0)+ "." +names[1].charAt(0)).toUpperCase();
      }
    
}
/*String[] <variable1> = <variable_Str>.split(elemento) ---> Con el String[] definimos que la <variable1> sera de tipo
array, con <variable_Str>.split(elemento) ---> con esto separamos el string guardado en <variable_Str> segun el elemento
escogido en el argumento de split.

<variable_Str>.split(elemento_Str) ---> Con esta funcion separamos la cadena de texto segun el parametro que escogamos
ejemplo: " ", "." , "a", ")"

<variable_Str>.charAt(indice) ---> Con esta funcion traemos solo un caracter de la <variable_Str> segun el
indice que escogamos.
  */
