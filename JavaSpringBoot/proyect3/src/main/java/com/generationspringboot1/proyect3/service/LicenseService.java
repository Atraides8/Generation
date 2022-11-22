package com.generationspringboot1.proyect3.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generationspringboot1.proyect3.model.License;
import com.generationspringboot1.proyect3.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }

    public void saceLicense(License license){
        licenseRepository.save(license);
    }
    
    public void updateLicense(License license){
        licenseRepository.save(license);
    }

    public List<License> findAllLicense(){
        return licenseRepository.findAll();
    }

    public List<License> buscarPorNum(int numero){
        return licenseRepository.findAllLicenseNum(numero);
    }

    public List<License> buscarPorFechaVencimiento(Date fechaVencimiento){
        return licenseRepository.findAllLicenseFechaVenc(fechaVencimiento);
    }

    public List<License> buscarPorClase(String clase){
        return licenseRepository.findAllLicenseClase(clase);
    }

    public void eliminarLicense(Integer id){
        licenseRepository.deleteById(id);
    }
}
