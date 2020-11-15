package pe.edu.upc.cliente.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.cliente.entities.Reseña;
import pe.edu.upc.cliente.repositories.ReseñaRepository;
import pe.edu.upc.cliente.services.ReseñaService;

import java.util.List;
import java.util.Optional;

@Service
public class ReseñaServiceImpl implements ReseñaService {

    @Autowired
    private ReseñaRepository reseñaRepository;

    @Transactional
    @Override
    public Reseña save(Reseña entity) throws Exception {
        return reseñaRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Reseña> findAll() throws Exception {
        return reseñaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Reseña> findById(Long aLong) throws Exception {
        return reseñaRepository.findById(aLong);
    }

    @Transactional
    @Override
    public Reseña update(Reseña entity) throws Exception {
        return reseñaRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        reseñaRepository.deleteById(aLong);
    }
}
