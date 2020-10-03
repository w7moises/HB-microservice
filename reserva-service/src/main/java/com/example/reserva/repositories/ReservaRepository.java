package com.example.reserva.repositories;

import com.example.reserva.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
}
