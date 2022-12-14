package com.generation.firstproyect.models;

public class Crema_corporal extends Cuidado_personal {
    //Caracteristicas.
    String tipo;
    String marca;

    


    //Constructores.
    public Crema_corporal() {
        super();
    }

    
    public Crema_corporal(String color_envase, int volumen_envase, String textura, String ingrediente, int ph,String olor, String tipo, String marca) {
        super(color_envase, volumen_envase, textura, ingrediente, ph, olor);
        this.tipo = tipo;
        this.marca = marca;
    }


    //Setters and getters.
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

//To string.
    @Override
    public String toString() {
        return super.toString() + "Crema_corporal [tipo=" + tipo + ", marca=" + marca + "]";
    }
}
