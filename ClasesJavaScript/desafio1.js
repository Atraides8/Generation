/*Ejercicio #1: crea una función que tenga un número
y comprueba si el número es mayor que 10.
Imprime en la consola verdadero si es mayor y de lo contrario falso. /* */


function comprobacion(n){
    if (n > 10){
        return true;
    }
    else{
        return false;
    }
}

/*Ejercicio #2: Crea una función que tome un número y comprueba si es divisible entre 4 o divisible entre 9. 
Imprime en la consola verdadero si un número es divisible entre 4 o 9,
y falso si un número no es divisible entre ninguno de los dos números. /* */

function comprobacion_div(n){
    if ((n % 4) == 0 || (n % 9) == 0 ){
        console.log(true);
    }
    else{
        console.log(false);
    }
}

comprobacion_div(2)
