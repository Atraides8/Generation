package com.generationspringboot1.proyect3.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="License") //Crea la tabla y nombra la table en la base de datos
public class License {
    @Id
    @GeneratedValue//Genera la llave primaria segun @Id segun la variable del siguiente codigo
    private Integer id;
    private int numero;
    @DateTimeFormat(pattern = "yyyy-MM-dd") //Esto nos sirve para poner formato de fecha USA
    private Date fechaVencimiento;
    private String clase;

    //Recepcion de la relacion one to one(desde user)
    //@JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER) //Se hace la recepcion de la relacion uno a uno
    @JoinColumn(name = "user_id") //Se hace la columna con la FK
    private User user; //Todo esto se conecta con user0

    public License() {
    }

    public License(Integer id, int numero, Date fechaVencimiento, String clase, User user) {
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //Back manda y Managed recibe


    


    //Constructores
 
}
