package com.generationspringboot1.proyect3.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generationspringboot1.proyect3.model.License;
import com.generationspringboot1.proyect3.service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {

    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }

    @PostMapping("/License/save")
    public void guardarLicense(@RequestBody License license){
        licenseService.saceLicense(license);
    }
    
    @PutMapping("/License/update")
    public void actualizarLicense(@RequestBody License license){
        licenseService.updateLicense(license);
    }

    @GetMapping("/License/search")
    public List<License> todasLasLicense(){
        return licenseService.findAllLicense();
    }

    @GetMapping("/License/buscarNum")
    public List<License> buscarNum(@RequestBody int numero){
        return licenseService.buscarPorNum(numero);
    }

    @GetMapping("/License/buscarFecha")
    public List<License> buscarFecha(@RequestBody Date fechaVencimiento){
        return licenseService.buscarPorFechaVencimiento(fechaVencimiento);
    }

    @GetMapping("/License/buscarClase")
    public List<License> buscarClase(@RequestBody String clase){
        return licenseService.buscarPorClase(clase);
    }

    @DeleteMapping("/License/eliminarLicense/{id}")
    public void eliminarLicense(@PathVariable Integer id){
        licenseService.eliminarLicense(id);
    }
}