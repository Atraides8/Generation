/*Crea un script que pida al usuario el diámetro de una rueda y su grosor (en metros)
y a través de condicionales if realice las siguientes operaciones:

a) Si el diámetro es superior a 1.4 debe mostrarse el mensaje “La rueda es para un vehículo grande”.
Si es menor o igual a 1.4 pero mayor que 0.8 debe mostrarse el mensaje “La rueda es para un vehículo mediano”.
Si no se cumplen ninguna de las condiciones anteriores debe mostrarse por pantalla el mensaje “La rueda es para un vehículo pequeño”.

b) Si el diámetro es superior a 1.4 con un grosor inferior a 0.4, ó si el diámetro es menor o igual a 1.4 pero mayor que 0.8,
con un grosor inferior a 0.25, deberá mostrarse el mensaje “El grosor para esta rueda es inferior al recomendado” /* */

function rueda(d, g){
    if (d > 14){
        if (g < 0.4){
            console.log("La rueda es para un vehiculo grande sin embargo el grosor para esta rueda es inferior al recomendado.")
        }
        else{
            console.log("La rueda es para un vehiculo grande.")
        }
    }
    else if ((d <= 1.4) && (d > 0.8)){
        if (g < 0.25){
            console.log("La rueda es para un vehiculo mediano sin embargo el grosor de esta rueda es inferior al recomendado.")
        }
        else{
            console.log("La rueda es para un vehiculo mediano.")
        }
    }
    else{
        console.log("La rueda es para un vehiculo pequeño.")
    }
}