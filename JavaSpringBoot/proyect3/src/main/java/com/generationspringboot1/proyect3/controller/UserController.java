package com.generationspringboot1.proyect3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generationspringboot1.proyect3.model.User;
import com.generationspringboot1.proyect3.service.UserService;

//Esto nos permite hacer peticiones desde cualquier parte
@CrossOrigin //Permisos de cualquier parte de cualquier url, otorgo permisos para entrar
@RestController
public class UserController {

    private UserService  userService;

    public UserController (@Autowired UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    //Si no lleva id, agrega
    //Si lleva id, pero el id no existe, tambien agrega
    @PostMapping("/user")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }


    //Si lleva id y si el id existe en la base, este lo actualiza con los nuevos datos
    @PutMapping("/user")
    public User updatUser(@RequestBody User user){ //@RequestBody se usa para obtener datos desde el postman
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id) {//@PathVariable se usa para obtener datos desde de la url
        userService.delete(id);
    }
    //Post = Crear
    //Put = Editar
}
