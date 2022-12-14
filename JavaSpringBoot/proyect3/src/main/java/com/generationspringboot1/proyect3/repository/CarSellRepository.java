package com.generationspringboot1.proyect3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generationspringboot1.proyect3.model.CarSell;

public interface CarSellRepository extends JpaRepository <CarSell, Integer>{
    @Query(value = "SELECT * from carsell WHERE cantidad = ?1", nativeQuery = true)
    List<CarSell> findAllCarSellCantidad(int cantidad);
}