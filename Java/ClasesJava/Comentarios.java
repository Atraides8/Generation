//Variable
        //Tipos de variables en JavaScript --> boolean, number, string, array, object
        // var nombre 1;

        /*Tipos de variables en Java --> boolean, int,
        double(16 digitos despues de la coma) y float(7 digitos despues de la coma)*/

        // String (Cadena de texto, se ocupa ""), char(solo un caracter, se ocupa '')
        
        // array y object
        // int numero = 1;
        /* String palabra = "palabra cualquiera"; ----->
         No se permite cambiar el valor a un tipo distinto del que es. */
         // matriz --Z [1, 'a', "palabra", 4] --> permite cualquier tipo de dato. Esto en JS

         // arreglos --> [1, 2, 5, 4] --> permite datos de un solo tipo. Esto en JAVA

         // arreglo de arreglos --> [[1, 2, 3], [5, 8, 6], [7, 9, 8]]

         /* diccionario --> [{id:1, nombre:"Nicolas"}, {id:2, nombre:"Kiara"}] 
          --> diccionario[0] -->  {id:1, nombre:"Nicolas"} */
          // diccionario[0].nombre --> "Nicolas", diccionario[1].id ---> 2
          
          // [{dia:'lunes', compras:[2000, 600, 500]}, {dia:'viernes', compras:[2000, 600, 500]}]


          //------------------------------------------------------------------

          /* ¿Como definimos los valores ded una declaracion de usuario?
          - Id --> Podria er alfa numerico, en caso de ser alfa numerico seria String,
          en caso contrario seria int.

          - Nombre --> String

          - Mail --> String

          - Pasword --> String

          - Edad --> Int

          - Genero --> char u otros

          ----------------------------------------------------------------

          Declaracion de variables:

          int nombre = 15;   ----> Declaro un numero entero con int y la variable "nombre"

          String palabra = "Este es un string"; --> Declaro una palabra con string y su variable

          Double decimal = 1.2354;  --> Declaro un decimal con 16 digitos si es necesario con double

          nombre = "hola"  ---> Esta declaracion de variable esta MAL!

          -----------------------------------------------------------------------------

          Parsear variables (cambiar de tipo una variable):

          - ParseDouble() --> Pasar desde String a Double

          - ParseInt() --> Pasar desde String a Int

          Ejemplo 1 pasar un double a int:
          
          double altura = 1.5; ---> La variable nace y muere como double, no se puede cambiar
          int alt = (int) altura; ---> Guardamos el int de altura en otra variabla de esta forma

          Ejemplo 2 pasar de un string numerico a int:

          String num = "12";
          int nuevoNum = Integer.parseInt(num)

        METEDO GENERICO PARA REDONDEAR:

          double d = 9.4568982982989;
        String pattern = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String formattedDouble = decimalFormat.format(d);
        System.out.println("Formatted double d = "+formattedDouble);



        REDONDEAR NUMERO METODO PAME:
        
          double d = 9.4568982982989;
         double scale = Math.pow(10, 3);
         double doubleM1 = Math.round(d*scale)/scale;
         System.out.println("Math1 Rounded off: "+doubleM1);



          */