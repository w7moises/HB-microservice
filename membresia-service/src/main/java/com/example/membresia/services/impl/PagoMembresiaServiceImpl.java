package com.example.membresia.services.impl;

import com.example.membresia.entities.PagoMembresia;
import com.example.membresia.repositories.PagoMembresiaRepository;
import com.example.membresia.services.PagoMembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoMembresiaServiceImpl implements PagoMembresiaService {

    @Autowired
    private PagoMembresiaRepository pagoMembresiaRepository;

    @Override
    public PagoMembresia save(PagoMembresia entity) throws Exception {
        return pagoMembresiaRepository.save(entity);
    }

    @Override
    public List<PagoMembresia> findAll() throws Exception {
        return pagoMembresiaRepository.findAll();
    }

    @Override
    public Optional<PagoMembresia> findById(Long aLong) throws Exception {
        return pagoMembresiaRepository.findById(aLong);
    }

    @Override
    public PagoMembresia update(PagoMembresia entity) throws Exception {
        return pagoMembresiaRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        pagoMembresiaRepository.deleteById(aLong);
    }
}
