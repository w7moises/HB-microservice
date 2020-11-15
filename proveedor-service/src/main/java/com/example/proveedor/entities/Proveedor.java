package com.example.proveedor.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proveedores")
@Data
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String nombres;

    @Column(length = 40, nullable = false)
    private String apellidos;

    @Column(name = "numero_documento", length = 40, nullable = false)
    private String numeroDocumento;

    @Column(length = 9, nullable = false)
    private String celular;

    @Column(length = 50, nullable = false)
    private String direccion;

    @Column(length = 50, nullable = false)
    private String correo;

    @Column(length = 2, nullable = false)
    private String calificacion;

    @Valid
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "publicacion_id")
    private List<Publicacion> publicaciones;

    public Proveedor(){
        publicaciones = new ArrayList<>();
    }
}
