package com.generationspringboot1.proyect3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generationspringboot1.proyect3.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
    //Con el nativeQuery le decimos a java que estamos usando otro lenguaje y que no es necesario que lo interprete
    @Query(value = "SELECT * FROM car WHERE marca = ?1", nativeQuery = true)
    List<Car> findAllAutoMarc(String marca);

    @Query(value = "SELECT * FROM car WEHERE color = ?1", nativeQuery = true)
    List<Car> findAllAutoColor(String color);
    
    @Query(value = "SELECT * FROM car WHERE color = ?1 AND marca = ?2", nativeQuery = true)
    List<Car> findAllAutoColorMarca(String color, String marca);

    @Query(value = "SELECT * FROM car c JOIN c.carsell cs", nativeQuery = true)
    List<Car> buscarAutosVendido();
}
