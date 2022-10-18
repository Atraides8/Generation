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
var lista_larga = [27, 32, 1, 99, 0, 35]
console.log(mostrarMayor(lista_larga))