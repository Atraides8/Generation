package com.generationspringboot1.proyect3.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="Car")
public class Car {

    //Atributos
    @Id
    @GeneratedValue
    private Integer id;
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    //Con @Range nos aseguramos que el monto siempre sera mayor que 0
    @Range(min = 0)
    private int valor;

    //Many to many
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="CarSell", //Nombre de la tabla relacional
        joinColumns = @JoinColumn(name="car_id"), //Nombre de la columna de mi table
        inverseJoinColumns = @JoinColumn(name="buySell_id") //nombre de la columna de la tabla de la otra relacion
    )
    private List <CarSell> carSell;

    public Car() {
    }

    public Car(Integer id, String marca, String modelo, String color, int anio, @Range(min = 0) int valor,
            List<CarSell> carSell) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.valor = valor;
        this.carSell = carSell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public List<CarSell> getCarSell() {
        return carSell;
    }

    public void setCarSell(List<CarSell> carSell) {
        this.carSell = carSell;
    }



    
    
}
