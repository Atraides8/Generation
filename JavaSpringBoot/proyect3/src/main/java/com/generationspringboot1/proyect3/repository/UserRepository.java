package com.generationspringboot1.proyect3.repository;

import org.springframework.data.repository.CrudRepository;

import com.generationspringboot1.proyect3.model.User;

//El repository es lo que te permite conectar el programa con la base de datos.
public interface UserRepository extends CrudRepository<User, Integer> {
    
}
