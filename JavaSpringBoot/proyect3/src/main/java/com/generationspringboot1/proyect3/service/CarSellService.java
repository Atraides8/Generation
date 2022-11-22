package com.generationspringboot1.proyect3.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generationspringboot1.proyect3.model.CarSell;
import com.generationspringboot1.proyect3.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public void updateCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public List<CarSell> findAllCarSell(){
        return carSellRepository.findAll();
    }
    
    public List<CarSell> buscarPorCantidad(int numero){
        return carSellRepository.findAllCarSellCantidad(numero);
    }

    public void eliminarCarSell(Integer id){
        carSellRepository.deleteById(id);
    }
    
}
