package com.generation.firstproyect.models;



public class Cuidado_personal {
    //Caracteristicas.
    String color_envase;
    int volumen_envase;
    String textura;
    String ingrediente;
    int ph;
    String olor;



    public Cuidado_personal() {
    }

    public Cuidado_personal(String color_envase, int volumen_envase, String textura, String ingrediente,
            int ph, String olor) {
        this.color_envase = color_envase;
        this.volumen_envase = volumen_envase;
        this.textura = textura;
        this.ingrediente = ingrediente;
        this.ph = ph;
        this.olor = olor;
    }






    public String getColor_envase() {
        return color_envase;
    }
    public void setColor_envase(String color_envase) {
        this.color_envase = color_envase;
    }
    public int getVolumen_envase() {
        return volumen_envase;
    }
    public void setVolumen_envase(int volumen_envase) {
        this.volumen_envase = volumen_envase;
    }
    public String getTextura() {
        return textura;
    }
    public void setTextura(String textura) {
        this.textura = textura;
    }
    public String getIngredientes() {
        return ingrediente;
    }
    public void setIngredientes(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    public int getPh() {
        return ph;
    }
    public void setPh(int ph) {
        this.ph = ph;
    }
    public String getOlor() {
        return olor;
    }
    public void setOlor(String olor) {
        this.olor = olor;
    }



    @Override
    public String toString() {
        return "Cuidado_personal [color_envase=" + color_envase + ", volumen_envase=" + volumen_envase + ", textura="
                + textura + ", ingredientes=" + ingrediente + ", ph=" + ph + ", olor=" + olor + "]";
    }
}