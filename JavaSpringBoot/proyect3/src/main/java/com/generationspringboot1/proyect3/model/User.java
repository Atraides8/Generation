package com.generationspringboot1.proyect3.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

//Le vamos a poner el nombre a nuestra tabla en la BD
@Entity(name = "User")
public class User {
    //Le especificamos a la base que el siguiente atributo
    //sera el id de la tabla
    @Id
    //Generamos la llave primaria
    @GeneratedValue
    //Definimos el atributo id
    private int id; //Primary key

    //Definimos los demas atributos de la tabla
    private String name;
    @Column(name = "last_name") //Con esto podemos cambiarle el nombre de la columna en la tabla de la BD
    private String lastName;
    //Hago que el correo sea unico, que no se pueda repetir con "unique = true"
    @Column (name = "email", unique = true)
    private String correo;


    //Relacion uno a uno (one to one)
    //@JsonBackReference
    //Cuando se envia una relacion one to one siempre se ocupa LAZY
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private License license;

    //Relacion uno a muchos (one to many)
    //@JsonBackReference
    //En las relaciones onte to many el tiempo de fetch siempre se hace on EAGER
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuySell> buySell;

    public User() {
    }

    public User(int id, String name, String lastName, String correo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Constructores
 


}
