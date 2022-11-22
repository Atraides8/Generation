package com.generationspringboot1.proyect3.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generationspringboot1.proyect3.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer>{

    @Query(value = "SELECT * FROM license WHERE numero = ?1", nativeQuery = true)
    List<License> findAllLicenseNum(int numero);

    @Query(value = "SELECT * FROM license WHERE fechaVencimiento = ?1", nativeQuery = true)
    List<License> findAllLicenseFechaVenc(Date fechaVencimiento);

    @Query(value = "SELECT * FROM license WEHERE clase = ?1", nativeQuery = true)
    List<License> findAllLicenseClase(String clase);
}

//ORDEN PARA HACER LOS MODULOS "REPOSITORY" - "SERVICE" - "CONTROLLER"
