package com.example.reserva.services.impl;


import com.example.reserva.entities.PagoReserva;
import com.example.reserva.repositories.PagoReservaRepository;
import com.example.reserva.services.PagoReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoReservaServiceImpl implements PagoReservaService {

    @Autowired
    private PagoReservaRepository pagoReservaRepository;

    @Override
    public PagoReserva save(PagoReserva entity) throws Exception {
        return pagoReservaRepository.save(entity);
    }

    @Override
    public List<PagoReserva> findAll() throws Exception {
        return pagoReservaRepository.findAll();
    }

    @Override
    public Optional<PagoReserva> findById(Long aLong) throws Exception {
        return pagoReservaRepository.findById(aLong);
    }

    @Override
    public PagoReserva update(PagoReserva entity) throws Exception {
        return pagoReservaRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        pagoReservaRepository.deleteById(aLong);
    }
}
