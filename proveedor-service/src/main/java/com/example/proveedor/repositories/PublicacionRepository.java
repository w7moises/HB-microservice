package com.example.proveedor.repositories;

import com.example.proveedor.entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion,Long> {
}
