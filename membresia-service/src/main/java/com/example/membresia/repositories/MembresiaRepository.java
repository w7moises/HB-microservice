package com.example.membresia.repositories;

import com.example.membresia.entities.Membresia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembresiaRepository extends JpaRepository<Membresia,Long> {
}
