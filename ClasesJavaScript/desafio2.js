/*Ejercicio 1:
Estás tratando de llegar del punto B al punto C. Solo puede mover un bloque a la vez. 
Puedes moverte hacia arriba, hacia abajo, hacia la izquierda hacia la derecha. 
Escribe un algoritmo para ir del punto B al punto C. /* */

//Funcion que mueve el bloque segun los strings ingresado (arriba, abajo, izquierda, derecha).
function mover_bloque(direccion){
    direccion.toLowerCase  //Funcion que devuelve la palabra completa en minusculas.

    if (direccion == "arriba"){ //Si la direccion ingresada es el string "arriba"
        console.log("Te haz movido un bloque hacia arriba."); //Te mueves un bloque hacia arriba
    }
    else if (direccion == "abajo"){ //Si la direccion ingresada es el string "abajo"
        console.log("Te haz movido un bloque hacia abajo."); //Te mueves un bloque hacia abajo
    }
    else if (direccion == "izquierda"){ //Si la direccion ingresada es el string "izquierda"
        console.log("Te haz movido un bloque hacia la izquierda."); //Te mueves un bloque hacia la izquierda
    }
    else if (direccion == "derecha"){ // Si la direccion ingresada es el string "derecha"
        console.log("Te haz movido un bloque hacia la derecha."); //Te mueves un bloque hacia la derecha
    }
    else{ //Si todo lo anterior no se cumple
        console.log("Direccion ingresada es invalida, recuerde ingresar: arriba, abajo, izquierda, derecha"); //Direccion invalida
    }
}

//Ejercicio 2:
// Funcion que revisa una lista guardando el numero mayor en cada iteracion.
function mostrarMayor(lista){
    var mayor = lista[0];

        for (n = 0; n < lista.length; n++){
            if (lista[n] > mayor)
            {
                mayor = lista[n];
            }
        }
        return mayor
    }


//Ejercicio 3: (SIN REALIZAR)
/* 15 personas están esperando en la fila para la tienda. 
Hay 3 cajeros (Marie, Tomas y Marco) que están disponibles. 
Marco es nuevo, por lo que ayuda a 1 persona por cada 2 personas a las que Marie ayuda. 
Tomas solo puede ayudar a 3 personas como máximo antes de volver a reabastecer los estantes. 
¿A cuántas personas ayuda cada cajero? /* */
