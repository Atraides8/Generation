package com.generationspringboot1.proyect3.service;

import com.generationspringboot1.proyect3.model.User;

public interface UserService {

    User getUser(Integer id);

    User save (User User);

    void delete(Integer id);
    
}
