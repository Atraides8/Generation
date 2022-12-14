package com.generation.firstproyect.service;

import java.util.List;
import java.util.Map;

import com.generation.firstproyect.model.User;

public interface UserService {
    //Interface tiene la tarea de dejar todo ordenado
    //Creando funciones globales especificas para cada llamado.
    //Osea "Polimorfismo"
    public Map<Integer, User>  getAll();

    //void add(User user);

    //void remove (User user);


    int size();

    User getUser (int position);

    //Set<Integer> keySet = userMap.keySet();
    //Collection<User> values = map.values();
}
