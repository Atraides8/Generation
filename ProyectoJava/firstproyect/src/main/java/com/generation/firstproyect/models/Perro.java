package com.generation.firstproyect.models;

public class Perro {
    //Caracteristicas o variables del "perro".
    private String nombre;
    private String pelaje;
    private String raza;
    private Boolean vacunado;

    //Con el this.<caracteristica> puedo traer la caracteristica del perro indicado.


    

    public Perro() {
    }

    public Perro (String nombre, String pelaje, String raza, Boolean vacunado){
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public Perro (String nombre, String pelaje, String raza){
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = false;
    }




    //Con set y get puedo usar o modificar las caracteristicas o variables.
    // get = lo obtiene y set = lo modifica.
    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {  //Cambiarle la variable pelaje de clase ponerle el pelaje ingresado.
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }




    //Con esto yo ingreso y obtengo el nombre de mi perro (metodo get)
    public String getNombre(){
        return nombre;
    }

    //Con este modifico el nombre de mi perro (metodo set)
    public void setNombre(String nombre){
        this.nombre = nombre;

    }


    //Acciones del perro, ladrar, caminar y  hacer trucos.
    public void ladrar(){
        System.out.println("guau");
    }

    public void caminar(){
        System.out.println("Dar un pasito");
    }

    public String truco(String tipoTruco){
        if(tipoTruco == "da la pata"){
            return "doy la pata";
        }
        return "no hago nada :c";

    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", pelaje=" + pelaje + ", raza=" + raza + ", vacunado=" + vacunado + "]";
    }

    
}
