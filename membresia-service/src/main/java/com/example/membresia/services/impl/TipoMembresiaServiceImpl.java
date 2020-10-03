package com.example.membresia.services.impl;

import com.example.membresia.entities.TipoMembresia;
import com.example.membresia.repositories.TipoMembresiaRepository;
import com.example.membresia.services.TipoMembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoMembresiaServiceImpl implements TipoMembresiaService {

    @Autowired
    private TipoMembresiaRepository tipoMembresiaRepository;

    @Override
    public TipoMembresia save(TipoMembresia entity) throws Exception {
        return tipoMembresiaRepository.save(entity);
    }

    @Override
    public List<TipoMembresia> findAll() throws Exception {
        return tipoMembresiaRepository.findAll();
    }

    @Override
    public Optional<TipoMembresia> findById(Long aLong) throws Exception {
        return tipoMembresiaRepository.findById(aLong);
    }

    @Override
    public TipoMembresia update(TipoMembresia entity) throws Exception {
        return tipoMembresiaRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        tipoMembresiaRepository.deleteById(aLong);
    }
}
