package com.generation.firstproyect.controller;

import com.generation.firstproyect.service.UserService;
import com.generation.firstproyect.service.UserServiceMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.firstproyect.model.User;

@RestController
public class UserController {

    public UserService UserService;

/*     public UserController(@Autowired UserService userService){
        this.UserService = userService;
        userService.add(new User(1, "Juan", "Barrias"));
    } */
    
    @GetMapping("/user")
    public User getUser(){
        return UserService.getUser(0);
    }
//localhost:8080/FindUser/1
    @GetMapping("/FindUser/{id}")
    public User FindUser(@PathVariable("id") int id){
        return UserService.getUser(id);

    }
    //Se instancia el mapping y se crea la url(Path) path y url es lo mismo
  /*   @GetMapping("/addUser/{id}/{nombre}/{apellido}")
        //Creamos la funcion, para obtener los datos del path se ocupa el PathVariable
        //Para el pathVariable se le de entregar el nombre del parametro en la url
        //Por ejemplo "id" que en la url esta como {id}
        //SE DEBE HACER POR CADA PARAMETRO ENVIADO EN LA URL
        public void addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido")String apellido){
            //Cuando ya obtenemos todos los parametros los podemos utilziar dentro de la funcion
            UserService.add(new User(id, nombre, apellido));
        }

        @GetMapping("/removeUser/{id}/{nombre}/{apellido}")
        public void removeUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido")String apellido){
            UserService.remove(new User(id, nombre, apellido));
        } */

    @GetMapping("/addUser/{key}/{id}/{nombre}/{apellido}")
    public void addMap(@PathVariable("key") int key, @PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
        UserServiceMap.addMap(key, new User(id, nombre, apellido));
    }

    @GetMapping("/userAll")
    public Map<Integer, User> getAll(){
        return UserService.getAll();
    }

/*     @GetMapping("/userAll")
    public List <User> getAll(){
        return userService.getAll();
    } */

}
