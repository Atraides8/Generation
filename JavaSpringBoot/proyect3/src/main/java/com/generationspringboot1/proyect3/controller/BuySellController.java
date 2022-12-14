package com.generationspringboot1.proyect3.controller;

import java.util.Date;
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

import com.generationspringboot1.proyect3.model.BuySell;
import com.generationspringboot1.proyect3.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {

    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService){
        this.buySellService = buySellService;
    }

    @PostMapping("/BuySell/Save")
    public void guardarBuySell(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }
    
    @PutMapping("/BuySell/update")
    public void actualizarBuySell(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/search")
    public List<BuySell> todosLosBuySell(){
        return buySellService.findAllBuySell();
    }

    @GetMapping("/BuySell/buscarMonto")
    public List<BuySell> buscarMonto(@RequestBody int numero){
        return buySellService.buscarPorMonto(numero);
    }

    @GetMapping("/BuySell/buscarFecha")
    public List<BuySell> buscarFecha(@RequestBody Date fechaCompra){
        return buySellService.buscarPorFechaCompra(fechaCompra);
    }

    @DeleteMapping("BuySell/eliminarBuySell/{id}")
    public void eliminarBuySell(@PathVariable Integer id){
        buySellService.eliminarBuySell(id);
    }
}
