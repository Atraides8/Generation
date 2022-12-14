package com.generation.firstproyect.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.generation.firstproyect.model.User;

@Service
public class UserServiceMap implements UserService {

    private static Map <Integer, User> userMap = new HashMap<>();

    public UserServiceMap(){

    };

    @Override
    public Map<Integer, User>  getAll(){
        return userMap;

    }

    public static void addMap(Integer key, User user){
        userMap.put(key,user);
    }

    
    public void removeMap(Integer key, User user){

        userMap.remove(key, user);
    }

    @Override
    public int size(){
        return userMap.size();
    }

    @Override
    public User getUser(int position){
        return userMap.get(position);
    }
}
