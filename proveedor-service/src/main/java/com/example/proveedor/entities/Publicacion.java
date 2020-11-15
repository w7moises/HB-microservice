package com.example.proveedor.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "publicaciones")
@Data
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String imagen;

    @Column(length = 40, nullable = false)
    private String Titulo;

    @Column(length = 100, nullable = false)
    private String descripcion;

    @Column(name = "fecha_publicacion",length = 40, nullable = false)
    private String fechaPublicacion;
}
