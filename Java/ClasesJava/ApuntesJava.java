//<PROGRAMACION ORIENTADA A OBJETOS>

/*
<Definiciones importantes>

<Clase>
 Definicion informal:
 La clase en java se conoce como el molde en donde podemos crear objetos con la
 misma caracteristisca indefinidamente, o en resumen.
 Las clases en Java (Java Class) son plantillas para la creación de objetos.

 Definicion formal:
 Una clase es un patrón para construir objetos. Por tanto, un objeto es una
 variable perteneciente a una clase determinada. Es importante distinguir entre
 objetos y clases: la clase es simplemente una declaración, no tiene asociado
 ningún objeto. Y todo objeto debe pertenecer a una clase.

 <Objeto>
 Definicion informal:
 Un objeto es una entidad que representa a un elemento del mundo real. La cual podemos
 crearla a partir de la clase o "molde".

 Definicion formal:
 Un objeto es una unidad que engloba dentro de sí un conjunto de datos y las
 funciones necesarias para el tratamiento de esos datos.

 Un objeto se caracteriza por:
1)  Su identidad: cada objeto es único y diferente del resto. Internamente se
    le asigna un ID para diferenciarlo de otros objetos, aunque pertenezcan
    a la misma clase y tengan todos sus valores internos con el mismo valor.

2)  Su estado: el estado de un objeto viene dado por el valor de sus atributos
    o variables internas.
    
 3) Su comportamiento: el comportamiento de un objeto se define mediante
    los métodos o fragmentos de código que operan con los atributos
    internos del objeto e interactúan, si es necesario, con otros objetos.

 <Metodo>
 Definicion informal:
 Las tareas que podemos pedir que un objeto realice son los metodos. Se "invoca"
 al metodo con la notacion punto ".".

 Definicion formal:
Se llaman métodos a las funciones que pertenecen a un objeto. Es decir: son
fragmentos de código con un nombre que permite invocarlos y ejecutarlos,
pero están encapsulados dentro del objeto. Tienen acceso a los atributos del
mismo y son la forma de operar con los atributos desde el exterior del objeto.
Son, en definitiva, los "diales" de la caja negra.
 Ej1:

String mi_cadena = "Esto es una cadena de caracteres";
System.out.println("La longitud de la cadena es: " + mi_cadena.length()); ---> "La longitud de la cadena es " 32

De lo anterior el objeto seria "mi_cadena" a la cual se le invoca el metodo ".length".

*Nota*:El mismo metodo no necesariamente hace lo mismo para objetos distintos.


<Mensajes>
El mensaje es el modo en que se comunican los objetos entre sí. Un mensaje
no es más que una llamada a un método de un determinado objeto. Cuando
llamemos a un método de un objeto, a menudo diremos que estamos
enviando un mensaje a ese objeto, y el objeto reaccionará ejecutando el
código asociado a ese mensaje.


<Polimorfismo>
Este "palabro" se refiere a la posibilidad de crear varias versiones del mismo
método, de forma que se comporte de maneras diferentes dependiendo del
estado del objeto o de los parámetros de entrada.

String mi_cadena = "Esto es una cadena de caracteres";
String[] mi_array = {mi_cadena, "Otra cadena"};
System.out.println("La longitud de la cadena es: " + mi_cadena.length()); ---> "La longitud de la cadena es: 32"
System.out.println("La longitud del array es: " + mi_array.length()); ---> "La longitud del array es: 2"

El metodo ".length" se invoca de la misma manera para una cadena y un array sin embargo
entrega dos respuestas distintas, a esto se le llama Polimorfismo.



<Atributos>
Definicion informal:
Los atributos de un objeto definen las características del mismo.

Definicion formal:
Los atributos son los datos incluidos en un objeto. Son como las variables en
los lenguajes de programación clásicos, pero están encapsuladas dentro de un
objeto y, salvo que se indique lo contrario, son invisibles desde el exterior.



<Interfaz>
Las clases (y, por lo tanto, también los objetos) tienen partes públicas y partes
privadas. La parte pública es visible para el resto de los objetos, mientras que
la privada sólo es visible para el propio objeto. A la parte pública de un
objeto se le denomina interfaz.

<Encapsulamiento>
Se denomina encapsulamiento al hecho de que cada objeto se comporte de
modo autónomo, de manera que lo que pase en su interior sea invisible para
el resto de objetos. Cada objeto sólo responde a ciertos mensajes (llamadas a
sus métodos) y proporciona determinadas salidas. Los procesos que lleve a
cabo para obtener esas están totalmente ocultos al resto de objetos.

<Herencia>
Es posible diseñar nuevas clases basándose en clases ya existentes. Esto se
llama herencia. Cuando una clase hereda de otra, toma todos los atributos y
todos los métodos de su clase “madre”, y puede añadir los suyos propios. A
veces, algunos de los métodos o datos heredados no son útiles, por lo que
pueden ser enmascarados, redefinidos o simplemente eliminados en la nueva
clase.

<Abstraccion>
Cuando se programa con OOP, se intentan abstraer las características de los
objetos del problema que estamos tratando de informatizar, para crear a partir
de ello las clases y sus métodos.



----------------------------------------------------------------------------------------------------------------

<VENTAJAS DE LA OOP>

1) Modularidad: el código de un objeto puede modificarse, mantenerse o
mejorarse sin que ello afecte al resto del sistema, siempre que
respetemos su interfaz (así, los demás objetos del programa se seguirán
comunicando con el objeto modificado sin que sepan que éste ha
cambiado)

2) Reutilización de código: es muy sencillo utilizar clases y objetos de
terceras partes. Solo tienen que publicar el interfaz de sus clases, y
podemos empezar a usarlas en muy poco tiempo, sin preocuparnos de
cómo funcionan por dentro, igual que el técnico de la lavadora sustituye
una pieza electrónica por otra sin saber exactamente como están hechas.

3) Facilidad de prueba y mantenimiento: si tenemos un objeto que está
dando problemas, es fácil aislar el elemento que falla y modificarlo sin
que ello afecte al resto del código de la aplicación.

4) Ocultación de información: como cada objeto oculta los detalles de su
implementación al resto, es virtualmente imposible que un
malfuncionamiento en una parte del sistema pueda afectar a otras.





*/