package com.generationspringboot1.proyect3.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="BuySell")
public class BuySell {

    //Atributos
    @Id
    @GeneratedValue
    private Integer id;
    //Con @Range nos aseguramos que el monto siempre sera mayor que 0
    @Range(min=0)
    private int monto;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCompra;


    //Recepcionar One to many (many to one)
    //@JsonManagedReference
    //Cuando se recibe una relacion many to one el fetch type es con lazy
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    //Many to many de auto
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "carSell",
        joinColumns = @JoinColumn(name="buySell_id"),
        inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private List <Car> car;

    

    //Constructores
    public BuySell() {
    }
    public BuySell(Integer id, @Range(min = 0) int monto, Date fechaCompra) {
        this.id = id;
        this.monto = monto;
        this.fechaCompra = fechaCompra;
    }

    //Getters y setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    
    
}
