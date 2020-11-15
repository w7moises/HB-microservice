package com.example.proveedor.services.impls;

import com.example.proveedor.entities.Publicacion;
import com.example.proveedor.repositories.PublicacionRepository;
import com.example.proveedor.services.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Transactional
    @Override
    public Publicacion save(Publicacion entity) throws Exception {
        return publicacionRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Publicacion> findAll() throws Exception {
        return publicacionRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Publicacion> findById(Long aLong) throws Exception {
        return publicacionRepository.findById(aLong);
    }

    @Transactional
    @Override
    public Publicacion update(Publicacion entity) throws Exception {
       return publicacionRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        publicacionRepository.deleteById(aLong);
    }
}
