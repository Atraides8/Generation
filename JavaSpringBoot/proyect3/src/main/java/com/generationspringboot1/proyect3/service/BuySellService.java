package com.generationspringboot1.proyect3.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generationspringboot1.proyect3.model.BuySell;
import com.generationspringboot1.proyect3.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {

    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }
    
    public void saveBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }

    public void updateBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }

    public List<BuySell> findAllBuySell(){    
        return buySellRepository.findAll();
    }

    public List<BuySell> buscarPorMonto(int monto){
        return buySellRepository.findAllBuySellMonto(monto);
    }

    public List<BuySell> buscarPorFechaCompra(Date fechaCompra){
        return buySellRepository.findAllBuySellFechaCompra(fechaCompra);
    }

    public void eliminarBuySell(Integer id){
        buySellRepository.deleteById(id);
    }
}
