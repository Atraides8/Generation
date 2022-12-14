function saludo(nombre){
    console.log("hola como estas?, "+nombre );
}

saludo("Fernando");

//operadores lógicos  : LOGICA
/* Nos ayudan a verificar si algo es verdadero o falso
    Y - O - No (negación)
    && -// - !(condicion)
    lógica:
    verdadero y verdadero -> verdadero
    falso y verdadero -> falso
    falso o verdadero -> verdadero */

//operadores aritméticos  : MATEMATICA
/* Nos ayudan a hacer operacion matematicas
    Suma -> + -> 2+6
    Resta -> - -> 2-6
    Division -> / -> 2/6
    Multiplicacion -> * -> 2*6
    Resto -> % -> 2%6
    PLUS
    Adicion(o Incremento) -> i++ (suma 1 a i)
    Sustraccion(o Decremento) -> i-- (resta 1 a i) */

//Condicionales  : LOGICA
/*
a)
Si mañana tengo prueba -> Estudio
Si mañana no tengo prueba -> No estudio

b)
Si mañana sale el sol -> Me pongo una polera
Si mañana no sale el sol -> Me pongo una polera y chaqueta

c)
Si pasa la micro -> Me demoro 30 minutos
Si tomo uber -> Me demoro 20 minutos
Si no tomo ninguno -> No llego

if - else if - else

a)
if(Mañana tengo prueba){
    estudio
}else{
    no estudio
}

b)
if(mañana sale el sol){
    me pongo una polera
}else{
    me pongo polera y chaqueta
}

c)
if(pasa la micro){
    demoro 30 minutos
}
else if(si tomo uber){
    me demoro 20 minutos
}
else{
    no llego
}
*/

//Operadores de comparacion  : LOGICO MATEMATICO
/* >  -> Mayor que
    <  -> Menor que
    <=  -> Menor o igual que
    >=  -> Mayor o igual que
    ==  -> Igual
    !=  -> Distinto de
    ===  -> Igual estricto
    !==  -> Distinto estricto */


//Funciones basicas de cadenas (strings)  : TEXTO
/*
toUpperCase()  -> Convierte todo string a mayusculas
toLowerCase()  -> Convierte todo string en minusculas
charAt()  -> Toma una cadena de texto y la separa en caracteres
concat()  -> Une dos o mas strings
parseInt()  -> Toma string y los convierte a number
typeof()  -> Muestra el tipo de dato
parseInt() -> transforma el string a number
slice() -> Corta la cadena de texto desde un inicio (primer parametro) hasta el final (segundo parametro)
NaN ----> Not is a number

/* */

var oracion = "esta es una oracion" ;
var oracion2 = "eSTa Es uNa oRaciOn";
var num = "24";
var numInt = parseInt(num)

console.log(oracion.toUpperCase()); // "ESTA ES UNA ORACION"
console.log(oracion2.toLowerCase()); // "esta es una oracion"
console.log(oracion.charAt(5)); // "e"
console.log(oracion.concat(oracion2)); //"esta es una oracioneSTa Es uNa oRaciOn"
console.log(typeof(num)); // 
console.log(typeof(numInt));