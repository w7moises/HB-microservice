package com.example.reserva.repositories;

import com.example.reserva.entities.PagoReserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoReservaRepository extends JpaRepository<PagoReserva,Long> {
}
