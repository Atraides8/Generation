package com.generation.firstproyect.models;


public class Shampoo extends Cuidado_personal {
    //Caracteristicas.
    Boolean sal;
    String cabello;


    //Constructores.
    public Shampoo() {
        super();
    }

    public Shampoo(String color_envase, int volumen_envase, String textura, String ingrediente, int ph,String olor, Boolean sal, String cabello) {
        super(color_envase, volumen_envase, textura, ingrediente, ph, olor);
        this.sal = sal;
        this.cabello = cabello;
    }




    //Getters and setters.
    public Boolean getSal() {
        return sal;
    }

    public void setSal(Boolean sal) {
        this.sal = sal;
    }

    public String getCabello() {
        return cabello;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }

    //To string.
    @Override
    public String toString() {
        return super.toString() + "Shampoo [sal=" + sal + ", cabello=" + cabello + "]";
    }

    
}