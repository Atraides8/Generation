 /*Ejercicos preparacion Prueba 1:

1. Obtén del 1 al 255: Escribe un programa que devuelve un array
con todos los números del 1 al 255. */

/*var lista = []

for (i = 1; i <= 255; i++){
    lista.push(i)
}

console.log(lista)
----------------------------------------------------------------------------------- */

/*2. Consigue pares hasta 1000: Escribe un programa que entregue
 la suma de todos los números pares del 1 al 1000
  - Puedes usar un operador de módulo para este ejercicio.
var suma = 0
for (i = 1; i <= 1000; i++){
    if ((i % 2) == 0){
        suma += i
    }
}

console.log(suma)

------------------------------------------------------------------------*/


/*3. Suma impares hasta 5000: Escribe un programa que devuelva
la suma de todos los números impares
entre 1 y 5000 (ej: 1+3+5+...+4997+4999). 

var suma_primos = 3
for (primo = 5000; primo > 1; primo--){
    for (cont = primo - 1; ((primo % cont) != 0); cont--){
        if (cont == 2){
            suma_primos += primo
        }
    }
}
console.log(suma_primos)

--------------------------------------------------------------------*/

/*4.Itera un array: Escribe un programa que devuelva la suma de todos
los valores dentro de un array
(ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14).  */
/*var lista = [-5,2,5,12]
var lista_suma = 0;
function suma_lista(lista){
    for (i = 0; i < lista.length ; i++){
        lista_suma += lista[i]
    }

    console.log(lista_suma)
}

suma_lista(lista)

----------------------------------------------------------------------------- */


/*5.Encuentra el mayor (max):
 Dado un array con múltiples valores, escribe un programa que devuelva
el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). 

var lista = [1, 2, 3]
var mayor = lista[0]

for ( i= 1; i < lista.length; i++){
    if (lista[i] > mayor){
        mayor = lista[i]
    }
}

console.log(mayor) */