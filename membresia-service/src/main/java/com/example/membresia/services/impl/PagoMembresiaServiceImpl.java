package com.example.membresia.services.impl;

import com.example.membresia.entities.PagoMembresia;
import com.example.membresia.repositories.PagoMembresiaRepository;
import com.example.membresia.services.PagoMembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PagoMembresiaServiceImpl implements PagoMembresiaService {

    @Autowired
    private PagoMembresiaRepository pagoMembresiaRepository;

    @Transactional
    @Override
    public PagoMembresia save(PagoMembresia entity) throws Exception {
        return pagoMembresiaRepository.save(entity);
    }

    @Transactional
    @Override
    public List<PagoMembresia> findAll() throws Exception {
        return pagoMembresiaRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<PagoMembresia> findById(Long aLong) throws Exception {
        return pagoMembresiaRepository.findById(aLong);
    }

    @Transactional
    @Override
    public PagoMembresia update(PagoMembresia entity) throws Exception {
        return pagoMembresiaRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        pagoMembresiaRepository.deleteById(aLong);
    }
}
