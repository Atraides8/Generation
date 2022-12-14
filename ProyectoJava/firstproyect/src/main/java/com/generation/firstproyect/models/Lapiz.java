package com.generation.firstproyect.models;

public class Lapiz {
    //<Caracteristicas>
    String color;
    String material;
    String punta;
    String marca;
    int largo;

    //<Constructores>

    //Constructor vacio.
    public Lapiz() {
    }
    
    //Constructor con todos los datos.
    public Lapiz(String color, String material, String punta, String marca, int largo) {
        this.color = color;
        this.material = material;
        this.punta = punta;
        this.marca = marca;
        this.largo = largo;
    }
    
    
    //<Getters and Setters>
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getPunta() {
        return punta;
    }
    public void setPunta(String punta) {
        this.punta = punta;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }


    //<Acciones lapiz>
    
    //Funcion que imprime "estas escribiendo"
    void escribir(){
        System.out.println("estas escribiendo");
    }

    //Funcion que te salva cuando te ahogas.
    void traqueotomia(Boolean ahogado){
        if(ahogado==true){
        System.out.println("traqueotomia en proceso");
        }
    }

    //Funcion que apuñala gente.
    void apuñalar(Boolean peligro){
        if(peligro==true){
            System.out.println("apuñalar en el ojo y no retirar");
        }
    }
}
