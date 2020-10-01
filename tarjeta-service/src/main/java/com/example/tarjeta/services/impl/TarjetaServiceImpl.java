package com.example.tarjeta.services.impl;

import com.example.tarjeta.entities.Tarjeta;
import com.example.tarjeta.repositories.TarjetaRepository;
import com.example.tarjeta.services.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarjetaServiceImpl implements TarjetaService {

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Override
    public Tarjeta save(Tarjeta entity) throws Exception {
        return tarjetaRepository.save(entity);
    }

    @Override
    public List<Tarjeta> findAll() throws Exception {
        return tarjetaRepository.findAll();
    }

    @Override
    public Optional<Tarjeta> findById(Long aLong) throws Exception {
        return tarjetaRepository.findById(aLong);
    }

    @Override
    public Tarjeta update(Tarjeta entity) throws Exception {
        return tarjetaRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        tarjetaRepository.deleteById(aLong);
    }
}
