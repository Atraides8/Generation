package com.generationspringboot1.proyect3.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="CarSell")
public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;

    //La relacion many to many implica que son dos relaciones one to many

    //Many to one a auto
    //Al ser una relacion de tabla erlacional ya no se llama a JSON
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    //Many to one a buysell
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buySell_id")
    private BuySell boySell;


    //NO ES NECESARIO CONSTRUIR CONSTRUCTORES CON LOS ATRIBUTOS DE RELACION
    public CarSell() {
    }

    public CarSell(Integer id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    //Setters y getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //

    


    

    
}
