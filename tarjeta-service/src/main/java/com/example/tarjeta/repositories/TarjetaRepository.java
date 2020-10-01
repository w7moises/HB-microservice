package com.example.tarjeta.repositories;

import com.example.tarjeta.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaRepository extends JpaRepository<Tarjeta,Long> {
}
