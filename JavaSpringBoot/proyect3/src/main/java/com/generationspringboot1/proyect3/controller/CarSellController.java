package com.generationspringboot1.proyect3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generationspringboot1.proyect3.model.CarSell;
import com.generationspringboot1.proyect3.service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {

    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }

    @PostMapping("/CarSell/save")
    public void guardarCarSell(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }

    @PutMapping("/CarSell/update")
    public void actualizarCarSell(@RequestBody CarSell carSell){
        carSellService.updateCarSell(carSell);
    }

    @GetMapping("/CarSell/search")
    public List<CarSell> todasLasCarSell(){
        return carSellService.findAllCarSell();
    }

    @GetMapping("/CarSell/buscarCantidad")
    public List<CarSell> buscarCantidad(@RequestBody int numero){
        return carSellService.buscarPorCantidad(numero);
    }

    @DeleteMapping("/CarSell/eliminarCarSell/{id}")
    public void eliminarCarSell(@PathVariable Integer id){
        carSellService.eliminarCarSell(id);
    }
    
}
