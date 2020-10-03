package com.example.reserva.repositories;

import com.example.reserva.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaRepository extends JpaRepository<Tarjeta,Long> {
}
