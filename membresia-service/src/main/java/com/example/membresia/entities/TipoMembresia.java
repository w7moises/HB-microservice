package com.example.membresia.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tipo_membresia")
@Data
public class TipoMembresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_membresia", length = 40, nullable = false)
    private String nombreMembresia;
}