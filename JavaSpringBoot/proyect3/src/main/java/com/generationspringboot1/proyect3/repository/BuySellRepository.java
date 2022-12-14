package com.generationspringboot1.proyect3.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generationspringboot1.proyect3.model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell, Integer>{

    @Query(value = "SELECT * FROM buysell WEHERE monto = ?1", nativeQuery = true)
    List<BuySell> findAllBuySellMonto(int monto);

    @Query(value = "SELECT * FROM buysell WHERE fechaCompra = ?1", nativeQuery = true)
    List<BuySell> findAllBuySellFechaCompra(Date fechaCompra);
}
