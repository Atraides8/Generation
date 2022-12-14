//Evaluacion 1, Generation.

/*Ejercicio 1: */
/* Funcion que aplica un descuento del 20% al total si el dia es "martes"
o "jueves" */
function descuento_dia(dia, lista){
    var total = 0 
    var dia = dia.toLowerCase()  //Retorna en minusculas el string ingresado.
    var descuento = 0
    
    for (i = 0; i < lista.length;i++){  // Ciclo for que recorre la lista.
        total += lista[i]               // Variable donde se suma cada valor de la lista.
    }

    if ((dia == "martes") || (dia == "jueves")){  /* Si el dia es martes o jueves
        descuento = total * 0.2                   se aplica descuento del 20% al total */
        total = total - descuento
        return total
    }
    else{
        console.log("Total de compra: $", total) /* Caso contrario, no se aplica descuento. */
        return total

    }
}

/*-----------------------------------------------------------------------------*/

//Ejercicio 2:

function descuento_5(lista){
    var total = 0
    var descuento = 0
    for (i = 0; i < lista.length;i++){
        total += lista[i]
    }
    if (lista.length > 3){
        for (i = 0; i < lista.length; i++){
            if (lista[i] > 10000){
                descuento = total * 0.05
                total = total - descuento
                console.log("Recibio un descuento de $", descuento,"en el total de su compra.")
                console.log("Total de compra: $",total )
            }
            else{
                console.log("Total de compra: $", total)

            }
        }
    }
}

var lista = [10001, 500, 200, 100]
descuento_5(lista)
/*----------------------------------------------------------------------------*/

//Ejercicio 4:

/*var lista = [200,5500,900,7000,500,300]
var mayor = lista[0]
var menor = lista[0]

function menor_mayor(lista){
    for ( i= 1; i < lista.length; i++){
        if (lista[i] > mayor){
            mayor = lista[i]
        }
        else if (lista[i] < menor){
            menor = lista[i]
        }
    }
    console.log(menor, mayor)
}

menor_mayor(lista)


-------------------------------------------------------------------------------------

Ejercicio 3: */
function verificador(lista){
    for(i = 0; i < lista.length; i++){
        if (lista[i] < 0){
            console.log("El elemento ubicado en", lista.indexOf(i), "es un negativo no valido")
        }
        else{
            console.log("No se encontro ningun numero negativo.")
        }
    }
}
verificador([-10, 1, 2, 3, 4]) 