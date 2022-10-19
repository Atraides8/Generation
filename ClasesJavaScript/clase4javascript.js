//Matrices

/* NOTA:
 var: Declara una variable de scope global o local
 para la función sin importar el ámbito de bloque. Permite hoisting.

let: Declara una variable de scope global, local para la función o de bloque.
 Es reasignable y no permite hoisting.

const: Declara una variable de scope global, local para la función o de bloque.
 No es reasignable, pero es mutable. No permite hoisting. */


/*
    CRUD de matrices
    C --> Create
    R --> Read
    U --> Update
    D --> Delete

    <Creacion de matriz>
    var matriz = [1,2,4,5]; --> con datos
    var matriz = []; --> vaciaste la matriz (eliminar datos)
    var matriz2 = []; --> vacia

    <¿Como poder acceder a lemento de la matriz?>
    var elementro = matriz[1]; --> elemento = 2
    var elementro = matriz[2]; --> elemento = 4

    <¿Como editar una matriz>
    matriz[2] = 3; --> [1,2,3,5]
    matriz[1] = "a"; --> [1, "a", 3, 5]

    <¿Como puedo imprimir los elementos de una matriz>
    *La vamos a ejemplificar mas abajo
    se ocupan los ciclos for o forEach.


*/

//Funciones para matrices

var matriz = [1, 5, 2, 3, 6, 7]

/*indexOf --> Yo le entrego un elemento
 y me devuelve la posicion en la que esta,
 si no esta el elemento retorna -1,
 si hay mas de un elemento me entrega
 la posicion del primero que encuentra
 de izquierda a derecha. */

 console.log(matriz.indexOf(3)); // ---> 3

 /* pop --> Elimina el ULTIMO elemento de la matriz */
 
 console.log(matriz.pop()); // ---> 7 ; matriz = [1,5,2,3,6]

 /* push --> Agrega un elemento al final de la matriz */

 matriz.push(8); // ---> matriz = [1,5,2,3,6,8]

 /* splice -->  Sirve para insertar, editar y eliminar objetos
 objetos de una matriz en un indice determinado.     */
 // const matriz3 = [1,5,2,3,6,8,8]
matriz3.splice(1,0,5); // --> [1,5,5,2,3,6,8,8]
matriz3.splice(1,1,6); // --> [1,6,2,3,6,8,8]
matriz3.splice(1,2,6); // --> [1,6,3,6,8,8]
matriz3.splice(1,2); // --> [1,3,6,8,8]
matriz3.splice(2); // --> [1,5]

 matriz.splice(1,0,5);
 /* Inserta en la posicion 1
 el 5 (depende de el numero
que le ingrese en el segundo
parametro) */
/* El segundo parametro de la funcion .splice(x, y, z)
n <= 0 --> Agrega el elemento y mueve los demas uno hacia la derecha.
n >= 0 --> Reemplaza la cantidad n de elementos desde el indice
indicado por el elemento que queramos */


/* UnShift --> Agrega elementos al inico de la matriz. */
const matriz4 = [1,5,2,3,6,8,8]

matriz4.unshift("palabra",8); // --> matriz4 = ["palabra", 8, 1, 5, 2, 3, 6, 8, 8]

/* Shift --> Elimina el PRIMER objeto en la matriz. */

const matriz5 = [1,5,2,3,6,8,8]
matriz5.shift(); //--> matriz5 = [5,2,3,6,8,8]

/* Slice --> Devuelve una parte de la matriz en formato
matriz  */

const matriz6 = [1,5,8,4,6,9,8]
const sliceMatriz6 = matriz6.slice(2,5); // ---> matriz6 = [8,4,6]

//----------------------------------------------------------------------
/* Tipos de declaracion de variables

    var --> Se ocupa cuando uno declara una variable GLOBAL
    let --> Se ocupa cuando uno declara una variable LOCAL
    const --> Se ocupa cuando uno declara una variable que NO DEBE CAMBIAR
*/
//EJEMPLO:

var x = 1;
var y = 2;
function f(){
    let z = 0;
    x = 2;
    console.log(z)
}
// --------------------------------------------------------------------------
/* ¿Que es un bucle? --> Algo que se repite.

    <Funciones tipo bucles>
    for --> for - forEach
    while --> while - do While

    Ej funcion <for>:
        for(var i; i < 9; i++){
            procesos
        }

    Ej funcion <forEach> :
        var matriz = [1,5,8,7,4,6];
        matriz.forEach(x=> proceso); // => : Es una flecha

<Ciclos While>
        
        Ej funcion <while>:
            while(condicion){
                proceso
            }

        Ej funcion <do while>:
            do{
                procesos

            }while(condicion);
        
        Ej <while>:
            
            var x = 4;

            while(x >= 3){
                console.log("si");
                x--;
                console.log(x);
            }
        Ej <do while>:

            do{
                x--;
                console.log(x);
            }while(x <= 3);
------------------------------------------------------------

Refactorizar --> Optimizar el codigo

            <Caracteristicas>
            1.- Facil de mantener(escalable)
                ---> puede crecer y mejorar sin problemas con el tiempo.
            2.- Buena legibilidad
            3.- Mejora la eficacia */