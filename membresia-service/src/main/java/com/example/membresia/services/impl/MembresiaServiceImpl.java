package com.example.membresia.services.impl;

import com.example.membresia.entities.Membresia;
import com.example.membresia.repositories.MembresiaRepository;
import com.example.membresia.services.MembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembresiaServiceImpl implements MembresiaService {
    @Autowired
    private MembresiaRepository membresiaRepository;

    @Override
    public Membresia save(Membresia entity) throws Exception {
        return membresiaRepository.save(entity);
    }

    @Override
    public List<Membresia> findAll() throws Exception {
        return membresiaRepository.findAll();
    }

    @Override
    public Optional<Membresia> findById(Long aLong) throws Exception {
        return membresiaRepository.findById(aLong);
    }

    @Override
    public Membresia update(Membresia entity) throws Exception {
        return membresiaRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        membresiaRepository.deleteById(aLong);
    }
}
