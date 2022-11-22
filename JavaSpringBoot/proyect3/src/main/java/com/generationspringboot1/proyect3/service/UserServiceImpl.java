package com.generationspringboot1.proyect3.service;

import java.util.Optional; //optional es un tipo de lista con mas funcionalidades

import org.springframework.stereotype.Service;

import com.generationspringboot1.proyect3.model.User;
import com.generationspringboot1.proyect3.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User getUser(Integer id){
        //select * from user where id = id;
        Optional <User> users = userRepository.findById(id);
        //El orElse nos permite verificar si hay o no hay datos dentro de nuestra lista
        //En caso de haner, devolvera el usuario caso contrario devuelve un null
        return users.orElse(null);
    }

    @Override
    public User save(User user){
        //insert into user (columnas)(values);
        return userRepository.save(user);
    }

    @Override
    public void delete (Integer id){
        //delete from user where id = id;
        userRepository.deleteById(id);
    }
}
